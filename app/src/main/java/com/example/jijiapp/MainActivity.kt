package com.example.jijiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.jijiapp.Fragments.FragmentHome
import com.example.jijiapp.Fragments.FragmentSaved
import com.example.jijiapp.Fragments.FragmentSettings
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    //A treplica of the JIJI mobile application
    //inspired by jiji.co.ke mobile app
    private lateinit var  bottomNavigationView: BottomNavigationView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView=findViewById(R.id.BottomView)




        //fragmentHome is populated by default

        replaceFragments(FragmentHome())



        bottomNavigationView.setOnItemSelectedListener(){
            when(it.itemId){
                R.id.hmBtn->replaceFragments(FragmentHome())
                R.id.svBtn->replaceFragments(FragmentSaved())
                R.id.ProfileBtn->replaceFragments(FragmentSettings())
            }


            true
        }













        //onCreate method ends here
    }


    //a function to replace the fragments
    private fun replaceFragments(fragment: Fragment){
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.mainView,fragment)
        fragmentTransaction.commit()


    }



}