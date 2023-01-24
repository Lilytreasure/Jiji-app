package com.example.jijiapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.example.jijiapp.R
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentSettings.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentSettings : Fragment() {
    // TODO: Rename and change types of parameters
    private  lateinit var buttonDn:AppCompatButton
    private lateinit var floatActionButtonMain:FloatingActionButton
    private lateinit var floatActionButtonMessage:FloatingActionButton
    private lateinit var floatActionButtonFb:FloatingActionButton


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val  view=inflater.inflate(R.layout.fragment_profile, container, false)
        buttonDn=view.findViewById(R.id.profiledn)

        //identify the floating action buttons by id
        floatActionButtonMain=view.findViewById(R.id.FloatButtonMain)
        floatActionButtonMessage=view.findViewById(R.id.floatMessage)
        floatActionButtonFb=view.findViewById(R.id.FloatFb)



        buttonDn.setOnClickListener(){
            val appContext = requireContext().applicationContext
            Toast.makeText(appContext,"Hello Dennis",Toast.LENGTH_LONG).show()
        }


        //customize the items in  the floatingAction Button to
        //populate other icons when clicked



        return view
    }



}