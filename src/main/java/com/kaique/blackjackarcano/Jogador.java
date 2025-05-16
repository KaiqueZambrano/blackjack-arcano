package com.kaique.blackjackarcano;

import java.util.Map;

public final class Jogador extends Entidade {

    private int aposta;
    private int buff;
    private int debuff;
    private boolean parou;

    public Jogador(Baralho baralho, int aposta) {
        super(baralho);
        this.aposta = aposta;
        buff = 0;
        debuff = 0;
        parou = false;
    }

    @Override
    public Carta adicionarNaMao(Baralho baralho) {
        Carta carta = baralho.comprarCarta();
        mao.add(carta);
        calcularMao();
        
        return carta;
    }
    
    @Override
    public void calcularMao() {
        pontuacao = buff - debuff;
        int qtdDeAses = 0;

        Map<String, Integer> valorPorCarta = Map.ofEntries(
                Map.entry("2", 2),
                Map.entry("3", 3),
                Map.entry("4", 4),
                Map.entry("5", 5),
                Map.entry("6", 6),
                Map.entry("7", 7),
                Map.entry("8", 8),
                Map.entry("9", 9),
                Map.entry("10", 10),
                Map.entry("Valete", 10),
                Map.entry("Cavaleiro", 10),
                Map.entry("Rainha", 10),
                Map.entry("Rei", 10),
                Map.entry("Ás", 11)
        );

        for (Carta carta : mao) {
            if (carta.getValor().equals("Ás")) {
                qtdDeAses += 1;
            }

            if (carta.getNaipe() != null) {
                pontuacao += valorPorCarta.get(carta.getValor());
            }
        }
        
        if (detectarCombinacao("Trinca")) 
            pontuacao += 3;
        else if (detectarCombinacao("Dois Pares"))
            pontuacao += 2;
        else if (detectarCombinacao("Par"))
            pontuacao += 1;

        if (detectarCombinacao("Sequência de Cor"))
            pontuacao += 4;
        else if (detectarCombinacao("Sequência"))
            pontuacao += 2;
        else if (detectarCombinacao("Cor"))
            pontuacao += 2;
        
        while (pontuacao > BlackjackArcano.PONTUACAO_MAXIMA && qtdDeAses > 0) {
            pontuacao -= 10;
            qtdDeAses -= 1;
        }
    }

    public int getAposta() {
        return aposta;
    }

    public void setAposta(int aposta) {
        this.aposta = aposta;
    }

    public int getBuff() {
        return buff;
    }

    public void setBuff(int buff) {
        this.buff = buff;
    }

    public int getDebuff() {
        return debuff;
    }

    public void setDebuff(int debuff) {
        this.debuff = debuff;
    }

    public boolean isParou() {
        return parou;
    }

    public void setParou(boolean parou) {
        this.parou = parou;
    }
}
