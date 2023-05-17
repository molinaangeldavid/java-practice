package entidad;

import java.util.ArrayList;

public class Cine {

	private String nombre;
	private ArrayList<Sala> salas;
	private ArrayList<Pelicula> peliculas;
	private ArrayList<Funcion> funciones;
	private double precio;
	
	public Cine() {
		salas = new ArrayList<Sala>();
		peliculas = new ArrayList<Pelicula>();
		funciones = new ArrayList<Funcion>();
	}
	
	public Cine(String nombre,ArrayList<Sala> salas, ArrayList<Pelicula> peliculas, double precio) {
		this.nombre = nombre;
		this.salas = salas;
		this.peliculas = peliculas;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Sala> getSalas() {
		return salas;
	}

	public void setSalas(ArrayList<Sala> salas) {
		this.salas = salas;
	}

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public ArrayList<Funcion> getFunciones() {
		return funciones;
	}

	public void setFunciones(ArrayList<Funcion> funciones) {
		this.funciones = funciones;
	}

	public void mostrarAsientosSalas() {
		for(int i = 0; i < salas.size() ; i++) {
			salas.get(i).mostrarAsientos();
		}
	}
	
	@Override
	public String toString() {
		return "Cine [nombre=" + nombre + ", salas=" + salas + ", peliculas=" + peliculas + ", precio=" + precio + "]";
	}
	
	
	
}
