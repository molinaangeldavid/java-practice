package entidad;

import java.time.LocalDate;

public class Alquiler {

	private String nombre;
	private String documento;
	private LocalDate fechaAlquiler;
	private LocalDate fechaDevolucion;
	private String posicionAmarre;
	private Barco barco;
	
	public Alquiler() {
		
	}
	
	public Alquiler(String nombre, String documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion,
			String posicionAmarre, Barco barco) {
		super();
		this.nombre = nombre;
		this.documento = documento;
		this.fechaAlquiler = fechaAlquiler;
		this.fechaDevolucion = fechaDevolucion;
		this.posicionAmarre = posicionAmarre;
		this.barco = barco;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public LocalDate getFechaAlquiler() {
		return fechaAlquiler;
	}

	public void setFechaAlquiler(LocalDate fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public String getPosicionAmarre() {
		return posicionAmarre;
	}

	public void setPosicionAmarre(String posicionAmarre) {
		this.posicionAmarre = posicionAmarre;
	}

	public Barco getBarco() {
		return barco;
	}

	public void setBarco(Barco barco) {
		this.barco = barco;
	}
	
	
	
	
}
