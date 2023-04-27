package mainCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;

public class Ejercicio1 {

	public static void main(String[] args) {

//		Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//		programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//		después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//		salir, se mostrará todos los perros guardados en el ArrayList.
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		ArrayList<String> razas = new ArrayList<String>();
		
		
		String op;
		String nombre;
		String nombre2;
		do {
			System.out.println("Desea ingresar un raza: <si/no> ");
			op = scan.next();
			if (op.equals("si")) {
				System.out.println("Ingrese el nombre de la raza: ");
				nombre = scan.next();
				razas.add(nombre);
			}else {
				for(int i = 0 ; i < razas.size() ; i++) {
					System.out.println(razas.get(i));
				}
				
			}
		} while (op.equals("si"));
		
		
		
		System.out.println("Ingrese de nuevo el nombre de la raza: ");
		nombre2 = scan.next();
		Iterator<String> it = razas.iterator();
		int con = 0;
		while(it.hasNext()) {

			String var = it.next();
			if(var.equals(nombre2)) {
				it.remove();
				con++;
			}
			if(con == 0) {
				System.out.println("La raza no existe");
				break;
			}
		}
		System.out.println("");
		System.out.println("Lista actualizada");
		System.out.println("");
		Collections.sort(razas);
		for(int i = 0 ; i < razas.size() ; i++) {
			System.out.println(razas.get(i));
		}
		
		
		// Continuacion del 1
//		Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//		un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//		está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//		ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//		la lista ordenada.
		
	}

}
