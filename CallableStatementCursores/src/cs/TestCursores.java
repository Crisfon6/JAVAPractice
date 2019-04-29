/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs;
import datos.*;
import java.sql.*;
import oracle.jdbc.*; 

/**
 *
 * @author CristhianJavierDelga
 */
public class TestCursores {
    public static void main(String Args[]){
        OracleCallableStatement oraCallStmt = null;
        OracleResultSet deptResultSet = null;
        try {
            Connection conn = Conexion.getConnection();
            oraCallStmt = (OracleCallableStatement)conn.prepareCall
            ("{? = call ref_cursor_package.get_dept_ref_cursor(?)}");
            //INDICAMOS EL TIPO DE REGRESO QUE ES UN CURSOR
            oraCallStmt.registerOutParameter(1, OracleTypes.CURSOR);//parametro 1
            oraCallStmt.setInt(2, 100);//segundo parametro dep id
            oraCallStmt.execute();
            //recupreamos el resultset
            deptResultSet = (OracleResultSet) oraCallStmt.getCursor(1);
            while (deptResultSet.next()) {
                System.out.print("ID Departamento "+deptResultSet.getInt(1));
                System.out.print(",Nombre Departamento "+deptResultSet.getString(2));
                System.out.print(",ID   Localidad "+deptResultSet.getString(3));
                System.out.println("");
            }
            oraCallStmt.close();
            conn.close();
        
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
            
}
