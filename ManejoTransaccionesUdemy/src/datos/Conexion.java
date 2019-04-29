package datos;

import java.sql.*;



public class Conexion {
	
	private static String JDBC_DRIVER ="com.mysql.cj.jdbc.Driver";
	
	//private static String JDBC_URL = "jdbc:mysql//localhost:3306/sga?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimecode=false&serverTimezone=UTC";
	
	private static String JDBC_URL = "jdbc:mysql://localhost/sga?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	private static String JDBC_USER = "root";
	
	private static String JDBC_PASS = "root";
	
	private static Driver driver = null;
	
	public static synchronized Connection getConnection() 		throws SQLException{
			if (driver==null) {
				try {
					Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
					driver = (Driver) jdbcDriverClass.newInstance();
					DriverManager.registerDriver(driver);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("FALLO AL CARGAR EL DRIVER JDBC");
					e.printStackTrace();
				}
			}
			return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
		}
	public static void close(ResultSet rs) {
		try {
			if (rs !=null) {
				rs.close();
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("ERROR CERRANDO");
			e.printStackTrace();
		}
	}
	public static void close(PreparedStatement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("ERRROR CERRANDO");
			e.printStackTrace();
		}
	}
	public static void close(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
}
