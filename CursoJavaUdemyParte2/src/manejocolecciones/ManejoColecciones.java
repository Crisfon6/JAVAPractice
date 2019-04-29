package manejocolecciones;
import java.util.*;

public class ManejoColecciones {
	public static void main(String[] args) {
		List miLista = new ArrayList();
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		//elemento repetido
		miLista.add(3);
		imprimir(miLista);
		
		Set miSet = new HashSet();
		miSet.add(1);
		miSet.add(2);
		miSet.add(3);
		miSet.add(1);
		imprimir(miSet);
		
		Map miMapa= new HashMap();
		//llave valor
		miMapa.put("1", "Juan");
		miMapa.put("2", "Carlos");
		miMapa.put("3", "Pico");
		miMapa.put("4", "Tomas");
		//Set con todas las llaves
		imprimir(miMapa.keySet());
		//List con todos los valores
		imprimir(miMapa.values());
		
	}
	
	private static void imprimir(Collection collection) {
		for (Object object : collection) {
			System.out.print(object+" ");
		}
		System.out.println();
	}
	
	
}
