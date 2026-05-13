package com.example.bmi_calc

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)

        val addBtn = findViewById<Button>(R.id.addBtn)
        val subBtn = findViewById<Button>(R.id.subBtn)
        val mulBtn = findViewById<Button>(R.id.mulBtn)
        val divBtn = findViewById<Button>(R.id.divBtn)

        val resultText = findViewById<TextView>(R.id.resultText)

        fun getNumbers(): Pair<Double, Double>? {
            val n1 = num1.text.toString()
            val n2 = num2.text.toString()

            if (n1.isEmpty() || n2.isEmpty()) {
                Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show()
                return null
            }

            return Pair(n1.toDouble(), n2.toDouble())
        }

        addBtn.setOnClickListener {
            val numbers = getNumbers() ?: return@setOnClickListener
            val result = numbers.first + numbers.second
            resultText.text = "Result: $result"
        }

        subBtn.setOnClickListener {
            val numbers = getNumbers() ?: return@setOnClickListener
            val result = numbers.first - numbers.second
            resultText.text = "Result: $result"
        }

        mulBtn.setOnClickListener {
            val numbers = getNumbers() ?: return@setOnClickListener
            val result = numbers.first * numbers.second
            resultText.text = "Result: $result"
        }

        divBtn.setOnClickListener {
            val numbers = getNumbers() ?: return@setOnClickListener

            if (numbers.second == 0.0) {
                Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val result = numbers.first / numbers.second
            resultText.text = "Result: $result"
        }
    }
}