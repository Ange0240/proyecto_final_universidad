package Vistas;

import Models.Usuario;
import java.lang.String;
import java.util.HashMap;
import CELULAR.ControladorCelulares;
import CELULAR.ModeloCelulares;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaCelulares extends javax.swing.JFrame {

    private List<String> carrito = new ArrayList<>();
    private HashMap<String, Usuario> mapaUsuarios;
    private List<ModeloCelulares> listaCelulares;
    private ControladorCelulares controladorCelulares;

    public VistaCelulares(HashMap<String, Usuario> mapaUsuarios) {
        this.mapaUsuarios = mapaUsuarios;
        setSize(728, 748);
        setLocationRelativeTo(null);
        initComponents();

        // Inicializar lista de celulares y controlador
        inicializarCelulares();
        controladorCelulares = new ControladorCelulares(listaCelulares);

        cargarCelularesEnTabla();

        TblCelulares.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int filaSeleccionada = TblCelulares.getSelectedRow();
                if (filaSeleccionada != -1) {
                    String modelo = TblCelulares.getValueAt(filaSeleccionada, 0).toString();
                    mostrarEspecificaciones(modelo);
                }
            }
        });

        TblCelulares.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedRow = TblCelulares.getSelectedRow();
                if (selectedRow != -1) {
                    String especificaciones = (String) TblCelulares.getValueAt(selectedRow, 0); // Cambia el índice según tu tabla
                    TxtEspecificacionesCelulares.setText(especificaciones);
                }
            }
        });
    }

    private void inicializarCelulares() {
        listaCelulares = new ArrayList<>();
        listaCelulares.add(new ModeloCelulares("iPhone 15", 999.99,
                "Pantalla: 6.1\"\nOLED\nCámara: 12MP\n126GB almacenamiento\nRAM: 6GB"));
        listaCelulares.add(new ModeloCelulares("Samsung Galaxy S24", 799.99,
                "Pantalla: 6.2\"\nAMOLED\nCámara: 50MP\n128GB almacenamiento\nRAM: 8GB"));
        listaCelulares.add(new ModeloCelulares("Google Pixel 8", 699.99,
                "Pantalla: 6.0\"\nOLED\nCámara: 50MP\n128GB almacenamiento\nRAM: 8GB"));
        listaCelulares.add(new ModeloCelulares("OnePlus 11", 749.99,
                "Pantalla: 6.7\"\nAMOLED\nCámara: 50MP\n256GB almacenamiento\nRAM: 16GB"));
        listaCelulares.add(new ModeloCelulares("Xiaomi 13 Pro", 899.99,
                "Pantalla: 6.73\"\nAMOLED\nCámara: 50MP\n256GB almacenamiento\nRAM: 12GB"));
        listaCelulares.add(new ModeloCelulares("Sony Xperia 1 IV", 1199.99,
                "Pantalla: 6.5\"\nOLED\nCámara: 12MP\n256GB almacenamiento\nRAM: 12GB"));
        listaCelulares.add(new ModeloCelulares("Motorola Edge 40", 599.99,
                "Pantalla: 6.55\"\nOLED\nCámara: 50MP\n128GB almacenamiento\nRAM: 8GB"));
        listaCelulares.add(new ModeloCelulares("Oppo Find X6 Pro", 1050.00,
                "Pantalla: 6.8\"\nAMOLED\nCámara: 50MP\n512GB almacenamiento\nRAM: 12GB"));
        listaCelulares.add(new ModeloCelulares("Realme GT 2 Pro", 899.00,
                "Pantalla: 6.7\"\nAMOLED\nCámara: 50MP\n256GB almacenamiento\nRAM: 12GB"));
        listaCelulares.add(new ModeloCelulares("Asus Zenfone 9", 799.00,
                "Pantalla: 5.9\"\nAMOLED\nCámara: 50MP\n128GB almacenamiento\nRAM: 8GB"));

        DefaultTableModel model = (DefaultTableModel) TblCelulares.getModel();
        model.setRowCount(0);  // Limpiar tabla antes de cargar datos

        for (ModeloCelulares modeloCelulares : listaCelulares) {
            Object[] row = {modeloCelulares.getModelo(), "$" + modeloCelulares.getPrecio()};
            model.addRow(row);
        }
    }

    private void cargarCelularesEnTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) TblCelulares.getModel();
        modeloTabla.setRowCount(0); // Limpiar tabla
        for (ModeloCelulares celular : listaCelulares) {
            Object[] row = new Object[2];
            row[0] = celular.getModelo();
            row[1] = "$" + celular.getPrecio();
            modeloTabla.addRow(row);
        }
    }

    private void mostrarEspecificaciones(String modelo) {
        ModeloCelulares celularSeleccionado = controladorCelulares.getEspecificaciones(modelo);
        if (celularSeleccionado != null) {
            // Asegúrate de que TblEspecificacionesCelulares sea un JTextArea o un componente similar
            TxtEspecificacionesCelulares.setText(celularSeleccionado.getEspecificaciones());
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
        jSeparator2 = new javax.swing.JSeparator();
        BtnVERCARRITO = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblCelulares = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtEspecificacionesCelulares = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Tienda de Angel");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Señor@ usuario, se encuentra en la seccion de celulares");

        jLabel3.setText("CELULARES DISPONIBLES:");

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
        BtnVERCARRITO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVERCARRITOActionPerformed(evt);
            }
        });

        TblCelulares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(TblCelulares);

        TxtEspecificacionesCelulares.setEditable(false);
        TxtEspecificacionesCelulares.setColumns(20);
        TxtEspecificacionesCelulares.setRows(5);
        jScrollPane3.setViewportView(TxtEspecificacionesCelulares);

        jLabel4.setText("Especificaciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(395, 395, 395))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnCARRITO)
                                .addGap(61, 61, 61)
                                .addComponent(BtnDESEOS)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(BtnAtras))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addGap(197, 197, 197)
                        .addComponent(BtnVERCARRITO)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(145, 145, 145))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCARRITO)
                            .addComponent(BtnDESEOS))
                        .addGap(54, 54, 54)
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

    private void BtnCARRITOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCARRITOActionPerformed
        int selectedRow = TblCelulares.getSelectedRow(); // Obtener fila seleccionada
        if (selectedRow != -1) {
            // Obtener modelo y precio de la fila seleccionada
            String modeloSeleccionado = (String) TblCelulares.getValueAt(selectedRow, 0); // Columna 0: Modelo
            String precioSeleccionado = String.valueOf(TblCelulares.getValueAt(selectedRow, 1)); // Columna 1: Precio

            // Agregar al carrito en el formato "Modelo,Precio"
            carrito.add(modeloSeleccionado + "," + precioSeleccionado);

            JOptionPane.showMessageDialog(this,
                    "Producto añadido al carrito:\nModelo: " + modeloSeleccionado + "\nPrecio: " + precioSeleccionado);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor selecciona un celular antes de añadir al carrito.");
        }
    }//GEN-LAST:event_BtnCARRITOActionPerformed

    private void BtnDESEOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDESEOSActionPerformed

    }//GEN-LAST:event_BtnDESEOSActionPerformed

    private void BtnVERCARRITOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVERCARRITOActionPerformed
        this.dispose();
        VistaCarritoDeseo vistaCarrito = new VistaCarritoDeseo(mapaUsuarios, carrito);
        vistaCarrito.setVisible(true);
    }//GEN-LAST:event_BtnVERCARRITOActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnCARRITO;
    private javax.swing.JButton BtnDESEOS;
    private javax.swing.JButton BtnVERCARRITO;
    private javax.swing.JTable TblCelulares;
    private javax.swing.JTextArea TxtEspecificacionesCelulares;
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
