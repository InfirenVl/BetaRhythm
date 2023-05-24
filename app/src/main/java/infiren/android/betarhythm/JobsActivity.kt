package infiren.android.betarhythm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import infiren.android.betarhythm.fragments.JobsDescFragment

open class JobsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jobs)
        val recview:RecyclerView=findViewById(R.id.rec_view)
        recview.adapter=RecViewAdapter(this, RecViewList().list)

    }

    fun goBack(view: View) {
        val intent = Intent(this@JobsActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
//    fun about(view: View){
//        var recId : RecyclerView = findViewById(R.id.rec_view)
//        recId.indexOfChild(clickedChildView)
//    }
}