package com.kaique.blackjackarcano;

import java.util.Map;

public final class Dealer extends Entidade {
    
    public Dealer(Baralho baralho) {
        super(baralho);
    }

    @Override
    public void calcularMao() {
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

        if (detectarCombinacao("Trinca")) {
            pontuacao += 3;
        } else if (detectarCombinacao("Dois Pares")) {
            pontuacao += 2;
        } else if (detectarCombinacao("Par")) {
            pontuacao += 1;
        }

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
}
