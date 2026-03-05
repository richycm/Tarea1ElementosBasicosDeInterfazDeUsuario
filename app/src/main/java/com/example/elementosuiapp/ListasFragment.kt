package com.example.elementosuiapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment

class ListasFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_listas, container, false)

        val listView = view.findViewById<ListView>(R.id.listView)
        
        // Regresamos a la lista sencilla con temas de la tarea
        val temasTarea = arrayOf(
            "1. TextFields (EditText)",
            "2. Botones (Button)",
            "3. ImageButton con iconos",
            "4. CheckBox para opciones",
            "5. RadioButtons para grupos",
            "6. Switch de encendido/apagado",
            "7. ListView para listas simples",
            "8. TextView para información",
            "9. ImageView para fotos",
            "10. ProgressBar para carga",
            "11. Fragments para navegación",
            "12. Navigation Bar inferior"
        )

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, temasTarea)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(requireContext(), "Tema: ${temasTarea[position]}", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}