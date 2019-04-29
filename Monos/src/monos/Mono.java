package monos;

import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.Random;

public class Mono {
	
	public String palabra="";
	public Double Fitness;
	
	public  String PalabraU ;
	
	
	
	
	
	public Mono(String palabraUser) {
		
		palabra = GenerarPalabraMono(palabraUser);
		Fitness = EvaluarFitness(palabraUser,palabra);
		this.PalabraU = palabraUser;
		
	}
	
	

	public String GenerarPalabraMono(String p) {
		String  Palabra = "";
		
		
		for (int i = 0; i < p.length(); i++) {
		
			Random rd = new Random();
			
			int x = 97+rd.nextInt(26);
			
			char letra;
			if (x==123) {
				x=32;
				
			}
		
			letra =(char)x;
		
			Palabra+=letra;
			
			
		}
		
		return Palabra;
		
	}
	
	public Double EvaluarFitness(String pUsuario,String pMono) {
		Double porcentaje =  0.0;
		
		Double unidadPorcentaje =  (double) 100;
		unidadPorcentaje /=pUsuario.length();
		
		
		for (int i = 0; i <  pUsuario.length(); i++) {
			if (pUsuario.charAt(i)==pMono.charAt(i)) {
				
				porcentaje+=unidadPorcentaje;
			}			
		}
		
		return porcentaje;		
	}
	
	

}
