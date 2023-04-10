package eggModulo2;

import java.util.Scanner;

public class clase3 {

	public static void main(String[] args) {

		// EjercicioGuia 1
		Scanner scan = new Scanner(System.in);
//		String frase;
//		System.out.println("Ingrese una frase: ");
//		frase = scan.nextLine();
//		System.out.println(convertirFrase(frase));
		
		// EjercicioGuia 2
		
//		int num1,num2;
//		System.out.println("Ingrese numero 1: ");
//		num1 = scan.nextInt();
//		System.out.println("Ingrese numero 2:");
//		num2 = scan.nextInt();
//		
//		esMultiplo(num1,num2);
		
		// Ejercicio 1
		
//		int num1,num2;
//		int opc;
//		System.out.println("Ingrese el primer numero: ");
//		num1 = scan.nextInt();
//		System.out.println("Ingrese el segundo numero: ");
//		num2 = scan.nextInt();
//		System.out.println("Ingrese opcion: <1-4>");
//		opc = scan.nextInt();
//		switch(opc) {
//			case 1:
//				System.out.println("Suma: " + sumar(num1,num2));
//				break;
//			case 2:
//				System.out.println("Resta: " + resta(num1,num2));
//				break;
//			case 3:
//				System.out.println("Producto: " + producto(num1,num2));
//				break;
//			case 4: 
//				System.out.println("Division: " + dividir(num1,num2));
//				break;
//			default:
//				System.out.println("No existe esa opcion");
//		}
		
		// Ejercicio 2
		
//		int cantidadPersonas;
//		boolean seguir = true;
//		String opcSeguir;
//		while (seguir == true){
//			datosPersona();
//			System.out.println("Desea seguir introduciendo datos?");
//			opcSeguir = scan.next();
//			if (opcSeguir.equals("no")) {
//				seguir = false;
//				System.out.println("Adios!!!");
//			}
//		}
		
		// Ejercicio 3
		
//		int euros;
//		String mon;
//		System.out.println("Ingrese la cantidad de euros: ");
//		euros = scan.nextInt();
//		System.out.println("Ingrese que moneda quiere convertir <dolar,yenes,libras>");
//		mon = scan.next();
//		convertirMoneda(euros,mon);
		
		// Ejercicio 4
		
//		int num1;
//		System.out.println("Ingrese un numero: ");
//		num1 = scan.nextInt();
//		
//		System.out.println("El numero es primo? " + esPrimo(num1));
		
	}
	
	// Funciones EJercicio 4
	
//	static boolean esPrimo(int num) {
//		boolean primo = true;
//		for(int i = 2; i < num && primo; i++) {
//			if (num % i == 0) {
//				primo = false;
//			}
//			
//		}
//		return primo;
//	}
	
	// Funciones Ejercicio 3
	
//	static void convertirMoneda(int cant, String moneda) {
//		double resul= 0;
//		switch(moneda) {
//			case "dolar":
//				resul = cant * 0.86;
//				break;
//			case "yenes":
//				resul = cant * 1.28611;
//				break;
//			case "libras":
//				resul = cant * 129.852;
//				break;
//			default:
//				System.out.println("NO existe esa moneda o no se puede convertir");
//		}
//		
//		System.out.println(cant + " euros = " + resul + " " +  moneda);
		
				
//	}
	
	// Funciones Ejercicio 2
	
//	static void datosPersona() {
//		Scanner scan = new Scanner(System.in);
//		String nombre;
//		int edad;
//		System.out.println("Nombre de la persona: ");
//		nombre = scan.nextLine();
//		System.out.println("Ingrese edad de la persona: ");
//		edad = scan.nextInt();
//		System.out.println("Nombre: " + nombre);
//		System.out.println("Es mayor de edad? " );
//		System.out.println("");
//		if (edad >= 18) {
//			System.out.println(nombre + " es mayor de edad");
//		}else {
//			System.out.println(nombre + " es menor de edad");
//		}
//		System.out.println(" ");
//	}
//	
	// Funciones Ejercicio 1
//	static float dividir (int num1,int num2) {
//		return (float) num1 / (float) num2;
//	}
//	
//	static int producto(int num1, int num2) {
//		return num1 * num2;
//	}
//	
//	static int resta(int num1,int num2) {
//		return num1 - num2;
//	}
//	
//	static int sumar(int num1,int num2) {
//		return num1 + num2;
//	}
	// Funcion EjercicioGuia 2
//	static void esMultiplo(int num1,int num2) {
//		if (num2 % num1 == 0) {
//			System.out.println("Es multiplo");
//		}else {
//			System.out.println("No es multiplo");
//		}
//	}
	
	// Funcion EjercicioGuia  1 
//	static String convertirFrase(String frase) {
//		String conversion = "";
//		for (int i = 0; i<frase.length(); i++) {
//			switch(frase.charAt(i)) {
//				case 'a':
//					conversion += "@";
//					break;
//				case 'e':
//					conversion += "#";
//					break;
//				case 'i':
//					conversion += "$";
//					break;
//				case 'o':
//					conversion += "%";
//					break;
//				case 'u':
//					conversion += "*";
//					break;
//				default:
//					conversion += frase.charAt(i);
//			}
//		}
//		
//		
//		return conversion;
//		
//	}

	
	
}
