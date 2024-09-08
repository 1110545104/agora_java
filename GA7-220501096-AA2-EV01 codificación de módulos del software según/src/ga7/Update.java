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
public class Update {

    public static void main(String[] args) {
        try {
            Connection con = ConexionBD.getConnection();
            Statement st = con.createStatement();
            ResultSet rs;

            String sql = "UPDATE usuarios set nombre='nombre11' WHERE id = '1' ";

            st.executeUpdate(sql);

            new Search().buscarTodosUsuarios();

        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
