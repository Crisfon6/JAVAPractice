package com.gm.mundopc;

public class DispostivoEntrada {
	
	private  String tipoEntrada;	
	private  String marca;
	
	public	DispostivoEntrada(String tipoEntrada, String marca){
		this.marca = marca;
		this.tipoEntrada = tipoEntrada;
	}
	
	@Override
	public String toString() {
		return "DispostivoEntrada [marca=" + marca + ", tipo de entrada=" + tipoEntrada + "]";
	}

	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	

}
