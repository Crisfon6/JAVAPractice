package manejogenericos;
//Definimos nuestra clase con el modificador <> diamante
public class ClaseGenerica<T> {
//Definimos una variable de tipo generico
	T object;
	//constructor
	public ClaseGenerica(T object) {
		this.object =  object;
	}
	
	public void obtenerTipo() {
		System.out.println("El objeto es de tipo"+object.getClass().getName());
	}
}
