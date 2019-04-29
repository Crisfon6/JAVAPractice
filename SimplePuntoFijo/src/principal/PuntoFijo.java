package principal;

public class PuntoFijo {
	Metodos metodos = new Metodos(8);
	
	public void Formula() {
		double ErrorAproximado=0;
		int iteraccion = 1;
		double Xi = 0;
		double X0=1.8;
		do {
			System.out.println("******************************************************");
			
			
			
			Xi = metodos.Evaluarg(X0);
			ErrorAproximado = metodos.ErrorAproximado(X0, Xi);
			System.out.println("iteraccion : "+iteraccion);
			System.out.println("X0 : "+X0 );
			System.out.println("Xi : "+Xi );
			System.out.println("Error Aproximado : "+ErrorAproximado);
			iteraccion++;
			X0 =Xi;
		} while (ErrorAproximado>metodos.ErrorEsperado());
				System.out.println("fx : "+metodos.Evaluarf(Xi));
	}
	

}

