package manejoexception1;
import  domain.*;
public class ManejoException1 {
public static void main(String[] args) {
	try {
		Division division = new Division (10,0);
		division.visualizaOperacion();
	}catch (OperationException e) {
		// TODO: handle exception
		System.out.println("Ocurrio un error");
		e.printStackTrace();
	}
}
}
