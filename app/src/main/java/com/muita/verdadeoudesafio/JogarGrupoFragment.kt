package com.muita.verdadeoudesafio

import android.app.AlertDialog
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.muita.verdadeoudesafio.databinding.FragmentJogarGrupoBinding
import kotlin.random.Random

class JogarGrupoFragment : Fragment() {
    private lateinit var binding: FragmentJogarGrupoBinding
    private val handler = Handler()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentJogarGrupoBinding.inflate(layoutInflater).apply {
            viewLifecycleOwner
        }
        initView()
        return binding.root
    }

    private fun initView() {
        val nome1 = requireArguments().getString("NOME1")
        val nome2 = requireArguments().getString("NOME2")
        val nome3 = requireArguments().getString("NOME3")
        val nome4 = requireArguments().getString("NOME4")
        val nome5 = requireArguments().getString("NOME5")
        val nome6 = requireArguments().getString("NOME6")

        binding.receivNome1.text = nome1
        binding.receivNome2.text = nome2
        binding.receivNome3.text = nome3
        binding.receivNome4.text = nome4
        binding.receivNome5.text = nome5
        binding.receivNome6.text = nome6


        val random = Random.nextInt(12)


        binding.btnGirar.setOnClickListener {
              handler.post(runnable)
            if (random == 0){
                nomeEscolhido1()
            }else if(random == 1){
                nomeEscolhido2()
            }else if (random == 2){
                nomeEscolhido3()

            }else if (random == 3){
                nomeEscolhido4()

            }else if (random == 4){
                nomeEscolhido5()

            }else if (random == 5){
                nomeEscolhido6()

            }else if (random == 6){
                nomeEscolhido1()

            }else if (random == 7){
                nomeEscolhido2()

            }else if (random == 8){
                nomeEscolhido3()

            }else if (random == 9){
                nomeEscolhido4()

            }else if (random == 10){
                nomeEscolhido5()

            }else if (random == 11){
                nomeEscolhido6()

            }else if (random == 12){
                nomeEscolhido1()

            }
        }


    }

    private fun nomeEscolhido1() {

        val nome1 = requireArguments().getString("NOME1")

        val view = View.inflate(requireContext(), R.layout.dialog_ops, null)
        val builder = AlertDialog.Builder(requireContext())
        builder.setView(view)
        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        val verdade = view.findViewById<Button>(R.id.btn_verdade)
        val desafio = view.findViewById<Button>(R.id.btn_desafio)
        val nome = view.findViewById<TextView>(R.id.receiv_nome_dialog)

        nome.text = nome1

        val bundle = bundleOf(
            "UU" to nome1 + ","
        )

        verdade.setOnClickListener {
            findNavController().navigate(
                R.id.action_jogarGrupoFragment_to_verdadeGrupoFragment,
                bundle
            )
            dialog.dismiss()
        }

        desafio.setOnClickListener {
            findNavController().navigate(
                R.id.action_jogarGrupoFragment_to_desafioGrupoFragment,
                bundle
            )
            dialog.dismiss()
        }



    }

    private fun nomeEscolhido2() {
        val nome2 = requireArguments().getString("NOME2")

        val view = View.inflate(requireContext(), R.layout.dialog_ops, null)
        val builder = AlertDialog.Builder(requireContext())
        builder.setView(view)
        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        val verdade = view.findViewById<Button>(R.id.btn_verdade)
        val desafio = view.findViewById<Button>(R.id.btn_desafio)
        val nome = view.findViewById<TextView>(R.id.receiv_nome_dialog)

        nome.text = nome2

        val bundle = bundleOf(
            "UU" to nome2 + ","
        )

        verdade.setOnClickListener {
            findNavController().navigate(
                R.id.action_jogarGrupoFragment_to_verdadeGrupoFragment,
                bundle
            )
            dialog.dismiss()
        }

        desafio.setOnClickListener {
            findNavController().navigate(
                R.id.action_jogarGrupoFragment_to_desafioGrupoFragment,
                bundle
            )
            dialog.dismiss()
        }
    }

    private fun nomeEscolhido3() {
        val nome3 = requireArguments().getString("NOME3")

        val view = View.inflate(requireContext(), R.layout.dialog_ops, null)
        val builder = AlertDialog.Builder(requireContext())
        builder.setView(view)
        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        val verdade = view.findViewById<Button>(R.id.btn_verdade)
        val desafio = view.findViewById<Button>(R.id.btn_desafio)
        val nome = view.findViewById<TextView>(R.id.receiv_nome_dialog)

        nome.text = nome3

        val bundle = bundleOf(
            "UU" to nome3 + ","
        )

        verdade.setOnClickListener {
            findNavController().navigate(
                R.id.action_jogarGrupoFragment_to_verdadeGrupoFragment,
                bundle
            )

            dialog.dismiss()
        }

        desafio.setOnClickListener {
            findNavController().navigate(
                R.id.action_jogarGrupoFragment_to_desafioGrupoFragment,
                bundle
            )
            dialog.dismiss()
        }
    }

    private fun nomeEscolhido4() {
        val nome4 = requireArguments().getString("NOME4")

        val view = View.inflate(requireContext(), R.layout.dialog_ops, null)
        val builder = AlertDialog.Builder(requireContext())
        builder.setView(view)
        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        val verdade = view.findViewById<Button>(R.id.btn_verdade)
        val desafio = view.findViewById<Button>(R.id.btn_desafio)
        val nome = view.findViewById<TextView>(R.id.receiv_nome_dialog)

        nome.text = nome4

        val bundle = bundleOf(
            "UU" to nome4 + ","
        )

        verdade.setOnClickListener {
            findNavController().navigate(
                R.id.action_jogarGrupoFragment_to_verdadeGrupoFragment,
                bundle
            )
            dialog.dismiss()
        }

        desafio.setOnClickListener {
            findNavController().navigate(
                R.id.action_jogarGrupoFragment_to_desafioGrupoFragment,
                bundle
            )

            dialog.dismiss()

        }
    }

    private fun nomeEscolhido5() {
        val nome5 = requireArguments().getString("NOME5")

        val view = View.inflate(requireContext(), R.layout.dialog_ops, null)
        val builder = AlertDialog.Builder(requireContext())
        builder.setView(view)
        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        val verdade = view.findViewById<Button>(R.id.btn_verdade)
        val desafio = view.findViewById<Button>(R.id.btn_desafio)
        val nome = view.findViewById<TextView>(R.id.receiv_nome_dialog)

        nome.text = nome5

        val bundle = bundleOf(
            "UU" to nome5 + ","
        )

        verdade.setOnClickListener {
            findNavController().navigate(
                R.id.action_jogarGrupoFragment_to_verdadeGrupoFragment,
                bundle
            )
            dialog.dismiss()
        }

        desafio.setOnClickListener {
            findNavController().navigate(
                R.id.action_jogarGrupoFragment_to_desafioGrupoFragment,
                bundle
            )
            dialog.dismiss()
        }
    }

    private fun nomeEscolhido6() {
        val nome6 = requireArguments().getString("NOME6")

        val view = View.inflate(requireContext(), R.layout.dialog_ops, null)
        val builder = AlertDialog.Builder(requireContext())
        builder.setView(view)
        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        val verdade = view.findViewById<Button>(R.id.btn_verdade)
        val desafio = view.findViewById<Button>(R.id.btn_desafio)
        val nome = view.findViewById<TextView>(R.id.receiv_nome_dialog)

        nome.text = nome6

        val bundle = bundleOf(
            "UU" to nome6 + ","
        )

        verdade.setOnClickListener {
            findNavController().navigate(
                R.id.action_jogarGrupoFragment_to_verdadeGrupoFragment,
                bundle
            )

            dialog.dismiss()
        }

        desafio.setOnClickListener {
            findNavController().navigate(
                R.id.action_jogarGrupoFragment_to_desafioGrupoFragment,
                bundle
            )
            dialog.dismiss()
        }
    }

    private val runnable: Runnable
        get() = Runnable{
            anim()
        }

    private fun anim() {
        val image2 = binding.horia

        image2.animate().apply {
            duration = 1000
            scaleXBy(.1f)
            scaleYBy(.1f)
            rotationYBy(360f)
        }.start()
    }

}