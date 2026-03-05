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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_seleccion, container, false)

        val cbTerminos = view.findViewById<CheckBox>(R.id.cbTerminos)
        val rgOpciones = view.findViewById<RadioGroup>(R.id.rgOpciones)
        val swModoOscuro = view.findViewById<SwitchCompat>(R.id.swModoOscuro)
        val tvSeleccionResult = view.findViewById<TextView>(R.id.tvSeleccionResult)

        // 1. Detectar si el teléfono ya está en modo oscuro para marcar el Switch
        val currentNightMode = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
        swModoOscuro.isChecked = (currentNightMode == Configuration.UI_MODE_NIGHT_YES)

        // 2. Programar el Switch para cambiar el tema
        swModoOscuro.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

        // Otros listeners para que la pantalla sea interactiva
        cbTerminos.setOnCheckedChangeListener { _, _ -> actualizarEstado(tvSeleccionResult, cbTerminos, rgOpciones) }
        rgOpciones.setOnCheckedChangeListener { _, _ -> actualizarEstado(tvSeleccionResult, cbTerminos, rgOpciones) }

        return view
    }

    private fun actualizarEstado(tv: TextView, cb: CheckBox, rg: RadioGroup) {
        val terminos = if (cb.isChecked) "Aceptados" else "Sin Aceptar"
        val id = rg.checkedRadioButtonId
        val plataforma = if (id != -1) view?.findViewById<RadioButton>(id)?.text else "Ninguna"
        tv.text = "Términos: $terminos | Plataforma: $plataforma"
    }
}