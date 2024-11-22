package Vistas;

import GENERALES.ControladorDatosUsuario;
import GENERALES.DatosUsuario;
import Models.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vista extends javax.swing.JFrame {

    private HashMap<String, Usuario> mapaUsuarios;
    private DefaultTableModel model;

    public Vista(HashMap<String, Usuario> mapaUsuarios) {
        this.mapaUsuarios = mapaUsuarios != null ? mapaUsuarios : new HashMap<>();
        initComponents();
        setLocationRelativeTo(null);
        inicializarVista();
    }

    private void inicializarVista() {

        // Inicializamos el modelo de la tabla
        model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Número de Identificación");
        model.addColumn("Tipo de Usuario");

        // Asignamos el modelo a la tabla
        TblTablaRegisto.setModel(model);

        // Llamar a este método para mostrar los usuarios registrados
        actualizarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtNombreUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtContraseña = new javax.swing.JTextField();
        CboxUsuarioOAdministrador = new javax.swing.JComboBox<>();
        BtnREGISTRAR = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        BtnLOGIN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblTablaRegisto = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        TxtIdentifiacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Tienda de Angel");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Señor@ usuario, se encuentra en la vista registro");

        jLabel3.setText("Usuario");

        jLabel4.setText("Contraseña");

        CboxUsuarioOAdministrador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));
        CboxUsuarioOAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxUsuarioOAdministradorActionPerformed(evt);
            }
        });

        BtnREGISTRAR.setText("REGISTRAR");
        BtnREGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnREGISTRARActionPerformed(evt);
            }
        });

        BtnLOGIN.setText("LOGIN");
        BtnLOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLOGINActionPerformed(evt);
            }
        });

        TblTablaRegisto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "ID", "Tipo de usario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblTablaRegisto.setRequestFocusEnabled(false);
        TblTablaRegisto.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TblTablaRegisto);
        if (TblTablaRegisto.getColumnModel().getColumnCount() > 0) {
            TblTablaRegisto.getColumnModel().getColumn(0).setResizable(false);
            TblTablaRegisto.getColumnModel().getColumn(1).setResizable(false);
            TblTablaRegisto.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel5.setText("Nro Identificacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnREGISTRAR)
                        .addGap(48, 48, 48)
                        .addComponent(BtnLOGIN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(CboxUsuarioOAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(TxtIdentifiacion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CboxUsuarioOAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIdentifiacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnREGISTRAR)
                        .addComponent(BtnLOGIN))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CboxUsuarioOAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxUsuarioOAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CboxUsuarioOAdministradorActionPerformed


    private void BtnLOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLOGINActionPerformed
    int filaSeleccionada = TblTablaRegisto.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione un usuario en la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener el ID del usuario seleccionado y el tipo de usuario
    String nroIdentificacion = TblTablaRegisto.getValueAt(filaSeleccionada, 1).toString();
    String tipoUsuario = (String) TblTablaRegisto.getValueAt(filaSeleccionada, 2);

    // Validar existencia del usuario en el mapa
    Usuario usuario = mapaUsuarios.get(nroIdentificacion);
    if (usuario == null) {
        JOptionPane.showMessageDialog(null, "Usuario no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Ingresar contraseña del usuario
    String ContraseñaIngresada = JOptionPane.showInputDialog(null,
            "Por favor, ingresa tu contraseña:",
            "Entrada de Texto",
            JOptionPane.QUESTION_MESSAGE);

    // Verificar la contraseña del usuario
    if (!usuario.getContraseña().equals(ContraseñaIngresada)) {
        JOptionPane.showMessageDialog(null, "La contraseña no es correcta.", "Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
        return; // Salir del método si la contraseña no es correcta
    }

    // Guardar la información del usuario logueado en DatosUsuario
    DatosUsuario.setUsuario(nroIdentificacion, filaSeleccionada);
    DatosUsuario.setFila(filaSeleccionada); // Establecer la fila para poder acceder a datos relacionados

    // Establecer el carrito y la lista de deseos vacíos para este usuario (en caso de que no haya datos)
    if (DatosUsuario.carrito[DatosUsuario.Fila] == null) {
        DatosUsuario.carrito[DatosUsuario.Fila] = new ArrayList<>();
    }
    if (DatosUsuario.listaDeDeseos[DatosUsuario.Fila] == null) {
        DatosUsuario.listaDeDeseos[DatosUsuario.Fila] = new ArrayList<>();
    }

    // Redirigir al usuario a la vista correspondiente según su tipo
    if ("Administrador".equals(usuario.getTipoUsuario())) {
        this.dispose();  // Cerrar la ventana actual

        // Abrir la VistaAdministrador
        java.awt.EventQueue.invokeLater(() -> {
            new VistaAdministrador(mapaUsuarios).setVisible(true);
            JOptionPane.showMessageDialog(null, "Bienvenido, Administrador", "Inicio de Sesión", JOptionPane.INFORMATION_MESSAGE);
        });
    } else if ("Usuario".equals(usuario.getTipoUsuario())) {
        this.dispose();  // Cerrar la ventana actual

        // Abrir la VistaUsuario
        java.awt.EventQueue.invokeLater(() -> {
            new VistaUsuario(mapaUsuarios).setVisible(true);
            JOptionPane.showMessageDialog(null, "Bienvenido, Usuario", "Inicio de Sesión", JOptionPane.INFORMATION_MESSAGE);
        });
    }
    }//GEN-LAST:event_BtnLOGINActionPerformed


    private void BtnREGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnREGISTRARActionPerformed

        String nombre = TxtNombreUsuario.getText();
        String nroIdentificacion = TxtIdentifiacion.getText();
        String contraseña = TxtContraseña.getText();
        String tipoUsuario = CboxUsuarioOAdministrador.getSelectedItem().toString();

        // Validaciones o excepciones
        if (nombre.isEmpty() || nroIdentificacion.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!nombre.matches("^[a-zA-Z\\s]+$")) {
            JOptionPane.showMessageDialog(null, "El Nombre solo debe contener letras", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!nroIdentificacion.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "El ID debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (mapaUsuarios.containsKey(nroIdentificacion)) {
            JOptionPane.showMessageDialog(null,
                    "El usuario con este ID ya está registrado.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (tipoUsuario.equals("Administrador")) {
            boolean hayAdministrador = false;
            for (Usuario usuario : mapaUsuarios.values()) {
                if (usuario.getTipoUsuario().equals("Administrador")) {
                    hayAdministrador = true;
                    break;
                }
            }

            if (hayAdministrador) {
                JOptionPane.showMessageDialog(null, "Ya existe un administrador registrado. Solo se puede tener uno.", "Error", JOptionPane.ERROR_MESSAGE);
                TxtNombreUsuario.setText("");
                TxtIdentifiacion.setText("");
                TxtContraseña.setText("");
                return;
            }
        }

        // Crear y registrar nuevo usuario
        Usuario nuevoUsuario = new Usuario(nombre, nroIdentificacion, contraseña, tipoUsuario);
        mapaUsuarios.put(nroIdentificacion, nuevoUsuario);

        actualizarTabla();

        ControladorDatosUsuario.agregarUsuario(nombre);
        ControladorDatosUsuario.AgregarContraseña(contraseña);

        JOptionPane.showMessageDialog(null,
                "Usuario registrado con éxito!",
                "Registro",
                JOptionPane.INFORMATION_MESSAGE);

        TxtNombreUsuario.setText("");
        TxtIdentifiacion.setText("");
        TxtContraseña.setText("");

    }//GEN-LAST:event_BtnREGISTRARActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        HashMap<String, Usuario> mapaUsuarios = new HashMap<>();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista(mapaUsuarios).setVisible(true);
            }
        });
    }

    public void actualizarTabla() {
        model.setRowCount(0);
        DefaultTableModel model = (DefaultTableModel) TblTablaRegisto.getModel();
        for (Usuario usuario : mapaUsuarios.values()) {
            model.addRow(new Object[]{
                usuario.getNombre(),
                usuario.getNroIdentificacion(),
                usuario.getTipoUsuario()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLOGIN;
    private javax.swing.JButton BtnREGISTRAR;
    private javax.swing.JComboBox<String> CboxUsuarioOAdministrador;
    private javax.swing.JTable TblTablaRegisto;
    private javax.swing.JTextField TxtContraseña;
    private javax.swing.JTextField TxtIdentifiacion;
    private javax.swing.JTextField TxtNombreUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
