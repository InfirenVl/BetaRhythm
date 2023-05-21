package infiren.android.betarhythm

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecViewAdapter(val con:Context, val list2:ArrayList<RecViewData>):RecyclerView.Adapter<RecViewAdapter.Link>() {
    class Link(itemView: View):RecyclerView.ViewHolder(itemView) {
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