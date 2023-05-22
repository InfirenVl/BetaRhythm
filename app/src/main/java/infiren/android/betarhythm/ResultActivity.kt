package infiren.android.betarhythm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val resJob = findViewById<ImageView>(R.id.jobAvatar)
        val resName = findViewById<TextView>(R.id.jobName)
        val resDesc = findViewById<TextView>(R.id.jobDescription)
        if(job == backEndDev) {
            resJob.setImageResource(R.drawable.backend_developer)
            resName.setText("Backend-Разработчик")
            resDesc.setText("Backend-Разработчик - это программист, отвечающий за внутреннюю логику сайта")
        }
        else if(job == fullStackDev) {
            resJob.setImageResource(R.drawable.fullstack_developer)
            resName.setText("Fullstack-Разработчик")
            resDesc.setText("Fullstack-Разработчик - «мастер на все руки» в мире веб разработки")
        }
        else if(job == gameDev) {
            resJob.setImageResource(R.drawable.game_developer)
            resName.setText("Разработчик Игр")
            resDesc.setText("Разработчик Игр - тот, кто создает ваши любимые игры")
        }
        else if(job == mobileDev) {
            resJob.setImageResource(R.drawable.mobile_developer)
            resName.setText("Mobile-Разработчик")
            resDesc.setText("Mobile-Разработчик - программист, но для приложений на телефон")
        }
        else if(job == uxUiDesigner) {
            resJob.setImageResource(R.drawable.ui_ux_designer)
            resName.setText("UI/UX-Дизайнер")
            resDesc.setText("UI/UX-Дизайнер - тот, благодаря кому интерфейсы интуитивно понятны и приятны глазу")
        }
        else if(job == gameDesigner) {
            resJob.setImageResource(R.drawable.game_designers)
            resName.setText("Гейм-Дизайнер")
            resDesc.setText("Гейм-Дизайнер - именно они решают, как будет выглядеть ваша игра")
        }
        else if(job == graphDesigner) {
            resJob.setImageResource(R.drawable.graphdesigner)
            resName.setText("Графический Дизайнер")
            resDesc.setText("Графический Дизайнер - от него зависит то, как будет выглядеть ваш проект")
        }
        else if(job == webDesigner) {
            resJob.setImageResource(R.drawable.web_designer)
            resName.setText("Web-Дизайнер")
            resDesc.setText("Web-Дизайнер - дизайнер, собирающий визуальную составляющую сайта")
        }
        else if(job == qaTester) {
            resJob.setImageResource(R.drawable.tester)
            resName.setText("Тестировщик")
            resDesc.setText("Тестировщик - находят ошибки и недочеты в программах, имитируя работу пользователя")
        }
        else if(job == systemAdmin) {
            resJob.setImageResource(R.drawable.sysadmin)
            resName.setText("Системный Администратор")
            resDesc.setText("Системный Администратор - следит за тем, чтобы вся техника и программы работали")
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