package manejojavabeans;
import bean.PersonaBean;

public class ManejoJavaBeans {
public static void main(String[] args) {
	PersonaBean bean = new PersonaBean();
	bean.setEdad(10);
	bean.setNombre("Daniel");
	System.out.println("Nombre "+ bean.getNombre()+" EDad "+bean.getEdad());
}
	
}
