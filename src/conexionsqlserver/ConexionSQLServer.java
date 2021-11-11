/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionsqlserver;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanPablo
 */
public class ConexionSQLServer {
    static String bases ="";
    static Conexion c = new Conexion();
    private static Statement st;
    private static ResultSet rs;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            
            st = c.getConexion().createStatement();
            
            String consulta = "SELECT name FROM master.dbo.sysdatabases";
            ResultSet rs = st.executeQuery(consulta);
            
            while(rs.next()){
               bases+=rs.getString(1);
               System.out.println(bases);
               JOptionPane.showMessageDialog(null,bases);
            }
            
        }catch(SQLException ex){
            System.out.println(ex.toString());
            
        }
        
    }
    
}
