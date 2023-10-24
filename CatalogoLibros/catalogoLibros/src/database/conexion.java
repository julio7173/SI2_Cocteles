package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    // Atributos para la conexion con la base de datos
    String url = "jdbc:mysql://0.tcp.sa.ngrok.io:10755/"; // Direccion de la base de datos
    String db = "biblioteca"; // NOmbre de la base de datos
    String user = "root"; // Nombre de usuario
    String password = ""; // Contraseña de usuario
    String driver = "com.mysql.cj.jdbc.Driver"; // Controlador JDBC
    
    Connection jdbc; // OBjeto que representa la conexion

    public conexion() {} // Constructor vacio
    
    public Connection conctar(){
        try {
            // Carga el controlador JDBC en memoria
            Class.forName(driver);
            // Obtiene la conexion con la base de datos
            jdbc = DriverManager.getConnection(url + db, user, password);
            // Imprime un mensaje - EXITO
            System.out.println("Base de datos conectada");
        } catch (ClassNotFoundException | SQLException e) {
            // Imprime un mensaje - ERROR
            System.out.println(e.getMessage());
            System.out.println("No se pudo conectar a la base de datos " + db);
        }
        // Devuelve el objeto de conexion
        return jdbc;
    }
    
    public void desconectar(){
        try {
            // Imprime un mensaje - FINALIZACION
            System.out.println("Conexión finalizada");
            // Cierra el objeto de conexion y libera recursos
            jdbc.close();
        } catch (SQLException e) {
            // IMprime un mensaje - ERROR
            System.out.println("Hubo un error al finalizar la conexión " + e);
        }
    }
}
