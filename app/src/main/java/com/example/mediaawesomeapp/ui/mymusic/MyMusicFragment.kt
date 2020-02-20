package com.example.mediaawesomeapp.ui.mymusic

import androidx.fragment.app.viewModels
import com.example.mediaawesomeapp.R
import com.example.mediaawesomeapp.databinding.FragmentMyMusicBinding
import com.example.mediaawesomeapp.ui.common.BaseFragment

/**
 * Created in 13/02/2020 by Sang
 */
class MyMusicFragment : BaseFragment<FragmentMyMusicBinding, MyMusicViewModel>() {

    override val layoutId: Int = R.layout.fragment_my_music

    override val viewModel: MyMusicViewModel by viewModels()

    override fun setup() {
    }
}
