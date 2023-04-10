package eggModulo2;

import java.util.Scanner;

public class clase2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Ejercicio 1
//		int num;
//		System.out.println("Ingrese numero: ");
//		num = scan.nextInt();
//		if (num % 2 == 0) {
//			System.out.println("El numero es par");
//		}else {
//			System.out.println("El numero es impar");
//		}
		
		// Ejercicio 2
//		String palabra;
//		System.out.println("Ingrese una palabra");
//		palabra = scan.nextLine();
//		
//		if (palabra.equals("eureka")) {
//			System.out.println("Correcto");
//		}else {
//			System.out.println("Incorrecto");
//		}
		
		// Ejercicio 3
//		System.out.println("Ingrese palabra o frase");
//		String palabra = scan.nextLine();
//		if (palabra.length() == 8) {
//			System.out.println("Correcto");
//		}else {
//			System.out.println("Incorrecto");
//		}
		
		// Ejercicio 4
//		System.out.println("Ingrese palabra: ");
//		String palabra = scan.nextLine();
//		if(palabra.substring(0,1).toLowerCase().equals("a")){
//			System.out.println("Correcto");
//		}else {
//			System.out.println("Incorrecto");
//		}
		
		// Ejercicio 5
//		System.out.println("Ingrese numero limite");
//		int limiteMayor = scan.nextInt();
//		int suma = 0;
//		int numero;
//		while(suma < limiteMayor) {
//			System.out.println("Ingrese numero");
//			numero = scan.nextInt();
//			suma += numero;
//			System.out.println("La suma es: "+ suma);
//		}
//		System.out.println("La suma de todos los numeros ingresados es: " + suma);
//		
		// Ejercicio 6
		
//		int opc;
//		String opc2="";
//		int num1,num2;
//		do {
//			System.out.println("Menu");
//			System.out.println("1. Sumar");
//			System.out.println("2. Resta");
//			System.out.println("3. Multiplicar");
//			System.out.println("4. Dividir");
//			System.out.println("5. Salir");
//			System.out.print("Elija Opcion: ");
//			System.out.println("");
//			opc = scan.nextInt();
//				
//				switch(opc) {
//				
//				case 1:
//					System.out.println("Ingrese numero1: ");
//					num1 = scan.nextInt();
//					System.out.println("Ingrese numero2: ");
//					num2 = scan.nextInt();
//					System.out.println("Suma: " + (num1 + num2));
//					break;
//				case 2: 
//					System.out.println("Ingrese numero1: ");
//					num1 = scan.nextInt();
//					System.out.println("Ingrese numero2: ");
//					num2 = scan.nextInt();
//					System.out.println("Resta: " + (num1 - num2));
//					break;
//				case 3:
//					System.out.println("Ingrese numero1: ");
//					num1 = scan.nextInt();
//					System.out.println("Ingrese numero2: ");
//					num2 = scan.nextInt();
//					System.out.println("Multiplicacion: " + (num1 * num2));
//					break;
//				case 4: 
//					System.out.println("Ingrese numero1: ");
//					num1 = scan.nextInt();
//					System.out.println("Ingrese numero2: ");
//					num2 = scan.nextInt();
//					System.out.println("Division: " + (num1 / num2));
//					break;
//				case 5:
//					System.out.println("Esta seguro que desea salir y/n");
//					opc2 = scan.next();
//					break;
//				default:
//					System.out.println("Ingreso una opcion invalida");
//				}
//			
//			
//		} while (opc !=5 && opc2.equals("y"));
//		
//		System.out.println("Adios");
		
		// Ejercicio 7
		
//		String frase;
//		int lecturasCorrectas=0;
//		String mensEsp;
//		System.out.println("Ingrese frase: ");
//		frase = scan.nextLine();
//		frase = frase.toLowerCase();
//		if (frase.length() == 5) {
//			lecturasCorrectas++;
//		}
//		if (frase.substring(0,1).equals("x")) {
//			lecturasCorrectas++;
//		}
//		if (frase.substring(frase.length() - 1, frase.length()).equals("o")) {
//			lecturasCorrectas++;
//		}
//		if (lecturasCorrectas == 3) {
//			System.out.println("Mensaje correcto");
//			System.out.println("Ingrese secuencia especial: ");
//			mensEsp = scan.next();
//			if (mensEsp.equals("&&&&&") ) {
//				System.out.println("Mensaje enviado");
//			}else {
//				System.out.println("Secuencia especial incorrecta. ");
//			}
//					
//		}
//		System.out.println("Lecturas correctas: " + lecturasCorrectas);
//		System.out.println("Lecturas incorrectas: " + (3 - lecturasCorrectas));
//		
		// Ejercicio 8
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Ingresar tamanio de cuadrado: ");
//		int cantidad = scan.nextInt();
//		for(int i = 0; i < cantidad ; i++) {
//			for(int j = 0; j < cantidad ; j++) {
//				
//				if(i == 0 || i == (cantidad - 1)) {
//					System.out.print("*");
//				}else {
//					if (i > 0 && j == 0 || j == (cantidad - 1)) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//				
//			}
//			System.out.println("");
//		}
		scan.close();
	}
	
}
