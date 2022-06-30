package com.muita.verdadeoudesafio

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.muita.verdadeoudesafio.databinding.FragmentNomesGrupoBinding


class NomesGrupoFragment : Fragment() {
    private lateinit var binding: FragmentNomesGrupoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNomesGrupoBinding.inflate(layoutInflater).apply {
            viewLifecycleOwner
        }
        initView()
        return binding.root
    }

    private fun initView() {



        binding.btnIniciar.setOnClickListener {
            if (binding.recebeuNome1.text.isBlank()||binding.recebeuNome2.text.isBlank()||binding.recebeuNome3.text.isBlank()){
                Toast.makeText(requireContext(),
                "Voce precisar ter pelo menos 3 pessoas para começar!",
                Toast.LENGTH_LONG).show()
            }else{

                val bundle = bundleOf(
                    "NOME1" to binding.recebeuNome1.text.toString(),
                    "NOME2" to binding.recebeuNome2.text.toString(),
                    "NOME3" to binding.recebeuNome3.text.toString(),
                    "NOME4" to binding.recebeuNome4.text.toString(),
                    "NOME5" to binding.recebeuNome5.text.toString(),
                    "NOME6" to binding.recebeuNome6.text.toString()
                )

                findNavController().navigate(
                    R.id.action_nomesGrupoFragment_to_jogarGrupoFragment,
                    bundle
                )
            }
        }



    }

}