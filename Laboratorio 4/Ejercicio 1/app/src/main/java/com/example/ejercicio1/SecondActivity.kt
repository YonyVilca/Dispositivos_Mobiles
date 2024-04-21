package com.example.ejercicio1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var btnBack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        imageView = findViewById(R.id.imageView)
        btnBack = findViewById(R.id.btnBack)

        // Obtener el índice de la imagen seleccionada de los extras
        val selectedImageIndex = intent.getIntExtra("selectedImageIndex", 0)
        val selectedImageName = "image${selectedImageIndex + 1}"

        // Asignar la imagen correspondiente al ImageView
        val resourceId = resources.getIdentifier(selectedImageName, "drawable", packageName)
        imageView.setImageResource(resourceId)

        btnBack.setOnClickListener {
            // Regresar a la actividad anterior
            onBackPressed()
        }
    }
}