package principal;

public class Metodos {
	public double ErrorEsperado(double cifra) {
		return (0.5* Math.pow(10, -cifra)*100);
	}
	public double ErrorAproximado(double valorAnterior, double valorActual) {
		return Math.abs(((valorActual-valorAnterior)/valorActual)*100);
	}
	public double Fx(double x) {
		return (Math.pow(x, 2))-(Math.pow(Math.E, -2*x))-3;
	}
	public void Secante(double cifra) {
		double errorEsperado= ErrorEsperado(cifra);
		double errorAproximado=9999;
		double x0 = 1;
		double x1 = 2;
		double aux=0;
		int contador=1;
		
		do {
			System.out.println("*****************************************");
			aux = (x1)-(((Fx(x1))*(x0-x1))/(Fx(x0)-(Fx(x1))));
			x0 = x1;
			x1 = aux;
			errorAproximado =ErrorAproximado (x0,x1);
			System.out.println("Iteraccion : "+contador);
			System.out.println("X0 : "+x0+"			Fx0 : "+Fx(x0));
			System.out.println("X1 : "+x1+"			Fx1 : "+Fx(x1));
			System.out.println("Error Aproximado "+errorAproximado);
			System.out.println("Error Esperado"+ errorEsperado);
			
			contador++;
		} while (errorEsperado<=errorAproximado);
	}
}
