package com.example.copa.data

import com.example.copa.R
import com.example.copa.model.ArabiaEscalacao

class Datasource {

    fun loadEscalacao(): List<ArabiaEscalacao>{
        return listOf<ArabiaEscalacao>(
            ArabiaEscalacao(R.string.treinador, R.drawable.tecnico_herverenard),
            ArabiaEscalacao(R.string.jogador1, R.drawable.goleiro_mohammedaiowais),
            ArabiaEscalacao(R.string.jogador2, R.drawable.meiocampo_mohamedkanno),
            ArabiaEscalacao(R.string.jogador3, R.drawable.meiocampo_salmanalfaraj),
            ArabiaEscalacao(R.string.jogador4, R.drawable.meiocampo_nawafalabed),
            ArabiaEscalacao(R.string.jogador5, R.drawable.zagueiro_abdulellahalamalki),
            ArabiaEscalacao(R.string.jogador6, R.drawable.zagueiro_alialbulayhi),
            ArabiaEscalacao(R.string.jogador7, R.drawable.centroavante_firasalburaikan),
            ArabiaEscalacao(R.string.jogador8, R.drawable.centroavante_salehalshehri),
            ArabiaEscalacao(R.string.jogador9, R.drawable.ponta_hattanbahebri),
            ArabiaEscalacao(R.string.jogador10, R.drawable.ponta_salemaldawsari),
            ArabiaEscalacao(R.string.jogador11, R.drawable.lateraldireito_mohammedalbreik),
            ArabiaEscalacao(R.string.jogador12, R.drawable.volante_abdullahotayf)
        )
    }
}