package com.example.mediaawesomeapp.ui.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.example.mediaawesomeapp.BR
import com.example.mediaawesomeapp.ext.autoClear

/**
 * Created in 11/02/2020 by Sang
 */
abstract class BaseFragment<V : ViewDataBinding, VM : ViewModel> : Fragment() {

    protected var binding by autoClear<V>()

    protected abstract val layoutId: Int

    protected abstract val viewModel: VM

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            setVariable(BR.viewModel, viewModel)
            lifecycleOwner = viewLifecycleOwner
            executePendingBindings()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // For save state, we can use SavedState in ViewModel
        setup()
    }

    abstract fun setup()
}
