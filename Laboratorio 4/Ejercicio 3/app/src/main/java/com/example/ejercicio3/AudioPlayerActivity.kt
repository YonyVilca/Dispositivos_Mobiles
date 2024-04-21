package com.example.ejercicio3

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AudioPlayerActivity : AppCompatActivity() {
    private lateinit var audioName: String
    private lateinit var  mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_player)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val textAudioName = findViewById<TextView>(R.id.textAudioName)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val btnPause = findViewById<Button>(R.id.btnPause)
        val btnStop = findViewById<Button>(R.id.btnStop)

        val selectedAudio = intent.getStringExtra("selectedAudio")
        audioName = selectedAudio ?: "Audio Desconocido"
        textAudioName.text = audioName

        // Configuración del MediaPlayer
        val audioResourceId = resources.getIdentifier(selectedAudio?.toLowerCase(), "raw", packageName)
        mediaPlayer = MediaPlayer.create(this, audioResourceId)

        btnPlay.setOnClickListener {
            mediaPlayer.start()
        }

        btnPause.setOnClickListener {
            mediaPlayer.pause()
        }

        btnStop.setOnClickListener {
            mediaPlayer.stop()
            mediaPlayer.prepare()
            mediaPlayer.seekTo(0)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()

    }
}