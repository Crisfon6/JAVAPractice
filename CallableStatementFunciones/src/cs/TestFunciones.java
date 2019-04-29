/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs;
import datos.Conexion;
import java.sql.*;

/**
 *
 * @author CristhianJavierDelga
 */
public class TestFunciones {
    public static void main(String Args[]){
        int empleadoId =111;
        try {
            Connection con = Conexion.getConnection();
            CallableStatement cstmt  =null;
            Double salarioMensual;
            cstmt = con.prepareCall("{ ? = call get_employee_salary(?)}");
            //una funcion regresa un valor
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.setInt(2, empleadoId);
            cstmt.execute();
            salarioMensual = cstmt.getDouble(1);
            cstmt.close();
            System.out.println("Empleado con id: "+ empleadoId);
            System.out.println("Salario $"+salarioMensual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
            
}
