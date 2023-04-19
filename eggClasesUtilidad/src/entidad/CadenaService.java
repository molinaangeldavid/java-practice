package entidad;

import entidad.Cadena;
import java.util.*;

public class CadenaService {

	
	public Cadena crearFrase() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la cadena: ");
		String frase = scan.nextLine();
		return new Cadena(frase);
	}
	
	public void mostrarVocales(Cadena c) {
		int cantVocales = 0;
		String vocales = "aeiou";
		for (int i = 0; i < c.getLongitud();i++) {
			for (int j = 0;j < vocales.length();j++) {
				if (c.getFrase().substring(i,i+1).equalsIgnoreCase(vocales.substring(j, j+1))) {
					cantVocales++;
				}
			}
		}
		System.out.println("Cantidad de vocales: " + cantVocales );
	}
	
	public void invertirFrase(Cadena c) {
		String alReves = "";
		
		for (int i = c.getLongitud()-1; i >= 0 ; i--) {
			alReves += c.getFrase().substring(i, i+1);
		}
		
		System.out.println("La frase invertida es " + alReves);
	}
	
	public void vecesRepetido(Cadena c, String letra) {
		int cantRepetido = 0;
				
		for(int i = 0 ; i < c.getLongitud() ; i++) {
			if (c.getFrase().charAt(i)==letra.charAt(0)) {
				cantRepetido++;
			}
		}
		System.out.println("Cantidad de la letra repetida es: " + cantRepetido);
	}
	
	public void compararLongitud(Cadena c, String frase2) {
		if (c.getLongitud() == frase2.length()) {
			System.out.println("La longitud de ambos strings son iguales");
		}else {
			System.out.println("La longitud de ambos strings son diferentes");
		}
	}
	
	public void unirFrases(Cadena c, String frase2) {
		System.out.println("Frase unida: " + c.getFrase().concat(frase2));
	}
	
	public void reemplazar(Cadena c, String letra) {
		String cadenaModificada= c.getFrase();
		System.out.println("Palabra modificada: " + cadenaModificada.replaceAll("a", letra));
		
	}
	
	public boolean contiene(Cadena c, String s) {
		if (c.getFrase().contains(s)) {
			return true;
		}else {
			return false;
		}
	}
	
}
