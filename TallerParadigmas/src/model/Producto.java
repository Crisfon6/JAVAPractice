package model;


import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


@Entity
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codigo;

	@Temporal(TemporalType.DATE)
	@Column(name="fechaFabricacion")
	private Date fechaFabricacion;

	private String nombre;
	private BigInteger precio;
	
	private int cantidad;
	
	
	public BigInteger getPrecio() {
		return precio;
	}

	public void setPrecio(BigInteger precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto() {
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getfechaFabricacion() {
		return this.fechaFabricacion;
	}
	public void setfechaFabricacion(Date fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}