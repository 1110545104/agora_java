/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ga7;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Heiner y Yuly
 */
public class Insert {

    public static void main(String[] args) {

        try {
            Connection con = ConexionBD.getConnection();
            Statement st = con.createStatement();
            ResultSet rs;

            String sql = "INSERT INTO usuarios(nombre,email,password) VALUES('nombre3','nombre3@email','1234') ";

            st.executeUpdate(sql);

            new Search().buscarTodosUsuarios();

        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
