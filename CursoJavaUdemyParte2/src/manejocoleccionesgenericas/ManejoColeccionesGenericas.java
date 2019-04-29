package manejocoleccionesgenericas;
import java.util.*;

public class ManejoColeccionesGenericas {
	public static void main(String[] args) {
		List<String> miLista = new ArrayList<>();
		miLista.add("Hola");
		miLista.add("CReaciones");
		imprimir(miLista);
		
		Set<String> miSet =  new HashSet<>();
		miSet.add("POPO");
		miSet.add("JAJA");
		miSet.add("POPO");
		imprimir(miSet);
		
		Map<String, String> miMap = new HashMap<>();
		miMap.put("Cristhian", "Dios");
		miMap.put("Ya tu ","Sabe");
		imprimir(miMap.keySet());
		imprimir(miMap.values());
	}
	private static void imprimir(Collection<String> c) {
		for (String cs : c) {
			System.out.print(cs+" ");
		}
		System.out.println();
	}
}
