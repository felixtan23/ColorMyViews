package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       setListeners()
    }

    fun setListeners(){

        val clickableViews: List<View> =
            listOf( box_one_text, box_two_text, box_three_text,
                box_four_text, box_five_text, constraint_layout)

        for(item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View){
        when(view.id){
            //Boxes uisng color class
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)

        }
    }

}
