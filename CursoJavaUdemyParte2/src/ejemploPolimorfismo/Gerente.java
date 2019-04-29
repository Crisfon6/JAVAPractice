package ejemploPolimorfismo;

public class Gerente extends Empleado{
	private String departamento;

	protected Gerente(String nombre, double sueldo,String departamento) {
		super(nombre, sueldo);
		// TODO Auto-generated constructor stub
		this.departamento = departamento;
		
	}
	public String obtenerDetalles() {
		return super.obtenerDetalles()+" ,Departamento "+departamento ; 
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
