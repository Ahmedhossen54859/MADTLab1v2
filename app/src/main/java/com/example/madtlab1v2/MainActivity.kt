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

        val MyTextView: TextView = findViewById(R.id.myTextView)
        val MyButton: Button = findViewById(R.id.myButton)
        val ColorButton: Button = findViewById(R.id.colorButton)
        val BgColorButton: Button = findViewById(R.id.bgColorButton)

        MyButton.setOnClickListener {
            MyTextView.text = "Button Clicked!"
        }

        ColorButton.setOnClickListener {
            MyTextView.setTextColor(Color.RED)
        }

        BgColorButton.setOnClickListener {
            findViewById<android.widget.LinearLayout>(android.R.id.content).let {
                it.rootView.setBackgroundColor(Color.YELLOW)
            }
        }
    }
}