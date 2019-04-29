package datos;

//import java.beans.ConstructorProperties;
import java.sql.*;
import java.util.*;

//import com.mysql.cj.xdevapi.Result;

import domain.Persona;

public class PersonasJDBC {
	// COMO LA LLAVE PRIMARIA ES AUTOINCREMENTABLE NOS AHORRAMOS ESTO
	// SE UTILIZA PREPARESTATEMENT POR LO QUE PODEMOS UTILIZAR
	// PARAMETRO (SIGNOS DE ?)
	// LOS CUALES SERAN REMPLAZADOS POR EL PARAMETRO RESPECTIVO
	private java.sql.Connection userConn;

	private final String SQL_INSERT = "INSERT INTO persona(nombre, apellido) VALUES(?,?)";

	private final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=? WHERE id_persona=?";

	private final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";

	private final String SQL_SELECT = "SELECT id_persona, nombre, apellido FROM persona ORDER BY id_persona";

	public PersonasJDBC() {

	}

	public PersonasJDBC(Connection conn) {
		this.userConn = conn;
	}

	public int insert(String nombre, String apellido) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;

		int rows = 0; // registros afectados
		try {
			conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);
			int index = 1;// contadorcolumnas
			stmt.setString(index++, nombre);
			stmt.setString(index++, apellido);
			System.out.println("Ejuctando querry " + SQL_INSERT);
			rows = stmt.executeUpdate();// no. registros afectadoss
			System.out.println("REgistros afectados " + rows);

		} finally {
			Conexion.close(stmt);
			if (this.userConn == null) {
				Conexion.close(conn);
			}
		}
		return rows;
	}

	public int update(int id_persona, String nombre, String apellido) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
			System.out.println("Ejecutando querry " + SQL_UPDATE);
			stmt = conn.prepareStatement(SQL_UPDATE);
			int index = 1;
			stmt.setString(index++, nombre);
			stmt.setString(index++, apellido);
			stmt.setInt(index, id_persona);
			rows = stmt.executeUpdate();
			System.out.println("Registros actualizados " + rows);
		}

		finally {
			// TODO: handle finally clause
			Conexion.close(stmt);
			if (this.userConn == null) {
				Conexion.close(conn);
			}
		}
		return rows;
	}

	public int delete(int id_persona) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
			System.out.println("Ejecutando querry: " + SQL_DELETE);
			stmt = conn.prepareStatement(SQL_DELETE);
			stmt.setInt(1, id_persona);
			rows = stmt.executeUpdate();
			System.out.println("Registros eliminados " + rows);
		} finally {
			// TODO: handle finally clause
			Conexion.close(stmt);
			if (this.userConn == null) {
				Conexion.close(conn);
			}
		}
		return rows;
	}

	  public List<Persona> select() throws SQLException {
	        Connection conn = null;
	        PreparedStatement stmt = null;
	        ResultSet rs = null;
	        Persona persona = null;
	        List<Persona> personas = new ArrayList<>();
	        try {
	            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
	            stmt = conn.prepareStatement(SQL_SELECT);
	            rs = stmt.executeQuery();
	            while (rs.next()) {
	                int id_persona = rs.getInt(1);
	                String nombre = rs.getString(2);
	                String apellido = rs.getString(3);
	                /*System.out.print(" " + id_persona);
	                 System.out.print(" " + nombre);
	                 System.out.print(" " + apellido);
	                 System.out.println();
	                 */
	                persona = new Persona();
	                persona.setId_persona(id_persona);
	                persona.setNombre(nombre);
	                persona.setApellido(apellido);
	                personas.add(persona);
	            }
	        } finally {
	            Conexion.close(rs);
	            Conexion.close(stmt);
	            if (this.userConn == null) {
	                Conexion.close(conn);
	            }
	        }
	        return personas;
	    }
}
