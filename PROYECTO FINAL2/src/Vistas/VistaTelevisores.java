package Vistas;

import Models.Usuario;
import java.util.HashMap;
import TELEVISORES.ControladorTelevisores;
import TELEVISORES.ModeloTelevisores;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VistaTelevisores extends javax.swing.JFrame {

    private List<ModeloTelevisores> listaTelevisores;
    private HashMap<String, Usuario> mapaUsuarios;
    private ControladorTelevisores controladorTelevisores;

    public VistaTelevisores(HashMap<String, Usuario> mapaUsuarios) {
        inicializarTelevisores();
        this.mapaUsuarios = mapaUsuarios;
        controladorTelevisores = new ControladorTelevisores(listaTelevisores);
        setSize(728, 748);
        setLocationRelativeTo(null);
        
        initComponents();
        cargarTelevisoresEnTabla();

        TblTelevisores.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int filaSeleccionada = TblTelevisores.getSelectedRow();
                if (filaSeleccionada != -1) {
                    String modelo = TblTelevisores.getValueAt(filaSeleccionada, 0).toString();
                    mostrarEspecificaciones(modelo);
                }
            }
        });
    }
    
    private void inicializarTelevisores() {
    listaTelevisores = new ArrayList<>();
    listaTelevisores.add(new ModeloTelevisores("Samsung QLED 4K", 1500.00, 
            "Pantalla: 55\"\nQLED\nResolución: 4K\nHDMI: 4 puertos\nSmart TV"));
    listaTelevisores.add(new ModeloTelevisores("LG OLED 4K", 2500.00, 
            "Pantalla: 65\"\nOLED\nResolución: 4K\nHDMI: 4 puertos\nSmart TV"));
    listaTelevisores.add(new ModeloTelevisores("Sony Bravia 4K", 1800.00, 
            "Pantalla: 55\"\nOLED\nResolución: 4K\nHDMI: 4 puertos\nSmart TV"));
    listaTelevisores.add(new ModeloTelevisores("TCL 6-Series QLED", 1200.00, 
            "Pantalla: 55\"\nQLED\nResolución: 4K\nHDMI: 4 puertos\nSmart TV"));
    listaTelevisores.add(new ModeloTelevisores("Vizio 4K Smart TV", 600.00, 
            "Pantalla: 50\"\nLED\nResolución: 4K\nHDMI: 3 puertos\nSmart TV"));
    listaTelevisores.add(new ModeloTelevisores("Hisense ULED 4K", 800.00, 
            "Pantalla: 65\"\nULED\nResolución: 4K\nHDMI: 3 puertos\nSmart TV"));
    listaTelevisores.add(new ModeloTelevisores("Samsung The Frame", 2500.00, 
            "Pantalla: 55\"\nQLED\nResolución: 4K\nHDMI: 4 puertos\nSmart TV"));
    listaTelevisores.add(new ModeloTelevisores("LG NanoCell 4K", 1000.00, 
            "Pantalla: 55\"\nNanoCell\nResolución: 4K\nHDMI: 4 puertos\nSmart TV"));
    listaTelevisores.add(new ModeloTelevisores("Philips 4K UHD", 1200.00, 
            "Pantalla: 65\"\nLED\nResolución: 4K\nHDMI: 4 puertos\nSmart TV"));
    listaTelevisores.add(new ModeloTelevisores("Sharp Aquos 4K", 900.00, 
            "Pantalla: 60\"\nLED\nResolución: 4K\nHDMI: 3 puertos\nSmart TV"));
}
    
        private void cargarTelevisoresEnTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) TblTelevisores.getModel();
        modeloTabla.setRowCount(0); // Limpiar tabla
        for (ModeloTelevisores Televisores : listaTelevisores) {
            Object[] row = new Object[2];
            row[0] = Televisores.getModelo();
            row[1] = "$" + Televisores.getPrecio();
            modeloTabla.addRow(row);
        }
        }
            private void mostrarEspecificaciones(String modelo) {
        ModeloTelevisores pcSeleccionado = controladorTelevisores.getEspecificaciones(modelo);
        if (pcSeleccionado != null) {
            TxtEspecificacionesTelevisores.setText(pcSeleccionado.getEspecificaciones());
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
        TblTelevisores = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtEspecificacionesTelevisores = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Tienda de Angel");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Señor@ usuario, se encuentra en la seccion de Televisores");

        jLabel3.setText("TELEVISORES DISPONIBLES:");

        BtnCARRITO.setText("CARRITO");

        BtnAtras.setText("Atras");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        BtnDESEOS.setText("LISTA DE DESEOS");

        jLabel5.setText("Agregar a:");

        BtnVERCARRITO.setText("VER CARRITO");

        TblTelevisores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(TblTelevisores);

        jLabel4.setText("Especificaciones");

        TxtEspecificacionesTelevisores.setColumns(20);
        TxtEspecificacionesTelevisores.setRows(5);
        jScrollPane3.setViewportView(TxtEspecificacionesTelevisores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAtras)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnCARRITO)
                                        .addGap(91, 91, 91)
                                        .addComponent(BtnDESEOS))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnVERCARRITO)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(427, 427, 427)
                            .addComponent(jLabel4)
                            .addGap(22, 22, 22))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(381, 381, 381))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(BtnVERCARRITO))
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCARRITO)
                    .addComponent(BtnDESEOS))
                .addComponent(BtnAtras)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JTable TblTelevisores;
    private javax.swing.JTextArea TxtEspecificacionesTelevisores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
