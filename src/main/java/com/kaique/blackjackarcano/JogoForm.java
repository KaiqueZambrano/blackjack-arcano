package com.kaique.blackjackarcano;

public class JogoForm extends javax.swing.JFrame {

    public JogoForm(int aposta) {
        initComponents();
        var baralho = new Baralho();
        
        var jogador = new Jogador(baralho, aposta);
        var dealer = new Dealer(baralho);
        
        jogador.adicionarNaMao(baralho);
        jogador.adicionarNaMao(baralho);
        
        dealer.adicionarNaMao(baralho);
        dealer.adicionarNaMao(baralho);
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
        setSize(new java.awt.Dimension(882, 451));

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
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pontuacaoLabel)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descCartaUmLabel)
                            .addComponent(descCartaDoisLabel)
                            .addComponent(descCartaTresLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartaDoisLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartaUmLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartaTresLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartaQuatroLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descCartaCincoLabel)
                            .addComponent(descCartaQuatroLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cartaCincoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hitBtn)
                    .addComponent(dropBtn)
                    .addComponent(spellBtn)
                    .addComponent(standBtn))
                .addGap(24, 24, 24))
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
