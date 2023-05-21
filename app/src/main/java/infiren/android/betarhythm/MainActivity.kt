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
        val intent = Intent(this@MainActivity, TestActivity::class.java)
        startActivity(intent)
        finish()
    }
}