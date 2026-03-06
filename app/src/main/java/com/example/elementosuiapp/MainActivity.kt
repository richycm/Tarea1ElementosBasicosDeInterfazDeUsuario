package com.example.elementosuiapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        // 1. Crear las pestañas
        tabLayout.addTab(tabLayout.newTab().setText("Texto"))
        tabLayout.addTab(tabLayout.newTab().setText("Botones"))
        tabLayout.addTab(tabLayout.newTab().setText("Selección"))
        tabLayout.addTab(tabLayout.newTab().setText("Listas"))
        tabLayout.addTab(tabLayout.newTab().setText("Info"))

        // 2. Recuperar la posición si la app se reinició (por el modo oscuro)
        val posicionGuardada = savedInstanceState?.getInt("TAB_ACTUAL") ?: 0
        tabLayout.getTabAt(posicionGuardada)?.select()

        // 3. Escuchar los cambios de pestaña
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val fragmento = when (tab?.position) {
                    0 -> TextFieldsFragment()
                    1 -> BotonesFragment()
                    2 -> SeleccionFragment()
                    3 -> ListasFragment()
                    4 -> InformacionFragment()
                    else -> TextFieldsFragment()
                }
                cambiarFragmento(fragmento)
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })

        // 4. Cargar el fragmento inicial solo la primera vez que se abre la app
        if (savedInstanceState == null) {
            cambiarFragmento(TextFieldsFragment())
        }
    }

    // Esta función guarda la pestaña actual antes de que la app se reinicie
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        outState.putInt("TAB_ACTUAL", tabLayout.selectedTabPosition)
    }

    private fun cambiarFragmento(fragmento: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.contenedorFragmentos, fragmento)
            .commit()
    }
}