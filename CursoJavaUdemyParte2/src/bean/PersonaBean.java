package bean;

import java.io.Serializable;
//1. implementar java.io.Serializable

public class PersonaBean implements Serializable {
//2. cada propiedad es tipo privado
	private String nombre;
	private int edad;
//3. Siempre tener un constructor vacio
	public PersonaBean() {
		
	}
	//Constructor del javaBean no requerido
	public PersonaBean(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	//4. get y set para cada uno de los que queramos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
