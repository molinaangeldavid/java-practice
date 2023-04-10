package eggModulo2;

import entidad.Circunferencia;
import entidad.Libro;
import entidad.Puntos;
import entidad.Rectangulo;
import entidad.Juego;
import entidad.Jugador;

import java.util.*;

public class mainPOO {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Ejercicio 1
		
//		Libro libro1 = new Libro();
//		libro1.cargarLibros();
//		System.out.println(libro1);
		// ------------------------------------------
		// Ejercicio 2
		
//		Circunferencia c1 = new Circunferencia();
//		System.out.println("Ingrese el radio: ");
//		c1.crearCircunferencia(scan.nextDouble());
//		System.out.println("Area: " + c1.area());
//		System.out.println("Perimetro: " + c1.perimetro());
		
		// ------------------------------------------------
		// Ejercicio 3
		
//		System.out.println("Ingrese base: ");
//		int base = scan.nextInt();
//		System.out.println("Ingrese altura: ");
//		int altura = scan.nextInt();
//		Rectangulo rec = new Rectangulo(base,altura);
//		
//		System.out.println("Superficie: "+ rec.superficie());
//		System.out.println("Perimetro: " + rec.perimetro());
//		
//		rec.dibujarRectangulo();
		
		// EJercicio 2 extra
		
//		Puntos p1 = new Puntos(3,4,6,5);
//		
//		System.out.println("Distancia entre los puntos: " + p1.calcularDistancia());
//		System.out.println(p1);
		
		// Ejercicio 3 extra
		
		Jugador jugador1 = new Jugador("David");
		Jugador jugador2 = new Jugador("Goliat");
		
		boolean continuar = false;
		String input;
		do {
			Juego juego1 = new Juego(jugador1,jugador2);
			juego1.iniciar_juego();
			System.out.println("Desea jugar otra ronda <si,no>");
			input = scan.next();
			if (input.toLowerCase().equals("si")) {
				System.out.println("Cambiando roles. Jugador 2 elijes numero");
				Juego juego2 = new Juego(jugador2,jugador1);
				juego2.iniciar_juego();
				continuar = true;
			}else {
				System.out.println("Adios!!");
				continuar = false;
			}
		} while (continuar);
		
	}

}
