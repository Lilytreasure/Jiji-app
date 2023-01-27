package com.example.jijiapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageButton
import androidx.fragment.app.FragmentTransaction
import com.example.jijiapp.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentPersonal.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentPersonal : Fragment() {
    // TODO: Rename and change types of parameters

    private  lateinit var  buttonSettingsBack: AppCompatButton



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view=  inflater.inflate(R.layout.fragment_personal, container, false)

        buttonSettingsBack=view.findViewById(R.id.settingsBack)

            //return to the previous fragment
        buttonSettingsBack.setOnClickListener(){
            val  customFragment=FragmentSettings()
            val transaction: FragmentTransaction =requireFragmentManager().beginTransaction()
            transaction.replace(R.id.mainView,customFragment)
            transaction.commit()

        }


        //open a new fragment from this fragment on button  click

       return  view
        //set up this custom fragment to switch other fragments
    }



}