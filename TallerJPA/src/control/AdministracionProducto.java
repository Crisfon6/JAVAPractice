package control;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Producto;

public class AdministracionProducto {

	private static final String PERSISTENCE_UNIT_NAME = "TallerJPA";
	private static EntityManagerFactory factory;

	private Producto producto;
	private List<Producto> productos;

	//constructor
	public AdministracionProducto() {
		iniciarAdministrarProducto();
	}

	//metodos
	public void iniciarAdministrarProducto() {
		producto = new Producto();
		productos = new ArrayList<Producto>();
		consultarProducto();

	}

	public void consultarProducto() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();

		Query query = em.createQuery("SELECT p FROM Producto p");
		this.productos = query.getResultList();

	}

	public String crearProducto() {

		System.out.println("Inicio prueba");
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(this.producto);
		em.getTransaction().commit();
		em.close();
		this.producto = new Producto();

		return "nueva-pagina";
	}

	public void crearProductoSinRetorno() {
		System.out.println("Inicio prueba modificar");

		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		em.persist(this.producto);
		em.getTransaction().commit();
		em.close();
		iniciarAdministrarProducto();
	}

	// getters y setters
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}
