package mx.edu.tecmm.moviles.practica6

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var txtNombre: TextView
    lateinit var txtTelefono: TextView
    lateinit var txtCarrera: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNombre = findViewById(R.id.txtNombre)
        txtTelefono = findViewById(R.id.txtTelefono)
        txtCarrera = findViewById(R.id.txtCarrera)


    }


    override fun onResume() {
        super.onResume()

        val MisPreferencias = getSharedPreferences("Mis datos", Context.MODE_PRIVATE)

        val nombre = MisPreferencias.getString("Nombre","Antonio López Prado")
        val telefono = MisPreferencias.getString("Telefono","3322710230")
        val carrera = MisPreferencias.getString("Carrera", "Ing. Informatica")
        txtNombre.text=nombre
        txtTelefono.text=telefono
        txtCarrera.text=carrera
    }

    fun abrirAgregar(v: View){
        val intent = Intent(this, AgregarP::class.java)
        startActivity(intent)
    }
}