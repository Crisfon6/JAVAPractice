package modificadoresAccesoPaquete2;
import modificadoresAccesoPaquete1.Clase1;

public class Clase3 extends Clase1{
	public Clase3() {
		//Constructor protegido puede acceder por ser subclase
		super(1,2);
		
		//Acesso default restringido al estar por fuera del paquet
		//Acceso privado restringido
		//Acceso public puede utilizar
	}
	public void pruebaDesdeClase3() {
		Clase1 c1 =  new Clase1();
		System.out.println("");
		System.out.println("atributo publico "+c1.atrPublic+"o heredado: "+atrPublic);
		System.out.println("Atributo protegido (Heredado)"+atrProtected);
		System.out.println("No se puede acceder al default por estar en otro paquete");
		System.out.println("No se puede acceder al atributo privado");
		
		new Clase1();
		System.out.println("");
		System.out.println("atributo publico "+c1.atrPublic+"o heredado: "+atrPublic);
		System.out.println("Atributo protegido (Heredado)"+atrProtected);
		System.out.println("No se puede acceder al default por estar en otro paquete");
		System.out.println("No se puede acceder al atributo privado");
	}

}
