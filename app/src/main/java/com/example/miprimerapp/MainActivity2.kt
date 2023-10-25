package com.example.miprimerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    lateinit var boton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        boton = findViewById(R.id.botonSalir)
        boton.setOnClickListener{
            val intentdos = Intent(this, MainActivity::class.java)
            startActivity(intentdos)

            finish()
        }
    }
}