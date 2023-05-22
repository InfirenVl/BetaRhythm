package infiren.android.betarhythm

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlin.reflect.KClass


    var backEndDev: Int = 0
    var fullStackDev: Int = 0
    var gameDev: Int = 0
    var mobileDev: Int = 0
    var uxUiDesigner: Int = 0
    var gameDesigner: Int = 0
    var graphDesigner: Int = 0
    var webDesigner: Int = 0
    var qaTester: Int = 0
    var systemAdmin: Int = 0
    var job : Int = 0


    enum class Question(val creator:()->FragmentQuestion){
        QUESTION_1({FragmentQuestion(
            R.layout.fragment_test,
            {
                backEndDev +=2; gameDev+=3; gameDesigner+=5; systemAdmin+=3
            },
            {
                fullStackDev+=2; mobileDev+=2; uxUiDesigner+=5; gameDesigner+=4;graphDesigner+=5; webDesigner+=4
            },
            {
                backEndDev +=4; gameDev+=5; fullStackDev+=2; mobileDev+=3; qaTester+=2; systemAdmin+=3
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            Question.QUESTION_2
        )}),
        QUESTION_2({FragmentQuestion(
            R.layout.fragment_question2,
            {
                backEndDev+=0; fullStackDev+=1; gameDev+=4; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=3; graphDesigner+=2; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=2; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=5; gameDesigner+=5; graphDesigner+=5; webDesigner+=5; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            Question.QUESTION_3
        )}),
        QUESTION_3({FragmentQuestion(
            R.layout.fragment_question3,
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=5; mobileDev+=5; uxUiDesigner+=0; gameDesigner+=5; graphDesigner+=0; webDesigner+=0; qaTester+=5; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=3; mobileDev+=3; uxUiDesigner+=0; gameDesigner+=3; graphDesigner+=0; webDesigner+=0; qaTester+=3; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=1; mobileDev+=1; uxUiDesigner+=0; gameDesigner+=1; graphDesigner+=0; webDesigner+=0; qaTester+=1; systemAdmin+=0
            },
            {
                backEndDev+=1; fullStackDev+=1; gameDev+=0; mobileDev+=0; uxUiDesigner+=1; gameDesigner+=0; graphDesigner+=1; webDesigner+=1; qaTester+=0; systemAdmin+=1
            },
            Question.QUESTION_4
        )}),
        QUESTION_4({FragmentQuestion(
            R.layout.fragment_question4,
            {
                backEndDev+=0; fullStackDev+=5; gameDev+=0; mobileDev+=0; uxUiDesigner+=5; gameDesigner+=5; graphDesigner+=5; webDesigner+=5; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=3; gameDev+=0; mobileDev+=0; uxUiDesigner+=3; gameDesigner+=3; graphDesigner+=3; webDesigner+=3; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=1; gameDev+=0; mobileDev+=0; uxUiDesigner+=1; gameDesigner+=1; graphDesigner+=1; webDesigner+=1; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=1; fullStackDev+=0; gameDev+=1; mobileDev+=1; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=1; systemAdmin+=1
            },
            Question.QUESTION_5
        )}),
        QUESTION_5({FragmentQuestion(
            R.layout.fragment_question5,
            {
                backEndDev+=0; fullStackDev+=5; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=5; qaTester+=5; systemAdmin+=5
            },
            {
                backEndDev+=0; fullStackDev+=3; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=3; qaTester+=3; systemAdmin+=3
            },
            {
                backEndDev+=0; fullStackDev+=1; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=1; qaTester+=1; systemAdmin+=1
            },
            {
                backEndDev+=1; fullStackDev+=0; gameDev+=1; mobileDev+=1; uxUiDesigner+=1; gameDesigner+=1; graphDesigner+=1; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            Question.QUESTION_6
        )}),
        QUESTION_6({FragmentQuestion(
            R.layout.fragment_question6,
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=3; gameDesigner+=3; graphDesigner+=3; webDesigner+=3; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=5; systemAdmin+=0
            },
            {
                backEndDev+=2; fullStackDev+=2; gameDev+=0; mobileDev+=2; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=2; systemAdmin+=5
            },
            Question.QUESTION_7
        )}),
        QUESTION_7({FragmentQuestion(
            R.layout.fragment_question7,
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=5; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=5; fullStackDev+=5; gameDev+=0; mobileDev+=1; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=3; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=1; fullStackDev+=1; gameDev+=1; mobileDev+=1; uxUiDesigner+=0; gameDesigner+=1; graphDesigner+=0; webDesigner+=1; qaTester+=1; systemAdmin+=2
            },
            {
                backEndDev+=0; fullStackDev+=2; gameDev+=5; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=5; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            Question.QUESTION_8
        )}),
        QUESTION_8({FragmentQuestion(
            R.layout.fragment_question8,
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=2; systemAdmin+=5
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=1; systemAdmin+=3
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=1
            },
            {
                backEndDev+=1; fullStackDev+=1; gameDev+=1; mobileDev+=1; uxUiDesigner+=1; gameDesigner+=1; graphDesigner+=1; webDesigner+=1; qaTester+=1; systemAdmin+=0
            },
            Question.QUESTION_9
        )}),
        QUESTION_9({FragmentQuestion(
            R.layout.fragment_question9,
            {
                backEndDev+=0; fullStackDev+=2; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=5; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=5; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=2; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=3; mobileDev+=1; uxUiDesigner+=0; gameDesigner+=5; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=1; gameDev+=0; mobileDev+=0; uxUiDesigner+=5; gameDesigner+=3; graphDesigner+=3; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            Question.QUESTION_10
        )}),
        QUESTION_10({FragmentQuestion(
            R.layout.fragment_question10,
            {
                backEndDev+=5; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=2; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=5; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=1; gameDesigner+=0; graphDesigner+=5; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=1; mobileDev+=1; uxUiDesigner+=0; gameDesigner+=1; graphDesigner+=0; webDesigner+=0; qaTester+=1; systemAdmin+=1
            },
            Question.QUESTION_11
        )}),
        QUESTION_11({FragmentQuestion(
            R.layout.fragment_question11,
            {
                backEndDev+=3; fullStackDev+=1; gameDev+=0; mobileDev+=5; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=5; fullStackDev+=5; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=5; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=2; fullStackDev+=0; gameDev+=5; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=1; systemAdmin+=1
            },
            Question.QUESTION_12
        )}),
        QUESTION_12({FragmentQuestion(
            R.layout.fragment_question12,
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=5; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=3; systemAdmin+=0
            },
            {
                backEndDev+=1; fullStackDev+=1; gameDev+=0; mobileDev+=1; uxUiDesigner+=1; gameDesigner+=0; graphDesigner+=1; webDesigner+=1; qaTester+=0; systemAdmin+=1
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            Question.QUESTION_13
        )}),
        QUESTION_13({FragmentQuestion(
            R.layout.fragment_question13,
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=3; systemAdmin+=5
            },
            {
                backEndDev+=3; fullStackDev+=3; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=1; mobileDev+=1; uxUiDesigner+=2; gameDesigner+=2; graphDesigner+=2; webDesigner+=2; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            Question.QUESTION_14
        )}),
        QUESTION_14({FragmentQuestion(
            R.layout.fragment_question14,
            {
                backEndDev+=0; fullStackDev+=4; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=5; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=4; graphDesigner+=5; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=5; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=0
            },
            {
                backEndDev+=1; fullStackDev+=0; gameDev+=1; mobileDev+=1; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=1; systemAdmin+=1
            },
            null
        )});


    }
class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.add(R.id.fragment_container, Question.QUESTION_1.creator.invoke(), "First qwestion")
        transaction.commit()


    }

    fun home(view: View) {
        val intent = Intent(this@TestActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun end_test(view: View) {
        Log.d("RADIOINDEX", "Beck" +backEndDev.toString())
        Log.d("RADIOINDEX", "Full" +fullStackDev.toString())
        Log.d("RADIOINDEX", "GameDev" +gameDev.toString())
        Log.d("RADIOINDEX", "Mobile" +mobileDev.toString())
        Log.d("RADIOINDEX", "UxUi" +uxUiDesigner.toString())
        Log.d("RADIOINDEX", "GameDes" +gameDesigner.toString())
        Log.d("RADIOINDEX", "Graph" +graphDesigner.toString())
        Log.d("RADIOINDEX", "Web" +webDesigner.toString())
        Log.d("RADIOINDEX", "QA" +qaTester.toString())
        Log.d("RADIOINDEX", "System" + systemAdmin.toString())
        val results = listOf(backEndDev, fullStackDev, gameDev, mobileDev, uxUiDesigner, gameDesigner, graphDesigner, webDesigner, qaTester, systemAdmin)
        Log.d("RADIO", "Result is $results")
        job = results.max()
//        when (job){
//            backEndDev -> "You are back"
//            fullStackDev -> "You are fullstack"
//            gameDev -> "You are gameDev"
//             mobileDev -> "You are mobile"
//            uxUiDesigner -> "You are UxUi"
//            gameDesigner ->  "You are gameDes"
//            graphDesigner -> "You are graph"
//            webDesigner -> "You are web"
//            qaTester -> "You are qa"
//            systemAdmin -> "You are admin"
//        }
        Log.d("RADIO", "Result is $job")
        val intent = Intent(this@TestActivity, ResultActivity::class.java)
        startActivity(intent)
        finish()
    }

}