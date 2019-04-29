package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import domain.Usuario;

public class UsuariosJDBC {
	Scanner scanner = new Scanner(System.in);
	private final String SQL_CREATE_TABLE = "CREATE TABLE `sga`.`usuario` (\r\n"
			+ "  `id_usuario` INT NOT NULL AUTO_INCREMENT,\r\n" + "  `usuario` VARCHAR(45) NULL,\r\n"
			+ "  `contrasena` VARCHAR(45) NULL,\r\n" + "  PRIMARY KEY (`id_usuario`));";
	
	 
	private final String SQL_INSERT = "INSERT INTO usuario(usuario,contrasena) VALUES(?,?)";
	private final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario= ?";
	private final String SQL_SELECT = "SELECT id_usuario,usuario, contrasena FROM usuario ORDER BY id_usuario";
	
	private final String SQL_UPDATE = "UPDATE  usuario  SET usuario =?, contrasena =? WHERE  id_usuario=?";
	private Usuario usuario;

	public int createTable() {
		Connection conn = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_CREATE_TABLE);
			rows = stmt.executeUpdate();

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rows;
	}

	public int insert(String usuario, String contrasena) {
		Connection conn = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);
			int index = 1;
			stmt.setString(index++, usuario);
			stmt.setString(index++, contrasena);
			stmt.executeUpdate();

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(stmt);
		}
		return rows;

	}

	public void delete(int id_usuario) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_DELETE);
			stmt.setInt(1, id_usuario);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(stmt);
		}
	}

	public List<Usuario> select() {
		Connection conn = null;
		PreparedStatement stmt = null;
		List<Usuario> usuarios = new ArrayList<Usuario>();
		ResultSet rs = null;
		try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_SELECT);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int id_usuario = rs.getInt(1);
				String usuarionombre = rs.getString(2);
				String contrasena = rs.getString(3);
				usuario = new Usuario();
				usuario.setId_usuario(id_usuario);
				usuario.setUsuario(usuarionombre);
				usuario.setContrasena(contrasena);
				usuarios.add(usuario);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(stmt);
			Conexion.close(rs);
		}
		return usuarios;

	}

	public void update(int id_usuario, String usuario, String contrasena) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = Conexion.getConnection();
			
			stmt = conn.prepareStatement(SQL_UPDATE);
			int index = 1;
			stmt.setString(index++, usuario);
			stmt.setString(index++, contrasena);
			stmt.setInt(index, id_usuario);
			stmt.executeUpdate();

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			Conexion.close(conn);
			Conexion.close(stmt);
		}
	}

}
