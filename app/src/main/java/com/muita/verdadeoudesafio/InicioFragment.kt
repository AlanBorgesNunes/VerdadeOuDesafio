package com.muita.verdadeoudesafio

import android.app.ProgressDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.muita.verdadeoudesafio.databinding.FragmentInicioBinding

class InicioFragment : Fragment() {
    private lateinit var binding: FragmentInicioBinding
    private var mInterstitialAd: InterstitialAd? = null
    private lateinit var mProgressDialog: ProgressDialog
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInicioBinding.inflate(layoutInflater).apply {
            viewLifecycleOwner
        }
        initView()
        return binding.root
    }

    private fun initView() {
        interAnuncio()
        binding.casal.setOnClickListener {
            showInter1()
        }

        binding.grupo.setOnClickListener {
          showInter2()
        }

        politicas()


    }

    private fun politicas(){
        binding.politicas.setOnClickListener {
         findNavController().navigate(
             R.id.action_inicioFragment_to_politicasFragment
         )
        }
    }


    private fun interAnuncio(){
        var adRequest = AdRequest.Builder().build()

        InterstitialAd.load(requireContext(),"ca-app-pub-6827886217820908/4462401649", adRequest,
            object : InterstitialAdLoadCallback() {
                override fun onAdFailedToLoad(adError: LoadAdError) {
                    mInterstitialAd = null
                }

                override fun onAdLoaded(interstitialAd: InterstitialAd) {
                    mInterstitialAd = interstitialAd
                }
            })

    }

    private fun showInter1(){

        if (mInterstitialAd != null){
            mInterstitialAd?.fullScreenContentCallback = object : FullScreenContentCallback(){
                override fun onAdClicked() {
                    super.onAdClicked()
                }

                override fun onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent()

                    findNavController().navigate(
                        R.id.action_inicioFragment_to_nomesCasalFragment
                    )

                }

                override fun onAdFailedToShowFullScreenContent(p0: AdError) {
                    super.onAdFailedToShowFullScreenContent(p0)
                }

                override fun onAdImpression() {
                    super.onAdImpression()
                }

                override fun onAdShowedFullScreenContent() {
                    super.onAdShowedFullScreenContent()
                }

            }

            mInterstitialAd?.show(requireActivity())
        }
    }

    private fun showInter2(){

        if (mInterstitialAd != null){
            mInterstitialAd?.fullScreenContentCallback = object : FullScreenContentCallback(){
                override fun onAdClicked() {
                    super.onAdClicked()
                }

                override fun onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent()

                    findNavController().navigate(
                        R.id.action_inicioFragment_to_nomesGrupoFragment
                    )

                }

                override fun onAdFailedToShowFullScreenContent(p0: AdError) {
                    super.onAdFailedToShowFullScreenContent(p0)
                }

                override fun onAdImpression() {
                    super.onAdImpression()
                }

                override fun onAdShowedFullScreenContent() {
                    super.onAdShowedFullScreenContent()
                }

            }

            mInterstitialAd?.show(requireActivity())
        }
    }
}