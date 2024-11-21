package Vistas;

import GENERALES.ControladorDatosUsuario;
import GENERALES.DatosUsuario;
import Models.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
         listaUsuarios = new ArrayList<>();  // Inicializamos la lista de usuarios
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
    
    
    int contador = 0;   
    private DefaultTableModel model;
    private ArrayList<Usuario> listaUsuarios; 
    

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
                "Nombre", "ID", "Rango"
            }
        ));
        jScrollPane2.setViewportView(TblTablaRegisto);

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
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1)))
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
        
        //Ingresar contraseña del usuario
         String ContraseñaIngresada = JOptionPane.showInputDialog(null, 
            "Por favor, ingresa tu contraseña:", 
            "Entrada de Texto", 
            JOptionPane.QUESTION_MESSAGE);
         
        if(!ControladorDatosUsuario.obtenerContraseña(filaSeleccionada).equals(ContraseñaIngresada)){
            JOptionPane.showMessageDialog(null, "La contraseña no es correcta!", "Información", JOptionPane.ERROR_MESSAGE);
        }
      
        

    }//GEN-LAST:event_BtnLOGINActionPerformed

    
    
    private void BtnREGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnREGISTRARActionPerformed
       
        String nombre = TxtNombreUsuario.getText();
        String nroIdentificacion = TxtIdentifiacion.getText();
        String contraseña = TxtContraseña.getText();
        String tipoUsuario = CboxUsuarioOAdministrador.getSelectedItem().toString();
        
        
         // Crear un nuevo objeto Usuario y agregarlo a la lista
        Usuario nuevoUsuario = new Usuario(nombre, nroIdentificacion, contraseña, tipoUsuario);
        listaUsuarios.add(nuevoUsuario);

        // Actualizar la tabla con el nuevo usuario
        actualizarTabla();
        
        ControladorDatosUsuario.agregarUsuario(nombre);
        ControladorDatosUsuario.AgregarContraseña(contraseña);
        
        contador++;       
        
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    
     public void actualizarTabla() {
        // Limpiar la tabla antes de agregar las filas nuevas
        model.setRowCount(0);

        // Agregar usuarios a la tabla
        for (Usuario usuario : listaUsuarios) {
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
