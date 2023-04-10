package parcial2practica;

import java.util.*;

public class Almacen {

	private String nombre;
	private double ganancia;
	private ArrayList<Comida> comidas;
	private ArrayList<Bebida> bebidas;
	
	public Almacen() {
		comidas = new ArrayList<Comida>();
		bebidas = new ArrayList<Bebida>();
	}

	public void listarProductos() {
		for(int i = 0; i < comidas.size() ; i++) {
			
		}
	}
	
	public void venderProducto(int tipo_p) {
		
	}
	
	public void agregarBebida(Bebida b) {
		
	}
	
	public void agregarComida(Comida c) {
		
	}
	
	public double litrosVendidos() {
		return 0.0;
	}
	
	public double kilosVendidos() {
		return 0.0;
	}
	
	public double obtenerGanancia() {
		return 0.0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getGanancia() {
		return ganancia;
	}

	public void setGanancia(double ganancia) {
		this.ganancia = ganancia;
	}
	
	
	
}
