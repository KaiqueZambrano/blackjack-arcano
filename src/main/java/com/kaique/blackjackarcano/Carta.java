package com.kaique.blackjackarcano;

public class Carta {

    public static final String[] NAIPES = {"Espadas", "Paus", "Copas", "Ouros"};
    public static final String[] VALORES = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "Valete", "Cavaleiro", "Rainha", "Rei", "Ás"
    };
    public static final String[] ARCANOS_MAIORES = {
        "O Louco", "O Mago", "A Sacerdotisa", "A Imperatriz", "O Imperador",
        "O Hierofante", "Os Amantes", "O Carro", "A Força", "O Eremita",
        "A Roda da Fortuna", "A Justiça", "O Enforcado", "A Morte",
        "A Temperança", "O Diabo", "A Torre", "A Estrela",
        "A Lua", "O Sol", "O Julgamento", "O Mundo"
    };

    private String naipe;
    private String valor;

    public Carta(String naipe, String valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return (valor + (naipe != null ? " de " + naipe : ""));
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
