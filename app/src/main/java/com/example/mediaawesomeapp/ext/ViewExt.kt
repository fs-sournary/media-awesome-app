package com.example.mediaawesomeapp.ext

import android.view.View
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter

/**
 * Created at 2020-02-05 by Sang
 */
@BindingAdapter(value = ["visibleGone"])
fun View.showHide(show: Boolean) {
    isVisible = show
}
