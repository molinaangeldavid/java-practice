package entidad;

import java.util.*;

public class Libro {
	
	Scanner scan = new Scanner(System.in);
	private String isbn;
	private String titulo;
	private String autor;
	private int pagina;
	
	public Libro() {
		
	}
	public Libro(String isbn, String titulo, String autor,int paginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.pagina = paginas;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPagina() {
		return pagina;
	}
	public void setPagina(int pagina) {
		this.pagina = pagina;
	}
	
	public void cargarLibros() {
		System.out.println("Ingrese ISBN: ");
		this.isbn = scan.next();
		System.out.println("Ingrese titulo: ");
		this.titulo = scan.next();
		System.out.println("Ingrese autor: ");
		this.autor = scan.next();
		System.out.println("Ingrese cantidad de paginas: ");
		this.pagina = scan.nextInt();
	}
	
	public String toString() {
		String ret = "ISBN: " + isbn + " - Titulo: " +  titulo;
		ret += " - Autor: "+  autor + " - Cantidad: " + pagina;
		return ret;
	}
	
	
	
}
