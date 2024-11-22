package Vistas;

import CELULAR.ModeloCelulares;
import Models.Usuario;
import java.util.HashMap;
import TABLETS.ModeloTablets;
import TABLETS.ControladorTablets;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VistaTablets extends javax.swing.JFrame {

    private HashMap<String, Usuario> mapaUsuarios;
    private List<ModeloTablets> listaTablets;
    private ControladorTablets controladorTablets;

    public VistaTablets(HashMap<String, Usuario> mapaUsuarios) {
        inicializarTablets();
        this.mapaUsuarios = mapaUsuarios;
        controladorTablets = new ControladorTablets(listaTablets);
        setSize(728, 748);
        setLocationRelativeTo(null);
        
        initComponents();
        cargarTabletsEnTabla();

        TblTablets.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int filaSeleccionada = TblTablets.getSelectedRow();
                if (filaSeleccionada != -1) {
                    String modelo = TblTablets.getValueAt(filaSeleccionada, 0).toString();
                    mostrarEspecificaciones(modelo);
                }
            }
        });
    }

    private void inicializarTablets() {
        listaTablets = new ArrayList<>();
        listaTablets.add(new ModeloTablets("iPad Pro 12.9", 1099.99,
                "Pantalla: 12.9\"\nLiquid Retina XDR\nCámara: 12MP\n128GB almacenamiento\nRAM: 6GB"));
        listaTablets.add(new ModeloTablets("Samsung Galaxy Tab S8", 899.99,
                "Pantalla: 11\"\nAMOLED\nCámara: 13MP\n128GB almacenamiento\nRAM: 8GB"));
        listaTablets.add(new ModeloTablets("Microsoft Surface Pro 9", 1299.99,
                "Pantalla: 13\"\nPixelSense\nCámara: 10MP\n256GB almacenamiento\nRAM: 16GB"));
        listaTablets.add(new ModeloTablets("Lenovo Tab P11 Pro", 499.99,
                "Pantalla: 11\"\nOLED\nCámara: 13MP\n128GB almacenamiento\nRAM: 6GB"));
        listaTablets.add(new ModeloTablets("Samsung Galaxy Tab A7", 229.99,
                "Pantalla: 10.4\"\nTFT\nCámara: 8MP\n64GB almacenamiento\nRAM: 3GB"));
        listaTablets.add(new ModeloTablets("Huawei MatePad 11", 399.99,
                "Pantalla: 11\"\nIPS LCD\nCámara: 13MP\n128GB almacenamiento\nRAM: 6GB"));
        listaTablets.add(new ModeloTablets("Apple iPad Mini", 499.99,
                "Pantalla: 8.3\"\nLiquid Retina\nCámara: 12MP\n64GB almacenamiento\nRAM: 4GB"));
        listaTablets.add(new ModeloTablets("Amazon Fire HD 10", 149.99,
                "Pantalla: 10.1\"\nFull HD\nCámara: 5MP\n32GB almacenamiento\nRAM: 2GB"));
        listaTablets.add(new ModeloTablets("Samsung Galaxy Tab S6 Lite", 349.99,
                "Pantalla: 10.4\"\nSuper AMOLED\nCámara: 8MP\n64GB almacenamiento\nRAM: 4GB"));
        listaTablets.add(new ModeloTablets("Google Pixel Slate", 599.99,
                "Pantalla: 12.3\"\nMolecular Display\nCámara: 8MP\n64GB almacenamiento\nRAM: 8GB"));
    }

    private void cargarTabletsEnTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) TblTablets.getModel();
        modeloTabla.setRowCount(0); // Limpiar tabla
        for (ModeloTablets Tablets : listaTablets) {
            Object[] row = new Object[2];
            row[0] = Tablets.getModelo();
            row[1] = "$" + Tablets.getPrecio();
            modeloTabla.addRow(row);
        }
    }

    private void mostrarEspecificaciones(String modelo) {
        ModeloTablets pcSeleccionado = controladorTablets.getEspecificaciones(modelo);
        if (pcSeleccionado != null) {
            TxtEspecificacionesTablets.setText(pcSeleccionado.getEspecificaciones());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        BtnCARRITO = new javax.swing.JButton();
        BtnAtras = new javax.swing.JButton();
        BtnDESEOS = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BtnVERCARRITO = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblTablets = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtEspecificacionesTablets = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Tienda de Angel");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Señor@ usuario, se encuentra en la seccion de Tablets");

        jLabel3.setText("TABLETS DISPONIBLES:");

        BtnCARRITO.setText("CARRITO");
        BtnCARRITO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCARRITOActionPerformed(evt);
            }
        });

        BtnAtras.setText("Atras");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        BtnDESEOS.setText("LISTA DE DESEOS");
        BtnDESEOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDESEOSActionPerformed(evt);
            }
        });

        jLabel5.setText("Agregar a:");

        BtnVERCARRITO.setText("VER CARRITO");

        TblTablets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(TblTablets);

        jLabel4.setText("Especificaciones");

        TxtEspecificacionesTablets.setEditable(false);
        TxtEspecificacionesTablets.setColumns(20);
        TxtEspecificacionesTablets.setRows(5);
        jScrollPane3.setViewportView(TxtEspecificacionesTablets);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnCARRITO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnDESEOS)
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(299, 299, 299))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnVERCARRITO)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAtras)
                        .addContainerGap(813, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel3))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel4)))
                        .addGap(77, 77, 77))))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(BtnVERCARRITO))
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnAtras)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnCARRITO)
                                    .addComponent(BtnDESEOS))
                                .addGap(67, 67, 67))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDESEOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDESEOSActionPerformed

    }//GEN-LAST:event_BtnDESEOSActionPerformed

    private void BtnCARRITOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCARRITOActionPerformed

    }//GEN-LAST:event_BtnCARRITOActionPerformed

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        this.dispose();
        VistaUsuario vistaUsuario = new VistaUsuario(mapaUsuarios);
        vistaUsuario.setVisible(true);
    }//GEN-LAST:event_BtnAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnCARRITO;
    private javax.swing.JButton BtnDESEOS;
    private javax.swing.JButton BtnVERCARRITO;
    private javax.swing.JTable TblTablets;
    private javax.swing.JTextArea TxtEspecificacionesTablets;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
