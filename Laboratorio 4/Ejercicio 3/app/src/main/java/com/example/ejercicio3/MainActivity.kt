package com.example.ejercicio3

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var spinner: Spinner
    private lateinit var btnSelect : Button
    private lateinit var selectedAudio : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinner = findViewById(R.id.spinnerAudios)
        btnSelect = findViewById(R.id.btnSelect)

        val audios = arrayOf("audio1", "audio2", "audio3", "audio4", "audio5")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, audios)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                selectedAudio = audios[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        btnSelect.setOnClickListener {
            val intent = Intent(this, AudioPlayerActivity::class.java).apply {
                putExtra("selectedAudio", selectedAudio)
            }
            startActivity(intent)
        }



    }
}