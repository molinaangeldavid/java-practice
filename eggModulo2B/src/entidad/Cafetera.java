package entidad;

public class Cafetera {
	private float capacidadMaxima;
	private float cantidadActual;
	
	public Cafetera() {
		this.capacidadMaxima = 50;
		this.cantidadActual = 20;
	}
	
	public float getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(float capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public float getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(float cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	public Cafetera(float capacidadMaxima,float capacidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = capacidadActual;
	}
	
	public void llenarCafetera() {
		this.cantidadActual = this.capacidadMaxima;
	}
	
	public void servirTaza(double d) {
		
		if(d >= this.cantidadActual) {
			System.out.println("Cafeteria vacia. Recargar");
			System.out.println("Taza cargada: " + ((this.cantidadActual * 100) / d) + "%");
			this.cantidadActual = 0;
		}else {
			this.cantidadActual -= d;
			System.out.println("Taza cargada 100 %");
		}
	}
	
	public void vaciarCafetera() {
		this.cantidadActual = 0;
	}
	
	public void agregarCafe(int cantidad) {
		if (cantidad >= this.capacidadMaxima) {
			this.cantidadActual = this.capacidadMaxima; 
		}else {
			this.cantidadActual += cantidad; 
		}
		
	}
}
