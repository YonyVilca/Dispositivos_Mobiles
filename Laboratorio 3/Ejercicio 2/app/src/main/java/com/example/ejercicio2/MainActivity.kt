package com.example.ejercicio2

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        }

    fun precionarDigito (view: View) {
        val resultado: TextView = findViewById(R.id.resultado)
        var result: String = resultado.text.toString()

        when(view.id){
            R.id.numcero -> resultado.setText(result + "0")
            R.id.numuno -> resultado.setText(result + "1")
            R.id.numdos -> resultado.setText(result + "2")
            R.id.numtres -> resultado.setText(result + "3")
            R.id.numcuatro -> resultado.setText(result + "4")
            R.id.numcinco -> resultado.setText(result + "5")
            R.id.numseis-> resultado.setText(result + "6")
            R.id.numsiete -> resultado.setText(result + "7")
            R.id.numocho -> resultado.setText(result + "8")
            R.id.numnueve -> resultado.setText(result + "9")
            R.id.punto -> resultado.setText(result + ".")

        }
    }
}