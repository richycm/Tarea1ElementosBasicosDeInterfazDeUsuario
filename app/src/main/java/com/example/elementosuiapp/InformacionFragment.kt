package com.example.elementosuiapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class InformacionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // En este fragmento solo mostramos información, 
        // así que solo inflamos la vista.
        return inflater.inflate(R.layout.fragment_informacion, container, false)
    }
}