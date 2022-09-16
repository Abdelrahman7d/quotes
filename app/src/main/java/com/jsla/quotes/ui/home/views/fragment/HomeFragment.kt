package com.jsla.quotes.ui.home.views.fragment

import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.jsla.quotes.R
import com.jsla.quotes.core.view.MyBlurBuilder.applyBlur
import com.jsla.quotes.databinding.FragmentHomeBinding
import com.jsla.quotes.ui.home.views.adapter.QuotesViewPagerAdapter
import com.jsla.quotes.ui.home.views.viewModel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var homeViewModel : HomeViewModel
    private lateinit var quotesViewPagerAdapter: QuotesViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        initializeViewModel()
        initializeComponents()

        return root
    }

    private fun initializeComponents() {

        quotesViewPagerAdapter = createPagerAdapter()
    }

    private fun createPagerAdapter(): QuotesViewPagerAdapter {
        return QuotesViewPagerAdapter()
    }

    private fun initializeViewModel() {

        homeViewModel =
            ViewModelProvider(this)[HomeViewModel::class.java]

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}