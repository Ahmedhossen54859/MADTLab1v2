package com.example.madtlab1v2

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView: TextView = findViewById(R.id.myTextView)
        val myButton: Button = findViewById(R.id.myButton)
        val colorButton: Button = findViewById(R.id.colorButton)
        val bgColorButton: Button = findViewById(R.id.bgColorButton)

        myButton.setOnClickListener {
            myTextView.text = "Button Clicked!"
        }

        colorButton.setOnClickListener {
            myTextView.setTextColor(Color.RED)
        }

        bgColorButton.setOnClickListener {
            findViewById<android.widget.LinearLayout>(android.R.id.content).let {
                it.rootView.setBackgroundColor(Color.YELLOW)
            }
        }
        //Code for revert
    }
}