package biblioteca;

import java.util.*;

public class Biblioteca {

	private String nombre;
	private ArrayList<Libro> libros;
	private int facturacion;
	private int cant_libros;
	
	/**
	 * 
	 * @param nombre
	 */
	public Biblioteca(String nombre) {
		this.nombre = nombre;
		libros = new ArrayList<Libro>();
	}
	
	public boolean agregar_libros(Libro libro) {
		boolean estado = false;
		int cant = 0;
		for (int i = 0 ; i < libros.size() ; i++) {
			if (libro.getCodigo() != libros.get(i).getCodigo()){
				cant++;
			}
		}
		if (cant == libros.size()) {
			estado = true;
			libros.add(libro);
			cant_libros++;
		}
		return estado;
	}
	
	public int obtener_facturacion() {
		return facturacion;
	}
	
	public boolean alquilar_libro(int codigo) {
		boolean alquilado = false;
		for (int i = 0 ; i < this.libros.size() && !alquilado; i++) {
			if (libros.get(i).getCodigo() == codigo) {
				if (libros.get(i).getEstado()) {
					alquilado = true;
					this.libros.get(i).setEstado(false);
					this.facturacion += 50;
				}else {
					System.out.println("El libro ya se encuentra alquilado");
				}
			}else {
				System.out.println("No se encuentra el libro");
			}
		}
		return alquilado;
	}

	public boolean devolver_libro(int cod) {
		boolean devuelto = false;
		for(int i = 0 ; i < this.libros.size() && !devuelto; i++) {
			if (cod == this.libros.get(i).getCodigo()) {
				if (this.libros.get(i).getEstado()) {
					System.out.println("El libro no se encuentra alquilado");
				}else {
					this.libros.get(i).setEstado(true); 
					devuelto = true;
				}
			}else {
				System.out.println("El codigo no es valido");
			}
		}
		return devuelto;
	}
	
	public void buscar_libro(int cod) {
		for (int i = 0 ; i < this.libros.size() ; i++) {
			if (cod == this.libros.get(i).getCodigo()) {
				System.out.println("===================================================");
				System.out.println("Titulo: " + this.libros.get(i).getTitulo());
				System.out.println("Autor: " + this.libros.get(i).getAutor());
				System.out.println("Genero: " + this.libros.get(i).getGenero());
			}else {
				System.out.println("El libro no se encuentra");
			}
		}
	}
	
	public void listar_libros(String genero) {
		System.out.println(genero.toUpperCase());
		for (int i = 0 ; i < this.libros.size() ; i++) {
			if(genero.equals(this.libros.get(i).getGenero())) {
				System.out.println("Titulo: " + this.libros.get(i).getTitulo());
				System.out.println("Codigo: " + this.libros.get(i).getCodigo());
				System.out.println("Alquilado: " + this.libros.get(i).getEstado());
			}
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public int getFacturacion() {
		return facturacion;
	}

	public void setFacturacion(int facturacion) {
		this.facturacion = facturacion;
	}

	public int getCant_libros() {
		return cant_libros;
	}

	public void setCant_libros(int cant_libros) {
		this.cant_libros = cant_libros;
	}

}
