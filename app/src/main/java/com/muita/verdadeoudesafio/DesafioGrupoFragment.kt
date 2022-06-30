package com.muita.verdadeoudesafio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muita.verdadeoudesafio.databinding.FragmentDesafioGrupoBinding
import com.muita.verdadeoudesafio.databinding.FragmentJogarGrupoBinding


class DesafioGrupoFragment : Fragment() {
    private lateinit var binding: FragmentDesafioGrupoBinding
    private val go: MutableList<String> = mutableListOf("Brinque com as condições climáticas e do lugar. Por exemplo, se está frio, desafie a pessoa a dar uma volta pela casa sem casaco. Se está calor, a pular na piscina de roupa;","Ser a pessoa que serve as bebidas até o final dessa rodada.","Fazer o máximo de flexões que você conseguir em 1 minuto",

        "Virar um shot de alguma bebida","Dance o funk do momento equilibrando um copo na cabeça.","Parar na frente de uma janela na rua e começar a cantar uma serenata.","Dê um beijo no pé da pessoa do seu lado direito.",

        "Ficar sem olhar o celular até o final da brincadeira.","Trocar o status de relacionamento no Facebook.","Postar uma foto feia nas redes sociais.","Dance uma música de forró com alguém da roda.",

        "Fazer um elogio a um desconhecido na festa ou na rua.","Escolher uma música para cantar até o final sem errar.","Encenar um trecho de filme para todos.","Rebolar em um bambolê imaginário.",

        "Escolha alguém para publicar uma mensagem qualquer em seu Facebook.","Ficar sem usar a palavra não até o final da rodada ou brincadeira.","Lamber o cotovelo.","Encostar a língua no nariz.",

        "Colocar o pé atrás da cabeça.","Escolher alguém da roda para dançar valsa e dançarem.","Fazer uma imitação de algum famoso ou de alguém que está na roda.","Passar uma rodada brincando com os olhos vendados.",

        "Ligar para alguém que por algum motivo a pessoa não conversa há muito tempo.","Passar uma rodada falando com algum sotaque ou em outro idioma.","Mastigar um alho cru.","Crie uma música de rap usando nome de todos que fazem parte da brincadeira.",

        "Jogue capoeira com alguém da roda.","Comer uma colher com canela.","Fique com 1 cubo de gelo no bolso até o final da brincadeira.","Engolir um gelo em menos de 1 minuto sem voltá-lo ao copo.",

        "Cantar uma música sem olhar a letra.","Inventar uma poesia que rime com alguma palavra (escolher uma palavra bizarra)","Simular um pedido de casamento.","Improvisar um número de musical com a situação da brincadeira.",

        "Tomar 1 litro de água no menor tempo possível.","Fazer uma parada de mãos.","Dance frevo.","Tirar uma peça de roupa (casaco, sapatos, brincos...)",

        "Fazer o máximo de flexões que você conseguir em 1 minuto.","Desligar o celular até o final do jogo.","Falar na língua do 'pê' até o final da rodada.","Abrir uma garrafa de cerveja sem abridor.",

        "Mude a sua foto de perfil no Facebook com a sua pior foto.","Passar a próxima rodada com os olhos vendados.","Pronunciar 'farofa' com 1 colher e farofa na boca.","Fazer uma pose de yoga.",

        "Improvisar uma coreografia de balé.","Toma água de uma tigela como se fosse um cachorro.","Imitar um gato se limpando.","Revelar a última mensagem que você mandou no WhatsApp.")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDesafioGrupoBinding.inflate(layoutInflater).apply {
            viewLifecycleOwner
        }
        initView()
        return binding.root
    }

    private fun initView() {
        val tt = requireArguments().getString("UU")

        binding.saveName.text = tt

        val frases : Int = (0 until (go.size)).random()
        val jhon = go[frases]
        binding.receivFeasesDesafio.text = jhon
    }




}