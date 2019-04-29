package com.gm.javadoc;
/**
 * Esta clase es una prueba
 * @author Cristhian
 *@version 1.0
 */

public class Arimetica {
/**
 * Primer operando
 */
	int operador1;
	/**
	 * Segundo operando
	 */
		int operador2;
		/**
		 * Constructor vacio de clase
		 */
	public Arimetica(int operador1, int operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
	}
	/**
	 *Este metodo realiza la suma de los dos operadores
	 * @return int resutlado de la suma
	 */
	public int  suma() {
		return operador1+operador2;
	}
	
}
