package manejoexcepciones2;

import datos.*;
import excepciones.AccesoDatosEx;
import excepciones.LecturaDatosEx;
import manejoexcepciones2.*;

public class ManejoExcepciones2 {
	public static void main(String[] args) {
		AccesoDatos1 datos = new ImplementacionMySql1();
		// Cambiamos el valor de simulador
		datos.simularError(true);
		ejecutar(datos, "listar");
		//datos.simularError(false);
		ejecutar(datos, "insertar");
	}

	public static void ejecutar(AccesoDatos1 datos, String accion) {
		if (accion.equals("listar")) {
			try {
				datos.listar();
				// Si se van a procesar varias exections primero se escoje la de menor jerarquia
			} catch (LecturaDatosEx e) {
				// TODO: handle exception
				System.out.println("Procesa la excepcion mas especcifica Error de lectura de datos");
			} catch (AccesoDatosEx e) {
				// TODO: handle exception
				System.out.println("Procesa la excepcion mas generica del acceso de datos");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error general");
			} finally {
				System.out.println("Finally es opcional");
			}
		} else if ("insertar".equals(accion)) {
			try {
				datos.insertar();
			} catch (AccesoDatosEx e) {
				// TODO: handle exception
				System.out.println("Excepcion mas genericadd");
			} finally {

				System.out.println("Finally");

			}

		}
	}
}
