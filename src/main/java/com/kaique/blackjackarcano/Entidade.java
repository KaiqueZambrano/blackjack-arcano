package com.kaique.blackjackarcano;

import java.util.ArrayList;

public abstract class Entidade {

    public final static int PONTUACAO_MAXIMA = 33;

    protected final ArrayList<Carta> mao;
    protected int pontuacao;
    protected boolean estourou;

    public Entidade(Baralho baralho) {
        mao = new ArrayList<>();

        Carta carta1 = baralho.comprarCarta();
        Carta carta2 = baralho.comprarCarta();

        mao.add(carta1);
        mao.add(carta2);

        pontuacao = 0;
        estourou = false;
    }

    public void adicionarNaMao(Baralho baralho) {
        Carta carta = baralho.comprarCarta();
        mao.add(carta);
    }

    public abstract void calcularMao();

    public ArrayList<Carta> getMao() {
        return mao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public boolean isEstourou() {
        return estourou;
    }

    public void setEstourou(boolean estourou) {
        this.estourou = estourou;
    }
}
