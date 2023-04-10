package eggModulo2;

import java.util.*;

public class clase2Extras {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// Ejercicio Extra 1
//		int min;
//		System.out.println("Ingrese cantidad de minutos");
//		min = scan.nextInt();
//		float dias;
//		dias = min / 1440;
//		float horas;
//		horas = (min % 1440) / 60;
//		System.out.println("Equivale a " + dias + " dias y " + horas + " horas");
		
		// Ejercicio Extra 2
		
//		int a,b,c,d,aux;
//		System.out.println("Ingrese el valor del a: ");
//		a = scan.nextInt();
//		System.out.println("Ingrese el valor del b: ");
//		b = scan.nextInt();
//		System.out.println("Ingrese el valor del c: ");
//		c = scan.nextInt();
//		System.out.println("Ingrese el valor del d: ");
//		d = scan.nextInt();
//		
//		System.out.println("A = " + a + ";  B = " + b + ";  C = " + c + ";  D = " + d );
//		
//		System.out.println("Cambiando de valores: ");
//		System.out.println("B toma el valor de C");
//		System.out.println("C toma el valor de A");
//		System.out.println("A toma el valor de D ");
//		System.out.println("y D toma el valor de B");
//		
//		aux = b;
//		b = c;
//		c = a;
//		a = d;
//		d = aux;
//		
//		System.out.println("A = " + a + ";  B = " + b + ";  C = " + c + ";  D = " + d );
	
		// Ejercicio Extra 3
		
//		String letra;
//		System.out.println("Ingrese letra: ");
//		letra = scan.next();
//		
//		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
//			System.out.println("Es una vocal");
//		}else {
//			System.out.println("NO es una vocal");
//		}
		
		// Ejercicio Extra 4
		
//		int numero;
//		String numeroRomano = "";
//		System.out.println("Ingrese un numero del 1 al 10");
//		numero = scan.nextInt();
//		
//		switch(numero) {
//			case 1:
//				numeroRomano = "I";
//				break;
//			case 2: 
//				numeroRomano = "II";
//				break;
//			case 3: 
//				numeroRomano = "III";
//				break;
//			case 4: 
//				numeroRomano = "IV";
//				break;
//			case 5: 
//				numeroRomano = "V";
//				break;
//			case 6: 
//				numeroRomano = "VI";
//				break;
//			case 7: 
//				numeroRomano = "VII";
//				break;
//			case 8: 
//				numeroRomano = "VIII";
//				break;
//			case 9: 
//				numeroRomano = "IX";
//				break;
//			case 10: 
//				numeroRomano = "X";
//				break;
//			default: 
//				numeroRomano = "Solo debio ingresar numero del 1 al 10";
//
//		}
//		
//		System.out.println("Numero romano del numero ingresado: " + numeroRomano);
		
		
		// Ejercicio Extra 5
		
//		String claseSocio;
//		int valorReal;
//		System.out.println("Ingrese clase de socio: A-B-C");
//		claseSocio = scan.next();
//		
//		System.out.println("Ingrese un valor real del costo del tratamiento");
//		valorReal = scan.nextInt();
//		
//		if(claseSocio.toLowerCase().equals("a")) {
//			System.out.println("Debe abonar: " + (valorReal * 0.5));
//		}else if(claseSocio.toLowerCase().equals("b")) {
//			System.out.println("Debe abonar: " + (valorReal * 0.65));
//		}else {
//			System.out.println("No tiene descuentos. Aporta: " + valorReal);
//		}
		
		
		// Ejercicio Extra 6
		
//		int cantidadPersonas;
//		int suma160=0, sumaGeneral=0, contadorPersona160 = 0;
//		
//		int altura;
//		System.out.println("Ingrese cantidad de personas: ");
//		cantidadPersonas = scan.nextInt();
//		
//		for(int i = 0 ; i< cantidadPersonas ; i++) {
//			System.out.println("Ingrese altura de la " + (i + 1) + " persona en cm");
//			altura = scan.nextInt();
//			if (altura < 160) {
//				suma160 += altura;
//				contadorPersona160++;
//			}
//			sumaGeneral += altura;
//		}
//		
//		System.out.println("Promedio de estaturas debajo de 160cm: " + suma160 / contadorPersona160 + " cm");
//		System.out.println("Promedio de estaturas general: " + sumaGeneral / cantidadPersonas + "cm");
//		
		
		// Ejercicio 7
		
//		int contadorNumeros = 0;
//		float numeroScanner;
//		float numeroMayor = 0;
//		float numeroMenor = 0;
//		float numeroAcumulador = 0;
//		int nNumeros;
//		System.out.println("Ingrese la cantidad de numeros que desea ingresar: ");
//		nNumeros = scan.nextInt();
		 // Version while
//		while(contadorNumeros < nNumeros) {
//			System.out.println("Ingrese numero mayor de 0");
//			numeroScanner = scan.nextInt();
//			contadorNumeros++;
//			if(contadorNumeros == 1) {
//				numeroMayor = numeroScanner;
//				numeroMenor = numeroScanner;
//			}else {
//				if (numeroScanner >= numeroMayor) {
//					numeroMayor = numeroScanner;
//				}else {
//					numeroMenor = numeroScanner;
//				}
//			}
//			
//			numeroAcumulador += numeroScanner; 
//		}
		
		// Version do-while
		
//		do {
//			System.out.println("Ingrese numero mayor de 0");
//			numeroScanner = scan.nextFloat();
//			contadorNumeros++;
//			if(contadorNumeros == 1) {
//				numeroMayor = numeroScanner;
//				numeroMenor = numeroScanner;
//			}else {
//				if (numeroScanner >= numeroMayor) {
//					numeroMayor = numeroScanner;
//				}else {
//					numeroMenor = numeroScanner;
//				}
//			}
//			
//			numeroAcumulador += numeroScanner; 
//		} while (contadorNumeros < nNumeros);
//		System.out.println("Promedio de los numeros ingresados: " + (numeroAcumulador / contadorNumeros));
//		System.out.println("El mayor de los numeros ingresados: " + numeroMayor);
//		System.out.println("El menor de los numeros ingresados: " + numeroMenor);
		
		
		// Ejercicio Extra 8
		
//		int numeroScanner;
//		int numerosPares = 0;
//		int numerosImpares = 0;
//		
//		do {
//			System.out.println("Ingrese numero: ");
//			numeroScanner = scan.nextInt();
//			if (numeroScanner % 2 == 0) {
//				numerosPares++;
//			}else {
//				numerosImpares++;
//			}
//		} while (numeroScanner % 5 != 0);
//		
//		System.out.println("Cantidad de numeros leidos: " + (numerosImpares + numerosPares));
//		System.out.println("Cantidad de numeros pares: " + numerosPares);
//		System.out.println("Cantidad de numeros pares: " + numerosImpares);
		
		// Ejercicio extra 9
		
//		int contador=0;
//		int dividendo, divisor;
//		int resta;
//		
//		System.out.println("Ingresar el dividendo: ");
//		dividendo = scan.nextInt();
//		System.out.println("Ingressar el divisor: ");
//		divisor = scan.nextInt();
//		do {
//			dividendo -= divisor;
//			contador++;
//			System.out.println((dividendo + divisor) + " - " + divisor +  " = " + dividendo);
//			
//		} while (dividendo >= divisor);
//		
//		System.out.println("El cociente es: " + contador);
//		System.out.println("El resto es: " + dividendo);
		
		// Ejercicio extra 10
				
//		int num1,num2, num3;
//		int resultado;
//		num1 = (int) (Math.random() * 10);
//		System.out.println(num1);
//		num2 = (int) (Math.random() * 10);
//		System.out.println(num2);
//		
//		do {
//			resultado = num1 * num2;
//			System.out.println("Ingrese un numero.");
//			num3 = scan.nextInt();
//			if (num3 > resultado) {
//				System.out.println("Ingrese un numero mas chico");
//			}else {
//				if (num3 == resultado) {
//					System.out.println("Has adivinado.Es igual");
//				}else {
//					System.out.println("Ingrese un numero mas grande");
//				}
//				
//			}
//		} while (resultado != num3);
		
		// Ejercicio extra 11
		
//		int numero;
//		int contador = 0;
//		System.out.println("Ingresar un numero: ");
//		numero = scan.nextInt();
//		
//		while(numero != 0) {
//			contador++;
//			numero = numero / 10;
//		}
//		
//		System.out.println("cantidad de digitos: " + contador);

		
		// Ejercicio extra 12
		
//		String iString = "";
//		String jString = "";
//		String kString = "";
//		for(int i = 0 ; i < 10 ; i++) {
//			for(int j = 0 ; j < 10 ; j++) {
//				for(int k = 0 ; k < 10 ; k++) {
//					iString = Integer.toString(i);
//					jString = Integer.toString(j);
//					kString = Integer.toString(k);
//					if (i == 3) {
//						iString = "E";
//					}
//					if (j == 3) {
//						jString = "E";
//					}
//					if (k == 3) {
//						kString = "E";
//					}
//					System.out.println(iString + " - " + jString + " - " + kString);
//					
//				}
//				
//			}
//			
//		}
		
		// Ejercicio extra 13
		
//			int num;
//		    System.out.println("Ingrese un numero");
//		    num = scan.nextInt();
//		    for(int i = 1; i <= num ; i++){
//		        for(int j = 1; j <= i ; j++){
//		            System.out.print(j);
//		        }
//		        System.out.println("");
//		    }
		
		// Ejercicio extra 14
		
		int familias;
		int hijos=0;
		int sumaHijos = 0;
		int edad=0;
		int sumaEdad = 0;
		
		//Por cantidad y edades de hijos
		
		System.out.println("Ingrese la cantidad de familias: ");
		familias = scan.nextInt();
		
		for (int i = 1 ; i <= familias ; i++) {
			
			System.out.println("Ingrese la cantidad de hijos de la familia " + i);
			hijos = scan.nextInt();
			sumaHijos += hijos;
			for (int j = 1 ; j <= hijos ; j++) {
				
				System.out.println("Ingrese la edad: ");
				edad = scan.nextInt();
				sumaEdad += edad;
			}
			
		}
		
		System.out.println("La media pot hijos es: " + sumaHijos / hijos);
		System.out.println("La media de edades son: " + sumaEdad / edad);
		
		
		
		    
		
		
		
		
		
		
		
	}

}
