package Vistas;

import Models.Usuario;
import java.util.HashMap;
import java.util.List;
import PC.ModeloPC;
import PC.ControladorPC;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class VistaPc extends javax.swing.JFrame {

    private HashMap<String, Usuario> mapaUsuarios;
    private List<ModeloPC> listaPCs;
    private ControladorPC controladorPC;

    public VistaPc(HashMap<String, Usuario> mapaUsuarios) {
        inicializarPCs();
        this.mapaUsuarios = mapaUsuarios;
        controladorPC = new ControladorPC(listaPCs);
        setSize(728, 748);
        setLocationRelativeTo(null);

        initComponents();
        cargarPCsEnTabla();

        TblPCs.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int filaSeleccionada = TblPCs.getSelectedRow();
                if (filaSeleccionada != -1) {
                    String modelo = TblPCs.getValueAt(filaSeleccionada, 0).toString();
                    mostrarEspecificaciones(modelo);
                }
            }
        });
    }

    private void inicializarPCs() {
        listaPCs = new ArrayList<>();
        listaPCs.add(new ModeloPC("HP Omen 16", 1200.00,
                "Pantalla: 16\"\nFull HD\nCámara: 1080p\n1TB SSD\nRAM: 16GB"));
        listaPCs.add(new ModeloPC("Dell XPS 13", 1300.00,
                "Pantalla: 13.4\"\n4K UHD\nCámara: 720p\n512GB SSD\nRAM: 8GB"));
        listaPCs.add(new ModeloPC("Apple MacBook Pro", 2500.00,
                "Pantalla: 14\"\nLiquid Retina XDR\nCámara: 1080p\n1TB SSD\nRAM: 16GB"));
        listaPCs.add(new ModeloPC("Asus ROG Strix", 1500.00,
                "Pantalla: 15.6\"\nFull HD\nCámara: 720p\n1TB SSD\nRAM: 32GB"));
        listaPCs.add(new ModeloPC("Lenovo ThinkPad X1", 1600.00,
                "Pantalla: 14\"\n4K UHD\nCámara: 1080p\n512GB SSD\nRAM: 16GB"));
        listaPCs.add(new ModeloPC("Acer Predator Helios 300", 1400.00,
                "Pantalla: 17.3\"\nFull HD\nCámara: 720p\n1TB SSD\nRAM: 16GB"));
        listaPCs.add(new ModeloPC("MSI GE76 Raider", 2200.00,
                "Pantalla: 17.3\"\n4K UHD\nCámara: 1080p\n1TB SSD\nRAM: 32GB"));
        listaPCs.add(new ModeloPC("Razer Blade 15", 2300.00,
                "Pantalla: 15.6\"\nFull HD\nCámara: 720p\n1TB SSD\nRAM: 16GB"));
        listaPCs.add(new ModeloPC("Samsung Galaxy Book Pro", 1200.00,
                "Pantalla: 15.6\"\nFull HD\nCámara: 720p\n512GB SSD\nRAM: 8GB"));
        listaPCs.add(new ModeloPC("Microsoft Surface Laptop 4", 1800.00,
                "Pantalla: 13.5\"\nPixelSense\nCámara: 720p\n512GB SSD\nRAM: 16GB"));
    }

    private void cargarPCsEnTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) TblPCs.getModel();
        modeloTabla.setRowCount(0); // Limpiar tabla
        for (ModeloPC pc : listaPCs) {
            Object[] row = new Object[2];
            row[0] = pc.getModelo();
            row[1] = "$" + pc.getPrecio();
            modeloTabla.addRow(row);
        }
    }

    private void mostrarEspecificaciones(String modelo) {
        ModeloPC pcSeleccionado = controladorPC.getEspecificaciones(modelo);
        if (pcSeleccionado != null) {
            TxtEspecificacionesPC.setText(pcSeleccionado.getEspecificaciones());
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
        TblPCs = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtEspecificacionesPC = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Tienda de Angel");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Señor@ usuario, se encuentra en la seccion de PC´S");

        jLabel3.setText("PC DISPONIBLES:");

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

        TblPCs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(TblPCs);

        TxtEspecificacionesPC.setEditable(false);
        TxtEspecificacionesPC.setColumns(20);
        TxtEspecificacionesPC.setRows(5);
        jScrollPane3.setViewportView(TxtEspecificacionesPC);

        jLabel4.setText("Especificaciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(220, 220, 220))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(237, 237, 237))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnCARRITO)
                                .addGap(88, 88, 88)
                                .addComponent(BtnDESEOS))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnVERCARRITO)))
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3)
                        .addGap(504, 504, 504)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(BtnAtras))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnDESEOS)
                            .addComponent(BtnCARRITO))
                        .addGap(16, 16, 16)
                        .addComponent(BtnAtras)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
    private javax.swing.JTable TblPCs;
    private javax.swing.JTextArea TxtEspecificacionesPC;
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
