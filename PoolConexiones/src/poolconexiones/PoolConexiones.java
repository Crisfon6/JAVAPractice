/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolconexiones;
import capadatos.pool.*;
import java.awt.BorderLayout;
import java.sql.*;
/**
 *
 * @author CristhianJavierDelga
 */
public class PoolConexiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs =null;
            try {
            //probamos el pool de mysql
                /*
                conn = PoolConexionesMysql.getConexion();
                System.out.println("Utilizamos el pool de conexion de Mysql");
                stmt = conn.prepareStatement("SELECT * FROM persona");
                rs = stmt.executeQuery(); 
                 while (rs.next()) {
                     System.out.print(" "+rs.getInt(1));
                     System.out.print(" "+ rs.getString(2));
                     System.out.println(" "+ rs.getString(3));}*/
                conn = PoolConexionesOracle.getConexion();
                     System.out.println("Utilizamos el pool de conexion de Oracle");
                     stmt = conn.prepareStatement("SELECT * FROM employees "
                             + "WHERE employee_id in(100,101,102)");
                     rs = stmt.executeQuery();
                     while (rs.next()) {                         
                         System.out.print(" "+rs.getInt(1));
                         System.out.print(" "+rs.getString(2));
                         System.out.println(" "+rs.getString(3));
                     }
                     conn.close(); 
                    
                
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
