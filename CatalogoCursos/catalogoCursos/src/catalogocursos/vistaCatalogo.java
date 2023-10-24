package catalogocursos;

import com.formdev.flatlaf.FlatDarkLaf;
import database.conexionBDR;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

public class vistaCatalogo extends javax.swing.JFrame {

    public vistaCatalogo() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baseCatalogo = new javax.swing.JPanel();
        botonCurso1 = new javax.swing.JButton();
        botonCurso2 = new javax.swing.JButton();
        botonCurso3 = new javax.swing.JButton();
        botonCurso4 = new javax.swing.JButton();
        botonCurso5 = new javax.swing.JButton();
        botonCurso6 = new javax.swing.JButton();
        tituloCurso1 = new javax.swing.JLabel();
        tituloCurso2 = new javax.swing.JLabel();
        tituloCurso3 = new javax.swing.JLabel();
        tituloCurso4 = new javax.swing.JLabel();
        tituloCurso5 = new javax.swing.JLabel();
        tituloCurso6 = new javax.swing.JLabel();
        indicador1 = new javax.swing.JButton();
        indicador2 = new javax.swing.JButton();
        indicador3 = new javax.swing.JButton();
        indicador4 = new javax.swing.JButton();
        indicador5 = new javax.swing.JButton();
        indicador6 = new javax.swing.JButton();
        botonInscribirse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 500));

        baseCatalogo.setBackground(new java.awt.Color(48, 48, 48));

        botonCurso1.setBackground(new java.awt.Color(217, 217, 217));
        botonCurso1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bannerCatalogo/1.png"))); // NOI18N
        botonCurso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCurso1ActionPerformed(evt);
            }
        });

        botonCurso2.setBackground(new java.awt.Color(217, 217, 217));
        botonCurso2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bannerCatalogo/2.png"))); // NOI18N
        botonCurso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCurso2ActionPerformed(evt);
            }
        });

        botonCurso3.setBackground(new java.awt.Color(217, 217, 217));
        botonCurso3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bannerCatalogo/3.png"))); // NOI18N
        botonCurso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCurso3ActionPerformed(evt);
            }
        });

        botonCurso4.setBackground(new java.awt.Color(217, 217, 217));
        botonCurso4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bannerCatalogo/4.png"))); // NOI18N
        botonCurso4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCurso4ActionPerformed(evt);
            }
        });

        botonCurso5.setBackground(new java.awt.Color(217, 217, 217));
        botonCurso5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bannerCatalogo/5.png"))); // NOI18N
        botonCurso5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCurso5ActionPerformed(evt);
            }
        });

        botonCurso6.setBackground(new java.awt.Color(217, 217, 217));
        botonCurso6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bannerCatalogo/6.png"))); // NOI18N
        botonCurso6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCurso6ActionPerformed(evt);
            }
        });

        tituloCurso1.setBackground(new java.awt.Color(255, 255, 255));
        tituloCurso1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloCurso1.setForeground(new java.awt.Color(255, 255, 255));
        tituloCurso1.setText("<html>Física General<html>");

        tituloCurso2.setBackground(new java.awt.Color(255, 255, 255));
        tituloCurso2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloCurso2.setForeground(new java.awt.Color(255, 255, 255));
        tituloCurso2.setText("<html>Introducción <p>a la <p>Programación<html>");

        tituloCurso3.setBackground(new java.awt.Color(255, 255, 255));
        tituloCurso3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloCurso3.setForeground(new java.awt.Color(255, 255, 255));
        tituloCurso3.setText("<html>Sistemas de <p>Información II<html>");

        tituloCurso4.setBackground(new java.awt.Color(255, 255, 255));
        tituloCurso4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloCurso4.setForeground(new java.awt.Color(255, 255, 255));
        tituloCurso4.setText("<html>Base de Datos <p>II<html>");

        tituloCurso5.setBackground(new java.awt.Color(255, 255, 255));
        tituloCurso5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloCurso5.setForeground(new java.awt.Color(255, 255, 255));
        tituloCurso5.setText("<html>Mercadotecnia<html>");

        tituloCurso6.setBackground(new java.awt.Color(255, 255, 255));
        tituloCurso6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloCurso6.setForeground(new java.awt.Color(255, 255, 255));
        tituloCurso6.setText("<html>Circuitos <p>Electrónicos<html>");

        indicador1.setBackground(new java.awt.Color(250, 255, 0));
        indicador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador1ActionPerformed(evt);
            }
        });

        indicador2.setBackground(new java.awt.Color(250, 255, 0));
        indicador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador2ActionPerformed(evt);
            }
        });

        indicador3.setBackground(new java.awt.Color(250, 255, 0));
        indicador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador3ActionPerformed(evt);
            }
        });

        indicador4.setBackground(new java.awt.Color(250, 255, 0));
        indicador4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador4ActionPerformed(evt);
            }
        });

        indicador5.setBackground(new java.awt.Color(250, 255, 0));
        indicador5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador5ActionPerformed(evt);
            }
        });

        indicador6.setBackground(new java.awt.Color(250, 255, 0));
        indicador6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador6ActionPerformed(evt);
            }
        });

        botonInscribirse.setBackground(new java.awt.Color(217, 217, 217));
        botonInscribirse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonInscribirse.setForeground(new java.awt.Color(0, 0, 0));
        botonInscribirse.setText("INSCRIBIRSE");
        botonInscribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInscribirseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout baseCatalogoLayout = new javax.swing.GroupLayout(baseCatalogo);
        baseCatalogo.setLayout(baseCatalogoLayout);
        baseCatalogoLayout.setHorizontalGroup(
            baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, baseCatalogoLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonInscribirse)
                    .addGroup(baseCatalogoLayout.createSequentialGroup()
                        .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCurso4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloCurso4)
                            .addComponent(indicador4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCurso5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloCurso5)
                            .addComponent(indicador5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(indicador6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloCurso6)
                            .addComponent(botonCurso6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(baseCatalogoLayout.createSequentialGroup()
                        .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCurso1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloCurso1)
                            .addComponent(indicador1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCurso2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloCurso2)
                            .addComponent(indicador2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(indicador3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tituloCurso3)
                                .addComponent(botonCurso3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(94, 94, 94))
        );
        baseCatalogoLayout.setVerticalGroup(
            baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseCatalogoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(botonInscribirse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCurso1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCurso2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCurso3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCurso1)
                    .addComponent(tituloCurso2)
                    .addComponent(tituloCurso3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baseCatalogoLayout.createSequentialGroup()
                        .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(indicador1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(indicador3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonCurso4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCurso5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCurso6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tituloCurso4)
                            .addComponent(tituloCurso5)
                            .addComponent(tituloCurso6)))
                    .addComponent(indicador2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(baseCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indicador4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indicador5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indicador6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCurso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCurso1ActionPerformed
        this.dispose();
        vistaCurso1 curso1 = new vistaCurso1();
        curso1.setVisible(true);
    }//GEN-LAST:event_botonCurso1ActionPerformed

    private void botonCurso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCurso2ActionPerformed
        this.dispose();
        vistaCurso2 curso2 = new vistaCurso2();
        curso2.setVisible(true);
    }//GEN-LAST:event_botonCurso2ActionPerformed

    private void botonCurso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCurso3ActionPerformed
        this.dispose();
        vistaCurso3 curso3 = new vistaCurso3();
        curso3.setVisible(true);
    }//GEN-LAST:event_botonCurso3ActionPerformed

    private void botonCurso4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCurso4ActionPerformed
        this.dispose();
        vistaCurso4 curso4 = new vistaCurso4();
        curso4.setVisible(true);
    }//GEN-LAST:event_botonCurso4ActionPerformed

    private void botonCurso5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCurso5ActionPerformed
        this.dispose();
        vistaCurso5 curso5 = new vistaCurso5();
        curso5.setVisible(true);
    }//GEN-LAST:event_botonCurso5ActionPerformed

    private void botonCurso6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCurso6ActionPerformed
        this.dispose();
        vistaCurso6 curso6 = new vistaCurso6();
        curso6.setVisible(true);
    }//GEN-LAST:event_botonCurso6ActionPerformed

    private void botonInscribirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInscribirseActionPerformed
        this.dispose();
        formularioInscripcion formulario = new formularioInscripcion();
        formulario.setVisible(true);
    }//GEN-LAST:event_botonInscribirseActionPerformed

    public void indicador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador1ActionPerformed
        // Objeto de la calse conexion para manejar la conexion con la base de datos
        conexionBDR con = new conexionBDR();
        // Llama al metodo conectar para obtener la conexion
        Connection jdbc = con.conctar();
        // Variables con la sentencia SQL - Insertar datos
        String consulC1 = "SELECT estado FROM cursos WHERE nombreCurso = 'Física General'";
        PreparedStatement cur1;
        try{
            cur1 = jdbc.prepareStatement(consulC1);
            ResultSet rs = cur1.executeQuery();
            boolean estado = false;
            if(rs.next()){
                estado = rs.getBoolean(1);
            }
            
            if(estado){
                indicador1.setBackground(new Color(255,0,0));
            }
        }catch (SQLException ex) {
            // Captura alguna excepcion al ejecutar y la muestra por consola
            Logger.getLogger(formularioInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Llama al método desconectar - Cierra la conexión con la base de datos
        con.desconectar();
    }//GEN-LAST:event_indicador1ActionPerformed

    public void indicador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador2ActionPerformed
        // Objeto de la calse conexion para manejar la conexion con la base de datos
        conexionBDR con = new conexionBDR();
        // Llama al metodo conectar para obtener la conexion
        Connection jdbc = con.conctar();
        // Variables con la sentencia SQL - Insertar datos
        String consulC2 = "SELECT estado FROM cursos WHERE nombreCurso = 'Introducción a la Programación'";
        PreparedStatement cur2;
        try{
            cur2 = jdbc.prepareStatement(consulC2);
            ResultSet rs = cur2.executeQuery();
            boolean estado = false;
            if(rs.next()){
                estado = rs.getBoolean(1);
            }
            
            if(estado){
                indicador2.setBackground(new Color(255,0,0));
            }
        }catch (SQLException ex) {
            // Captura alguna excepcion al ejecutar y la muestra por consola
            Logger.getLogger(formularioInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Llama al método desconectar - Cierra la conexión con la base de datos
        con.desconectar();
    }//GEN-LAST:event_indicador2ActionPerformed

    public void indicador3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador3ActionPerformed
        // Objeto de la calse conexion para manejar la conexion con la base de datos
        conexionBDR con = new conexionBDR();
        // Llama al metodo conectar para obtener la conexion
        Connection jdbc = con.conctar();
        // Variables con la sentencia SQL - Insertar datos
        String consulC3 = "SELECT estado FROM cursos WHERE nombreCurso = 'Sistemas de Información II'";
        PreparedStatement cur3;
        try{
            cur3 = jdbc.prepareStatement(consulC3);
            ResultSet rs = cur3.executeQuery();
            boolean estado = false;
            if(rs.next()){
                estado = rs.getBoolean(1);
            }
            
            if(estado){
                indicador3.setBackground(new Color(255,0,0));
            }
        }catch (SQLException ex) {
            // Captura alguna excepcion al ejecutar y la muestra por consola
            Logger.getLogger(formularioInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Llama al método desconectar - Cierra la conexión con la base de datos
        con.desconectar();
    }//GEN-LAST:event_indicador3ActionPerformed

    public void indicador4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador4ActionPerformed
        // Objeto de la calse conexion para manejar la conexion con la base de datos
        conexionBDR con = new conexionBDR();
        // Llama al metodo conectar para obtener la conexion
        Connection jdbc = con.conctar();
        // Variables con la sentencia SQL - Insertar datos
        String consulC4 = "SELECT estado FROM cursos WHERE nombreCurso = 'Base de Datos II'";
        PreparedStatement cur4;
        try{
            cur4 = jdbc.prepareStatement(consulC4);
            ResultSet rs = cur4.executeQuery();
            boolean estado = false;
            if(rs.next()){
                estado = rs.getBoolean(1);
            }
            
            if(estado){
                indicador4.setBackground(new Color(255,0,0));
            }
        }catch (SQLException ex) {
            // Captura alguna excepcion al ejecutar y la muestra por consola
            Logger.getLogger(formularioInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Llama al método desconectar - Cierra la conexión con la base de datos
        con.desconectar();
    }//GEN-LAST:event_indicador4ActionPerformed

    public void indicador5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador5ActionPerformed
        // Objeto de la calse conexion para manejar la conexion con la base de datos
        conexionBDR con = new conexionBDR();
        // Llama al metodo conectar para obtener la conexion
        Connection jdbc = con.conctar();
        // Variables con la sentencia SQL - Insertar datos
        String consulC5 = "SELECT estado FROM cursos WHERE nombreCurso = 'Mercadotecnia'";
        PreparedStatement cur5;
        try{
            cur5 = jdbc.prepareStatement(consulC5);
            ResultSet rs = cur5.executeQuery();
            boolean estado = false;
            if(rs.next()){
                estado = rs.getBoolean(1);
            }
            
            if(estado){
                indicador5.setBackground(new Color(255,0,0));
            }
        }catch (SQLException ex) {
            // Captura alguna excepcion al ejecutar y la muestra por consola
            Logger.getLogger(formularioInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Llama al método desconectar - Cierra la conexión con la base de datos
        con.desconectar();
    }//GEN-LAST:event_indicador5ActionPerformed

    public void indicador6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador6ActionPerformed
        // Objeto de la calse conexion para manejar la conexion con la base de datos
        conexionBDR con = new conexionBDR();
        // Llama al metodo conectar para obtener la conexion
        Connection jdbc = con.conctar();
        // Variables con la sentencia SQL - Insertar datos
        String consulC6 = "SELECT estado FROM cursos WHERE nombreCurso = 'Circuitos Electrónicos'";
        PreparedStatement cur6;
        try{
            cur6 = jdbc.prepareStatement(consulC6);
            ResultSet rs = cur6.executeQuery();
            boolean estado = false;
            if(rs.next()){
                estado = rs.getBoolean(1);
            }
            
            if(estado){
                indicador6.setBackground(new Color(255,0,0));
            }
        }catch (SQLException ex) {
            // Captura alguna excepcion al ejecutar y la muestra por consola
            Logger.getLogger(formularioInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Llama al método desconectar - Cierra la conexión con la base de datos
        con.desconectar();
    }//GEN-LAST:event_indicador6ActionPerformed

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
                new vistaCatalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseCatalogo;
    private javax.swing.JButton botonCurso1;
    private javax.swing.JButton botonCurso2;
    private javax.swing.JButton botonCurso3;
    private javax.swing.JButton botonCurso4;
    private javax.swing.JButton botonCurso5;
    private javax.swing.JButton botonCurso6;
    private javax.swing.JButton botonInscribirse;
    public javax.swing.JButton indicador1;
    public javax.swing.JButton indicador2;
    public javax.swing.JButton indicador3;
    public javax.swing.JButton indicador4;
    public javax.swing.JButton indicador5;
    public javax.swing.JButton indicador6;
    private javax.swing.JLabel tituloCurso1;
    private javax.swing.JLabel tituloCurso2;
    private javax.swing.JLabel tituloCurso3;
    private javax.swing.JLabel tituloCurso4;
    private javax.swing.JLabel tituloCurso5;
    private javax.swing.JLabel tituloCurso6;
    // End of variables declaration//GEN-END:variables
}
