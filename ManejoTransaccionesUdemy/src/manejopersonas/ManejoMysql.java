package manejopersonas;



import java.sql.*;
import datos.Conexion;
import datos.PersonasJDBC;
import domain.Persona;


public class ManejoMysql {
	public static void main(String[] args) {
		
		PersonasJDBC personaJDBC = new PersonasJDBC();

		Connection conn = null;
		try {
			conn = Conexion.getConnection();
			if (conn.getAutoCommit()) {
				conn.setAutoCommit(false);
			}
			// proporcionamos la conexion
			PersonasJDBC personas = new PersonasJDBC(conn);
			personas.update(4, "Cristhian", "Fonseca");
//			 personas.insert("Miguel2",
//	                    "Ayala12341234123412341234123412341234123412341234123412341234123412341234123412344");
			personas.insert("JUAN", "Miguel");
			conn.commit();
		} catch (SQLException e) {
			// TODO: handle exception

			// hacemos rollback
			try {
				System.out.println("Entramos al rollback");
				e.printStackTrace(System.out);
				conn.rollback();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace(System.out);
			}

		}

	}

}
