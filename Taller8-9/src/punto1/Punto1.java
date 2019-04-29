package punto1;

public class Punto1 {

	static char[] recorridoA = {'b','b'};
	static char[] recorridoB = {'a','d','c','b','e'};
	static char[] recorridoC = {'d','c','b','e','d'};
	
	public final static int RECORRIDO_SIMPLE = 0;
	public final static int CICLO = 1;
	public final static int CICLO_SIMPLE=2;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (DefinirRecorrido(recorridoA)==0) {
			System.out.println("Recorrido a  es un recorrido Simple");
		}
		if (DefinirRecorrido(recorridoA)==1) {
			System.out.println("Recorrido a es un ciclo");
		}
		if (DefinirRecorrido(recorridoA)==2) {
			System.out.println("Recorrido es un ciclo simple");
		}
		

	}
	
	
	public static int DefinirRecorrido(char[]evaluar) {
		int recorrido = 0 ;
		if (evaluar.length>0) {
			//Evaluar si es trayectoria simple
			int banderaSimple =0;
			for (int i = 0; i < evaluar.length; i++) {				
				for (int j = 1; j < evaluar.length; j++) {
					if (evaluar[i] == evaluar[j]) {
						banderaSimple +=1;
						}
				}
			}
			if (banderaSimple ==0) {
				recorrido = RECORRIDO_SIMPLE;
			}
			if (banderaSimple==1) {
				recorrido = CICLO_SIMPLE;
			}
			if (banderaSimple>1) {
				recorrido = CICLO; 
			}
			
		}
		
		
		
		
		
		return recorrido;
	}

}
