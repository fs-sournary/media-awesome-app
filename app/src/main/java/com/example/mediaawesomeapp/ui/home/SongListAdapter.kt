package com.example.mediaawesomeapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import com.example.mediaawesomeapp.databinding.ItemSongBinding
import com.example.mediaawesomeapp.model.Song
import com.example.mediaawesomeapp.ui.common.BaseDataListAdapter

/**
 * Created in 11/02/2020 by Sang
 */
class SongListAdapter : BaseDataListAdapter<Song, ItemSongBinding>(COMPARATOR) {

    override fun createBinding(parent: ViewGroup, viewType: Int): ItemSongBinding =
        ItemSongBinding.inflate(LayoutInflater.from(parent.context), parent, false)

    companion object {

        val COMPARATOR = object : DiffUtil.ItemCallback<Song>() {
            override fun areItemsTheSame(oldItem: Song, newItem: Song): Boolean = false

            override fun areContentsTheSame(oldItem: Song, newItem: Song): Boolean = false
        }
    }
}