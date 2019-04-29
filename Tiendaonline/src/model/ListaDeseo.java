package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the lista_deseo database table.
 * 
 */
@Entity
@Table(name = "lista_deseo")
@NamedQuery(name = "ListaDeseo.findAll", query = "SELECT l FROM ListaDeseo l")
public class ListaDeseo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idlista;

	private int idproducto;

	private int idusuario;

	public ListaDeseo() {
	}

	public int getIdlista() {
		return idlista;
	}

	public void setIdlista(int idlista) {
		this.idlista = idlista;
	}

	public int getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public int getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

}