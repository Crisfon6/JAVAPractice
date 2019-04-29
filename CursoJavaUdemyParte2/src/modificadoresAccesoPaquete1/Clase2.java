package modificadoresAccesoPaquete1;

public class Clase2 {
	public Clase2() {
	//Prueba de constructores
	
	//constructor publico
	new Clase1(1);
	//Constructor protegido
	new Clase1(1,2);
	//Constructor default
	new Clase1(1,2,3);
	//Contructor private
	//new Clase1(1,2,3,4);
	System.out.println("Constructor private: Acceso negado");
	}
	public void pruebasDesdeClase2() {
		//Acceso a los atributos
		Clase1 c1 = new Clase1();
		System.out.println("Atributo publico"+c1.atrPublic);
		System.out.println("Atributo protegido "+c1.atrProtected);
		System.out.println("Atributo default"+c1.atrDefault);
		System.out.println("Atributo private no accesible");
		System.out.println();
		System.out.println("MEtodo publico"+c1.metodoPublico());
		System.out.println("Metodo protegido "+c1.metodoProtegido());
		System.out.println("Metodo default"+c1.metodoPaquete());
		System.out.println("Metodo private no accesible");
	}
}
