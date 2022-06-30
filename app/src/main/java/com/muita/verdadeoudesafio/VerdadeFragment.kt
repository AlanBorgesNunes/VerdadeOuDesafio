package com.muita.verdadeoudesafio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.muita.verdadeoudesafio.databinding.FragmentVerdadeBinding


class VerdadeFragment : Fragment() {
    private lateinit var binding: FragmentVerdadeBinding
    private val go: MutableList<String> = mutableListOf("Quem você levaria dessa roda para uma ilha deserta?",
        "O que você faria com 1 milhão de reais agora?",
        "Qual é a sua maior vergonha na vida?","Se você pudesse mudar algo em você, o que seria?",
        "Qual foi o sonho mais estranho que você já teve?","Se hoje fosse o seu último dia de vida, o que você faria?",
    "É verdade que ninguém te chamou para sair nessa semana?","De 0 a 10, que nota você daria para o (escolha alguém) em termos de (beleza, simpatia, inteligência)?",
    "É verdade que você já ficou com alguém dessa roda?", "Biscoito ou bolacha? Defenda sua teoria.",
    "Coxinha pela pontinha ou pela bundinha?","O que os olhos não vêem o coração não sente?",
    "Qual foi o pior presente que você já recebeu?","Se o mundo fosse acabar e você pudesse salvar apenas uma pessoa para sobreviver, quem seria?",
    "Você já nadou pelado?","Qual o seu pior hábito?","É possível morrer de amor?","É verdade que você já foi traído?",
    "O que não pode faltar na sua geladeira?","Você passaria a noite com alguém por 1 milhão de reais?",
    "É verdade que você já mandou nudes?","Como foi o seu primeiro beijo?","Você já beijou mais de uma pessoa no mesmo dia? Quantas?",
    "Carnaval na folia ou no campo?","Dormir pelado ou com roupa?","Você ficaria tranquilo se todo o histórico do seu WhatsApp ficasse público agora?",
    "Entre quatro paredes vale tudo?","Qual é o seu maior orgulho?","É verdade que você ficaria com alguém que está presente aqui na roda?",
    "Você se acha bonito?","Qual foi o motivo do seu último término?","Para onde você viajaria agora?",
    "Mãe ou pai?","Se você pudesse trazer de volta uma pessoa que já morreu, quem seria?",
    "Se você pudesse mudar algo na história da humanidade, o que mudaria?","Em qual país você gostaria de morar?",
    "Qual animal você gostaria de ser?","Em uma máquina do tempo, para que época da história ou momento da sua vida você voltaria?",
    "É verdade que você já mentiu brincando de verdade ou desafio?","WhatsApp ou Facebook?",
    "Qual é a sua técnica de sedução infalível?","O que te tira do sério?",
    "Se você só pudesse salvar uma pessoa dessa sala de um incêndio, quem você salvaria?","Qual foi a maior mentira que você já contou?",
    "Bar ou balada?","Como foi a primeira vez que você beijou na boca?",
    "Qual estilo de música você não suporta?","Já fez xixi na rua?","Qual característica você realmente valoria em um amigo?",
    "Já foi pego pela polícia por alguma coisa?","Você acredita em casamento?","Quem é a pessoa mais inteligente do mundo, para você?",
    "O que realmente é muito brega para você?","Já comeu comida que seria jogada fora?")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVerdadeBinding.inflate(layoutInflater).apply {
            viewLifecycleOwner
        }
        initView()

        return binding.root
    }

    private fun initView() {
        val nome1 = requireArguments().getString("UU")

        binding.saveName.text = nome1

        frases()

    }
    private fun frases(){
        val frases: Int = (0 until (go.size)).random()

        val jhon = go[frases]

        binding.receivFrases.text = jhon

    }
}