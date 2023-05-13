package mainCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1Extra {

	public static void main(String[] args) {
		
//		Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
//		y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
//		introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
//		programa mostrará por pantalla el número de valores que se han leído, su suma y su
//		media (promedio).
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int numero;
		do {
			System.out.println("Ingrese un numero: ");
			numero = scan.nextInt();
			if(numero != 99) {				
				numeros.add(numero);
			}
		} while (numero!= 99);
		
		for(Integer num: numeros) {
			System.out.print(num + " ");
		}
		
		
		
	}
	
}
