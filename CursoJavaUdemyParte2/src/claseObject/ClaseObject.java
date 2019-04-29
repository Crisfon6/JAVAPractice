package claseObject;

public class ClaseObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado emp1 = new Empleado("Juan", (double) 10000);
		Empleado emp2 = new Empleado("Juan", (double) 10000);
		compararObjetos(emp1,emp2);
	}
	private static void compararObjetos(Empleado emp1, Empleado emp2) {
		System.out.println("Contenido Objeto : "+emp1);
		System.out.println("Contenido Objeto:"+emp2);
		//Revision por referencia 
		if ( emp1== emp2) {
			System.out.println("Misma direcion en memoria");
		}else {
			System.out.println("Tienen diferente direccion de memoria");
		}
		//con el metodo equals
		if (emp1.equals(emp2)) {
			System.out.println("Tiene el mismo contenido, son iguales");
		}else {
			System.out.println("no son iguales");
		}
		//Con el metodo hashcode
		if (emp1.hashCode() == emp2.hashCode()) {
			System.out.println("tienen el mismo codigo hash");
		}else {
			System.out.println("no tienen el mismo codigo hash");
	}
		
	}
	

}
