package personas.test;

import java.sql.SQLException;
import java.util.List;
import personas.dto.PersonaDTO;
import personas.jdbc.PersonaDao;
import personas.jdbc.PersonaDaoJDBC;

public class TestPersonas {
	public static void main(String[] args) throws SQLException {
		PersonaDao personaDao = new PersonaDaoJDBC();
		
	
		
		try {
//			PersonaDTO persona = new PersonaDTO();
//			persona.setNombre("Mario");
//			persona.setApellido("lopez");
//		personaDao.insert(persona);
//			
//			//eliminar el registro 3
//			personaDao.delete(new PersonaDTO(5));
//			
//			//actualizar
			PersonaDTO personaTmp = new PersonaDTO();
			personaTmp.setApellido("Fonseca");
			personaTmp.setNombre("Cristhian");
			personaTmp.setId_persona(2);
			personaDao.update(personaTmp);
			
			//listar
			List<PersonaDTO> personas = personaDao.select();
			for (PersonaDTO personaDTO : personas) {
				System.out.println(personaDTO);
				System.out.println();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exepcion en la capa de pruebas");
			e.printStackTrace();
		}
	}
}
