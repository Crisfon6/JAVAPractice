package domain;

public class Division {
	
	private int numerador;
	
	private int denominador;
	public Division(int numerador, int denominador) throws OperationException{
		if (denominador==0) {
			//trow  nwe illeagalArgumentException("denomiador igual 0")
			throw new OperationException("Denominador igual cero");
		}
		
		this.numerador = numerador;
		this.denominador= denominador;
	}
	public void visualizaOperacion() {
		System.out.println(numerador/denominador);
	}

}
