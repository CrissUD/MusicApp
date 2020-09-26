package com.cristian.secondclass

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.cristian.secondclass.model.Song
import kotlinx.android.synthetic.main.item_song.view.*

class SongViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun bind(item: Song) {
        itemView.songImage.setImageDrawable(item.image)
        itemView.songNameText.text = item.nameSong
        itemView.artistNameText.text = item.artistName
    }
}