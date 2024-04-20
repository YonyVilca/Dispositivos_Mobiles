package com.example.ejercicio3

import android.media.MediaPlayer
import android.widget.Button
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // Declaramos una variable para almacenar el reproductor de medios
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// Obtenemos referencias a los botones de la interfaz de usuario
        val buttonPlay: Button = findViewById(R.id.button)
        val buttonPause: Button = findViewById(R.id.button2)
        val buttonStop: Button = findViewById(R.id.button3)
// Creamos el reproductor de medios y lo inicializamos con el archivo de audio en res/raw
        mediaPlayer = MediaPlayer.create(this, R.raw.music)
// Configuramos el listener de clic para el botón de reproducir
        buttonPlay.setOnClickListener{
            // Iniciamos la reproducción del audio
            mediaPlayer.start()
        }
        // Configuramos el listener de clic para el botón de pausa
        buttonPause.setOnClickListener{
            // Verificamos si el audio está reproduciéndose y lo pausamos si es así
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
            }
        }
        // Configuramos el listener de clic para el botón de detener
        buttonStop.setOnClickListener {
            mediaPlayer.stop()
            mediaPlayer.prepare()
            mediaPlayer.seekTo(0)

        }
}
    // Detenemos la reproducción del audio, lo preparamos para reproducir desde el principio y lo llevamos al inicio
    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()
    }
}