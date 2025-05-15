package com.kaique.blackjackarcano;

import java.util.Map;

public class Dealer extends Entidade {

    public Dealer(Baralho baralho) {
        super(baralho);
    }

    @Override
    public void calcularMao() {
        int valorTotal = 0;
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
}
