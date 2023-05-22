package infiren.android.betarhythm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // tyt bil seva
    }

    fun start(view: View){
        backEndDev = 0
        fullStackDev = 0
        gameDev = 0
        mobileDev = 0
        uxUiDesigner= 0
        gameDesigner = 0
        graphDesigner = 0
        webDesigner= 0
        qaTester= 0
        systemAdmin= 0
        job = 0
        val intent = Intent(this@MainActivity, TestActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun goToJobs(view: View) {
        val intent = Intent(this@MainActivity, JobsActivity::class.java)
        startActivity(intent)
        finish()
    }
}