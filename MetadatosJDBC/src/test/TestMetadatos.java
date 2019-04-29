/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.Conexion;
import java.sql.*;
import oracle.jdbc.OracleResultSetMetaData;


/**
 *
 * @author CristhianJavierDelga
 */
public class TestMetadatos {
    public static void main(String Args[]){
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM employees");
            //obetnemos un objeto de metadatos de oracle
            OracleResultSetMetaData rsOracle = (OracleResultSetMetaData) 
                    rs.getMetaData();
            if(rsOracle==null){
                System.out.println("Metadatos no disponible");
            }else{
                //preguntamos cuantas columnas tiene la tabla
                int columnCount = rsOracle.getColumnCount();
                System.out.println("Numero de columnas :"+columnCount);
                for (int i = 1; i <= columnCount; i++) {
                //desplegamos al columna
                    System.out.print("Nombre Columna "+rsOracle.getColumnName(i));
                    System.out.print(", Tipo Columna"+rsOracle.getColumnTypeName(i));
                    switch(rsOracle.isNullable(i)){
                        case OracleResultSetMetaData.columnNullable:
                            System.out.print(", Si acepta Nulos");
                            break;
                        case OracleResultSetMetaData.columnNoNulls:
                            System.out.print(", No acepta Nulos");
                            break;
                        case OracleResultSetMetaData.columnNullableUnknown:
                            System.out.print(", Valor nulo desconocido");
                    }
                    System.out.println("");
                    }
            }
                
            
            
        } catch (Exception e) {
            Conexion.close(conn);
            Conexion.close(rs);
            
        }
    }
}
    

