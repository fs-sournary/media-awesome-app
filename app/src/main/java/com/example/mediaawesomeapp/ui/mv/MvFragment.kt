package com.example.mediaawesomeapp.ui.mv

import androidx.fragment.app.viewModels
import com.example.mediaawesomeapp.R
import com.example.mediaawesomeapp.databinding.FragmentMvBinding
import com.example.mediaawesomeapp.ui.common.BaseFragment

/**
 * Created in 13/02/2020 by Sang
 */
class MvFragment : BaseFragment<FragmentMvBinding, MvViewModel>(){

    override val layoutId: Int = R.layout.fragment_mv

    override val viewModel: MvViewModel by viewModels()

    override fun setup() {
    }
}
