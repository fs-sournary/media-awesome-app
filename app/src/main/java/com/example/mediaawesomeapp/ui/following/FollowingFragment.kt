package com.example.mediaawesomeapp.ui.following

import androidx.fragment.app.viewModels
import com.example.mediaawesomeapp.R
import com.example.mediaawesomeapp.databinding.FragmentFollowingBinding
import com.example.mediaawesomeapp.ui.common.BaseFragment

/**
 * Created in 13/02/2020 by Sang
 */
class FollowingFragment : BaseFragment<FragmentFollowingBinding, FollowingViewModel>() {

    override val layoutId: Int = R.layout.fragment_following

    override val viewModel: FollowingViewModel by viewModels()

    override fun setup() {

    }
}
