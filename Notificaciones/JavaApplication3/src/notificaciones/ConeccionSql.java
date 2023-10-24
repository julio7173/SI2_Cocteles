package notificaciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConeccionSql {

    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;
    public PreparedStatement ps;

    public void ConectarBasedeDatos() {
        try {
            final String Controlador = "com.mysql.jdbc.Driver";
            Class.forName(Controlador);
            final String url_bd = "jdbc:mysql://localhost:3306/notificaciones";
            conexion = DriverManager.getConnection(url_bd, "root", "");
            sentencia = conexion.createStatement();
            System.out.println("Coneccion realizada");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public int existeEstudiante(String codigo_sis) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String sql = "SELECT count(codigoSis) FROM estudiante WHERE codigoSis = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, codigo_sis);

            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException ex) {
            return 1;
        }
    }
    
    public boolean registrar(ventanas pro){
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "INSERT INTO estudiante(codigoSis, nombre, apellido, correo) VALUES (?,?,?,?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1,pro.getCod_sis());
            ps.setString(2,pro.getNombre());
            ps.setString(3,pro.getApellido());
            ps.setString(4,pro.getCorre());
            ps.execute();
            return true;
        }catch(SQLException ex){
            return false;
        }
    }
    public boolean esEmail(String correo) {

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+´)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);
        return mather.find();

    }
    public void DesconectarBasedeDatos() {
        try {
            if (conexion != null) {
                if (sentencia != null) {
                    sentencia.close();
                }
                conexion.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    public Connection getConnection() {
        try {
            final String Controlador = "com.mysql.jdbc.Driver";
            Class.forName(Controlador);
            final String url_bd = "jdbc:mysql://localhost:3306/cocteles";
            conexion = DriverManager.getConnection(url_bd, "root", "");
            sentencia = conexion.createStatement();
            System.out.println("Coneccion realizada");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ", JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
    }
}