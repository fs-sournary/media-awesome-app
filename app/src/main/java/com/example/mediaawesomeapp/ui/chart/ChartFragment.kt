package com.example.mediaawesomeapp.ui.chart

import androidx.fragment.app.viewModels
import com.example.mediaawesomeapp.R
import com.example.mediaawesomeapp.databinding.FragmentChartBinding
import com.example.mediaawesomeapp.ui.common.BaseFragment

/**
 * Created in 13/02/2020 by Sang
 */
class ChartFragment : BaseFragment<FragmentChartBinding, ChartViewModel>(){

    override val layoutId: Int = R.layout.fragment_chart

    override val viewModel: ChartViewModel by viewModels()

    override fun setup() {
    }
}
