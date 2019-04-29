package modificadoresAccesoPaquete2;

import modificadoresAccesoPaquete1.Clase1;

public class Clase4 {
	public Clase4() {
		// PAquete protected no puede usar al no ser subclase
	}

	public void pruebasDesdeClase4() {
		Clase1 c1 =  new Clase1();
		System.out.println("");
		System.out.println("atributo publico "+c1.atrPublic+"o heredado: "+c1.atrPublic);
		System.out.println("Atributo protegido Acceso denegado");
		System.out.println("No se puede acceder al default por estar en otro paquete");
		System.out.println("No se puede acceder al atributo privado");
		
		new Clase1();
		System.out.println("");
		System.out.println("atributo publico "+c1.metodoPublico());
		System.out.println("Atributo protegido denegado al metodo");
		System.out.println("No se puede acceder al default por estar en otro paquete");
		System.out.println("No se puede acceder al atributo privado");

	}
}
