package com.example.mediaawesomeapp.ui.common

import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.mediaawesomeapp.BR
import java.util.concurrent.Executors

/**
 * Created in 11/02/2020 by Sang
 */
abstract class BaseDataListAdapter<T, V : ViewDataBinding>(diffCallback: DiffUtil.ItemCallback<T>) :
    ListAdapter<T, BaseDataViewHolder<V>>(
        AsyncDifferConfig.Builder<T>(diffCallback)
            .setBackgroundThreadExecutor(Executors.newSingleThreadExecutor())
            .build()
    ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseDataViewHolder<V> {
        val binding = createBinding(parent, viewType)
        return BaseDataViewHolder(binding)
    }

    protected abstract fun createBinding(parent: ViewGroup, viewType: Int): V

    override fun onBindViewHolder(holder: BaseDataViewHolder<V>, position: Int) {
        val item = getItem(position) ?: return
        holder.binding.setVariable(BR.item, item)
        bindData(item)
        holder.binding.executePendingBindings()
    }

    /**
     * Bind more into your item.
     */
    protected open fun bindData(item: T) {}
}
