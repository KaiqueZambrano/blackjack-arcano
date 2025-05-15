package com.kaique.blackjackarcano;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    protected boolean detectarCombinacao(String combinacao) {
        List<String> ordemDasCartas = Arrays.asList(
                "Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Valete", "Cavaleiro", "Rainha", "Rei", "Ás"
        );
        
        Map<String, Integer> qtdDeCartasPorValor = new HashMap<>();
        Map<String, List<String>> listaDeCartasPorNaipe = new HashMap<>();
        
        for (var carta : mao) {
            if (carta.getNaipe() != null) {
                String valor = carta.getValor();
                String naipe = carta.getNaipe();

                qtdDeCartasPorValor.put(valor, qtdDeCartasPorValor.getOrDefault(valor, 0) + 1);

                if (!listaDeCartasPorNaipe.containsKey(naipe)) {
                    listaDeCartasPorNaipe.put(naipe, new ArrayList<>());
                }
                listaDeCartasPorNaipe.get(naipe).add(valor);
            }
        }

        boolean temPar = false;
        boolean temDoisPares = false;
        boolean temSequencia = false;
        boolean temCor = false;
        boolean temTrinca = false;
        boolean temQuadra = false;
        boolean temSequenciaDeCor = false;

        switch (combinacao) {
            case "Par" -> {
                for (var carta : qtdDeCartasPorValor.entrySet()) {
                    if (carta.getValue() == 2) {
                        temPar = true;
                    }
                }

                return temPar;
            }

            case "Dois Pares" -> {
                int pares = 0;

                for (var carta : qtdDeCartasPorValor.entrySet()) {
                    if (carta.getValue() == 2) {
                        pares++;
                    }
                }

                if (pares > 1)
                    temDoisPares = true;

                return temDoisPares;
            }

            case "Sequência" -> {
                for (int i = 0; i < ordemDasCartas.size() - 2; i++) {
                    String carta1 = ordemDasCartas.get(i);
                    String carta2 = ordemDasCartas.get(i + 1);
                    String carta3 = ordemDasCartas.get(i + 2);

                    if (qtdDeCartasPorValor.getOrDefault(carta1, 0) > 0
                            && qtdDeCartasPorValor.getOrDefault(carta2, 0) > 0
                            && qtdDeCartasPorValor.getOrDefault(carta3, 0) > 0) {
                        temSequencia = true;
                        break;
                    }
                }

                return temSequencia;
            }

            case "Cor" -> {
                for (var listaDeCartas : listaDeCartasPorNaipe.values()) {
                    if (listaDeCartas.size() >= 3) {
                        temCor = true;
                    }
                }

                return temCor;
            }
            
            case "Trinca" -> {
                for (var carta : qtdDeCartasPorValor.entrySet()) {
                    if (carta.getValue() == 3) {
                        temTrinca = true;
                    }
                }

                return temTrinca;
            }
            
            case "Quadra" -> {
                for (var carta : qtdDeCartasPorValor.entrySet()) {
                    if (carta.getValue() == 4) {
                        temQuadra = true;
                    }
                }

                return temQuadra;
            }

            case "Sequência de Cor" -> {
                for (var cartasDoMesmoNaipe : listaDeCartasPorNaipe.values()) {
                    for (int i = 0; i < ordemDasCartas.size() - 2; i++) {
                        String c1 = ordemDasCartas.get(i);
                        String c2 = ordemDasCartas.get(i + 1);
                        String c3 = ordemDasCartas.get(i + 2);

                        if (cartasDoMesmoNaipe.contains(c1)
                                && cartasDoMesmoNaipe.contains(c2)
                                && cartasDoMesmoNaipe.contains(c3)) {
                            temSequenciaDeCor = true;
                        }
                    }
                }

                return temSequenciaDeCor;
            }

            default -> {
                return false;
            }
        }
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
