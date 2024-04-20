package com.example.ejercicio2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var n1: TextView
    lateinit var n2: TextView
    lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        n1 = findViewById(R.id.Titulo2)
        n2 = findViewById(R.id.editTextText2)
        resultado = findViewById(R.id.editTextText3)

        val sumar: Button = findViewById(R.id.button)
        val restar: Button = findViewById(R.id.button2)
        val dividir: Button = findViewById(R.id.button3)
        val multiplicar: Button = findViewById(R.id.button4)

        sumar.setOnClickListener { calculate('+') }
        restar.setOnClickListener { calculate('-') }
        dividir.setOnClickListener { calculate('/') }
        multiplicar.setOnClickListener { calculate('*') }
    }

    private fun calculate(operator: Char) {
        val num1 = n1.text.toString().toDouble()
        val num2 = n2.text.toString().toDouble()
        val result = when (operator) {
            '+' -> num1 + num2
            '-' -> num1 - num2
            '*' -> num1 * num2
            '/' -> if (num2 != 0.0) num1 / num2 else Double.NaN
            else -> Double.NaN
        }
        resultado.text = if (result.isNaN()) "Error" else result.toString()
    }
}