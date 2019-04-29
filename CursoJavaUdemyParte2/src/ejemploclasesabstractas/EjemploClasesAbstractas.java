package ejemploclasesabstractas;

import abstracto.domain.*;

public class EjemploClasesAbstractas {

	public static void main(String[] args) {
		FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
		FiguraGeometrica triangulo = new Triangulo("ttTriangulo");
		FiguraGeometrica circulo = new Circulo("Circulo");
		rectangulo.dibujar();
		triangulo.dibujar();
		circulo.dibujar();
		
		System.out.println(triangulo.toString());


	}

}
