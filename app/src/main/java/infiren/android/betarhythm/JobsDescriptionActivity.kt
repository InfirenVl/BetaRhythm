package infiren.android.betarhythm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentTransaction
import infiren.android.betarhythm.fragments.JobsDescFragment

class JobsDescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jobs_description)


        val transaction = supportFragmentManager.beginTransaction()
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.add(R.id.plate, JobsDescFragment(), "First qwestion")
        transaction.commit()
    }

    fun backJob(view : View){
        val intent = Intent(this@JobsDescriptionActivity, JobsActivity::class.java)
        startActivity(intent)
        finish()
    }
}