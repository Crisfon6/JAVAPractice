package personas.jdbc;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

import personas.dto.PersonaDTO;

public class PersonaDaoJDBC implements PersonaDao {
	private Connection userConn;
	private String SQL_INSERT = "INSERT INTO persona(nombre,apellido) VALUES(?,?)";
	private String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=? WHERE id_persona=?";
	private String SQL_DELETE = "DELETE FROM persona WHERE id_persona=?";
	private String SQL_SELECT = "SELECT * FROM persona ";

	public PersonaDaoJDBC() {

	}

	public PersonaDaoJDBC(Connection conn) {
		this.userConn = conn;
	}

	@Override
	public int insert(PersonaDTO persona) throws SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;
		int rows;
		try {
			conn = (this.userConn != null) ? this.userConn : 
				Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);
			int index = 1;
			stmt.setString(index++, persona.getNombre());
			stmt.setString(index++, persona.getApellido());
			System.out.println("ejecuto la query"+ SQL_INSERT);
			rows = stmt.executeUpdate();
			System.out.println("Registros afectados "+ rows);

		} finally {
			Conexion.close(stmt);
			if (this.userConn == null) {
				Conexion.close(conn);				
			}
		}
		return rows;
	}

	@Override
	public int update(PersonaDTO persona) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		int rows =0;
		try {
			conn = (this.userConn != null) ? this.userConn : 
				Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_UPDATE);
			int index = 1;
			stmt.setString(index++, persona.getNombre());
			stmt.setString(index++, persona.getApellido());
			stmt.setInt(index, persona.getId_persona());
			rows = stmt.executeUpdate();
			System.out.println("Registros actualizados "+ rows);
		} finally {
			Conexion.close(stmt);
			// TODO: handle finally clause
			if (this.userConn==null) {
				Conexion.close(conn);
			}
		}
		return rows;
	}

	@Override
	public int delete(PersonaDTO persona) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		int rows =0;
		try {
			conn = (this.userConn != null) ? this.userConn : 
				Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_DELETE);
			stmt.setInt(1, persona.getId_persona());
			rows = stmt.executeUpdate();
			System.out.println("Registros eliminados "+ rows);
		} finally {
			Conexion.close(stmt);
			// TODO: handle finally clause
			if (this.userConn==null) {
				Conexion.close(conn);
			}
		}
		return rows;
	}

	@Override
	public List<PersonaDTO> select() throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		PersonaDTO personaDTO = null;
		List<PersonaDTO> personas = new ArrayList<PersonaDTO>();
		try {
			conn = (this.userConn != null) ? this.userConn : 
				Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_SELECT);
			rs = stmt.executeQuery();
			while(rs.next()) {
				int idPersonaTemp = rs.getInt(1);
				String nombrePersonaTemp = rs.getString(2);
				String apellidoPersonaTemp = rs.getString(3);
				personaDTO = new PersonaDTO();
				personaDTO.setId_persona(idPersonaTemp);
				personaDTO.setNombre(nombrePersonaTemp);
				personaDTO.setApellido(apellidoPersonaTemp);
				personas.add(personaDTO);
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
