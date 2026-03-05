package com.example.elementosuiapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Quitamos enableEdgeToEdge para evitar el error del margen
        setContentView(R.layout.activity_main)

        // Buscamos los botones
        val btnText = findViewById<Button>(R.id.btnText)
        val btnBotones = findViewById<Button>(R.id.btnBotones)
        val btnSeleccion = findViewById<Button>(R.id.btnSeleccion)
        val btnListas = findViewById<Button>(R.id.btnListas)
        val btnInfo = findViewById<Button>(R.id.btnInfo)

        // Programamos clics
        btnText.setOnClickListener { cambiarFragmento(TextFieldsFragment()) }
        btnBotones.setOnClickListener { cambiarFragmento(BotonesFragment()) }
        btnSeleccion.setOnClickListener { cambiarFragmento(SeleccionFragment()) }
        btnListas.setOnClickListener { cambiarFragmento(ListasFragment()) }
        btnInfo.setOnClickListener { cambiarFragmento(InformacionFragment()) }

        // Al abrir, cargar el primer fragmento
        if (savedInstanceState == null) {
            cambiarFragmento(TextFieldsFragment())
        }
    }

    private fun cambiarFragmento(fragmento: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.contenedorFragmentos, fragmento)
            .commit()
    }
}