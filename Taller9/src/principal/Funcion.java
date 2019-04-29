package principal;

public class Funcion {
		double X =0;
	public void funcionX() {
		double valorActual = 0,valorAnterior =0;
		do {
			
			double funcion = (2*(Math.pow(X	, 3)))-(3*Math.pow(X, 2))-(2*X)+2;
			
		} while (ErrorAproximado(valorActual,valorAnterior)<=ErrorEstablecido(8));
		
	}
	public double ErrorEstablecido(double exponente) {
		double errorEst;
		errorEst = (0.5 * (Math.pow(10, -exponente))) * 100;
		System.out.println("Error Establecido = " + errorEst);
		return errorEst;

	}
	public double ErrorAproximado(double valorActual, double valorAnterior) {
		
		
		double errorAprox;

		errorAprox = Math.abs(((valorActual - valorAnterior) / valorActual)*100);
	

		return errorAprox;

	}
	

}
	

