package principal;

public class Metodos {
double Cifras;
	
	public Metodos(double cifras) {
		this.Cifras = cifras;
	}
	
	
	
	 double ErrorAproximado(double valorAnterior, double valorActual) {
		double errorEsperado = (Math.abs((valorActual-valorAnterior)/valorActual))*100;
		return errorEsperado;
	}
	
	double Evaluarg(double x) {
		double fx= Math.pow((((5*(Math.pow(x,3 ))+(2*x)+7))/2),0.2);
		return fx;
	}
	double Evaluarf(double x) {
		double fx= ((2*Math.pow(x, 5))-(5*Math.pow(x, 3))-(2*x)-7);
		return fx;
	}
	double ErrorEsperado() {
		double errorEsperado = ((0.5*(Math.pow(10, -Cifras))))*100;
		return errorEsperado;
	}

}
