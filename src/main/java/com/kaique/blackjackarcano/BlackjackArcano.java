package com.kaique.blackjackarcano;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class BlackjackArcano {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println("Erro ao carregar o tema.");
        }
        
        var inicioForm = new InicioForm();
        inicioForm.setVisible(true);
    }
}
