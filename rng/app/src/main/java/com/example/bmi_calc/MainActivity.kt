package com.example.bmi_calc

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val minInput = findViewById<EditText>(R.id.minInput)
        val maxInput = findViewById<EditText>(R.id.maxInput)
        val generateButton = findViewById<Button>(R.id.generateButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        generateButton.setOnClickListener {

            val minStr = minInput.text.toString()
            val maxStr = maxInput.text.toString()

            if (minStr.isEmpty() || maxStr.isEmpty()) {
                Toast.makeText(this, "Please enter both values", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val min = minStr.toInt()
            val max = maxStr.toInt()

            if (min >= max) {
                Toast.makeText(this, "Minimum must be less than Maximum", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val randomNumber = Random.nextInt(min, max + 1)

            resultText.text = "Generated Number: $randomNumber"
        }
    }
}