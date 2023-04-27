package arraylist;

import java.util.*;

public class ArrayListEjemplo {
	private ArrayList<String> palabras;
	
	public ArrayListEjemplo() {
		palabras = new ArrayList<String>();
	}
	
	public void agregarElementos() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar palabra: ");
		String palabra = scan.next();
		palabras.add(palabra);
	}
	
	public void leerElementos() {
		for (int i = 0; i < palabras.size() ; i++) {
			System.out.print(palabras.get(i) + " - ");
		}
		System.out.println("");
	}
	
	public void eliminarElemento() {
		palabras.remove(palabras.size() - 1);
	}
}
