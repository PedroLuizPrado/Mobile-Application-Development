package com.example.cp1mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var  buttonAvancar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        buttonAvancar = findViewById(R.id.btnProximaPagina)
        buttonAvancar.setOnClickListener{
            val NavegarTelaInicial = Intent(this, TelaDois ::class.java )

            startActivity(NavegarTelaInicial)
        }

    }
}