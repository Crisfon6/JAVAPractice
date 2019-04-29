package com.gm.mundopc;

public class Teclado extends DispostivoEntrada{
	
	final int idTeclado;
	static int contadorTeclados;
	
	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		idTeclado= ++contadorTeclados;
	}

	@Override
	public String toString() {
		return "Teclado [idTeclado=" + idTeclado + "]"+super.toString();
	}
	

}
