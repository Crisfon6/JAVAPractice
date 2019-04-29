package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("REMITENTE");
		Scanner sc = new Scanner(System.in);
//		int gradoMayor = 2;
		Metodos CRC = new Metodos();
		System.out.println("CRC");
		System.out.println("POLINOMIO : ");
		char[] polinomio = CRC.CrearPolinomio();
		CRC.Imprimir(polinomio);
		
		System.out.println("DATA : ");
		char[] data = CRC.CrearPolinomio();
		CRC.Imprimir(data);
		char[] data0 = CRC.AgregarCeros(data, polinomio);
		CRC.Imprimir(data0);
		
		System.out.println();
		char[] crcFinal = CRC.Xor(data0, polinomio);
		char[] dataEnviar = CRC.pegar(data0, crcFinal);
		System.out.println("DATA PARA ENVIAR ES: ");
		CRC.Imprimir(dataEnviar);
		
//		System.out.println("RECEPTOR");
//		CRC.Xor(dataEnviar, polinomio);
//		System.out.println("NO PRESENTA ERRORES");
	}
}
