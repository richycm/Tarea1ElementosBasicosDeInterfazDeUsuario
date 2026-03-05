package com.example.elementosuiapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BotonesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflamos el layout del fragmento
        return inflater.inflate(R.layout.fragment_botones, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Usamos onViewCreated para asegurar que la vista ya esté lista
        val btnFilled: Button? = view.findViewById(R.id.btnFilled)
        val btnImage: ImageButton? = view.findViewById(R.id.btnImage)
        val fabSmall: FloatingActionButton? = view.findViewById(R.id.fabSmall)

        // Asignamos los clics
        btnFilled?.setOnClickListener { showToast("Botón Normal presionado") }
        btnImage?.setOnClickListener { showToast("Botón de Imagen presionado") }
        fabSmall?.setOnClickListener { showToast("Botón Flotante presionado") }
    }

    private fun showToast(mensaje: String) {
        context?.let {
            Toast.makeText(it, mensaje, Toast.LENGTH_SHORT).show()
        }
    }
}