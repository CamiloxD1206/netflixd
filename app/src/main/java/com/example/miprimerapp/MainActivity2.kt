package com.example.miprimerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var eltal: TextView
    lateinit var elotrotal: TextView
    lateinit var boton: Button
    lateinit var boton2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        eltal = findViewById(R.id.titulo)
        elotrotal = findViewById(R.id.descripcion)

        val titulo = intent.getStringExtra("titulo")
        val descripcion = intent.getStringExtra("descripcion")

        eltal.text = titulo
        elotrotal.text = descripcion

        boton = findViewById(R.id.botonSalir)
        boton.setOnClickListener{
            val intentdos = Intent(this, MainActivity::class.java)
            startActivity(intentdos)

            finish()
        }

        boton2=findViewById(R.id.botondevolver)
        boton2.setOnClickListener{
            val intentdos = Intent(this, MainActivity3::class.java)
            startActivity(intentdos)

            finish()
        }
    }
}
