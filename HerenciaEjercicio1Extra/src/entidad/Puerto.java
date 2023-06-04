package entidad;

import java.util.ArrayList;

public class Puerto {
	String nombre;
	ArrayList<Alquiler> alquileres;
	ArrayList<Barco> barcos;
	
	public Puerto() {
		alquileres = new ArrayList<Alquiler>();
		barcos = new ArrayList<Barco>();
	}
	
	public Puerto(String nombre) {
		this.nombre = nombre;
		alquileres = new ArrayList<Alquiler>();
		barcos = new ArrayList<Barco>();
	}
	
	public Puerto(String nombre, ArrayList<Alquiler> alquileres, ArrayList<Barco> barcos) {
		this.nombre = nombre;
		this.alquileres = alquileres;
		this.barcos = barcos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(ArrayList<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}

	public ArrayList<Barco> getBarcos() {
		return barcos;
	}

	public void setBarcos(ArrayList<Barco> barcos) {
		this.barcos = barcos;
	}
	
	
	
	
}
