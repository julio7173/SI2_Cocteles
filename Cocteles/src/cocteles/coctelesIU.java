package cocteles;

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

public class coctelesIU extends javax.swing.JFrame {
    
    conexion jdbc = new conexion();
    
    public coctelesIU() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ventana = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        nombreCoctel = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        timepoPreparacion = new javax.swing.JLabel();
        campoTiempo = new javax.swing.JTextField();
        popularidad = new javax.swing.JLabel();
        campoPopularidad = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ventana.setBackground(new java.awt.Color(0, 0, 0));

        titulo.setBackground(new java.awt.Color(0, 0, 0));
        titulo.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Cocteles populares de la ciudad de Cochabamba");

        nombreCoctel.setBackground(new java.awt.Color(0, 0, 0));
        nombreCoctel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        nombreCoctel.setForeground(new java.awt.Color(255, 255, 255));
        nombreCoctel.setText("Nombre del Coctel");

        campoNombre.setBackground(new java.awt.Color(255, 255, 255));
        campoNombre.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(0, 0, 0));
        campoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNombreKeyTyped(evt);
            }
        });

        timepoPreparacion.setBackground(new java.awt.Color(0, 0, 0));
        timepoPreparacion.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        timepoPreparacion.setForeground(new java.awt.Color(255, 255, 255));
        timepoPreparacion.setText("Tiempo de preparación");

        campoTiempo.setBackground(new java.awt.Color(255, 255, 255));
        campoTiempo.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        campoTiempo.setForeground(new java.awt.Color(0, 0, 0));
        campoTiempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTiempoKeyTyped(evt);
            }
        });

        popularidad.setBackground(new java.awt.Color(0, 0, 0));
        popularidad.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        popularidad.setForeground(new java.awt.Color(255, 255, 255));
        popularidad.setText("Popularidad del Coctel");

        campoPopularidad.setBackground(new java.awt.Color(255, 255, 255));
        campoPopularidad.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        campoPopularidad.setForeground(new java.awt.Color(0, 0, 0));
        campoPopularidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoPopularidadKeyTyped(evt);
            }
        });

        botonAgregar.setBackground(new java.awt.Color(255, 255, 255));
        botonAgregar.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        botonAgregar.setForeground(new java.awt.Color(0, 0, 0));
        botonAgregar.setText("Agregar");
        botonAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonEliminar.setBackground(new java.awt.Color(255, 0, 0));
        botonEliminar.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("Eliminar");
        botonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VentanaLayout = new javax.swing.GroupLayout(Ventana);
        Ventana.setLayout(VentanaLayout);
        VentanaLayout.setHorizontalGroup(
            VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(VentanaLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(nombreCoctel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(VentanaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoPopularidad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(VentanaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(timepoPreparacion))
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(VentanaLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(popularidad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(botonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAgregar)
                .addGap(62, 62, 62))
        );
        VentanaLayout.setVerticalGroup(
            VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(nombreCoctel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timepoPreparacion, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(popularidad, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPopularidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(botonEliminar))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ventana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ventana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Metodo que valida ingreso de solo numeros
    public void onlyNumbers(JTextField campo, int size, java.awt.event.KeyEvent evt){
        // Obtiene el codigo del caracter presionado
        int key = evt.getKeyChar();
        // Verifica si el codigo corresponde a un numero entre 0 y 9
        boolean number = key >= 48 && key <= 57;
        // Si no es un numero cancela el eento y no ingresa al campo
        if(!number){
            evt.consume();
        }
        // Verifica que no exceda el tamaño máximo permitido
        if(campo.getText().trim().length() == size){
            // Cancela el evento y no ingresa el numero presionada
            evt.consume();
        }
    }
    
    // Metodo que valida el tamaño del texto ingresado
    public void sizeName(JTextField campo, int size, java.awt.event.KeyEvent evt){
        // Verifica que el texto no exceda el amañó máximo
        if(campo.getText().trim().length() == size){
            // Cancela el evento y no ingresa el carácter presionada
            evt.consume();
        }
    }
    
    private void campoTiempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTiempoKeyTyped
        onlyNumbers(campoTiempo, 3, evt);
    }//GEN-LAST:event_campoTiempoKeyTyped

    private void campoPopularidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPopularidadKeyTyped
        onlyNumbers(campoPopularidad, 2, evt);
    }//GEN-LAST:event_campoPopularidadKeyTyped

    private void campoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNombreKeyTyped
        sizeName(campoNombre, 20, evt);
    }//GEN-LAST:event_campoNombreKeyTyped

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // Obtener los datos del coctel
        String nombre = campoNombre.getText().trim();
        String tiempoPreparacion = campoTiempo.getText().trim();
        String popularidad = campoPopularidad.getText().trim();
        
        // Verifica que todos los campos esten llenos
        if(nombre.isEmpty() || tiempoPreparacion.isEmpty() || popularidad.isEmpty()){
            // Muestra mensaje - Todos o algun campo vacio
            JOptionPane.showMessageDialog(this, "Debes de llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            // Muestra mensaje - EXITO
            JOptionPane.showMessageDialog(this, "Felicidades Shinji", "Exito", JOptionPane.INFORMATION_MESSAGE);
            // Objeto de la calse conexion para manejar la conexion con la base de datos
            conexion con = new conexion();
            // Llama al metodo conectar para obtener la conexion
            Connection jdbc = con.conctar();
            // Variable con la sentencia SQL - Insertar datos
            String sql = "INSERT INTO coctel(nombre, tiempoPreparacion, popularidad) VALUES(?, ?, ?)";
            // Variable para preparar y ejecutar la sentencia SQL
            PreparedStatement ps;
            // Variable que almacena el número de filas afectadas por la operación
            int filas;
            try {
                // Prepara la sentencia SQL con la conexion
                ps = jdbc.prepareStatement(sql);
                // Asignación de valores usando los campos como parametros de la sentencia SQL
                ps.setString(1, nombre);
                ps.setInt(2, Integer.parseInt(tiempoPreparacion));
                ps.setInt(3, Integer.parseInt(popularidad));
                // Ejecuta la sentencia SQL - Obtiene número de filas afectadas por la operación
                filas = ps.executeUpdate();
                // Cierra el objeto PreparedStatement
                ps.close();
                // Verifica si la operación fue exitosa
                if(filas > 0){
                    // Muestra mensaje - EXITO
                    JOptionPane.showMessageDialog(this, "Coctel " + nombre + " agregado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    // Muestra mensaje - ERROR
                    JOptionPane.showMessageDialog(this, "No se pudo agregar el coctel " + nombre, "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                // Captura alguna excepcion al ejecutar y la muestra por consola
                Logger.getLogger(coctelesIU.class.getName()).log(Level.SEVERE, null, ex);
            }
            // Llama al método desconectar - Cierra la conexión con la base de datos
            con.desconectar();
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // Obtener los datos del coctel
        String nombre = campoNombre.getText().trim();
        
        // Verifica que todos los campos esten llenos
        if(nombre.isEmpty()){
            // Muestra mensaje - Todos o algun campo vacio
            JOptionPane.showMessageDialog(this, "Debes de llenar al menos el campo del nombre", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            // Muestra mensaje - EXITO
            JOptionPane.showMessageDialog(this, "Felicidades Shinji", "Exito", JOptionPane.INFORMATION_MESSAGE);
            // Objeto de la calse conexion para manejar la conexion con la base de datos
            conexion con = new conexion();
            // Llama al metodo conectar para obtener la conexion
            Connection jdbc = con.conctar();
            // Variable con la sentencia SQL - Insertar datos
            String sql = "DELETE FROM coctel WHERE nombre = ?";
            // Variable para preparar y ejecutar la sentencia SQL
            PreparedStatement ps;
            // Variable que almacena el número de filas afectadas por la operación
            int filas;
            try {
                // Prepara la sentencia SQL con la conexion
                ps = jdbc.prepareStatement(sql);
                // Asignación de valores usando los campos como parametros de la sentencia SQL
                ps.setString(1, nombre);
                // Ejecuta la sentencia SQL - Obtiene número de filas afectadas por la operación
                filas = ps.executeUpdate();
                // Cierra el objeto PreparedStatement
                ps.close();
                // Verifica si la operación fue exitosa
                if(filas > 0){
                    // Muestra mensaje - EXITO
                    JOptionPane.showMessageDialog(this, "Coctel " + nombre + " eliminado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    // Muestra mensaje - ERROR
                    JOptionPane.showMessageDialog(this, "No se pudo encontrar el coctel " + nombre, "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                // Captura alguna excepcion al ejecutar y la muestra por consola
                Logger.getLogger(coctelesIU.class.getName()).log(Level.SEVERE, null, ex);
            }
            // Llama al método desconectar - Cierra la conexión con la base de datos
            con.desconectar();
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

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
                new coctelesIU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ventana;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPopularidad;
    private javax.swing.JTextField campoTiempo;
    private javax.swing.JLabel nombreCoctel;
    private javax.swing.JLabel popularidad;
    private javax.swing.JLabel timepoPreparacion;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
