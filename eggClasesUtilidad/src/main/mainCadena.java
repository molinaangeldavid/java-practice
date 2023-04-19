package main;

import entidad.*;
import java.util.*;

public class mainCadena {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter("");
		CadenaService c = new CadenaService();
		Cadena c1 = c.crearFrase();
		c.mostrarVocales(c1);
		c.invertirFrase(c1);
		System.out.println("Ingrese letra: ");
		c.vecesRepetido(c1, scan.nextLine());
		System.out.println("Ingrese frase: ");
		c.compararLongitud(c1, scan.nextLine());
		System.out.println("Ingrese frase para unir: ");
		c.unirFrases(c1, scan.nextLine());
		System.out.println("Ingrese letra a modificar: ");
		c.reemplazar(c1, scan.nextLine());
		System.out.println("Ingrese letra: ");
		if (c.contiene(c1, scan.nextLine())) {
			System.out.println("Esta letra esta contenida en " + c1.getFrase());
		}else {
			System.out.println("El string no tiene esta letra");
		}
	}

}
