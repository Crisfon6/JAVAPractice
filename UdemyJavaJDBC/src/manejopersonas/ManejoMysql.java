package manejopersonas;

import java.util.List;

import datos.UsuariosJDBC;
import datos.PersonasJDBC;
import domain.*;

public class ManejoMysql {
	public static void main(String[] args) {
		List<Usuario> usuarios;
		PersonasJDBC personaJDBC = new PersonasJDBC();
		UsuariosJDBC usuarioJDBC = new UsuariosJDBC();
		// prueba del metodo insert
		// personaJDBC.insert("Jhonatan", "Fecaca");
		// prueba del metodo update
//		 personaJDBC.update(1, "Nombre3", "Apellido3");
		// prueba metodo delete
		// personaJDBC.delete(1);
		// //prueba metodo select
//		 List<Persona>persona = personaJDBC.select();
//		 for (Persona persona2 : persona) {
//		 System.out.println(persona2);
//		 }
		// usuarioJDBC.createTable();
		// usuarioJDBC.insert("Mateo", "Andres");

//		usuarios = usuarioJDBC.select();
//		for (Usuario usuario : usuarios) {
//			System.out.println(usuario);
//		}
//		usuarioJDBC.delete(3);
//		usuarios = usuarioJDBC.select();
//		for (Usuario usuario : usuarios) {
//			System.out.println(usuario);
//		}
		usuarioJDBC.update(2, "Holad","Mundo");
		usuarios = usuarioJDBC.select();
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}

	}

}
