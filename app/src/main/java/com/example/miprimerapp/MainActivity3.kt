package com.example.miprimerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    lateinit var boton: Button
    lateinit var editTextTitulo: EditText
    lateinit var editTextDescripcion: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        boton = findViewById(R.id.teardrops)
        editTextTitulo = findViewById(R.id.titulopeli)
        editTextDescripcion = findViewById(R.id.descripcionpeli)
        boton.setOnClickListener{
            val intentdos = Intent(this, MainActivity2::class.java)
            val titulo = editTextTitulo.text.toString()
            val descripcion = editTextDescripcion.text.toString()
            intentdos.putExtra("titulo", titulo)
            intentdos.putExtra("descripcion", descripcion)
            startActivity(intentdos)

            finish()
        }
    }
}