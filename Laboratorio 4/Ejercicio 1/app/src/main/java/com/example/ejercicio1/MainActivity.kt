package com.example.ejercicio1

import android.os.Bundle
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    private lateinit var spinner: Spinner
    private lateinit var btnNext:Button
    private val images = arrayOf("Image1", "image2", "image3")
    private var selectedImageIndex: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinner = findViewById(R.id.spinner)
        btnNext = findViewById(R.id.btnNext)
// Adaptador para el Spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, images)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        // Restaurar el índice seleccionado del Spinner si hay datos guardados
        if (savedInstanceState != null) {
            selectedImageIndex = savedInstanceState.getInt("selectedImageIndex", 0)
            spinner.setSelection(selectedImageIndex)
        }

        // Configurar el listener de selección del Spinner
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: android.view.View?, position: Int, id: Long) {
                selectedImageIndex = position
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        btnNext.setOnClickListener {
            // Iniciar la segunda actividad y pasar el índice de la imagen seleccionada
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("selectedImageIndex", selectedImageIndex)
            }
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        // Guardar el índice seleccionado del Spinner
        outState.putInt("selectedImageIndex", selectedImageIndex)
        super.onSaveInstanceState(outState)
    }
}