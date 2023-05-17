package entidad;

import java.util.ArrayList;

public class Funcion {
	private int numeroSala;
	private ArrayList<Espectador> espectadores;
	private Pelicula peliculaFuncion;
	
	public Funcion() {
		espectadores = new ArrayList<Espectador>();
	}
	
	public Funcion(int numeroSala, ArrayList<Espectador> espectadores, Pelicula peliculaFuncion) {
		this.numeroSala = numeroSala;
		this.espectadores = espectadores;
		this.peliculaFuncion = peliculaFuncion;
	}

	public Funcion(int numeroSala, Pelicula peliculaFuncion) {
		this.numeroSala = numeroSala;
		this.peliculaFuncion = peliculaFuncion;
	}

	public int getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}

	public ArrayList<Espectador> getEspectadores() {
		return espectadores;
	}

	public void setEspectadores(ArrayList<Espectador> espectadores) {
		this.espectadores = espectadores;
	}

	public Pelicula getPeliculaFuncion() {
		return peliculaFuncion;
	}

	public void setPeliculaFuncion(Pelicula peliculaFuncion) {
		this.peliculaFuncion = peliculaFuncion;
	}

	@Override
	public String toString() {
		return "Funcion [numeroSala=" + numeroSala + ", espectadores=" + espectadores + ", peliculaFuncion="
				+ peliculaFuncion + "]";
	}
	
	
}
