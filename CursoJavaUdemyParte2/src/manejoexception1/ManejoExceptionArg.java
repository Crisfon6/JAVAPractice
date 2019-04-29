package manejoexception1;

import domain.*;

public class ManejoExceptionArg {
	public static void main(String[] args) throws OperationException {
		try {
			int op1 = Integer.parseInt(args[0]);
			int op2 = Integer.parseInt(args[1]);
			Division div = new Division(op1, op2);
			div.visualizaOperacion();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ocurrio un exeption");
			System.out.println("Hubo un al acceder a un elemento fuera de rango");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Ocurrio una exception");
			System.out.println("Un numero no era entero");
			e.printStackTrace();
		} catch (OperationException e) {
			System.out.println("Ocurrio una exception");
			System.out.println("Error operacion");
			e.printStackTrace();
		} finally {
			System.out.println("Se terminaron de corregir todas las exceptions");

		}
	}
}
