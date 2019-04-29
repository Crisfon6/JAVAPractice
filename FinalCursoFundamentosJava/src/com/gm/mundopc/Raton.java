package com.gm.mundopc;

public class Raton extends DispostivoEntrada {
	final int idRaton;
	static int contadorRatones;

	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		contadorRatones += 1;
		idRaton=  ++contadorRatones;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Raton [idRaton=" + idRaton + "]"+super.toString();
	}

	

	

}
