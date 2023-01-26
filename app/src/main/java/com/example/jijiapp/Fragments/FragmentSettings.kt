package com.example.jijiapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.FragmentTransaction
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

    private lateinit var floatActionButtonMain: FloatingActionButton
    private lateinit var floatActionButtonMessage: FloatingActionButton
    private lateinit var floatActionButtonFb: FloatingActionButton
    private lateinit var  buttonDn: AppCompatButton
    //customize the floating action button to load child floating buttons

    var floatButtonVisible=false


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val  view=inflater.inflate(R.layout.fragment_profile, container, false)


        //identify the floating action buttons by id
        floatActionButtonMain=view.findViewById(R.id.FloatButtonMain)
        floatActionButtonMessage=view.findViewById(R.id.floatMessage)
        floatActionButtonFb=view.findViewById(R.id.FloatFb)


        buttonDn=view.findViewById(R.id.profiledn)
        //test whether the button is acessible

        //dispaly another fragment when  the button is clicked
        // the displayed fragment will  clear the main view and  be set
        //as the new display

        buttonDn.setOnClickListener(){

            //open a custom fragment from this parent fragment
            val  customFragment=FragmentPersonal()
            val transaction: FragmentTransaction =requireFragmentManager().beginTransaction()
            transaction.replace(R.id.mainView,customFragment)
            transaction.commit()

        }


        floatButtonVisible=false

        floatActionButtonMain.setOnClickListener(){

            if (!floatButtonVisible){
                floatActionButtonMessage.show()
                floatActionButtonFb.show()


                floatActionButtonMessage.visibility=View.VISIBLE
                floatActionButtonFb.visibility=View.VISIBLE

                floatActionButtonMain.setImageDrawable(resources.getDrawable(R.drawable.ic_close))


                floatButtonVisible=true

            }
            else{
                floatActionButtonMessage.hide()
                floatActionButtonFb.hide()

                floatActionButtonMessage.visibility=View.GONE
                floatActionButtonFb.visibility=View.GONE

                floatActionButtonMain.setImageDrawable(resources.getDrawable(R.drawable.ic_messages))


                floatButtonVisible=false


            }


            //adding default clickables to tst whether the populated floating buttons
            //are clickable


            floatActionButtonMessage.setOnClickListener(){
                val context=requireContext().applicationContext
                Toast.makeText(context,"Float message clicked", Toast.LENGTH_LONG).show()

            }
            floatActionButtonFb.setOnClickListener(){
                val context=requireContext().applicationContext
                Toast.makeText(context,"Float facebook  clicked", Toast.LENGTH_LONG).show()

            }

        }


        //customize the items in  the floatingAction Button to
        //populate other icons when clicked

        return view
    }



}