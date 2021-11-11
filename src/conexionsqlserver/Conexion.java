/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionsqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JuanPablo
 */
public class Conexion {
    
    public Connection getConexion() {
        String conUrl = "jdbc:sqlserver://localhost:1433;database=master;user=sa;password=Root1234;LogintTimeout=40;";  
        try {
           Connection con = DriverManager.getConnection(conUrl);
           return con;
        } catch (SQLException e) {
           System.out.println(e.toString());
           return null;
        }
    }

   
}
