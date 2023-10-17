package cocteles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;

public class ConeccionSql {

    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;
    public PreparedStatement ps;

    public void ConectarBasedeDatos() {
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
    }
    
    public int existeBebida(String bebida) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String sql = "SELECT count(nombre) FROM bebida WHERE nombre = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, bebida);

            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException ex) {
            return 1;
        }
    }
    
    public boolean registrar(Interfas pro){
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "INSERT INTO bebida(nombre, popularidad) VALUES (?,?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1,pro.getNombre());
            ps.setString(2,pro.getPopularidad());
            ps.execute();
            return true;
        }catch(SQLException ex){
            return false;
        }
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