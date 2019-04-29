package abstracto.domain;

public class Rectangulo extends FiguraGeometrica{
	public Rectangulo(String tipoFigura) {
		super(tipoFigura);
	}
		public void dibujar() {

		System.out.println("Aqui se debe dibujar "+this.getClass().getSimpleName());
	}

}
