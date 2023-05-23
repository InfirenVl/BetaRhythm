package infiren.android.betarhythm

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageButton
import androidx.fragment.app.Fragment
import kotlin.reflect.KClass

class FragmentQuestion(private val layoutId: Int,
    private val doOnIndex0: ()->Unit,
    private val doOnIndex1: ()->Unit,
    private val doOnIndex2: ()->Unit,
    private val doOnIndex3: ()->Unit,
    private val nextQuestion: Question?
    ) : Fragment() {
    var radioGroup : RadioGroup? = null

    var nextButton: AppCompatButton? = null
    lateinit var homeButton: AppCompatImageButton
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(layoutId, container, false)
        radioGroup = rootView.findViewById(R.id.radio_group)
        nextButton = rootView.findViewById(R.id.next)


        nextButton?.isEnabled = false
        radioGroup?.setOnCheckedChangeListener { radioGroup, optionId ->
            run {
                nextButton?.isEnabled = true
            }
        }

        nextButton?.setOnClickListener{
            var idIndex = radioGroup!!.indexOfChild(rootView.findViewById(radioGroup!!.checkedRadioButtonId))
            when (idIndex){
                0 -> {doOnIndex0()}
                1 -> {doOnIndex1()}
                2 -> {doOnIndex2()}
                3 -> {doOnIndex3()}

            }

            //mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=0;)
            if (nextQuestion != null) {
                parentFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, nextQuestion.creator.invoke())
                    .commit()
            }

        }
        return  rootView
    }
    companion object {

        @JvmStatic
        fun newInstance() = Question.QUESTION_1.creator.invoke()
    }
}