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
public class TestProcedimientos {
    public static void main(String Args[]){
        int empleadoId =100;
        
        double incrementoSalario = 1.1;
        Connection con ;
        /*{
            con = Conexion.getConnection();
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
        }*/
        try {
            con = Conexion.getConnection();
            Statement stmt =null;
            ResultSet rs = null;
            CallableStatement cstmt =null;
                      
            stmt = con.createStatement();
            //llamamos al sP store procedure
            
            System.out.println("Aumento del 10 al empleado"+ empleadoId);
            cstmt = con.prepareCall("{call set_employee_salary(?,?)}");
            cstmt.setInt(1, empleadoId);
            cstmt.setDouble(2, incrementoSalario);
            cstmt.execute();
            cstmt.close();
            String query = "SELECT first_name, salary FROM employees "
+ " WHERE employee_id = " + empleadoId;
            
            rs = stmt.executeQuery(query);
            rs.next();
            System.out.println("Nombre"+rs.getString(1));
            System.out.println("Salari nuevo:"+rs.getFloat(2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
