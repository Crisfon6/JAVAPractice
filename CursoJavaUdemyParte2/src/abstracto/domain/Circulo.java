package abstracto.domain;

public class Circulo extends FiguraGeometrica{
	public Circulo(String tipoFigura) {
		super(tipoFigura);
	}
	public void dibujar() {
	 
		System.out.println("Aqui se debe dibujar"+getClass().getSimpleName());
	}

}
