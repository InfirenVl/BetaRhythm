package infiren.android.betarhythm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    val nameTest : String = "Тестировщик"
    var resJob = findViewById<ImageView>(R.id.jobAvatar)
    var resName = findViewById<TextView>(R.id.jobName)
    var resDesc = findViewById<TextView>(R.id.jobDescription)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        if (job == qaTester){
            resJob.setImageResource(R.drawable.tester)
            resName.setText("$nameTest")
            resDesc.setText("находят ошибки и недочеты в программах, имитируя работу пользователя")
        }

    }
    fun backMain(view: View){
        val intent = Intent(this@ResultActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun again(view: View){
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
        val intent = Intent(this@ResultActivity, TestActivity::class.java)
        startActivity(intent)
        finish()
    }
}