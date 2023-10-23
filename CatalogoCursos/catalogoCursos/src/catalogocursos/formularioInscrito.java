package catalogocursos;

import com.formdev.flatlaf.FlatDarkLaf;
import database.conexionBDR;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class formularioInscrito extends javax.swing.JFrame {

    public formularioInscrito() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
    }
    
    // Metodo que valida ingreso de solo numeros
    public void onlyNumbers(JTextField campo, int size, java.awt.event.KeyEvent evt){
        // Obtiene el codigo del caracter presionado
        int key = evt.getKeyChar();
        // Verifica si el codigo corresponde a un numero entre 0 y 9
        boolean number = key >= 48 && key <= 57;
        // Si no es un numero cancela el evento y no ingresa al campo
        if(!number){
            evt.consume();
        }
        // Verifica que no exceda el tamaño máximo permitido
        if(campo.getText().trim().length() == size){
            // Cancela el evento y no ingresa el numero presionada
            evt.consume();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        labelCI = new javax.swing.JLabel();
        campoCI = new javax.swing.JTextField();
        labelCurso = new javax.swing.JLabel();
        campoCursos = new javax.swing.JComboBox<>();
        botonIrCurso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(48, 48, 48));

        botonAtras.setBackground(new java.awt.Color(217, 217, 217));
        botonAtras.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(0, 0, 0));
        botonAtras.setText("<");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        labelCI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCI.setForeground(new java.awt.Color(255, 255, 255));
        labelCI.setText("Cedula de Identidad");

        campoCI.setBackground(new java.awt.Color(255, 255, 255));
        campoCI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoCI.setForeground(new java.awt.Color(0, 0, 0));
        campoCI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCIKeyTyped(evt);
            }
        });

        labelCurso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCurso.setForeground(new java.awt.Color(255, 255, 255));
        labelCurso.setText("Seleccione un curso");

        campoCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Física General", "Introducción a la Programación", "Sistemas de Información II", "Base de Datos II", "Mercadotecnia", "Circuitos Electrónicos" }));

        botonIrCurso.setBackground(new java.awt.Color(255, 255, 255));
        botonIrCurso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonIrCurso.setForeground(new java.awt.Color(0, 0, 0));
        botonIrCurso.setText("IR AL CURSO");
        botonIrCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIrCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(botonAtras))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCurso))))
                .addContainerGap(248, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonIrCurso)
                .addGap(338, 338, 338))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(250, 250, 250)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelCI)
                        .addComponent(campoCI, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(250, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(botonAtras)
                .addGap(168, 168, 168)
                .addComponent(labelCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(botonIrCurso)
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(135, 135, 135)
                    .addComponent(labelCI)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(campoCI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(304, Short.MAX_VALUE)))
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

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.dispose();
        vistaCatalogo catalogo = new vistaCatalogo();
        catalogo.setVisible(true);
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void campoCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCIKeyTyped
        onlyNumbers(campoCI, 10, evt);
    }//GEN-LAST:event_campoCIKeyTyped

    private void botonIrCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIrCursoActionPerformed
        // OBtener los datos de los campos
        String ci = campoCI.getText().trim();
        String curso = campoCursos.getSelectedItem().toString().trim();
        
        // Verifica que todos los campos esten llenos
        if(ci.isEmpty() || curso.isEmpty()){
            // Muestra mensaje - Todos o algun campo vacio
            JOptionPane.showMessageDialog(this, "Debes de llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            // Objeto de la calse conexion para manejar la conexion con la base de datos
            conexionBDR con = new conexionBDR();
            // Llama al metodo conectar para obtener la conexion
            Connection jdbc = con.conctar();
            // Variables con la sentencia SQL - Insertar datos
            String verAlumIns = "SELECT COUNT(*) FROM inscritos WHERE ci = ? AND nombreCurso = ?";
            // Variables para preparar y ejecutar la sentencia SQL
            PreparedStatement alumIns;
            try {
                
                alumIns = jdbc.prepareStatement(verAlumIns);
                alumIns.setInt(1, Integer.parseInt(ci));
                alumIns.setString(2, curso);
                ResultSet rs = alumIns.executeQuery();
                
                int existe = 0;
                
                if(rs.next()){
                    existe = rs.getInt(1);
                }
                
                if(existe == 0){   
                    JOptionPane.showMessageDialog(this, "No estas inscrito al curso " + curso, "Error", JOptionPane.ERROR_MESSAGE);
                }else{
                    switch(curso){
                        case "Física General":
                            this.dispose();
                            vistaInscrito1 inscrito1 = new vistaInscrito1();
                            inscrito1.setVisible(true);
                            break;
                        case "Introducción a la Programación":
                            this.dispose();
                            vistaInscrito2 inscrito2 = new vistaInscrito2();
                            inscrito2.setVisible(true);
                            break;
                        case "Sistemas de Información II":
                            this.dispose();
                            vistaInscrito3 inscrito3 = new vistaInscrito3();
                            inscrito3.setVisible(true);
                            break;
                        case "Base de Datos II":
                            this.dispose();
                            vistaInscrito4 inscrito4 = new vistaInscrito4();
                            inscrito4.setVisible(true);
                            break;
                        case "Mercadotecnia":
                            this.dispose();
                            vistaInscrito5 inscrito5 = new vistaInscrito5();
                            inscrito5.setVisible(true);
                            break;
                        case "Circuitos Electrónicos":
                            this.dispose();
                            vistaInscrito6 inscrito6 = new vistaInscrito6();
                            inscrito6.setVisible(true);
                            break;
                        default:
                            System.out.println("No existen mas cursos");
                            break;
                    }
                } 
            } catch (SQLException ex) {
                // Captura alguna excepcion al ejecutar y la muestra por consola
                Logger.getLogger(formularioInscripcion.class.getName()).log(Level.SEVERE, null, ex);
            }
            // Llama al método desconectar - Cierra la conexión con la base de datos
            con.desconectar();
        }
    }//GEN-LAST:event_botonIrCursoActionPerformed


    public static void main(String args[]) {
        //Ccambiamos el LookAndFell de la ventana
        try {
            UIManager.setLookAndFeel( new FlatDarkLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioInscrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonIrCurso;
    private javax.swing.JTextField campoCI;
    private javax.swing.JComboBox<String> campoCursos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCI;
    private javax.swing.JLabel labelCurso;
    // End of variables declaration//GEN-END:variables
}
