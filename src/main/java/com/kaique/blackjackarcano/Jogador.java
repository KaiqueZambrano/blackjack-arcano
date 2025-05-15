package com.kaique.blackjackarcano;

import java.util.HashMap;
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

    private boolean detectarCombinacao(String combinacao) {
        Map<String, Integer> quantidadeDeCartas = new HashMap<>();
        Map<String, Integer> quantidadeDeNaipes = new HashMap<>();
        
        for (Carta carta : mao) {
            if (carta.getNaipe() != null) {
                String valor = carta.getValor();
                String naipe = carta.getNaipe();
                
                quantidadeDeCartas.put(valor, quantidadeDeCartas.getOrDefault(valor, 0) + 1);
                quantidadeDeNaipes.put(naipe, quantidadeDeNaipes.getOrDefault(naipe, 0) + 1);
            }
        }
        
        boolean temPar = false;
        boolean temDoisPares = false;
        boolean temTrinca = false;
        boolean temSequencia = false;
        boolean temCor = false;
        boolean temSequenciaDeCor = false;

        switch (combinacao) {
            case "Par" -> {
                return temPar;
            }
            case "Dois Pares" -> {
                return temDoisPares;
            }
            case "Trinca" -> {
                return temTrinca;
            }
            case "Sequência" -> {
                return temSequencia;
            }
            case "Cor" -> {
                return temCor;
            }
            case "Sequência de Cor" -> {
                return temSequenciaDeCor;
            }
            default -> {
                return false;
            }
        }
    }

    @Override
    public void calcularMao() {
        int valorTotal = buff - debuff;
        int qtdDeAses = 0;

        Map<String, Integer> valorPorCarta = new HashMap<>();

        valorPorCarta.put("2", 2);
        valorPorCarta.put("3", 3);
        valorPorCarta.put("4", 4);
        valorPorCarta.put("5", 5);
        valorPorCarta.put("6", 6);
        valorPorCarta.put("7", 7);
        valorPorCarta.put("8", 8);
        valorPorCarta.put("9", 9);
        valorPorCarta.put("10", 10);
        valorPorCarta.put("Valete", 10);
        valorPorCarta.put("Cavaleiro", 10);
        valorPorCarta.put("Rainha", 10);
        valorPorCarta.put("Rei", 10);
        valorPorCarta.put("Ás", 11);

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
