package com.example.cp1_mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        bt_segunda_tela.setOnClickListener {
            IrParaSegundaTela()
        }

    }
    private  fun IrParaSegundaTela(){

        val segundaTela = Intent(this,SegundaTela::class.java)
        startActivity(SegundaTela)
    }
}