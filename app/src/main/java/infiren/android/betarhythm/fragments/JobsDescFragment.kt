package infiren.android.betarhythm.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import infiren.android.betarhythm.JobsActivity
import infiren.android.betarhythm.MainActivity
import infiren.android.betarhythm.R
import infiren.android.betarhythm.positionIndex

class JobsDescFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_jobs_desc, container, false)

        var image = rootView.findViewById<ImageView>(R.id.jobsImage)
        var name = rootView.findViewById<TextView>(R.id.jobsName)
        var desc = rootView.findViewById<TextView>(R.id.jobsDesc)
//
        if (positionIndex == 1){
            image.setImageResource(R.drawable.game_designers)
            name.setText("Гейм-Дизайнер")
            desc.setText("Гейм-Дизайнер - именно они решают, как будет выглядеть ваша игра")
        }else if (positionIndex ==2){
            image.setImageResource(R.drawable.game_developer)
            name.setText("Разработчик Игр")
            desc.setText("Разработчик Игр - тот, кто создает ваши любимые игры")
        }else if (positionIndex ==3){
            image.setImageResource(R.drawable.graphdesigner)
            name.setText("Графический Дизайнер")
            desc.setText("Графический Дизайнер - от него зависит то, как будет выглядеть ваш проект")
        }else if (positionIndex ==4){
            image.setImageResource(R.drawable.mobile_developer)
            name.setText("Mobile-Разработчик")
            desc.setText("Mobile-Разработчик - программист, но для приложений на телефон")
        }else if (positionIndex ==5){
            image.setImageResource(R.drawable.sysadmin)
            name.setText("Системный Администратор")
            desc.setText("Системный Администратор - следит за тем, чтобы вся техника и программы работали")
        }else if (positionIndex ==6){
            image.setImageResource(R.drawable.tester)
            name.setText("Тестировщик")
            desc.setText("Тестировщик - находят ошибки и недочеты в программах, имитируя работу пользователя")
        }else if (positionIndex ==7){
            image.setImageResource(R.drawable.ui_ux_designer)
            name.setText("UI/UX-Дизайнер")
            desc.setText("UI/UX-Дизайнер - тот, благодаря кому интерфейсы интуитивно понятны и приятны глазу")
        }else if (positionIndex ==8){
            image.setImageResource(R.drawable.fullstack_developer)
            name.setText("Fullstack-Разработчик")
            desc.setText("Fullstack-Разработчик - «мастер на все руки» в мире веб разработки")
        }else if (positionIndex ==9){
            image.setImageResource(R.drawable.web_designer)
            name.setText("Web-Дизайнер")
            desc.setText("Web-Дизайнер - дизайнер, собирающий визуальную составляющую сайта")
        }
        return rootView
    }

    companion object {
        @JvmStatic
        fun newInstance() = JobsDescFragment()

    }
}