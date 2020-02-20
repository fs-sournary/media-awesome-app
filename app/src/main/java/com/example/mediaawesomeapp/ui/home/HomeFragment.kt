package com.example.mediaawesomeapp.ui.home

import androidx.fragment.app.viewModels
import com.example.mediaawesomeapp.R
import com.example.mediaawesomeapp.databinding.FragmentHomeBinding
import com.example.mediaawesomeapp.ui.common.BaseFragment

/**
 * Created in 11/02/2020 by Sang
 */
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(){

    override val layoutId: Int = R.layout.fragment_home

    override val viewModel: HomeViewModel by viewModels()

    override fun setup() {
    }
}
