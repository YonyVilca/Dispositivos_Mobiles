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
    private var currentNumber = ""
    //Agregando constantes de clave
    companion object {
        private const val KEY_N1_TEXT = "n1_text"
        private const val KEY_N2_TEXT = "n1_text"
        private const val KEY_CURRENT_NUMBER = "current_number"
    }

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

        // Obtener los botones numéricos
        val buttons = arrayOf(
            findViewById<Button>(R.id.button5), findViewById<Button>(R.id.button6),
            findViewById<Button>(R.id.button7), findViewById<Button>(R.id.button8),
            findViewById<Button>(R.id.button9), findViewById<Button>(R.id.button10),
            findViewById<Button>(R.id.button11), findViewById<Button>(R.id.button12),
            findViewById<Button>(R.id.button13), findViewById<Button>(R.id.button14)
        )

        // Asignar listeners de clic a los botones numéricos
        for (button in buttons) {
            button.setOnClickListener {
                val number = button.text.toString()
                // Obtener el TextView activo
                val activeTextView = if (n1.hasFocus()) n1 else n2
                // Obtener el texto actual y agregar el número presionado
                val currentText = activeTextView.text.toString()
                activeTextView.text = currentText + number
            }
        }
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
        // Restablecer el registro de números después de realizar la operación
        currentNumber = ""
        // Borrar los TextViews de entrada
        n1.text = ""
        n2.text = ""
    }
}