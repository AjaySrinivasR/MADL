package com.example.app1

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.changeButton)

        button.setOnClickListener {
            // Change text color
            textView.setTextColor(Color.BLUE)

            // Change font style
            textView.typeface = Typeface.SERIF
            textView.setTypeface(textView.typeface, Typeface.BOLD)

            // Show toast message
            Toast.makeText(
                this,
                "Font and color changed!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
