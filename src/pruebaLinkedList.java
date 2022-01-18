import java.util.LinkedList;
import java.util.ArrayList;


public class pruebaLinkedList {

	public static void main (String[] args) {
		
		LinkedList<String> palabras = new LinkedList<>();
		
		
		System.out.println(palabras.isEmpty());
		palabras.add("Primera palabra");
		palabras.add("Segunda palabra");
		palabras.add("Tercera palabra");
		palabras.add("Cuarta palabra");

		System.out.println(palabras.isEmpty());
		
		System.out.println(palabras);
		
		System.out.println(palabras.contains("la palabra"));
		
		
	}
	
 
	
}
