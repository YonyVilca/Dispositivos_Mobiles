package com.example.ejercicio3

import android.media.MediaPlayer
import android.widget.Button
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPlay: Button = findViewById(R.id.button)
        val buttonPause: Button = findViewById(R.id.button2)
        val buttonStop: Button = findViewById(R.id.button3)

        mediaPlayer = MediaPlayer.create(this, R.raw.music)

        buttonPlay.setOnClickListener{
            mediaPlayer.start()
        }
        buttonPause.setOnClickListener{
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
            }
        }
        buttonStop.setOnClickListener {
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