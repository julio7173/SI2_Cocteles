package comunicadosdocente;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mysql.cj.jdbc.JdbcStatement;
import javax.swing.UIManager;
import database.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.PreparedStatement;
import com.mysql.cj.jdbc.JdbcStatement;

public class VerRegistropublicaciones extends javax.swing.JFrame {

    conexion jdbc = new conexion();

    public VerRegistropublicaciones() {
        initComponents();
         pack();
        setLocationRelativeTo(null);
        jdbc.conctar();
        mostrarRegistros();
        
       // mostrar();    
        
    }
    
    @SuppressWarnings("unchecked")
     public void sizeName(JTextField registros, int size, java.awt.event.KeyEvent evt){
        // Verifica que el texto no exceda el amañó máximo
        if(registros.getText().trim().length() == size){
            // Cancela el evento y no ingresa el carácter presionada
            evt.consume();
        }
    }
     
    public void mostrarRegistros(){
        //String [] registroProf = new String[1];
        
         DefaultTableModel modelo=new DefaultTableModel ();
            modelo.addColumn("Registro");
            tablaregistro.setModel(modelo);
        try {
             
            String query = "select * from registroprof;";
            
            ResultSet consulta = jdbc.consultarBD(query);
            while(consulta.next()){
                
                String registro = consulta.getString("registro2");
                String[] rowData = {registro};
                modelo.addRow(rowData);
            }
            System.out.println("---------------------");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaregistro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE  PUBLICACIONES");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("X");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        editar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        editar.setText("Editar");
        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarMouseClicked(evt);
            }
        });
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        tablaregistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Registro"
            }
        ));
        tablaregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaregistroMouseClicked(evt);
            }
        });
        tablaregistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tablaregistroKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tablaregistro);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editar)
                .addGap(66, 66, 66)
                .addComponent(eliminar)
                .addGap(119, 119, 119))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editar)
                    .addComponent(eliminar))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        // TODO add your handling code here:
          int filaSeleccionada = tablaregistro.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un registro para editar.");
    } else {
        String registroAEditar = (String) tablaregistro.getValueAt(filaSeleccionada, 0);
        editarRegistropublicaciones editarRegistropublicaciones = new editarRegistropublicaciones( registroAEditar);
        editarRegistropublicaciones.setVisible(true);
    }
    
    }//GEN-LAST:event_editarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // Obtén la fila seleccionada en la tabla
    int filaSeleccionada = tablaregistro.getSelectedRow();
    

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un registro para eliminar.");
    } else {
        // Obtiene el valor de la celda de la columna "Registro" en la fila seleccionada
        String registroAEliminar = (String) tablaregistro.getValueAt(filaSeleccionada, 0);

        try {
            // Crea una sentencia SQL para eliminar el registro en la base de datos
            String query = "DELETE FROM registroprof WHERE registro2 = ?";

            // Prepara la declaración
            PreparedStatement preparedStatement = jdbc.getConctar().prepareStatement(query);
            preparedStatement.setString(1, registroAEliminar);

            // Ejecuta la sentencia SQL para eliminar el registro
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                // Registro eliminado con éxito
                JOptionPane.showMessageDialog(this, "Registro eliminado con éxito.");
                // Actualiza la tabla de registros
                mostrarRegistros();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el registro.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el registro: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_eliminarActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        setVisible(false);
        publicaciones interfaz = new publicaciones();
        interfaz.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseClicked
        int filaSeleccionada = tablaregistro.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un registro para editar.");
        } else {
            String registroAEditar = (String) tablaregistro.getValueAt(filaSeleccionada, 0);
            editarRegistropublicaciones editarRegistropublicaciones = new editarRegistropublicaciones( registroAEditar);
            editarRegistropublicaciones.setVisible(true);
        }
    }//GEN-LAST:event_editarMouseClicked

    private void tablaregistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaregistroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaregistroKeyTyped

    private void tablaregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaregistroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaregistroMouseClicked

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
            java.util.logging.Logger.getLogger(VerRegistropublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerRegistropublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerRegistropublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerRegistropublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerRegistropublicaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaregistro;
    // End of variables declaration//GEN-END:variables
}