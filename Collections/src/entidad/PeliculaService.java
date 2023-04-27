package entidad;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;



public class PeliculaService {

	public Pelicula crearPelicula() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el nombre de la pelicula: ");
		String nombre = scan.nextLine();
		System.out.println("Ingrese el director de la pelicula: ");
		String nombreDirector = scan.nextLine();
		System.out.println("Ingrese la duracion de la pelicula");
		int duracion = scan.nextInt();
		return new Pelicula(nombre,nombreDirector,duracion);

	}
	
	public void mostrarPeliculas(ArrayList<Pelicula> peliculas) {
		for(Pelicula pelicula: peliculas) {
			System.out.println(pelicula.getTitulo() + " - " + pelicula.getDirector() + " - " + pelicula.getDuracion());
		}
		
	}
	
	public void mostrarPeliculasMayorA(ArrayList<Pelicula> peliculas, int duracion) {
		int contador = 0;
		for(Pelicula pelicula: peliculas) {
			if (pelicula.getDuracion() > duracion) {
				contador++;
				System.out.println(pelicula.getTitulo() + " - " + pelicula.getDirector() + " - " + pelicula.getDuracion());
			}
		}
		System.out.println((contador==0) ? "No existe esas peliculas" : "");
	}
	
	public static Comparator<Pelicula> compararDuracionMayorMenor = new Comparator<Pelicula>() {
		@Override
		public int compare(Pelicula p1, Pelicula p2) {
			return p1.getDuracion().compareTo(p2.getDuracion());
		}
	};
	
	public static Comparator<Pelicula> compararDuracionMenorMayor = new Comparator<Pelicula>() {
		@Override
		public int compare(Pelicula p1, Pelicula p2) {
			return p2.getDuracion().compareTo(p1.getDuracion()); 
		}
	};
	
	public static Comparator<Pelicula> compararAlfabeticamenteTitulo = new Comparator<Pelicula>() {
		@Override
		public int compare(Pelicula p1, Pelicula p2) {
			return p1.getTitulo().compareTo(p2.getTitulo()); 
		}
	};
	
	public static Comparator<Pelicula> compararAlfabeticamenteDirector = new Comparator<Pelicula>() {
		@Override
		public int compare(Pelicula p1, Pelicula p2) {
			return p1.getDirector().compareTo(p2.getDirector()); 
		}
	};
	
	
}
