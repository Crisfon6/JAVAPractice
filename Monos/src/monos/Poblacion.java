package monos;

import java.util.ArrayList;

public class Poblacion {

	ArrayList<Mono> Monos = new ArrayList<Mono>();
	int numPoblacion =1;
	
	public void GenerarPoblacion(String frase) {
		
		int numPoblacion=1;
			for (int i = 0; i < 1000; i++) {
				 Monos.add(new Mono(frase));
			}
		
		
			
			
		
		
	}
	
	

	public void ImprimePoblacion() {
		System.out.println("Poblacion "+numPoblacion);
		
		int i =1;
		for (Mono mono : Monos) {
			
			System.out.println("Mono: "+ i+"  Palabra: "+mono.palabra+" Fitness: "+mono.Fitness);
			++i;
		}
		numPoblacion++;
	}
	
	
}

