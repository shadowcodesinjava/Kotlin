package com.example.myapplication // Change to match your package name

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find GUI components
        val etKilograms = findViewById<EditText>(R.id.etKilograms)
        val btnConvert = findViewById<Button>(R.id.btnConvert)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnConvert.setOnClickListener {
            val input = etKilograms.text.toString()

            if (input.isNotEmpty()) {
                val kg = input.toDouble()
                // Formula: 1 kg = 2.20462 lbs
                val lbs = kg * 2.20462

                // Format to 2 decimal places
                tvResult.text = "Result: %.2f lbs".format(lbs)
            } else {
                Toast.makeText(this, "Please enter a value!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
