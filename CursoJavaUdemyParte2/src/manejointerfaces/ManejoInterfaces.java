package manejointerfaces;
import datos.*;

public class ManejoInterfaces  {
	public static void main(String[] args) {
		AccesoDatos datos = new ImplementacionMySql();
		ejecutar(datos,"listar");
		datos = new ImplementacionOracle();
		ejecutar(datos,"insertar");
				
	}
	public static void ejecutar(AccesoDatos datos, String accion) {
		if ("listar".equals(accion)) {
			datos.listar();
		}
		else if ("insertar".equals(accion)) {
			datos.insertar();
		}
	}
}
