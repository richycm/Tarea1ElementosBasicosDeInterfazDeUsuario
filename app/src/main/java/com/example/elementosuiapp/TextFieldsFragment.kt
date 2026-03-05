package com.example.elementosuiapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class TextFieldsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflamos el diseño del fragmento
        val view = inflater.inflate(R.layout.fragment_text_fields, container, false)

        // Buscamos los elementos del diseño XML por su ID
        val etEntrada = view.findViewById<EditText>(R.id.etEntrada)
        val btnMostrar = view.findViewById<Button>(R.id.btnMostrar)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultado)

        // Programamos el botón para que al hacer clic cambie el texto de abajo
        btnMostrar.setOnClickListener {
            val textoIngresado = etEntrada.text.toString()

            if (textoIngresado.isNotEmpty()) {
                tvResultado.text = "¡Hola, $textoIngresado! Bienvenido a mi tarea."
            } else {
                tvResultado.text = "Por favor, escribe un nombre primero."
            }
        }

        return view
    }
}