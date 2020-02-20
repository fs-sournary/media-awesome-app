/**
 * gkc_hash_code : 01DTTE3W3Z4Y56WHYW8SYCTXMK
 */

package com.example.mediaawesomeapp.ui.main

import com.example.mediaawesomeapp.R
import com.example.mediaawesomeapp.databinding.FragmentMainBinding
import com.example.mediaawesomeapp.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>() {

    override val viewModel: MainViewModel by viewModel()

    override val layoutId: Int = R.layout.fragment_main
}