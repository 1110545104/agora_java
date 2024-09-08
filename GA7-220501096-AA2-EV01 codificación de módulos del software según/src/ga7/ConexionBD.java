/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ga7;

/**
 *
 * @author Heiner y Yuly
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConexionBD {  

    private static final String usuario = "root";
    private static final String clave = "";
    private static final String url = "jdbc:mysql://localhost:3306/bd_ga7";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, usuario, clave);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("Error en la conexion a la bases de datos:", e);
        }
        return connection;
    }

}
