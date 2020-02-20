/**
 * gkc_hash_code : 01DTTE3W3Z4Y56WHYW8SYCTXMK
 */

package com.example.mediaawesomeapp.ui.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseViewModel : ViewModel() {

    private val compositeDisposable = CompositeDisposable()

    fun addDisposable(disposable: Disposable) {
        compositeDisposable.addAll(disposable)
    }

    fun onDestroy() {
        compositeDisposable.clear()
    }
}