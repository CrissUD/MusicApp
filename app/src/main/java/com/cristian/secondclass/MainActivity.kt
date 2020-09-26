package com.cristian.secondclass

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import com.cristian.secondclass.model.Song
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var myTextView: TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // forma larga de buscar un elemento en el xml
        myTextView = findViewById(R.id.title);

        val songList: MutableList<Song> = mutableListOf()

        songList.add(Song(
            resources.getDrawable(R.drawable.bullet_cover, theme),
            "Scream Aim Fire",
            "Bullet for my Valentine")
        )
        songList.add(Song(
            resources.getDrawable(R.drawable.metallica_cover, theme),
            "And Justice for All",
            "Metallica")
        )
        songList.add(Song(
            resources.getDrawable(R.drawable.obscura_cover, theme),
            "Omnivium",
            "Obscura")
        )
        songList.add(Song(
            resources.getDrawable(R.drawable.queen_cover, theme),
            "Bohemian Raphsody",
            "Queen")
        )
        playListScroll.adapter = SongAdapter(songList)
        playListScroll.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
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

    fun showSong(view: View) {
        var intent = Intent(this, SongDetailsActivity::class.java)
        startActivity(intent)
    }
}