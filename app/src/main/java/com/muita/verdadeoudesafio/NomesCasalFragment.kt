package com.muita.verdadeoudesafio

import android.app.ProgressDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.muita.verdadeoudesafio.databinding.FragmentNomesCasalBinding


class NomesCasalFragment : Fragment() {
    private lateinit var binding: FragmentNomesCasalBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNomesCasalBinding.inflate(layoutInflater).apply {
            viewLifecycleOwner
        }
        initView()
       return binding.root
    }

    private fun initView() {
        val homem = binding.homem.text.toString()
        val mulher = binding.mulher.text



        binding.btnIniciar.setOnClickListener {

            if (binding.homem.text.toString().isBlank()||binding.mulher.text.toString().isBlank()){
                Toast.makeText(requireContext(),
                "Campos obrigatórios em branco.",
                Toast.LENGTH_SHORT).show()

            }else{

                val bundle = bundleOf(
                    "HOMEM" to binding.homem.text.toString(),
                    "MULHER" to binding.mulher.text.toString()
                )
                findNavController().navigate(
                    R.id.action_nomesCasalFragment_to_jogarFragment,
                    bundle
                )

            }

        }
    }

}