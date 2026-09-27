package com.example.madtlab1v2

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

        myButton.setOnClickListener {
            myTextView.text = "Button Clicked!"
        }
    }
}