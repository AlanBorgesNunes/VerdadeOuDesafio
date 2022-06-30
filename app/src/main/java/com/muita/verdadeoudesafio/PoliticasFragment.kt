package com.muita.verdadeoudesafio

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import com.muita.verdadeoudesafio.databinding.FragmentPoliticasBinding

class PoliticasFragment : Fragment() {
    private lateinit var binding: FragmentPoliticasBinding
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPoliticasBinding.inflate(layoutInflater).apply {
            viewLifecycleOwner
        }
        initView()
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initView() {
        binding.webview.webViewClient = WebViewClient()
        binding.webview.apply {
            loadUrl("https://myteam-bras.blogspot.com/2022/06/verdade-ou-desafio.html")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
        }
    }


}