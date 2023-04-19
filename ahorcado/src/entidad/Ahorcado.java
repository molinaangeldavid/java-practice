package entidad;

public class Ahorcado {
	private String palabraAhorcado[];
	private int cantidadLetrasEncontrados;
	private int cantidadIntentos;
	
	public Ahorcado() {
		this.cantidadLetrasEncontrados = 0;
	}
	public Ahorcado(String[] palabra, int intentos) {
		this.palabraAhorcado = palabra;
		this.cantidadLetrasEncontrados = 0;
		this.cantidadIntentos = intentos;
	}
	public String[] getPalabraAhorcado() {
		return palabraAhorcado;
	}
	public void setPalabraAhorcado(String[] palabraAhorcado) {
		this.palabraAhorcado = palabraAhorcado;
	}
	public int getCantidadLetrasEncontrados() {
		return cantidadLetrasEncontrados;
	}
	public void setCantidadLetrasEncontrados(int cantidadLetrasEncontrados) {
		this.cantidadLetrasEncontrados = cantidadLetrasEncontrados;
	}
	public int getCantidadIntentos() {
		return cantidadIntentos;
	}
	public void setCantidadIntentos(int cantidadIntentos) {
		this.cantidadIntentos = cantidadIntentos;
	}
	
	
}
