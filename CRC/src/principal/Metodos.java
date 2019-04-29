package principal;

import java.util.Iterator;
import java.util.Scanner;

public class Metodos {
	Scanner sc = new Scanner(System.in);

	public void Imprimir(char[] imprimir) {
		for (char byte1 : imprimir) {
			System.out.print(byte1);
		}
		System.out.println();
	}

	public char[] CrearPolinomio() {
		String poli = sc.next();		
		char[] polinomio = poli.toCharArray();	

		return polinomio;
	}

	public char[] AgregarCeros(char[] data, char[] polinomio) {
		char[] data0 = new char[data.length + (polinomio.length - 1)];
		for (int i = 0; i < data.length; i++) {
			data0[i] = data[i];
		}
		for (int i = data.length; i < data0.length; i++) {
			data0[i] = '0';			
		}				
		return data0;	
	}
	public char[] Duplicar(char [] array) {
		char[] duplicado = new char[array.length];
		for (int i = 0; i < array.length; i++) {
			duplicado[i] = array[i];
		}
		return duplicado;
	}
	

	public char[] Xor(char[] data, char[] polinomio) {
		char[] residuo = new char[polinomio.length - 1];
		char[] dataModificada = Duplicar(data);
		int bandera = 0;

		do {

			System.out.println("*********************************************************");
			bandera = ContarCeros(dataModificada);
			for (int i = bandera; i < bandera + polinomio.length; i++) {
				if (dataModificada[i] == polinomio[i - bandera]) {
					dataModificada[i] = '0';
				} else {
					dataModificada[i] = '1';
				}
			}
			bandera = ContarCeros(dataModificada);
			Imprimir(dataModificada);
			System.out.println();

		} while (residuo.length < (dataModificada.length - bandera));
			residuo = EstablecerCRC(dataModificada,polinomio);
			return residuo;
	}
	public char[] EstablecerCRC(char[] data, char[]polinomio) {
		char [] CRC = new char[polinomio.length-1];
		for (int i = 0; i < CRC.length; i++) {
			CRC[i]= data[data.length+i-polinomio.length+1];
		}
		System.out.println("CRC : ");
		Imprimir(CRC );
		System.out.println();
		return CRC;
	}

	public int ContarCeros(char[] data) {
		int contador = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == '1') {
				contador = i;
				break;
			}
		}
		return contador;
	}
	public char[] pegar(char[]data , char[]crc) {
		char[] datafinal = new char[data.length];
		for (int i = 0; i < data.length-crc.length; i++) {
			datafinal[i] =data[i];
		}for (int j = 0; j < crc.length; j++) {
			datafinal[data.length-crc.length+j]= crc[j];
		}
		
		return datafinal;
	}
}
