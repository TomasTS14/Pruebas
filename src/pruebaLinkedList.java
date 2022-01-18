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
		palabras.addFirst("Antes de Primera");

		System.out.println(palabras.isEmpty());
		
		System.out.println(palabras);
		System.out.println(palabras.getLast());
		System.out.println(palabras.indexOf("Tercera palabra"));
		System.out.println(palabras.poll());
		System.out.println(palabras.pop());
		System.out.println(palabras);
		System.out.println("=================================");
		System.out.println(palabras.peek());
		System.out.println(palabras.contains("la palabra"));
		System.out.println();
		
		
	}
	
 
	
}
