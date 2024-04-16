package com.example.ejercicio1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageButton>(R.id.img_view)

        // Agregar un listener al clic de la imagen
        imageView.setOnClickListener {
            // Mostrar un Toast con un mensaje personalizado
            Toast.makeText(this, "¡Clic en la imagen!", Toast.LENGTH_SHORT).show()
        }
    }
}