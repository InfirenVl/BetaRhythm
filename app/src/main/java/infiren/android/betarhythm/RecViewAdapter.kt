package infiren.android.betarhythm

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import infiren.android.betarhythm.fragments.JobsDescFragment

var positionIndex : Int = -1
var inProgress : Int = 0

class RecViewAdapter(val con:Context, val list2:ArrayList<RecViewData>):RecyclerView.Adapter<RecViewAdapter.Link>() {

    open class Link(itemView: View):RecyclerView.ViewHolder(itemView) {
            init {

                    val ctx : Context = itemView.context
                    itemView.setOnClickListener {
                        positionIndex = adapterPosition
                        val intent = Intent(ctx, JobsDescriptionActivity::class.java)
                        Log.d("RECID", "Element $positionIndex")
                        inProgress++
                        ctx.startActivity(intent)
                    }

            }


        val img:ImageView=itemView.findViewById(R.id.img)
        val text:TextView=itemView.findViewById(R.id.text)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecViewAdapter.Link {
        val root = LayoutInflater.from(con).inflate(R.layout.rec_view_item,parent,false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: RecViewAdapter.Link, position: Int) {
        holder.img.setImageResource(list2[position].image)
        holder.text.setText(list2[position].text)
    }

    override fun getItemCount(): Int {
        return list2.size
    }
}