package com.example.mediaawesomeapp.ext

import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import androidx.annotation.IdRes
import androidx.appcompat.widget.SearchView
import androidx.core.view.updateLayoutParams
import androidx.databinding.BindingAdapter
import com.example.mediaawesomeapp.R
import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

/**
 * Created at 2020-02-03 by Sang
 */
fun SearchView.fromView(
    queryChangeAction: (String) -> Unit, querySubmitAction: (String) -> Unit
): Observable<String> {
    val subject = PublishSubject.create<String>()
    setOnQueryTextListener(object : SearchView.OnQueryTextListener {
        override fun onQueryTextSubmit(query: String?): Boolean {
            querySubmitAction.invoke(query ?: return false)
            return true
        }

        override fun onQueryTextChange(newText: String?): Boolean {
            queryChangeAction.invoke(newText ?: return false)
            subject.onNext(newText)
            return true
        }
    })
    return subject
}

@BindingAdapter(
    value = ["searchTextSize", "searchTextColor", "removeSearchButtonPadding"],
    requireAll = false
)
fun SearchView.customWidget(size: Float, @IdRes textColorId: Int, removed: Boolean) {
    val searchText = findViewById<View>(R.id.search_src_text)
    if (searchText is EditText) {
        searchText.textSize = size
        searchText.setTextColor(textColorId)
    }
    // Remove space between start and search icon (id = search_mag_icon)
    if (removed) {
        val searchEditFrame = findViewById<LinearLayout>(R.id.search_edit_frame)
        searchEditFrame.updateLayoutParams<LinearLayout.LayoutParams> {
            leftMargin = resources.getDimensionPixelSize(R.dimen.dp_4)
        }
    }
}
