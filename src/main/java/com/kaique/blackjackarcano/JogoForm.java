package com.kaique.blackjackarcano;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public final class JogoForm extends javax.swing.JFrame {

    private final List<JLabel> cartaLabels = new ArrayList<>();
    private final List<JLabel> descCartaLabels = new ArrayList<>();
    private int cartasNaMao = 0;

    public JogoForm(int aposta) {
        initComponents();

        cartaLabels.add(cartaUmLabel);
        cartaLabels.add(cartaDoisLabel);
        cartaLabels.add(cartaTresLabel);
        cartaLabels.add(cartaQuatroLabel);
        cartaLabels.add(cartaCincoLabel);

        descCartaLabels.add(descCartaUmLabel);
        descCartaLabels.add(descCartaDoisLabel);
        descCartaLabels.add(descCartaTresLabel);
        descCartaLabels.add(descCartaQuatroLabel);
        descCartaLabels.add(descCartaCincoLabel);

        var baralho = new Baralho();
        var gerenciador = new GerenciadorDeImagens();

        var jogador = new Jogador(baralho, aposta);
        var dealer = new Dealer(baralho);

        Carta c1 = jogador.adicionarNaMao(baralho);
        mostrarCartaNaMao(gerenciador, c1);

        Carta c2 = jogador.adicionarNaMao(baralho);
        mostrarCartaNaMao(gerenciador, c2);
        
        dealer.adicionarNaMao(baralho);
        dealer.adicionarNaMao(baralho);
        
        dealer.calcularMao();
        jogador.calcularMao();
        
        pontuacaoLabel.setText("Pontuação: " + Integer.toString(jogador.getPontuacao()));
    }

    public void mostrarCartaNaMao(GerenciadorDeImagens gerenciador, Carta carta) {
        var labelCarta = cartaLabels.get(cartasNaMao);
        var labelDesc = descCartaLabels.get(cartasNaMao);

        var imagemOriginal = (BufferedImage) gerenciador.getImagemDaCarta(carta);

        int largura = labelCarta.getWidth();
        int altura = labelCarta.getHeight();

        Image imagemRedimensionada = imagemOriginal.getScaledInstance(largura, altura, Image.SCALE_SMOOTH);

        labelCarta.setIcon(new ImageIcon(imagemRedimensionada));
        labelDesc.setText(carta.toString());

        cartasNaMao++;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hitBtn = new javax.swing.JButton();
        dropBtn = new javax.swing.JButton();
        spellBtn = new javax.swing.JButton();
        standBtn = new javax.swing.JButton();
        pontuacaoLabel = new javax.swing.JLabel();
        descCartaUmLabel = new javax.swing.JLabel();
        cartaUmLabel = new javax.swing.JLabel();
        descCartaDoisLabel = new javax.swing.JLabel();
        cartaDoisLabel = new javax.swing.JLabel();
        descCartaTresLabel = new javax.swing.JLabel();
        cartaTresLabel = new javax.swing.JLabel();
        descCartaQuatroLabel = new javax.swing.JLabel();
        cartaQuatroLabel = new javax.swing.JLabel();
        descCartaCincoLabel = new javax.swing.JLabel();
        cartaCincoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blackjack Arcano");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("jogoFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(882, 440));

        hitBtn.setText("HIT");

        dropBtn.setText("DROP");

        spellBtn.setText("SPELL");

        standBtn.setText("STAND");

        pontuacaoLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        pontuacaoLabel.setText("Pontuação: 0");

        descCartaUmLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        cartaUmLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N

        descCartaDoisLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        cartaDoisLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N

        descCartaTresLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        cartaTresLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N

        descCartaQuatroLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        cartaQuatroLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N

        descCartaCincoLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        cartaCincoLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pontuacaoLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hitBtn)
                                .addGap(18, 18, 18)
                                .addComponent(dropBtn))
                            .addComponent(cartaUmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descCartaUmLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spellBtn)
                                .addGap(18, 18, 18)
                                .addComponent(standBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cartaDoisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cartaTresLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cartaQuatroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(descCartaDoisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(descCartaTresLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(descCartaQuatroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cartaCincoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descCartaCincoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(pontuacaoLabel)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descCartaDoisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descCartaTresLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descCartaUmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartaDoisLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartaUmLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartaTresLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartaQuatroLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descCartaQuatroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(descCartaCincoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cartaCincoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hitBtn)
                    .addComponent(dropBtn)
                    .addComponent(spellBtn)
                    .addComponent(standBtn))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cartaCincoLabel;
    private javax.swing.JLabel cartaDoisLabel;
    private javax.swing.JLabel cartaQuatroLabel;
    private javax.swing.JLabel cartaTresLabel;
    private javax.swing.JLabel cartaUmLabel;
    private javax.swing.JLabel descCartaCincoLabel;
    private javax.swing.JLabel descCartaDoisLabel;
    private javax.swing.JLabel descCartaQuatroLabel;
    private javax.swing.JLabel descCartaTresLabel;
    private javax.swing.JLabel descCartaUmLabel;
    private javax.swing.JButton dropBtn;
    private javax.swing.JButton hitBtn;
    private javax.swing.JLabel pontuacaoLabel;
    private javax.swing.JButton spellBtn;
    private javax.swing.JButton standBtn;
    // End of variables declaration//GEN-END:variables
}
