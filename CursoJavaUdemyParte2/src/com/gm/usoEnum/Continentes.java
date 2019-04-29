package com.gm.usoEnum;

public enum Continentes {
	AFRICA(55),
	AMERICA(23),
	ASIA(57);
	
	private final int paises;
	
	Continentes(int paises){
		this.paises = paises;
	}

	public int getPaises() {
		return paises;
	}
	
	
}
