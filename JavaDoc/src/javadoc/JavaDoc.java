package javadoc;

import com.gm.javadoc.Arimetica;

/**
 * Clase para probar javaDoc
 * @author Cristhian
 *@version 1.0
 */
public class JavaDoc {

	/**
	 * Metodo que ejecuta la prueba en la clase  Arimetica
	 * @param args argumentos de la linea de comandos
	 */
	public static void main(String args[]) {
		int resultado = new Arimetica(3,2).suma();
		System.out.println(resultado);
	}
}
