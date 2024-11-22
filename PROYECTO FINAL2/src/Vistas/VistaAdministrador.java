package Vistas;

import Models.Usuario;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaAdministrador extends javax.swing.JFrame {

    private HashMap<String, Usuario> mapaUsuarios;
    DefaultTableModel model;

    public VistaAdministrador(HashMap<String, Usuario> mapaUsuarios) {
        this.mapaUsuarios = mapaUsuarios;
        initComponents();
        setLocationRelativeTo(null);
        inicializarVistaAdministrador();
    }

    private void inicializarVistaAdministrador() {
        // Inicializamos el modelo de la tabla
        model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Número de Identificación");
        model.addColumn("Tipo de Usuario");

        // Asignamos el modelo a la tabla
        TblUsuariosAdmin.setModel(model);

        // Llamar a este método para mostrar los usuarios registrados
        actualizarTablaAdministrador();
    }

    private void actualizarTablaAdministrador() {
        // Limpiar la tabla antes de agregar las filas nuevas
        model.setRowCount(0);

        // Agregar usuarios a la tabla
        for (Usuario usuario : mapaUsuarios.values()) {
            model.addRow(new Object[]{
                usuario.getNombre(),
                usuario.getNroIdentificacion(),
                usuario.getTipoUsuario()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BtnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblUsuariosAdmin = new javax.swing.JTable();
        BtnHISTORIALCOMPRAS = new javax.swing.JButton();
        BtnELIMINAR = new javax.swing.JButton();
        BtnVERCONTRASEÑA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Tienda de Angel");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Administrador, verá lo que ve un usuario, usted puede editar");

        BtnAtras.setText("Atras");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        TblUsuariosAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuarios", "Identificacion", "Productos Comprados"
            }
        ));
        jScrollPane1.setViewportView(TblUsuariosAdmin);

        BtnHISTORIALCOMPRAS.setText("HISTORIAL DE COMPRAS");

        BtnELIMINAR.setText("ELIMINAR USUARIO");
        BtnELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnELIMINARActionPerformed(evt);
            }
        });

        BtnVERCONTRASEÑA.setText("VER CONTRASEÑA");
        BtnVERCONTRASEÑA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVERCONTRASEÑAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(267, 267, 267)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BtnAtras)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BtnVERCONTRASEÑA)
                                        .addComponent(BtnHISTORIALCOMPRAS)
                                        .addComponent(BtnELIMINAR)))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(BtnVERCONTRASEÑA))
                            .addComponent(BtnHISTORIALCOMPRAS, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(BtnELIMINAR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(BtnAtras)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        this.dispose(); // Cerrar la vista del administrador
        Vista vistaAnterior = new Vista(mapaUsuarios); // Reabrir la vista principal con los datos actuales
        vistaAnterior.setVisible(true);
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void BtnELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnELIMINARActionPerformed
        // Obtener la fila seleccionada
        int selectedRow = TblUsuariosAdmin.getSelectedRow();

        // Verificar si se seleccionó una fila
        if (selectedRow != -1) {
            // Obtener el número de identificación del usuario seleccionado (suponiendo que es el segundo campo)
            String nroIdentificacion = (String) TblUsuariosAdmin.getValueAt(selectedRow, 1);

            // Verifica si el usuario es el mismo administrador
            Usuario usuarioSeleccionado = mapaUsuarios.get(nroIdentificacion);
            if (usuarioSeleccionado.getTipoUsuario().equals("Administrador")) {
                JOptionPane.showMessageDialog(this, "No puedes eliminar al administrador(tu) mientras esté logueado.");
                return; // No eliminar al administrador
            }

            mapaUsuarios.remove(nroIdentificacion);

            actualizarTablaAdministrador();

            JOptionPane.showMessageDialog(this, "Usuario eliminado con éxito.");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un usuario para eliminar.");
        }
    }//GEN-LAST:event_BtnELIMINARActionPerformed

    private void BtnVERCONTRASEÑAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVERCONTRASEÑAActionPerformed
        int filaSeleccionada = TblUsuariosAdmin.getSelectedRow();

        // Verificamos si se ha seleccionado una fila
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un usuario para ver la contraseña.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nroIdentificacion = (String) TblUsuariosAdmin.getValueAt(filaSeleccionada, 1);

        // Buscar al usuario en el mapa
        Usuario usuario = mapaUsuarios.get(nroIdentificacion);

        if (usuario != null) {
            // Mostrar la contraseña en un cuadro de diálogo
            JOptionPane.showMessageDialog(this, "La contraseña del usuario " + usuario.getNombre() + " es: " + usuario.getContraseña(), "Contraseña del Usuario", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnVERCONTRASEÑAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnELIMINAR;
    private javax.swing.JButton BtnHISTORIALCOMPRAS;
    private javax.swing.JButton BtnVERCONTRASEÑA;
    private javax.swing.JTable TblUsuariosAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
