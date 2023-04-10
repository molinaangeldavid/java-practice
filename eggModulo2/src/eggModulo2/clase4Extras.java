package eggModulo2;

import java.util.*;

public class clase4Extras {

	public static void main(String[] args) {

		// Ejercicio 1
		
		Scanner scan = new Scanner(System.in);
//		int num;
//		int suma=0;
//		System.out.println("Ingrese cantidad de numeros que desea ingresar: ");
//		num = scan.nextInt();
//		int vector[] = new int[num];
//		
//		for (int i = 0; i < num; i++) {
//			vector[i] = scan.nextInt();
//		}
//		
//		for (int i = 0; i < num; i++) {
//			suma += vector[i];
//		}
//		
//		System.out.println("Suma total del vector es: " + suma);
		
		// ---------------------------------------------------
		// Ejercicio 2
		
//		int num;
//		System.out.println("Ingrese cantidad de numeros que desea ingresar: ");
//		num = scan.nextInt();
//		int vector1[] = new int[num];
//		int vector2[] = new int[num];
//		int contador = 0;
//		for(int i = 0; i < num ; i++) {
//			System.out.println("Ingrese numero del primer vector");
//			vector1[i] = scan.nextInt();
//			System.out.println("Ingrese numero del segundo vector");
//			vector2[i] = scan.nextInt();
//			if (vector1[i] != vector2[i]) {
//				System.out.println("El numero no es igual al numero del primer vector");
//				i = num;
//			}
//			contador++;
//		}
//		if (contador == num) {
//			System.out.println("Los dos vectores son iguales");
//		}
//	
	// --------------------------------------------------------
	// Ejercicio 3
	
//		int vector[]=new int[5];
//		rellenar(vector);
//		imprimir(vector);
		
	// --------------------------------------------------------
		
	// Ejercicio 4
		
//		double alumnos[][] = new double[11][5];
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Ingrese Notas del alumno: " + i);
//			for(int j = 0; j < 10;j++) {
//				tipoNota(i,j,alumnos);
//				if (j != 4) {
//					alumnos[i][j] = ponderarNota(j);				
//				}else {
//					alumnos[i][j] = notaFinal(i, alumnos);
//				}
//			}
//		}
		
	// Ejercicio 5
		
//		int filas;
//		int columnas;
//		Random random = new Random();
//		System.out.println("Ingrese la cantidad de fila que quiere tener: ");
//		filas = scan.nextInt();
//		System.out.println("Ingrese la cantidad de columnas que quiere tener: ");
//		columnas = scan.nextInt();
//		int matriz[][] = new int[filas][columnas];
//		int suma = 0;
//		
//		for(int i = 0; i < filas; i++) {
//			for (int j = 0; j < columnas; j++) {
//				
//				matriz[i][j] = random.nextInt(10);
//				suma += matriz[i][j];
//			}
//		}
//		
//		System.out.println("La suma de sus elementos son: " + suma);
		
	// --------------------------------------------------------------------------
	// Ejercicio 6
		
		
//		String[][] sopaLetras = new String[20][20];
//		String[] letras = new String[5];
//		String letraIng;
//		
//		for(int i = 0; i < 5; i++) {
//			do {
//				System.out.println("Palabra "+ (i+1));
//				System.out.println("Ingrese una palabra entre 3 y 5 caracteres: ");
//				letraIng = scan.next();
//			} while (letraIng.length() < 3 || letraIng.length() > 5);
//			letras[i] = letraIng;
//			
//		}
//		llenarMatriz(letras,sopaLetras);
//		imprimirSopaLetras(sopaLetras);
		
	// Ejercicio 7
		
		
		
	}
	// -----------------------------------------------------------------------
	// Funciones ejercicio 6
//	static boolean chequearFila(int fila,int filasLlenas[]) {
//		boolean repite = false;
//		for (int i = 0 ; i < 5 && !repite; i++) {
//			if (fila == filasLlenas[i]) {
//				repite = true;
//			}
//		}
//		return repite;
//	}
//	
//	static void llenarMatriz(String[] letras, String sopaLetras[][]) {
//		Random random = new Random();
//		int[] filasLlenas = new int[5];
//		int f;
//		for (int i = 0 ; i < filasLlenas.length; i++) {
//			do {
//				f = random.nextInt(20);
//			} while (chequearFila(f,filasLlenas));
//			filasLlenas[i] = f;
//		}
//		
//		for (int i = 0 ; i < sopaLetras.length ;i++) {
//			for(int j = 0 ; j < sopaLetras[0].length ; j++) {
//				sopaLetras[i][j] = Integer.toString(random.nextInt(10));
//			}
//		}
//		
//		for (int i = 0; i < filasLlenas.length ; i++) {
//			int lenPalabra = letras[i].length();
//			int indexPalabra = 0;
//			int filaPalabra = filasLlenas[i];
//			for (int j = random.nextInt(15) ; indexPalabra < lenPalabra; j++) {
//				sopaLetras[filaPalabra][j] = letras[i].substring(indexPalabra,(indexPalabra + 1));
//				indexPalabra++; 
//				
//			}
//		}
//		
//	}
//	
//	static void imprimirSopaLetras(String sopaL[][]) {
//		
//		for(int i = 0; i < sopaL.length; i++) {
//			System.out.print("[ ");
//			for(int j = 0; j < sopaL[0].length;j++) {
//				System.out.print(sopaL[i][j] + " ");
//			}
//			System.out.print("]");
//			System.out.println("");
//		}
//	}
	
	// ----------------------------------------------------------------------
	// Funciones Ejercicio 4
//	static void tipoNota(int al, int nNota, double alumnos[][]) {
//		switch(nNota) {
//			case 0:
//				System.out.println("Ingrese nota del primer trabajo evaluativo: ");
//				break;
//			case 1: 
//				System.out.println("Ingrese nota del segundo trabajo evaluativo: ");
//				break;
//			case 2:
//				System.out.println("Ingrese nota del primer integrador: ");
//				break;
//			case 3:
//				System.out.println("Ingrese nota del segundo integrador: ");
//				break;
//			default:
//				System.out.println("Nota final: " + alumnos[al][nNota]);
//		}	
		
//	}
	
//	static double ponderarNota(int col) {
//		double num;
//		Scanner scan = new Scanner(System.in);
//		num = scan.nextDouble();
//		switch(col) {
//			case 0: 
//				num = num * 0.1;
//				break;
//			case 1: 
//				num = num * 0.15;
//				break;
//			case 2: 
//				num = num * 0.25;
//				break;
//			default:
//				num = num * 0.5;
//				break;
//			
//		}
//		return num;
//	}
//	
//	static double notaFinal(int al, double notas[][]) {
//		double notaF = 0;
//		for (int j = 0 ; j < 4; j++) {
//			notaF += notas[al][j];
//		}
//		return notaF;
//	}
	// -----------------------------------------------------------------
	// Funciones Ejercicio 3
//	public static void rellenar( int vector[]){
//		for (int i = 0; i < 5; i++) {
//			vector[i]=(int)(Math.random()*10);
//		}
//	} 
//	public static void imprimir( int vector[]){
//		for (int i = 0; i < 5; i++) {
//			System.out.print(vector[i]+" ");
//		}
}


