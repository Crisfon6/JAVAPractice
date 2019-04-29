package introduccionjdbc;

import java.sql.*;



public class IntroduccionJDBC {
	public static void main(String[] args)  {
		
	//Cadena de conexion  MySql, el parametro SSL es opcional
		//String url = "jdbc:mysql://localhost:3306/sga?useSSL=false";
		String url ="jdbc:mysql://localhost/sga?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		//Cargamos el driver de mysql
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Creamos el obejto de conexion 
			Connection conexion = (Connection) DriverManager.getConnection(url,"root","root");
			//CReamos un objeto statement, que sirve para ejecutr sentencias
			Statement instruccion =conexion.createStatement();
			//CReamos el Querry
			//String sql ="SELECT * FROM persona";
			String sql ="select id_persona, nombre, apellido from persona";
			ResultSet result = instruccion.executeQuery(sql);
			while (result.next()) {
				System.out.print("Id: "+result.getInt(1)+" Nombre : "+result.getString(2)+" Apellido"+result.getString(3));
				System.out.println();
			}
			result.close();
			instruccion.close();
			conexion.close();
		} catch (ClassNotFoundException  | SQLException e) {
			e.printStackTrace();
		}
}
}
