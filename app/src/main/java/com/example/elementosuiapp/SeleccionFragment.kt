package com.example.elementosuiapp

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat
import androidx.fragment.app.Fragment

class SeleccionFragment : Fragment() {

    private var ultimoTipoSeleccionado: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_seleccion, container, false)

        val cbTerminos = view.findViewById<CheckBox>(R.id.cbTerminos)
        val rgOpciones = view.findViewById<RadioGroup>(R.id.rgOpciones)
        val swModoOscuro = view.findViewById<SwitchCompat>(R.id.swModoOscuro)
        
        val tvResumenDesc = view.findViewById<TextView>(R.id.tvResumenDesc)
        val tvGuiaTitulo = view.findViewById<TextView>(R.id.tvInfoSeleccionTitulo)
        val tvGuiaDesc = view.findViewById<TextView>(R.id.tvInfoSeleccionDesc)

        // Recuperar el estado guardado tras el cambio de tema
        ultimoTipoSeleccionado = savedInstanceState?.getString("ULTIMA_GUIA")

        val currentNightMode = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
        swModoOscuro.isChecked = (currentNightMode == Configuration.UI_MODE_NIGHT_YES)

        fun actualizarResumenYGuia(tipo: String = "") {
            // Actualizar resumen de elecciones (lo que flota arriba)
            val terminadosText = if (cbTerminos.isChecked) "Aceptado ✅" else "No aceptado ❌"
            val idSeleccionado = rgOpciones.checkedRadioButtonId
            val opcionText = if (idSeleccionado != -1) {
                view.findViewById<RadioButton>(idSeleccionado)?.text ?: "Ninguna"
            } else {
                "Ninguna"
            }
            tvResumenDesc.text = "Términos: $terminadosText\nPlataforma: $opcionText"

            // Actualizar guía técnica (en la caja de abajo)
            // Si tipo está vacío, intentamos usar el último tipo guardado
            val tipoAMostrar = if (tipo.isNotEmpty()) tipo else ultimoTipoSeleccionado
            
            if (tipoAMostrar != null) {
                ultimoTipoSeleccionado = tipoAMostrar
                when (tipoAMostrar) {
                    "CHECK" -> {
                        tvGuiaTitulo.text = "CheckBox"
                        tvGuiaDesc.text = "Permite selecciones múltiples. Es ideal para opciones independientes como 'Aceptar términos'."
                    }
                    "RADIO" -> {
                        tvGuiaTitulo.text = "RadioButton"
                        tvGuiaDesc.text = "Se usa dentro de un RadioGroup para permitir una sola elección entre varias. Al elegir una, se desmarca la otra."
                    }
                    "SWITCH" -> {
                        tvGuiaTitulo.text = "Switch"
                        tvGuiaDesc.text = "Interruptor binario (encendido/apagado). Muy común para activar configuraciones como el Modo Oscuro."
                    }
                }
            }
        }

        // --- LISTENERS DE INTERACCIÓN REAL ---
        
        // Usamos setOnClickListener para que solo se dispare cuando el usuario toca el componente,
        // evitando que la restauración del estado sobrescriba la guía técnica.

        swModoOscuro.setOnClickListener {
            val isChecked = swModoOscuro.isChecked
            actualizarResumenYGuia("SWITCH")
            
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

        cbTerminos.setOnClickListener {
            actualizarResumenYGuia("CHECK")
        }

        // Para los RadioButtons, ponemos el click individual para la GUÍA
        for (i in 0 until rgOpciones.childCount) {
            rgOpciones.getChildAt(i).setOnClickListener {
                actualizarResumenYGuia("RADIO")
            }
        }

        // El OnCheckedChangeListener se encarga de actualizar el RESUMEN de texto (arriba)
        rgOpciones.setOnCheckedChangeListener { _, _ ->
            actualizarResumenYGuia("") // Solo actualiza resumen
        }

        // Inicialización (Carga el resumen y la guía si había algo guardado)
        actualizarResumenYGuia()

        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        // Guardamos el tipo de guía que estaba activa
        outState.putString("ULTIMA_GUIA", ultimoTipoSeleccionado)
    }
}