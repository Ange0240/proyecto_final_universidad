package Vistas;

import Models.Usuario;
import java.util.HashMap;

public class VistaUsuario extends javax.swing.JFrame {

    private HashMap<String, Usuario> mapaUsuarios;

    public VistaUsuario(HashMap<String, Usuario> mapaUsuarios) {
        this.mapaUsuarios = mapaUsuarios;
        initComponents();
        setSize(728, 748);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnCELULARES = new javax.swing.JButton();
        BtnTELEVISORES = new javax.swing.JButton();
        BtnTABLETS = new javax.swing.JButton();
        BtnPC = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        BtnAtras = new javax.swing.JButton();
        BtnVERCARRITO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(728, 748));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Tienda de Angel");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Se encuentra en la sección productos señor@ usuario");

        BtnCELULARES.setText("CELULARES");
        BtnCELULARES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCELULARESActionPerformed(evt);
            }
        });

        BtnTELEVISORES.setText("TELEVISORES");
        BtnTELEVISORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTELEVISORESActionPerformed(evt);
            }
        });

        BtnTABLETS.setText("TABLETS");
        BtnTABLETS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTABLETSActionPerformed(evt);
            }
        });

        BtnPC.setText("PC");
        BtnPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPCActionPerformed(evt);
            }
        });

        BtnAtras.setText("Atras");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        BtnVERCARRITO.setText("VER CARRITO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(BtnAtras))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnPC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnCELULARES, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnTABLETS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnTELEVISORES, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnVERCARRITO)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(BtnVERCARRITO))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnAtras)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCELULARES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnTELEVISORES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnPC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnTABLETS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(207, 207, 207))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTELEVISORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTELEVISORESActionPerformed
        this.dispose();

        java.awt.EventQueue.invokeLater(() -> {
            new VistaTelevisores(mapaUsuarios).setVisible(true);
        });
    }//GEN-LAST:event_BtnTELEVISORESActionPerformed

    private void BtnCELULARESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCELULARESActionPerformed

        this.dispose();
        java.awt.EventQueue.invokeLater(() -> {
            new VistaCelulares(mapaUsuarios).setVisible(true);
        });
    }//GEN-LAST:event_BtnCELULARESActionPerformed

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        this.dispose();
        Vista vistaAnterior = new Vista(mapaUsuarios);
        vistaAnterior.setVisible(true);
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void BtnPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPCActionPerformed
        this.dispose();

        java.awt.EventQueue.invokeLater(() -> {
            new VistaPc(mapaUsuarios).setVisible(true);
        });
    }//GEN-LAST:event_BtnPCActionPerformed

    private void BtnTABLETSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTABLETSActionPerformed
        this.dispose();

        java.awt.EventQueue.invokeLater(() -> {
            new VistaTablets(mapaUsuarios).setVisible(true);
        });
    }//GEN-LAST:event_BtnTABLETSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnCELULARES;
    private javax.swing.JButton BtnPC;
    private javax.swing.JButton BtnTABLETS;
    private javax.swing.JButton BtnTELEVISORES;
    private javax.swing.JButton BtnVERCARRITO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
