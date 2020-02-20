package com.example.mediaawesomeapp.ui.common

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

/**
 * Created in 11/02/2020 by Sang
 *
 * Each layout that bind data must include a "item" variable.
 */
class BaseDataViewHolder<V : ViewDataBinding>(val binding: V) :
    RecyclerView.ViewHolder(binding.root)
