package infiren.android.betarhythm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class TestActivity : AppCompatActivity() {
    var radioGroup : RadioGroup? = null
    var backEndDev: Int = 0
    var fullStackDev : Int = 0
    var gameDev : Int = 0
    var mobileDev : Int = 0
    var uxUiDesigner : Int = 0
    var gameDesigner : Int = 0
    var graphDesigner : Int = 0
    var webDesigner : Int = 0
    var qaTester : Int = 0
    var systemAdmin : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        // val viewPager = findViewById<FragmentContainerView>(R.id.fragment_container)
        //val next = findViewById<Button>(R.id.button_next)
        //val header = findViewById<TextView>(R.id.questionID)
        //radioGroup = findViewById(R.id.radioGroup1)

        //testVariants.checkedRadioButtonId

//        val CHEK1 : String = "SSS"
//        when (testVariants.checkedRadioButtonId) {
//            R.id.radioButton1 -> Log.d(CHEK1,"111")
//
//        }
//        next.setOnClickListener {
//            var id : Int = 1
//            id++
//            header.setText("Вопрос №$id")
//
//                supportFragmentManager.beginTransaction()
//                    .replace(R.id.fragment_container,TestFragmentTwo())
//                    .commit()
//        }
        val transaction = supportFragmentManager.beginTransaction()
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.add(R.id.fragment_container, TestFragment(), "First qwestion")
        transaction.commit()


    }

    fun home(view: View) {
        val intent = Intent(this@TestActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun next2(view: View) {
        val header = findViewById<TextView>(R.id.questionID)
        val quest = findViewById<TextView>(R.id.question)

        header.setText("Вопрос №2")
        quest.setText("Если бы у вас была такая возможность, кем бы вы хотели стать?")
        /*
        1 - result += 1
        2 - result = result + 2
        3 - result = result + 3
        4 - result = result + 4
        switch{
        case(1){
           системный администратор + 5
           бэкенд-разработчик + 5
           разработчик игр + 2
            }

        case(2){
         фуллстек-разработчик + 1
         мобильный разработчик + 2
         Ui/ux дизайнеры + 5
         геймдизайнеры + 5
         граф.дизайнеры + 5
         веб дизайнеры + 5
        }

        case(3){
        бэкенд-разработчик
        фуллстек-разработчик
        разработчик игр
        мобильный разработчик
        тестировщик
        }

        case(4){
            - вы еблан
        }
        бэкенд-разработчик
        фуллстек-разработчик
        разработчик игр
        мобильный разработчик
        Ui/ux дизайнеры
        геймдизайнеры
        граф.дизайнеры
        веб дизайнеры
        тестировщик
        системный администратор
        }*/
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, TestFragmentTwo())
            .commit()
    }
    fun next3(view: View){
        val header = findViewById<TextView>(R.id.questionID)
        val quest = findViewById<TextView>(R.id.question)

        header.setText("Вопрос №3")
        quest.setText("Любите ли вы играть в\\n  компьютерные игры?  ")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentQuestion3())
            .commit()
    }
    fun next4(view: View){
        val header = findViewById<TextView>(R.id.questionID)
        val quest = findViewById<TextView>(R.id.question)

        header.setText("Вопрос №4")
        quest.setText("Считаете ли вы, или ваши близкие, что у вас хороший вкус?")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentQuestion4())
            .commit()
    }
    fun next5(view: View){
        val header = findViewById<TextView>(R.id.questionID)
        val quest = findViewById<TextView>(R.id.question)

        header.setText("Вопрос №5")
        quest.setText("Согласны ли вы с утверждением «Меня интересуют языки программирования, но я бы не сказал, что программист прямо сейчас - это моя мечта»")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentQuestion5())
            .commit()
    }
    fun next6(view: View){
        val header = findViewById<TextView>(R.id.questionID)
        val quest = findViewById<TextView>(R.id.question)

        header.setText("Вопрос №6")
        quest.setText("Выбери один из вариантов")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentQuestion6())
            .commit()
    }
    fun next7(view: View){
        val header = findViewById<TextView>(R.id.questionID)
        val quest = findViewById<TextView>(R.id.question)

        header.setText("Вопрос №7")
        quest.setText("Что вам ближе?")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentQuestion7())
            .commit()
    }
    fun next8(view: View){
        val header = findViewById<TextView>(R.id.questionID)
        val quest = findViewById<TextView>(R.id.question)

        header.setText("Вопрос №8")
        quest.setText("Нравится ли вам разбирать дома технику?")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentQuestion8())
            .commit()
    }
    fun next9(view: View){
        val header = findViewById<TextView>(R.id.questionID)
        val quest = findViewById<TextView>(R.id.question)

        header.setText("Вопрос №9")
        quest.setText("Что вам ближе?")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentQuestion9())
            .commit()
    }
    fun next10(view: View){
        val header = findViewById<TextView>(R.id.questionID)
        val quest = findViewById<TextView>(R.id.question)

        header.setText("Вопрос №10")
        quest.setText("Что из этого вам больше интересно?")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentQuestion10())
            .commit()
    }
    fun next11(view: View){
        val header = findViewById<TextView>(R.id.questionID)
        val quest = findViewById<TextView>(R.id.question)

        header.setText("Вопрос №11")
        quest.setText("Если у вас уже был опыт программирования, какие языки это были?")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentQuestion11())
            .commit()
    }
    fun next12(view: View){
        val header = findViewById<TextView>(R.id.questionID)
        val quest = findViewById<TextView>(R.id.question)

        header.setText("Вопрос №12")
        quest.setText("Если вам предложат возможность первым играть в новинки игровой индустрии, да\n" +
                "ещё и за деньги, хоть и придется выполнять некоторую отчётность, согласились бы\n" +
                "вы?")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentQuestion12())
            .commit()
    }
    fun next13(view: View){
        val header = findViewById<TextView>(R.id.questionID)
        val quest = findViewById<TextView>(R.id.question)

        header.setText("Вопрос №13")
        quest.setText("Вам предложили два варианта, либо работать с серверами и «железом», либо\n" +
                "работать с логикой взаимодействия серверов, что бы вы выбрали?")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentQuestion13())
            .commit()
    }
    fun next14(view: View){
        val header = findViewById<TextView>(R.id.questionID)
        val quest = findViewById<TextView>(R.id.question)

        header.setText("Вопрос №14")
        quest.setText("Выберите утверждение, которое вам ближе")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentQuestion14())
            .commit()
    }
    fun end_test(view: View){
        val intent = Intent(this@TestActivity, ResultActivity::class.java)
        startActivity(intent)
        finish()
    }

}