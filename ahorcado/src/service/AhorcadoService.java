package service;

import entidad.Ahorcado;
import java.util.*;

public class AhorcadoService {

	public Ahorcado crearJuego() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la palabra: ");
		String palabraString = scan.next();
		String palabra[] = new String[palabraString.length()];
		for (int i = 0 ; i < palabraString.length() ; i++) {
			palabra[i] = palabraString.substring(i,i+1);
		}
		System.out.println("Ingrese la cantidad de intentos que tendra el jugador para adivinar: ");
		int intentos = scan.nextInt();
		return new Ahorcado(palabra,intentos);
	}
	
	private int longitud(Ahorcado a) {
		return a.getPalabraAhorcado().length;
	}
	
	private void buscar(Ahorcado a, String letra) {
		int cantLetrasEncontradas = 0;
		for(int i = 0; i < longitud(a); i++) {
			if(letra.equals(a.getPalabraAhorcado()[i])) {
				cantLetrasEncontradas++;
			}	
		}
		if(cantLetrasEncontradas == 0) {			
			System.out.println("La letra no esta en la palabra.");
		}
	}
	
	private boolean encontradas(Ahorcado a, String letra) {
		int contLetras = 0;
		for(int i = 0; i < longitud(a);i++) {
			if(letra.equals(a.getPalabraAhorcado()[i])) {
				contLetras++;
			}
		}
		a.setCantidadLetrasEncontrados(a.getCantidadLetrasEncontrados() + contLetras);
		System.out.println("Cantidad letras encontradas: " + a.getCantidadLetrasEncontrados());
		System.out.println("Cantidad de letras faltantes: " + (longitud(a) - a.getCantidadLetrasEncontrados()));
		if(contLetras > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	private void intentos(Ahorcado a) {
		System.out.println("Intentos disponibles: " + a.getCantidadIntentos());
	}
	
	private String[] dibujarAhorcado(Ahorcado a,String ahorcadoPalabra[],String letra) {
		for(int i = 0 ; i < longitud(a) ; i++) {
			if(letra.equals(a.getPalabraAhorcado()[i])) {
				ahorcadoPalabra[i] = letra;
			}
			System.out.print(ahorcadoPalabra[i]);
		}
		System.out.println("");
		return ahorcadoPalabra;
	}
	
	private String[] rellenarGuionBajo(Ahorcado a,String[] arr) {
		for(int i = 0 ; i < longitud(a); i++) {
			arr[i] = "_";
		}
		return arr;
	}
	
	public void juego() {
		Scanner scan = new Scanner(System.in);
		Ahorcado a1 = this.crearJuego();
		String ahorcadoVacio[] = new String[longitud(a1)]; 
		ahorcadoVacio = rellenarGuionBajo(a1, ahorcadoVacio);
		String letra;
		do {
			System.out.println("Ingrese una letra: ");
			letra = scan.next();
			buscar(a1,letra);
			if(!encontradas(a1,letra)) {
				a1.setCantidadIntentos(a1.getCantidadIntentos() - 1);				
			}
			intentos(a1);
			ahorcadoVacio = dibujarAhorcado(a1, ahorcadoVacio, letra);
			
		} while (a1.getCantidadIntentos() > 0 && a1.getCantidadLetrasEncontrados() != longitud(a1));
		if (a1.getCantidadIntentos() == 0) {
			System.out.println("Has perdido.");
			System.out.println("La palabra es: " + Arrays.toString(a1.getPalabraAhorcado()));
		}
		if (a1.getCantidadLetrasEncontrados() == longitud(a1)){
			System.out.println("Has adivinado!!");
		}
	}
}
