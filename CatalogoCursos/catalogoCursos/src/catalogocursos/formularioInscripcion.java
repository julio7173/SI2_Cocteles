package catalogocursos;

import com.formdev.flatlaf.FlatDarkLaf;
import database.conexionBDR;
import java.awt.event.ActionEvent;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class formularioInscripcion extends javax.swing.JFrame {
    
    public formularioInscripcion() {
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
    
    // Metodo que valida ingreso de solo texto
    public void onlyStrings(JTextField campo, int size, java.awt.event.KeyEvent evt){
        // Obtiene el codigo del caracter presionado
        int key = evt.getKeyChar();
        // Verifica si el codigo corresponde a un numero entre 0 y 9
        boolean number = key >= 48 && key <= 57;
        // Si es un numero cancela el evento y no ingresa al campo
        if(number){
            evt.consume();
        }
        // Verifica que el texto no exceda el amañó máximo
        if(campo.getText().trim().length() == size){
            // Cancela el evento y no ingresa el carácter presionada
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baseFormulario = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        labelCI = new javax.swing.JLabel();
        campoCI = new javax.swing.JTextField();
        labelCorreo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        labelCurso = new javax.swing.JLabel();
        campoCursos = new javax.swing.JComboBox<>();
        botonInscribirse = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 500));

        baseFormulario.setBackground(new java.awt.Color(48, 48, 48));

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setText("Nombre completo");

        campoNombre.setBackground(new java.awt.Color(255, 255, 255));
        campoNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(0, 0, 0));
        campoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNombreKeyTyped(evt);
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

        labelCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        labelCorreo.setText("Correo electrónico");

        campoCorreo.setBackground(new java.awt.Color(255, 255, 255));
        campoCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoCorreo.setForeground(new java.awt.Color(0, 0, 0));
        campoCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCorreoKeyTyped(evt);
            }
        });

        labelCurso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCurso.setForeground(new java.awt.Color(255, 255, 255));
        labelCurso.setText("Seleccione un curso");

        campoCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Física General", "Introducción a la Programación", "Sistemas de Información II", "Base de Datos II", "Mercadotecnia", "Circuitos Electrónicos" }));

        botonInscribirse.setBackground(new java.awt.Color(255, 255, 255));
        botonInscribirse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonInscribirse.setForeground(new java.awt.Color(0, 0, 0));
        botonInscribirse.setText("I N S C R I B I R S E");
        botonInscribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInscribirseActionPerformed(evt);
            }
        });

        botonAtras.setBackground(new java.awt.Color(217, 217, 217));
        botonAtras.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(0, 0, 0));
        botonAtras.setText("<");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout baseFormularioLayout = new javax.swing.GroupLayout(baseFormulario);
        baseFormulario.setLayout(baseFormularioLayout);
        baseFormularioLayout.setHorizontalGroup(
            baseFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseFormularioLayout.createSequentialGroup()
                .addGroup(baseFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baseFormularioLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(baseFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCurso)
                            .addGroup(baseFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelCorreo)
                                .addComponent(labelCI)
                                .addComponent(labelNombre)
                                .addComponent(campoCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(campoCI, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(campoNombre)
                                .addComponent(campoCursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(baseFormularioLayout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(botonInscribirse))
                    .addGroup(baseFormularioLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(botonAtras)))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        baseFormularioLayout.setVerticalGroup(
            baseFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseFormularioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botonAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(labelCI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(labelCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(botonInscribirse)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.dispose();
        vistaCatalogo catalogo = new vistaCatalogo();
        catalogo.setVisible(true);
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void campoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNombreKeyTyped
        onlyStrings(campoNombre, 80, evt);
    }//GEN-LAST:event_campoNombreKeyTyped

    private void campoCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCIKeyTyped
        onlyNumbers(campoCI, 10, evt);
    }//GEN-LAST:event_campoCIKeyTyped

    private void campoCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCorreoKeyTyped
        sizeName(campoCorreo, 150, evt);
    }//GEN-LAST:event_campoCorreoKeyTyped

    private void botonInscribirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInscribirseActionPerformed
        // OBtener los datos de los campos
        String nombre = campoNombre.getText().trim();
        String ci = campoCI.getText().trim();
        String correo = campoCorreo.getText().trim();
        String curso = campoCursos.getSelectedItem().toString().trim();
        
        // Verifica que todos los campos esten llenos
        if(nombre.isEmpty() || ci.isEmpty() || correo.isEmpty() || curso.isEmpty()){
            // Muestra mensaje - Todos o algun campo vacio
            JOptionPane.showMessageDialog(this, "Debes de llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            // Objeto de la calse conexion para manejar la conexion con la base de datos
            conexionBDR con = new conexionBDR();
            // Llama al metodo conectar para obtener la conexion
            Connection jdbc = con.conctar();
            // Variables con la sentencia SQL - Insertar datos
            String consultaCupo = "SELECT cupoActual FROM cursos WHERE nombreCurso = ?";
            String verAlum = "SELECT COUNT(*) FROM alumnos WHERE ci = ? AND nombreCompleto = ? AND correo = ?";
            String alumno = "INSERT INTO alumnos( ci, nombreCompleto, correo) VALUES(?, ?, ?)";
            String verIns = "SELECT COUNT(*) FROM inscritos WHERE ci = ? AND nombreCurso = ?";
            String inscribirse = "INSERT INTO inscritos( ci, nombreCurso) VALUES(?, ?)";
            String cupos = "UPDATE cursos SET cupoActual = cupoActual + 1 WHERE nombreCurso = ?";
            // Variables para preparar y ejecutar la sentencia SQL
            PreparedStatement al;
            PreparedStatement ins;
            PreparedStatement cupo;
            PreparedStatement conCupo;
            PreparedStatement verAl;
            PreparedStatement verIn;
            // Variable que almacena el número de filas afectadas por la operación
            int filasAL;
            int filasINS;
            int filasCUR;
            try {
                
                conCupo = jdbc.prepareCall(consultaCupo);
                conCupo.setString(1, curso);
                ResultSet rs = conCupo.executeQuery();
                
                verAl = jdbc.prepareStatement(verAlum);
                verAl.setInt(1, Integer.parseInt(ci));
                verAl.setString(2, nombre);
                verAl.setString(3, correo);
                ResultSet rs2 = verAl.executeQuery();
                
                verIn = jdbc.prepareStatement(verIns);
                verIn.setInt(1, Integer.parseInt(ci));
                verIn.setString(2, curso);
                ResultSet rs3 = verIn.executeQuery();
                
                int cupoActual = 0;
                int existe = 0;
                int inscrito = 0;
                
                if(rs.next()){
                    cupoActual = rs.getInt("cupoActual");
                }
                if(rs2.next()){
                    existe = rs2.getInt(1);
                }
                if(rs3.next()){
                    inscrito = rs3.getInt(1);
                }
                
                if(cupoActual <= 25){
                    if(existe == 0){
                        // Prepara la sentencia SQL con la conexion
                        al = jdbc.prepareStatement(alumno);
                        // Asignación de valores usando los campos como parametros de la sentencia SQL
                        al.setInt(1, Integer.parseInt(ci));
                        al.setString(2, nombre);
                        al.setString(3, correo);
                        // Ejecuta la sentencia SQL - Obtiene número de filas afectadas por la operación
                        filasAL = al.executeUpdate();
                        // Cierra el objeto PreparedStatement
                        al.close();
                        
                        if(inscrito == 0){
                            // Prepara la sentencia SQL con la conexion
                            ins = jdbc.prepareStatement(inscribirse);
                            // Asignación de valores usando los campos como parametros de la sentencia SQL
                            ins.setInt(1, Integer.parseInt(ci));
                            ins.setString(2, curso);
                            // Ejecuta la sentencia SQL - Obtiene número de filas afectadas por la operación
                            filasINS = ins.executeUpdate();
                            // Cierra el objeto PreparedStatement
                            ins.close();
                            // Prepara la sentencia SQL con la conexion
                            cupo = jdbc.prepareStatement(cupos);
                            // Asignación de valores usando los campos como parametros de la sentencia SQL
                            cupo.setString(1, curso);
                            // Ejecuta la sentencia SQL - Obtiene número de filas afectadas por la operación
                            filasCUR = cupo.executeUpdate();
                            // Cierra el objeto PreparedStatement
                            cupo.close();
                            // Verifica si la operación fue exitosa
                            if(filasAL > 0 || filasINS > 0 || filasCUR > 0){
                                // Muestra mensaje - EXITO
                                JOptionPane.showMessageDialog(this, "Alumno " + nombre + " inscrito con exito al curso " + curso, "Exito", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(this, "El alumno " + nombre + " ya está inscrito al curso " + curso, "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        
                    }else{
                        System.out.println("El alumno " + nombre + " ya esta en la lista de alumnos");
                        if(inscrito == 0){
                            // Prepara la sentencia SQL con la conexion
                            ins = jdbc.prepareStatement(inscribirse);
                            // Asignación de valores usando los campos como parametros de la sentencia SQL
                            ins.setInt(1, Integer.parseInt(ci));
                            ins.setString(2, curso);
                            // Ejecuta la sentencia SQL - Obtiene número de filas afectadas por la operación
                            filasINS = ins.executeUpdate();
                            // Cierra el objeto PreparedStatement
                            ins.close();
                            // Prepara la sentencia SQL con la conexion
                            cupo = jdbc.prepareStatement(cupos);
                            // Asignación de valores usando los campos como parametros de la sentencia SQL
                            cupo.setString(1, curso);
                            // Ejecuta la sentencia SQL - Obtiene número de filas afectadas por la operación
                            filasCUR = cupo.executeUpdate();
                            // Cierra el objeto PreparedStatement
                            cupo.close();
                            // Verifica si la operación fue exitosa
                            if(filasINS > 0 || filasCUR > 0){
                                // Muestra mensaje - EXITO
                                JOptionPane.showMessageDialog(this, "Alumno " + nombre + " inscrito con exito al curso " + curso, "Exito", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(this, "El alumno " + nombre + " ya está inscrito al curso " + curso, "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }else{
                    switch(curso){
                        case "Física General":
                            indicador1.doClick();
                            break;
                        case "Introducción a la Programación":
                            indicador2.doClick();
                            break;
                        case "Sistemas de Información II":
                            indicador3.doClick();
                            break;
                        case "Base de Datos II":
                            indicador4.doClick();
                            break;
                        case "Mercadotecnia":
                            indicador5.doClick();
                            break;
                        case "Circuitos Electrónicos":
                            indicador6.doClick();
                            break;
                        default:
                            System.out.println("No existen mas cursos");
                            break;
                    }
                    JOptionPane.showMessageDialog(this, "No hay cupos disponibles para el curso " + curso, "Error",JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                // Captura alguna excepcion al ejecutar y la muestra por consola
                Logger.getLogger(formularioInscripcion.class.getName()).log(Level.SEVERE, null, ex);
            }
            // Llama al método desconectar - Cierra la conexión con la base de datos
            con.desconectar();
        }
    }//GEN-LAST:event_botonInscribirseActionPerformed

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
                new formularioInscripcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseFormulario;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonInscribirse;
    private javax.swing.JTextField campoCI;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JComboBox<String> campoCursos;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel labelCI;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelCurso;
    private javax.swing.JLabel labelNombre;
    // End of variables declaration//GEN-END:variables
}
