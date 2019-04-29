package datos;
import excepciones.*;
public class ImplementacionMySql1 implements AccesoDatos1{
	private boolean simularError;

	@Override
	public void insertar() throws AccesoDatosEx {
		// TODO Auto-generated method stub
		if (simularError) {
		throw new EscrituraDatosEx("Error en la escritura" );
		}else {
			System.out.println("Insertar desde MySql");
		}
			
	}

	@Override
	public void listar() throws AccesoDatosEx {
		// TODO Auto-generated method stub
		if (simularError) {
			throw new LecturaDatosEx("Error de lectura de datos");
		}else {
			System.out.println("Listar desde MySql");
		}
		
	}
	 public boolean isSimularError() {
		return simularError;
	}
	@Override
	public void simularError(boolean simularError) {
		// TODO Auto-generated method stub
		this.simularError = simularError;
	}
	
	
}
