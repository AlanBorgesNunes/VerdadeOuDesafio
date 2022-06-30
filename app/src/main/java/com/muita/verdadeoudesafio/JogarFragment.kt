package com.muita.verdadeoudesafio

import android.app.AlertDialog
import android.os.Bundle
import android.os.Handler
import android.service.voice.VoiceInteractionSession
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.muita.verdadeoudesafio.databinding.FragmentJogarBinding
import kotlin.random.Random


class JogarFragment : Fragment() {
    private lateinit var binding: FragmentJogarBinding
    private val handler = Handler()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentJogarBinding.inflate(layoutInflater).apply {
           viewLifecycleOwner
       }
        initView()
        return binding.root
    }

    private fun initView() {
        val homem = requireArguments().getString("HOMEM")
        val mulher = requireArguments().getString("MULHER")

        binding.receivHomem.text = homem
        binding.receivMulher.text = mulher

        val random = Random.nextInt(5)




        binding.btnGirar.setOnClickListener {
              handler.post(runnable)

            if (random == 0){
                nomeEscolhidoHomem()
            }else if(random == 1){
               nomeEscolhidoMulher()
            }else if (random == 2){
                nomeEscolhidoHomem()

            }else if (random == 3){
              nomeEscolhidoMulher()

            }else if (random == 4){
                nomeEscolhidoHomem()

            }else if (random == 5){
              nomeEscolhidoMulher()
            }

        }


    }
    private val runnable: Runnable
    get() = Runnable{
        anim()
    }

    private fun anim(){
        val image2 = binding.linearGira

        image2.animate().apply {
            duration = 1000
            scaleXBy(.1f)
            scaleYBy(.1f)
            rotationYBy(360f)
        }.start()

    }

    private fun nomeEscolhidoHomem(){
        val homem = requireArguments().getString("HOMEM")

        val view = View.inflate(requireContext(), R.layout.dialog_ops, null)
        val builder = AlertDialog.Builder(requireContext())
        builder.setView(view)
        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        val verdade = view.findViewById<Button>(R.id.btn_verdade)
        val desafio = view.findViewById<Button>(R.id.btn_desafio)
        val nome = view.findViewById<TextView>(R.id.receiv_nome_dialog)

        nome.text = homem

        val bundle = bundleOf(
            "UU" to homem + ","
        )



        verdade.setOnClickListener {
                findNavController().navigate(
                    R.id.action_jogarFragment_to_verdadeFragment,
                    bundle
                )
            dialog.dismiss()
        }

        desafio.setOnClickListener {
            findNavController().navigate(
                R.id.action_jogarFragment_to_desafioFragment,
                bundle
            )

            dialog.dismiss()
        }


    }

    private fun nomeEscolhidoMulher(){
        val mulher = requireArguments().getString("MULHER")

        val view = View.inflate(requireContext(), R.layout.dialog_ops, null)
        val builder = AlertDialog.Builder(requireContext())
        builder.setView(view)
        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        val verdade = view.findViewById<Button>(R.id.btn_verdade)
        val desafio = view.findViewById<Button>(R.id.btn_desafio)
        val nome = view.findViewById<TextView>(R.id.receiv_nome_dialog)

        nome.text = mulher
        val bundle = bundleOf(
            "UU" to mulher + ","
        )


        verdade.setOnClickListener {
            findNavController().navigate(
                R.id.action_jogarFragment_to_verdadeFragment,
                bundle
            )

            dialog.dismiss()
        }

        desafio.setOnClickListener {
            findNavController().navigate(
                R.id.action_jogarFragment_to_desafioFragment,
                bundle

            )

            dialog.dismiss()
        }
    }

}