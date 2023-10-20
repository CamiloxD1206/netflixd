package com.example.miprimerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var boton: Button
    lateinit var usuario: String
    lateinit var contraseña: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextUsuario: android.widget.EditText = findViewById(R.id.editTextUsuario)
        val editTextContraseña: android.widget.EditText = findViewById(R.id.editTextContraseña)

        boton = findViewById(R.id.boton)

        boton.setOnClickListener {
            usuario = editTextUsuario.text.toString()
            contraseña = editTextContraseña.text.toString()

            if (usuario == "camilo@misena.edu.co" && contraseña == "camilosalazar") {

                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)

                finish()
            } else {
                Toast.makeText(applicationContext, "Inicio de sesión fallido", Toast.LENGTH_LONG).show()
            }
        }
    }
}
