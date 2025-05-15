package com.kaique.blackjackarcano;

import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;

public final class Baralho {

    private final Stack<Carta> cartas;
    private final Stack<Carta> descartes;

    public Baralho() {
        cartas = new Stack<>();
        descartes = new Stack<>();

        for (var naipe : Carta.NAIPES) {
            for (String valor : Carta.VALORES) {
                cartas.push(new Carta(naipe, valor));
            }
        }

        for (var arcano : Carta.ARCANOS_MAIORES) {
            cartas.push(new Carta(null, arcano));
        }

        Collections.shuffle(cartas);
    }
    
    public Carta comprarCarta() {
        if (cartas.isEmpty()) {
            return null;
        }
        return cartas.pop();
    }

    public void devolverCarta(Carta carta) {
        this.descartes.push(carta);
    }

    public ArrayList<Carta> mostrarCartas(int n) {
        ArrayList<Carta> cartasVisualizadas = new ArrayList<>();
        int size = Math.min(n, cartas.size());

        for (int i = 0; i < size; i++) {
            cartasVisualizadas.add(cartas.get(i));
        }

        return cartasVisualizadas;
    }

    public Stack<Carta> getCartas() {
        return cartas;
    }

    public Stack<Carta> getDescartes() {
        return descartes;
    }
}
