package edu.bo.ucb.guia_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun selectedButton(view: View) {
        if ( view.id === R.id.servicios_button) {
            Toast.makeText( view.context, "Opción de Servicios", Toast.LENGTH_LONG).show()
        }else if(view.id === R.id.portafolio_button){
            Toast.makeText( view.context, "Opción de Portafolio", Toast.LENGTH_LONG).show()
        }else if(view.id === R.id.acerca_de_button){
            Toast.makeText( view.context, "Opción de Acerca de", Toast.LENGTH_LONG).show()
        }else if(view.id === R.id.contacto_button){
            Toast.makeText( view.context, "Opción de Contacto", Toast.LENGTH_LONG).show()
        }else if(view.id === R.id.redes_sociales_button){
            Toast.makeText( view.context, "Opción de Redes Sociales", Toast.LENGTH_LONG).show()
        }
        //Toast.makeText( view.context, "Evento no definido", Toast.LENGTH_LONG).show()
        //comentarios
    }
}

