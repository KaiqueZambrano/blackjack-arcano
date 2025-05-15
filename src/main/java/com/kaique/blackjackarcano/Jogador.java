package com.kaique.blackjackarcano;

import java.util.Map;

public class Jogador extends Entidade {

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
    public void calcularMao() {
        int valorTotal = buff - debuff;
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
                valorTotal += valorPorCarta.get(carta.getValor());
            }
        }

        if (detectarCombinacao("Trinca")) {
            valorTotal += 3;
        } else if (detectarCombinacao("Dois Pares")) {
            valorTotal += 2;
        } else if (detectarCombinacao("Par")) {
            valorTotal += 1;
        }

        if (detectarCombinacao("Sequência de Cor")) {
            valorTotal += 4;
        } else if (detectarCombinacao("Sequência")) {
            valorTotal += 2;
        } else if (detectarCombinacao("Cor")) {
            valorTotal += 2;
        }

        while (valorTotal > Entidade.PONTUACAO_MAXIMA && qtdDeAses > 0) {
            valorTotal -= 10;
            qtdDeAses -= 1;
        }

        pontuacao = valorTotal;
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
