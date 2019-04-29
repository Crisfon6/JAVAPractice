package utileria;

import java.io.*;

public class Archivos {
	public static void crearArchivo(String nombreArchivo) {
			File archivo = new File(nombreArchivo);
			try {
				PrintWriter salida = new PrintWriter(new FileWriter(archivo));
				salida.close();
				System.out.println("El archivo se ha creado correctamente \n");
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	public static void escribirArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo));
			String contenido = "Contenido a escribir en el archivo";
			salida.println(contenido);
			salida.println();
			salida.println("Fin de escritura");
			salida.close();
			System.out.println("Se ha escrito correctamente \n");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void leerArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String lectura;
			lectura = entrada.readLine();
			while (lectura != null) {
				System.out.println("Lectura :"+lectura);
				lectura = entrada.readLine();
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void anexarArchivo(String nombreArchivo) {
		File archivo= new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
			String contenido = "Anexando inforamcion al archivo";
			salida.println(contenido);
			salida.println();
			salida.println("Fin de Anexar");
			salida.close();
			System.out.println("SE ha anexado correctamente \n");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
