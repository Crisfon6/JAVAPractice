package monos;

import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		
		Poblacion poblacion = new Poblacion();
		System.out.println("Bienvenido a los monos de Cristhian");
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		poblacion.GenerarPoblacion(frase);
		poblacion.ImprimePoblacion();
		
		
		
		
	}

}
