package eggModulo2;

import java.util.*;

public class clase4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		// Guia teorica
//		int[] vector1 = new int[2];
//		int[][] matriz1 = new int[2][2];
//		String nombre;
//		int cantidad = scan.nextInt();
//		String[] nombres = new String[cantidad];
//		
//		for(int i = 0 ; i < cantidad ; i++) {
//			System.out.println("Ingrese nombre: ");
//			nombre = scan.next();
//			nombres[i] = nombre;
//		}
//		
//		for(int i = 0; i < cantidad ; i++) {
//			System.out.println(nombres[i]);
//		}
		
		// ---------------------------------------
		// Ejercicio 1
		
//		int numeros[] = new int[100];
//		
//		for(int i = 0; i < 100 ; i++) {
//			numeros[i] = i+1;
//		}
//		
//		for(int i = 99; i >= 0 ; i--) {
//			System.out.print(numeros[i] + " ");
//		}
		
		//-------------------------------------------
		// Ejercicio 2
		
//		int tamanio;
//		Random random = new Random(); 
//		System.out.println("Ingrese la longitud que tendra el vector: ");
//		tamanio = scan.nextInt();
//		int aleaNum[] = new int[tamanio];
//		
//		for(int i = 0; i < tamanio ; i++) {
//			aleaNum[i] = random.nextInt(10);
//		}
//		
//		System.out.println("Ingrese numero que desea encontrar: ");
//		int numeroAEncontrar = scan.nextInt();
//		boolean seRepite = false;
//		int repetidos = 0;
//		
//		for(int i = 0; i < aleaNum.length && !seRepite ; i++) {
//			if(numeroAEncontrar == aleaNum[i]) {
//				repetidos++;
//				if (repetidos == 1) {
//					System.out.println("Esta en la posicion: " + i);
//				}
//			}
//			if(repetidos > 1) {
//				seRepite = true;
//				System.out.println("Esta repetido");
//			}
//		}
//		if (repetidos == 0) {
//			System.out.println("No se encontro el numero");
//		}
		
		// -------------------------------------------------------------
		// Ejercicio 3
		
//		Random random  = new Random();
//		System.out.println("Ingrese el tamaño del vector");
//		int n = leer.nextInt();
//
//		int vector[] = new int[n];
//		int cont=0;
//		int digito;
//		int uno=0,dos=0,tres=0,cuatro=0,cinco=0;
//
//		for(int i=0; i<n; i++){
//
//			vector[i]= random.nextInt(99999);
//
//			digito = Integer.toString(vector[i]).length();
//
//			switch(digito) {
//			case 1:
//				uno = uno + 1;
//				break;
//			case 2:
//				dos = dos + 1;
//				break;
//			case 3:
//				tres = tres + 1;
//				break;
//			case 4:
//				cuatro = cuatro + 1;
//				break;
//			case 5:
//				cinco = cinco + 1;
//				break;  
//			}

//		}
//
//		System.out.println("El vector tiene " + uno + " números de un dígito \n"
//				+ dos + " números de dos dígitos \n"
//				+ tres + " números de tres dígitos \n"
//				+ cuatro + " números de cuatro dígitos \n"
//				+ cinco + " números de cinco dígitos.");
//
	
		// ----------------------------------------------------------
		// Ejercicio 4
		
//        Random random  = new Random();
//        int matriz[][] = new int[4][4];
//        int matriz2[][] = new int[4][4];
//        
//        for(int i=0; i<4; i++){
//            for(int j=0; j<4; j++){
//                
//             matriz[i][j]=random.nextInt(10);
//             System.out.print(" " + matriz[i][j]);
//                
//            }          
//            System.out.println(" ");
//        }
//        
//        System.out.println("-----------");
//        
//        for(int i=0; i<4; i++){
//            for(int j=0; j<4; j++){
//                
//             matriz2[i][j]= matriz[j][i];           
//                System.out.print(" " + matriz2[i][j]);   
//            }           
//            System.out.println(" ");
//        }
		
		// ---------------------------------------------------------
		// Ejercicio 5
		
//		Random random  = new Random();
//		int matriz[][] = {{0,-2,4},{2,0,2},{-4,-2,0}};
//		int matriz2[][] = new int[4][4];
//		boolean anti=true;

		/*
	        for(int i=0; i<4; i++){
	            for(int j=0; j<4; j++){

	             matriz[i][j]=random.nextInt(10 + 10) - 10;
	             System.out.print(" " + matriz[i][j]);

	            }          
	            System.out.println(" ");
	        }
		 */

//		System.out.println("-----------");
//
//		for(int i=0; i<3; i++){
//			for(int j=0; j<3; j++){
//
//				matriz2[i][j]= matriz[j][i];           
//				System.out.print(" " + matriz2[i][j]);   
//			}           
//			System.out.println(" ");
//		}
//
//		for(int i=0; i<3; i++){
//			for(int j=0; j<3; j++){
//
//				if(matriz2[i][j] != -matriz[i][j]){
//					anti = false;
//				} else {
//					anti = true;
//				}      
//
//			}           
//
//		}
//		if(anti){
//			System.out.println("La matriz -AT es antisimetrica");
//		} else {
//			System.out.println("La matriz -AT no es antisimetrica");
//		}
//	
		// ------------------------------------------------------
		// Ejercicio 6
		
		int magico[][] = new int[3][3];
		int sumaPrimerFila = 0; 
		int sumafila = 0;
		int sumaCol = 0;
		
		System.out.println("Ingrese los 9 numeros de la matriz: <0,9>");
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				do {
					magico[i][j] = scan.nextInt();
					if (magico[i][j] < 0 || magico[i][j] > 9) {
						System.out.println("El numero ingresado no es valido. Ingrese nuevamente");
					}
				}while(magico[i][j] < 0 || magico[i][j] > 9);
				
				if(i == 0) {
					sumaPrimerFila += magico[i][j];
				}
			}
		}
		int diagonalP = 0;
		int diagonalS = 0;
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if (i == j) {
					diagonalP += magico[i][j]; 
				}
				if(i == (2 - j)) {
					diagonalS += magico[i][j];
				}
				if(i != 0) {
					sumafila += magico[i][j];
				}
				sumaCol += magico[j][i];
			}
		}
		
		if (diagonalP == diagonalS && sumaPrimerFila == diagonalP) {
			if(sumaPrimerFila == sumafila/2) {
				if(sumaPrimerFila == sumaCol/3) {
					System.out.println("Es magico");
				}else {
					System.out.println("No es magico");
				}
			}else{
				System.out.println("No es magico");
			}
		}else {
			System.out.println("No es magico");
		}
		
			
		
	}

}
