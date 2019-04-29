package manejogenericos;

public class ManejoGenericos {
	public static void main(String[] args) {
		//CReamos una instancia  de la clase generica
		ClaseGenerica<Float> objetoFloat = new ClaseGenerica<Float>(15F);
		objetoFloat.obtenerTipo();
		ClaseGenerica<String> objetoString = new ClaseGenerica<>("hola");
		objetoString.obtenerTipo();
		//Los gnericos no pueden ser utilizados por primitivos
	}
}
