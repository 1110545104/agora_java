/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ga7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Heiner y Yuly
 */
public class Search {

    public void buscarTodosUsuarios() {
        try {
            Connection con = ConexionBD.getConnection();
            Statement st = con.createStatement();
            ResultSet rs;

            rs = st.executeQuery("SELECT * FROM usuarios");

            rs.next();

            do {

                String impresion = "ID: " + rs.getInt("id")
                        + " NOMBRE: " + rs.getString("nombre")
                        + " EMAIL: " + rs.getString("email")
                        + " Clave: " + rs.getString("password");

                System.out.println(impresion);
            } while (rs.next());

        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
