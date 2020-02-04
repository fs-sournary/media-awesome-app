package com.example.mediaawesomeapp.util

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.core.view.updatePadding
import com.example.mediaawesomeapp.R
import com.google.android.material.appbar.AppBarLayout

/**
 * Created at 2020-01-02 by Sang
 * Important class that make app can fit system window.
 */
object EdgeToEdge {

    fun setupRoot(root: ViewGroup) {
        root.systemUiVisibility =
            View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
    }

    fun setupAppBar(appbar: AppBarLayout, toolbar: Toolbar) {
        val toolbarPadding = toolbar.resources.getDimensionPixelSize(R.dimen.dp_16)
        appbar.setOnApplyWindowInsetsListener { _, insets ->
            appbar.updatePadding(top = insets.systemWindowInsetTop)
            toolbar.updatePadding(
                left = toolbarPadding + insets.systemWindowInsetLeft,
                right = insets.systemWindowInsetRight
            )
            insets
        }
    }

    fun setupScrollingContent(scrollingContent: ViewGroup) {
        val originalPaddingLeft = scrollingContent.paddingLeft
        val originalPaddingRight = scrollingContent.paddingRight
        val originalPaddingBottom = scrollingContent.paddingBottom
        scrollingContent.setOnApplyWindowInsetsListener { _, insets ->
            scrollingContent.updatePadding(
                left = originalPaddingLeft + insets.systemWindowInsetLeft,
                right = originalPaddingRight + insets.systemWindowInsetRight,
                bottom = originalPaddingBottom + insets.systemWindowInsetBottom
            )
            insets
        }
    }
}
