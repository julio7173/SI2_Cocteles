package comunicadosdocente;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import database.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class publicaciones extends javax.swing.JFrame {

    conexion jdbc = new conexion();
     
    public publicaciones() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    
    public void sizeName(JTextField camporegistro, int size, java.awt.event.KeyEvent evt){
        
         if(camporegistro.getText().trim().length() == size){
            // Cancela el evento y no ingresa el numero presionada
            evt.consume();
        
        }
    }
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        camporegistro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        enviar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        camporegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camporegistroActionPerformed(evt);
            }
        });
        camporegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                camporegistroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                camporegistroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                camporegistroKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del Profesor");

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

        enviar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setText("Ver Registro");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jButton1))
                    .addComponent(camporegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(enviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(111, 111, 111))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addComponent(camporegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviar)
                    .addComponent(jButton3))
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

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        VerRegistropublicaciones verRegistropublicaciones= new VerRegistropublicaciones();
        verRegistropublicaciones.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void camporegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camporegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camporegistroActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        // TODO add your handling code here:
        String registro2 = camporegistro.getText().trim();
        if(registro2.isEmpty() ){
            // Muestra mensaje - Todos o algun campo vacio
            JOptionPane.showMessageDialog(this, "Debes de llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            
            // Objeto de la calse conexion para manejar la conexion con la base de datos
            conexion con = new conexion();
            // Llama al metodo conectar para obtener la conexion
            Connection jdbc = con.conctar();
            // Variable con la sentencia SQL - Insertar datos
            String sql = "INSERT INTO registroprof( registro2 ) VALUES(?)";
            // Variable para preparar y ejecutar la sentencia SQL
            PreparedStatement ps;
            // Variable que almacena el número de filas afectadas por la operación
            int filas;
            try {
                // Prepara la sentencia SQL con la conexion
                ps = jdbc.prepareStatement(sql);
                // Asignación de valores usando los campos como parametros de la sentencia SQL
                ps.setString(1,registro2);
              
                // Ejecuta la sentencia SQL - Obtiene número de filas afectadas por la operación
                filas = ps.executeUpdate();
                // Cierra el objeto PreparedStatement
                ps.close();
                // Verifica si la operación fue exitosa
                if(filas > 0){
                    // Muestra mensaje - EXITO
                    JOptionPane.showMessageDialog(this, "registro " + registro2 + " agregado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    // Muestra mensaje - ERROR
                    JOptionPane.showMessageDialog(this, "No se pudo agregar el registro " + registro2, "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                // Captura alguna excepcion al ejecutar y la muestra por consola
                Logger.getLogger(publicaciones.class.getName()).log(Level.SEVERE, null, ex);
            }
            // Llama al método desconectar - Cierra la conexión con la base de datos
            con.desconectar();
        }
    }//GEN-LAST:event_enviarActionPerformed

    private void camporegistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_camporegistroKeyTyped
        sizeName(camporegistro, 250, evt);
    }//GEN-LAST:event_camporegistroKeyTyped

    private void camporegistroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_camporegistroKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_camporegistroKeyReleased

    private void camporegistroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_camporegistroKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_camporegistroKeyPressed

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
            java.util.logging.Logger.getLogger(publicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(publicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(publicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(publicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new publicaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField camporegistro;
    private javax.swing.JButton enviar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}