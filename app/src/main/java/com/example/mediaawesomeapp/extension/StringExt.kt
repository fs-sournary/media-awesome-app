package com.example.mediaawesomeapp.extension

import android.os.Build
import android.text.Html
import android.text.Spanned
import com.example.mediaawesomeapp.util.Constants

/**
 * Created at 2020-02-03 by Sang
 */
fun String.getSpannedHtml(): Spanned = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
    Html.fromHtml(this, Html.FROM_HTML_MODE_LEGACY)
} else {
    Html.fromHtml(this)
}

fun String?.getAccessToken(): String? = when (this) {
    Constants.DEF_ACCESS_TOKEN, null -> null
    else -> "Bearer $this"
}
