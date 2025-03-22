package Exercicio;

public class AppPonto extends javax.swing.JFrame {

    public AppPonto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfEixoX = new javax.swing.JTextField();
        tfEixoY = new javax.swing.JTextField();
        btAvaliar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbEixoY = new javax.swing.JCheckBox();
        cbEixoX = new javax.swing.JCheckBox();
        cb1Q = new javax.swing.JCheckBox();
        cb2Q = new javax.swing.JCheckBox();
        cb4Q = new javax.swing.JCheckBox();
        cb3Q = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Eixo X:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Eixo Y:");

        tfEixoX.setPreferredSize(new java.awt.Dimension(80, 20));
        tfEixoX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEixoXActionPerformed(evt);
            }
        });

        tfEixoY.setPreferredSize(new java.awt.Dimension(80, 20));

        btAvaliar.setText("Avaliar");
        btAvaliar.setBorder(null);
        btAvaliar.setPreferredSize(new java.awt.Dimension(60, 20));
        btAvaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvaliarActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Posição:");

        cbEixoY.setForeground(new java.awt.Color(0, 0, 0));
        cbEixoY.setText("Incide sobre o Eixo Y");
        cbEixoY.setEnabled(false);

        cbEixoX.setForeground(new java.awt.Color(0, 0, 0));
        cbEixoX.setText("Incide sobre o Eixo X");
        cbEixoX.setEnabled(false);

        cb1Q.setForeground(new java.awt.Color(0, 0, 0));
        cb1Q.setText("No 1 Quadrante");
        cb1Q.setEnabled(false);

        cb2Q.setForeground(new java.awt.Color(0, 0, 0));
        cb2Q.setText("No 2 Quadrante");
        cb2Q.setEnabled(false);

        cb4Q.setForeground(new java.awt.Color(0, 0, 0));
        cb4Q.setText("No 4 Quadrante");
        cb4Q.setEnabled(false);

        cb3Q.setForeground(new java.awt.Color(0, 0, 0));
        cb3Q.setText("No 3 Quadrante");
        cb3Q.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfEixoX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEixoY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(btAvaliar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbEixoY)
                            .addComponent(cbEixoX)
                            .addComponent(cb1Q, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb2Q, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb3Q, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb4Q, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfEixoX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfEixoY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btAvaliar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cbEixoX)
                .addGap(18, 18, 18)
                .addComponent(cbEixoY)
                .addGap(18, 18, 18)
                .addComponent(cb1Q)
                .addGap(18, 18, 18)
                .addComponent(cb2Q)
                .addGap(18, 18, 18)
                .addComponent(cb3Q)
                .addGap(18, 18, 18)
                .addComponent(cb4Q)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfEixoXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEixoXActionPerformed

    }//GEN-LAST:event_tfEixoXActionPerformed

    private void btAvaliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvaliarActionPerformed

        cbEixoX.setSelected(false);
        cbEixoY.setSelected(false);
        cb1Q.setSelected(false);
        cb2Q.setSelected(false);
        cb3Q.setSelected(false);
        cb4Q.setSelected(false);

        if (tfEixoX.getText().isEmpty() || tfEixoY.getText().isEmpty()) {
            throw new IllegalArgumentException("ERRO: Alguns campos nao estao preenchidos");

        }
        Ponto ponto = new Ponto(Integer.parseInt(tfEixoX.getText()), Integer.parseInt(tfEixoY.getText()));

        if (ponto.estaIncidindoSobreX()) {
            cbEixoX.setSelected(true);
        }

        if (ponto.estaIncidindoSobreY()) {
            cbEixoY.setSelected(true);
        }

        if (ponto.identificarQuadrante() == Quadrante.PRIMEIRO) {
            cb1Q.setSelected(true);
        } else if (ponto.identificarQuadrante() == Quadrante.SEGUNDO) {
            cb2Q.setSelected(true);
        } else if (ponto.identificarQuadrante() == Quadrante.TERCEIRO) {
            cb3Q.setSelected(true);
        } else if (ponto.identificarQuadrante() == Quadrante.QUARTO) {
            cb4Q.setSelected(true);
        }


    }//GEN-LAST:event_btAvaliarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppPonto().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAvaliar;
    private javax.swing.JCheckBox cb1Q;
    private javax.swing.JCheckBox cb2Q;
    private javax.swing.JCheckBox cb3Q;
    private javax.swing.JCheckBox cb4Q;
    private javax.swing.JCheckBox cbEixoX;
    private javax.swing.JCheckBox cbEixoY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfEixoX;
    private javax.swing.JTextField tfEixoY;
    // End of variables declaration//GEN-END:variables
}
