package entidad;


public class Cine {

	private String nombre;
	private Sala sala;
	private Pelicula pelicula;
	private double precio;
	
	public Cine() {
	}
	
	public Cine(String nombre,Sala sala, Pelicula pelicula, double precio) {
		this.nombre = nombre;
		this.sala = sala;
		this.pelicula = pelicula;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Pelicula getPeliculas() {
		return pelicula;
	}

	public void setPeliculas(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void mostrarAsientos() {
		this.sala.mostrarAsientos();
	}
	
	@Override
	public String toString() {
		return "Cine [nombre=" + nombre + ", salas=" + sala + ", peliculas=" + pelicula + ", precio=" + precio + "]";
	}
	
	
	
}
