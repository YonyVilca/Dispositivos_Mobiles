package com.example.ejercicio1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// Clase principal de la actividad
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// Obtener referencia al ImageButton en el layout
        val imageView = findViewById<ImageButton>(R.id.img_view)

// Configurar el listener para el ImageButton
        imageView.setOnClickListener {
            // Mostrar un Toast con el mensaje "¡Universidad la Salle!"
            Toast.makeText(this, "¡Universidad la Salle!", Toast.LENGTH_SHORT).show()
        }
    }
}