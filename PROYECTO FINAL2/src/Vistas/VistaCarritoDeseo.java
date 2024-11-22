package Vistas;

import Models.Usuario;
import java.util.HashMap;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Models.Producto;
import javax.swing.JOptionPane;

public class VistaCarritoDeseo extends javax.swing.JFrame {

    private HashMap<String, Usuario> mapaUsuarios;

    public VistaCarritoDeseo(HashMap<String, Usuario> mapaUsuarios, List<String> carrito) {
        this.mapaUsuarios = mapaUsuarios;
        setSize(728, 748);
        setLocationRelativeTo(null);
        initComponents();
        cargarCarritoEnTabla(carrito);
    }

    private void cargarCarritoEnTabla(List<String> carrito) {
        DefaultTableModel model = (DefaultTableModel) TblCarrito.getModel();
        model.setRowCount(0); // Limpiar la tabla
        for (String item : carrito) {
            String[] datos = item.split(","); // Dividir el formato "Modelo,Precio"
            model.addRow(new Object[]{datos[0], datos[1]}); // Agregar modelo y precio
        }
    }

    private double calcularTotal() {
        double total = 0; // Inicializar el total

        DefaultTableModel model = (DefaultTableModel) TblCarrito.getModel();

        // Iterar sobre todas las filas de la tabla
        for (int i = 0; i < model.getRowCount(); i++) {
            Object precioObj = model.getValueAt(i, 1); // Suponiendo que los precios están en la columna 1
            if (precioObj != null) {
                try {
                    // Convertir el precio a un número y sumarlo al total
                    double precio = Double.parseDouble(precioObj.toString());
                    total += precio;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this,
                            "Error en el precio de la fila " + (i + 1) + ": " + precioObj);
                }
            }
        }
        return total;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblCarrito = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblDeseos = new javax.swing.JTable();
        BtnCOMPRAR = new javax.swing.JButton();
        BtnELIMINARPRODUCTO = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnAtras = new javax.swing.JButton();
        BtnELIMINARDESEO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Tienda de Angel");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Aqui podrá ver su Carrito y su lista de deseos");

        TblCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Costo"
            }
        ));
        jScrollPane1.setViewportView(TblCarrito);

        TblDeseos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Costro"
            }
        ));
        jScrollPane2.setViewportView(TblDeseos);

        BtnCOMPRAR.setText("COMPRAR");
        BtnCOMPRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCOMPRARActionPerformed(evt);
            }
        });

        BtnELIMINARPRODUCTO.setText("ELIMINAR");

        jLabel3.setText("SU CARRITO");

        jLabel5.setText("SUS DESEOS");

        BtnAtras.setText("Atras");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        BtnELIMINARDESEO.setText("ELIMINAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(281, 281, 281))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAtras)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnCOMPRAR)
                            .addComponent(BtnELIMINARPRODUCTO))
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(BtnELIMINARDESEO)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnELIMINARPRODUCTO)
                                .addGap(101, 101, 101)
                                .addComponent(BtnCOMPRAR))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnELIMINARDESEO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(BtnAtras)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        this.dispose();
        VistaUsuario vistaUsuario = new VistaUsuario(mapaUsuarios);
        vistaUsuario.setVisible(true);
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void BtnCOMPRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCOMPRARActionPerformed
        // Obtener el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) TblCarrito.getModel();
        double total = 0;


        // Mostrar el total al usuario y pedir el pago
        String mensaje = "El total de su compra es: $" + total + "\n¿Con cuánto desea pagar?";
        String input = JOptionPane.showInputDialog(this, mensaje);

        if (input != null && !input.isEmpty()) {
            try {
                double dineroIngresado = Double.parseDouble(input);
                if (dineroIngresado >= total) {
                    JOptionPane.showMessageDialog(this, "Compra realizada con éxito. Cambio: $" + (dineroIngresado - total));
                } else {
                    JOptionPane.showMessageDialog(this, "Dinero insuficiente para completar la compra.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese un número válido.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar una cantidad para pagar.");
        }
    }//GEN-LAST:event_BtnCOMPRARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnCOMPRAR;
    private javax.swing.JButton BtnELIMINARDESEO;
    private javax.swing.JButton BtnELIMINARPRODUCTO;
    private javax.swing.JTable TblCarrito;
    private javax.swing.JTable TblDeseos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
