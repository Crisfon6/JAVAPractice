package bloquesdecodigo;

public class Persona {
	private final int idPersona;
	private static int contadorPersonas;
	
	{
		System.out.println("Bloque inizializador");
		idPersona = ++contadorPersonas;
	}
	
	static {
		contadorPersonas=10;
		System.out.println("Bloque estatico");
	}
	Persona(){
		
		System.out.println("Constructor");
	}
	public int getIdPersona() {
		
		return idPersona;
	}

}
