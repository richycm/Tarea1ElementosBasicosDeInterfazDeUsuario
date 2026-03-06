package com.example.elementosuiapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment

class ListasFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_listas, container, false)

        val listView = view.findViewById<ListView>(R.id.listView)
        val tvInfoTitulo = view.findViewById<TextView>(R.id.tvInfoTitulo)
        val tvInfoDescripcion = view.findViewById<TextView>(R.id.tvInfoDescripcion)
        
        val temasTarea = arrayOf(
            "TextFields (EditText)",
            "Botones (Button)",
            "ImageButton",
            "CheckBox",
            "RadioButton",
            "Switch",
            "ListView",
            "TextView",
            "ImageView",
            "ProgressBar"
        )

        // Usamos el layout personalizado item_lista para que herede el color del tema
        val adapter = ArrayAdapter(requireContext(), R.layout.item_lista, temasTarea)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val seleccionado = temasTarea[position]
            val explicacion = when(position) {
                0 -> "Permite al usuario ingresar y editar texto. Es fundamental para formularios y búsquedas."
                1 -> "Componente interactivo que ejecuta una acción específica al ser presionado por el usuario."
                2 -> "Un botón que muestra una imagen o icono en lugar de texto para una interfaz más visual."
                3 -> "Permite al usuario seleccionar una o varias opciones de un conjunto de elementos."
                4 -> "Permite seleccionar solo una opción de un grupo. Al marcar uno, el anterior se desmarca."
                5 -> "Un interruptor de dos estados (encendido/apagado) ideal para configuraciones y ajustes."
                6 -> "Muestra una lista de elementos desplazable. Es muy eficiente para manejar muchos datos."
                7 -> "Muestra texto estático que el usuario no puede editar. Se usa para etiquetas y títulos."
                8 -> "Se utiliza para mostrar imágenes, fotos o recursos gráficos dentro de la aplicación."
                9 -> "Indica visualmente el progreso de una operación, como una descarga o una carga de datos."
                else -> "Elemento de interfaz estándar de Android."
            }
            
            tvInfoTitulo.text = seleccionado
            tvInfoDescripcion.text = explicacion
        }

        return view
    }
}