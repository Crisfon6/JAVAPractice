package modificadoresAccesoPaquete1;

public class Clase1 {
	//Creamos atributos
	
	public int atrPublic  = 10;
	protected int atrProtected = 20;
	int atrDefault = 30;
	private int atrPrivate = 40;
	
	//constructor
	public Clase1() {
		
	}
	public Clase1(int i) {
		System.out.println("Constructor publico 1");
	}
	protected Clase1(int i, int o) {
		System.out.println("Constructor protected2");
	}
	Clase1(int i, int o, int j){
		System.out.println("Constructor package 3");
	}
	private Clase1(int i, int o, int j, int k) {
		System.out.println("Constructor private 4");
	}
	//Definir metodos
	public int metodoPublico() {
		return 9;
	}
	protected int metodoProtegido() {
		return 10;
	}
	
	int metodoPaquete() {
		return 11;
	}
	private int metodoPrivado() {
		return 12;
	}
	

}
