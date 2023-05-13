package mainCollections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.TreeSet;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		TreeSet<String> paises = new TreeSet<String>();
		String continuar;
		do {
			System.out.println("Ingrese un pais: ");
			paises.add(scan.nextLine());
			System.out.println("Desea agregar mas paises? <si/no>: ");
			continuar = scan.nextLine();
		} while (continuar.equals("si"));
		
		for(String pais: paises) {
			System.out.println(pais);
		}
		ArrayList<String> paisesList = new ArrayList<String>(paises);
		System.out.println("Ingrese el pais que desea borrar");
		String paisBorrar = scan.next();
		int cont = 0;
		for(String pais: paisesList) {
			if(pais.equals(paisBorrar)) {
				paises.remove(pais);
			}else {
				cont++;
			}
		}
		if(cont == paisesList.size()) {
			System.out.println("El pais no se encontro");
		}
		for(String pais: paises) {
			System.out.println(pais);
		}
		
	}
	
	

}
