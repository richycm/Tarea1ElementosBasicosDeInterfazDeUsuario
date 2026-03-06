package com.example.elementosuiapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BotonesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_botones, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnFilled: Button? = view.findViewById(R.id.btnFilled)
        val btnImage: ImageButton? = view.findViewById(R.id.btnImage)
        val fabSmall: FloatingActionButton? = view.findViewById(R.id.fabSmall)
        
        val tvTitulo: TextView? = view.findViewById(R.id.tvInfoBotonesTitulo)
        val tvDesc: TextView? = view.findViewById(R.id.tvInfoBotonesDesc)

        btnFilled?.setOnClickListener { 
            tvTitulo?.text = "Botón Normal"
            tvDesc?.text = "Componente básico para ejecutar una acción principal al hacer clic."
        }
        btnImage?.setOnClickListener { 
            tvTitulo?.text = "ImageButton"
            tvDesc?.text = "Botón que usa una imagen o icono en lugar de texto para una interfaz más visual."
        }
        fabSmall?.setOnClickListener { 
            tvTitulo?.text = "Floating Action Button"
            tvDesc?.text = "Botón circular que 'flota' sobre la interfaz para acciones rápidas y prominentes."
        }
    }
}