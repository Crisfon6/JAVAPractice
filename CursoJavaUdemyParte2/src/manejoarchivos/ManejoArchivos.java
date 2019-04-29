package manejoarchivos;

import static utileria.Archivos.*;

public class ManejoArchivos {
	//NOTA: ya debe estar creado la carpeta en la que se quiere trabajar
	//o otorgar los permisos sin son necesario
	public static final String NOMBRE_ARCHIVO= "D:\\java\\pruebaJava\\pruebaJava.txt";
	public static void main(String[] args) {
		//Crear Archivo
		crearArchivo(NOMBRE_ARCHIVO);
		//Escribir ARchivo
		escribirArchivo(NOMBRE_ARCHIVO);
		//leer infor
		leerArchivo(NOMBRE_ARCHIVO);
		//anexar
		anexarArchivo(NOMBRE_ARCHIVO);
		leerArchivo(NOMBRE_ARCHIVO);
	}

}
