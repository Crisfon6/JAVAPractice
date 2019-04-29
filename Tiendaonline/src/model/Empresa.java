package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the empresa database table.
 * 
 */
@Entity
@NamedQuery(name="Empresa.findAll", query="SELECT e FROM Empresa e")
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idempresa;

	private String correo;

	private String descripcionempresa;

	private String direccion;

	private String facebook;

	private String instagram;

	private String nombreempresa;

	private BigInteger telefonoempresa;

	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="empresa")
	private List<Producto> productos;

	public Empresa() {
	}

	public String getIdempresa() {
		return this.idempresa;
	}

	public void setIdempresa(String idempresa) {
		this.idempresa = idempresa;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDescripcionempresa() {
		return this.descripcionempresa;
	}

	public void setDescripcionempresa(String descripcionempresa) {
		this.descripcionempresa = descripcionempresa;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFacebook() {
		return this.facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getInstagram() {
		return this.instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getNombreempresa() {
		return this.nombreempresa;
	}

	public void setNombreempresa(String nombreempresa) {
		this.nombreempresa = nombreempresa;
	}

	public BigInteger getTelefonoempresa() {
		return this.telefonoempresa;
	}

	public void setTelefonoempresa(BigInteger telefonoempresa) {
		this.telefonoempresa = telefonoempresa;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto addProducto(Producto producto) {
		getProductos().add(producto);
		producto.setEmpresa(this);

		return producto;
	}

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setEmpresa(null);

		return producto;
	}

}