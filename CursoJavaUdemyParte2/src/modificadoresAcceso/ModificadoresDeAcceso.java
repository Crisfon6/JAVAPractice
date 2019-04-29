package modificadoresAcceso;
import modificadoresAccesoPaquete1.*;
import modificadoresAccesoPaquete2.*;

public class ModificadoresDeAcceso {
	public static void main(String[] args) {
		//pureba de accesos a  clase 1 desde otras clases
		//Acceso a clase 1 desde clase2
		System.out.println("**************Acceso desde clase 2 a clase 1 (mismo paquete)");
		new Clase2().pruebasDesdeClase2();
		
		//Acceso a clase 1 desde clase2
		//Clase 3 extiende de clase1 
		System.out.println("\n********** Acceso a clase 3 a clase 1 (Diferente paquete, pero es subclase)");
		new Clase3().pruebaDesdeClase3();
		//Acceso a lase 1 desde clase4
		//Clase 4 no es una una subclase y esta en otro paquete
		System.out.println("\n******** Acceso desde clase 4 a clase 1 (diferente paquet, No es subclase) ");
		new Clase4().pruebasDesdeClase4();
	}

}
