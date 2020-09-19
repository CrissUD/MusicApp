package com.cristian.secondclass

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var myTextView: TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // forma larga de buscar un elemento en el xml
        myTextView = findViewById(R.id.title);
    }

    fun showColor(view: View) {
        // forma corta de buscar un elemento en el xml
        imgPause.setBackgroundColor(Color.parseColor("#270E43"));
        var song: String = searchInput.text.toString();
        if(song.isEmpty()) {
            myTextView.text = "Esta Vacio";
        } else {
            myTextView.text = "Hola ${song}";
        }
    }
}