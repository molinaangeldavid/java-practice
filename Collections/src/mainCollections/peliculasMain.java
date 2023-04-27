package mainCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

import entidad.Pelicula;
import entidad.PeliculaService;
import java.util.Scanner;

public class peliculasMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		PeliculaService ps = new PeliculaService();
		String continuar;
		do {
			peliculas.add(ps.crearPelicula());
			System.out.println("Desea agregar mas peliculas> <si/no>");
			continuar = scan.next();
		} while (continuar.equals("si"));
				
		// Mostrar todas las peliculas
		ps.mostrarPeliculas(peliculas);
		
		// Mostrar todas las peliculas mayor a cierta duracion
		System.out.println("Ingrese la duraciond de la peli que desea filtrar: ");
		int duracionPeli = scan.nextInt();
		ps.mostrarPeliculasMayorA(peliculas, duracionPeli);
		
		
		//Ordenar peliculas por duracion de mayor a menor
		System.out.println("================================================");
		Collections.sort(peliculas, ps.compararDuracionMayorMenor);
		ps.mostrarPeliculas(peliculas);
		System.out.println("================================================");
		Collections.sort(peliculas, ps.compararDuracionMenorMayor);
		ps.mostrarPeliculas(peliculas);
		System.out.println("================================================");
		Collections.sort(peliculas, ps.compararAlfabeticamenteTitulo);
		ps.mostrarPeliculas(peliculas);
		System.out.println("================================================");
		Collections.sort(peliculas, ps.compararAlfabeticamenteDirector);
		ps.mostrarPeliculas(peliculas);
		
		
	}
	
	

}
