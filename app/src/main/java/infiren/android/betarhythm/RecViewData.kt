package infiren.android.betarhythm

data class RecViewData( val image:Int, val text:String)
class RecViewList{
    val list = arrayListOf(
        RecViewData(R.drawable.backend_developer, "Backend-Разработчик"),
        RecViewData(R.drawable.game_designers, "Гейм-Дизайнер"),
        RecViewData(R.drawable.game_developer, "Разработчик Игр"),
        RecViewData(R.drawable.graphdesigner, "Графический Дизайнер"),
        RecViewData(R.drawable.mobile_developer, "Mobile-Разработчик"),
        RecViewData(R.drawable.sysadmin, "Системный Администратор"),
        RecViewData(R.drawable.tester, "Тестировщик"),
        RecViewData(R.drawable.ui_ux_designer, "UI/UX-Дизайнер"),
        RecViewData(R.drawable.fullstack_developer, "Fullstack-Разработчик"),
        RecViewData(R.drawable.web_designer, "Web-Дизайнер")
    )
}
