package com.gm.usoEnum;

public class UsoEnum {
	public static void main(String[] args) {
		
		System.out.println(DiasSemana.DOMINGO);
		
		verificarDia(DiasSemana.DOMINGO);
		System.out.println("Continente "+Continentes.AFRICA+" Tiene "+Continentes.AFRICA.getPaises()+" Paises");
		System.out.println();
		indicarPaises(Continentes.ASIA);
		imprimirContinentes();
	}
	public static void 	indicarPaises(Continentes continentes) {
		switch (continentes ) {
		case ASIA:
			System.out.println("NUMERO DE PAISES "+Continentes.ASIA.getPaises());
			break;

		default:
			break;
		}
	}
	public static void imprimirContinentes() {
		for (Continentes c : Continentes.values()) {
			System.out.println("Continente "+c+" Numero de paises "+ c.getPaises());
		}
	}
	
	public static void verificarDia(DiasSemana dia) {
		switch (dia) {
		case DOMINGO:
			System.out.println("Ultimo dia de la semana");
			break;

		default:
			break;
		}
	}
}
