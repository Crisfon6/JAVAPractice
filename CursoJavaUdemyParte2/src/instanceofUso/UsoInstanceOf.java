package instanceofUso;

public class UsoInstanceOf {
	public static void main(String[] args) {
		FiguraGeometrica figura;
		figura = new Elipse();
		
		//Determinar solo un tipo al que pertenezca
		determinarTipo(figura);
		//Determinar todos los tipos a los que perteneze
		System.out.println();
		
		determinarTodosTipos(figura);
	}
	public static void determinarTipo(Object figura) {
		if (figura instanceof Elipse) {
			System.out.println("ES una elipse");
		}else if (figura instanceof Triangulo) {
			System.out.println("Es un triangulo");
		}else if(figura instanceof Rectangulo) {
			System.out.println("Es un rectangulo");
		}else if(figura instanceof Circulo) {
			System.out.println("ES un circulo");
		}else if (figura instanceof Object) {
			System.out.println("Es un objeto");
		}else {
			System.out.println("No se encontro tipo");
		}
	}
	public static void determinarTodosTipos(Object figura) {
		if (figura instanceof Elipse) {
			System.out.println("ES una elipse");
		}if (figura instanceof Triangulo) {
			System.out.println("Es un triangulo");
		} if(figura instanceof Rectangulo) {
			System.out.println("Es un rectangulo");
		}if(figura instanceof Circulo) {
			System.out.println("ES un circulo");
		}if (figura instanceof Object) {
			System.out.println("Es un objeto");
		}else {
			System.out.println("No se encontro tipo");
		}
	}
}
