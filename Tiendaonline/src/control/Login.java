package control;

import java.util.ArrayList;
import java.util.List;

//import javax.faces.application.FacesMessage;
//import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Usuario;

public class Login {

	private static final String PERSISTENCE_UNIT_NAME = "Tiendaonline";
	private static EntityManagerFactory factory;

	private Usuario usuario;
	private List<Usuario> usuarios;

	// constructor
	public Login() {
		iniciarLogin();
	}
	// EntityManager em = factory.createEntityManager();

	// metodos
	public void iniciarLogin() {
		usuario = new Usuario();
		usuarios = new ArrayList<Usuario>();

	}

	public void consultarUsuario() {
		EntityManager em = factory.createEntityManager();
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		Query query = (Query) em.createQuery("SELECT p FROM Usuario p");
		this.usuarios = query.getResultList();
		for (Usuario usuario : usuarios) {
			System.out.println("entro " + usuario.getNombreusuario());
		}
	}

	public String crearUsuario() {

//		System.out.println("Inicio prueba");
//		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
//		EntityManager em = factory.createEntityManager();
//		em.getTransaction().begin();
//		em.persist(this.usuario);
//		em.getTransaction().commit();
//		em.close();
//		this.usuario = new Usuario();
		return "nueva-pagina";
	}

	public void crearUsuarioSinRetorno() {
		System.out.println("Inicio prueba modificar");

		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		em.persist(this.usuario);
		em.getTransaction().commit();
		em.close();

	}

	// CODIGO PANDA
	/* METODO PRIVADO ADMI QUE NOS PERMITIRA VALIDAR LOS DATOS ADMI */
	// private Usuario validarUser(Usuario usario) {
	// /* OBJETO ADMI QUE RETORNAREMOS */
	// Usuario user = null;
	// /* VARIABLE DE CONSULTA */
	// String consulta;
	// try {
	// /* EJECUTAMOS LA CONSULTA MEDIANTE PARAMETROS */
	// consulta = "FROM Usuario u WHERE u.nombreusuario = ?1 and u.pass= ?2";
	//
	// /*
	// * EJECUTAMOS EL QUERY Y LE ASIGNAMOS LOS PARAMETROS QUE RECIBIMOS
	// */
	// Query query = this.em.createQuery(consulta);
	// query.setParameter(1, usuario.getNombreusuario());
	// query.setParameter(2, usuario.getContrasena());
	//
	// /* GUARDAMOS LOS RESULTADOS DE LA CONSULTA */
	// List<Usuario> lista = query.getResultList();
	// if (!lista.isEmpty()) {
	// user = lista.get(0);
	// }
	// } catch (Exception e) {
	// // TODO: handle exception
	// }
	// return user;
	// }
	//
	//
	//////////////////////////////////////////
	// /* METODOS PUBLICOS ADMINISTRADOR */
	// public String iniciarSesion() {
	// Usuario use;
	// String redireccion = null;
	// try {
	// use = validarUser(usuario);
	// if (use != null) {
	// redireccion = "interfazUser";
	// } else {
	// FacesContext.getCurrentInstance().addMessage(null,
	// new FacesMessage(FacesMessage.SEVERITY_WARN, "aviso", "usuario incorrecto"));
	// }
	// } catch (Exception e) {
	//
	// }
	// return redireccion;
	// }

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	// public void eliminarProducto() {
	// System.out.println("Eliminar");
	// factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	// EntityManager emEntityManager = factory.
	// }
}
