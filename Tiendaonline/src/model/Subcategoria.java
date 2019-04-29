package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the subcategoria database table.
 * 
 */
@Entity
@NamedQuery(name="Subcategoria.findAll", query="SELECT s FROM Subcategoria s")
public class Subcategoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idsubcategoria;

	//bi-directional many-to-one association to Categoria
	@ManyToOne
	@JoinColumn(name="idcategoria")
	private Categoria categoria;

	public Subcategoria() {
	}

	public String getIdsubcategoria() {
		return this.idsubcategoria;
	}

	public void setIdsubcategoria(String idsubcategoria) {
		this.idsubcategoria = idsubcategoria;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}