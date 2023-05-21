package infiren.android.betarhythm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class JobsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jobs)
        val recview:RecyclerView=findViewById(R.id.rec_view)
        recview.adapter=RecViewAdapter(this, RecViewList().list)
    }
}