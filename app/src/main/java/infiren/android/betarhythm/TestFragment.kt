package infiren.android.betarhythm

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class TestFragment : Fragment() {
    var radioGroup : RadioGroup? = null

    private lateinit var nextButton: AppCompatButton


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment

        val rootView = inflater.inflate(R.layout.fragment_test, container, false)
//        radioGroup = rootView.findViewById(R.id.radio_group)
//        nextButton = rootView.findViewById(R.id.next)
//
//        nextButton.setOnClickListener{
//            var idIndex = radioGroup!!.indexOfChild(rootView.findViewById(radioGroup!!.checkedRadioButtonId))
//            when (idIndex){
//                0 -> {backEndDev +=2; gameDev+=3; gameDesigner+=5; systemAdmin+=3}
//                1 -> {fullStackDev+=2; mobileDev+=2; uxUiDesigner+=5; gameDesigner+=4;graphDesigner+=5; webDesigner+=4}
//                2 -> {backEndDev +=4; gameDev+=5; fullStackDev+=2; mobileDev+=3; qaTester+=2; systemAdmin+=3}
//                3 -> {backEndDev+=0; fullStackDev+=0; gameDev+=0; mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=0}
//
//            }
//            Log.d("RADIOID", idIndex.toString() )
//            Log.d("RADIOINDEX", backEndDev.toString())
//            Log.d("RADIOINDEX", fullStackDev.toString())
//            Log.d("RADIOINDEX", gameDev.toString())
//            //mobileDev+=0; uxUiDesigner+=0; gameDesigner+=0; graphDesigner+=0; webDesigner+=0; qaTester+=0; systemAdmin+=0;)
//                parentFragmentManager.beginTransaction()
//                    .replace(R.id.fragment_container, FragmentQuestion2())
//                    .commit()
//
//        }


        return  rootView






    }


    companion object {

        @JvmStatic
        fun newInstance() = TestFragment()
    }
}