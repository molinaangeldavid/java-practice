package entidad;

import java.util.Random;

public class RevolverAgua {
	private int posicionActual;
	private int posicionAgua;
	
	public RevolverAgua() {
	}
	
	public RevolverAgua(int posicionActual, int posicionAgua) {
		this.posicionActual = posicionActual;
		this.posicionAgua = posicionAgua;
	}

	public int getPosicionActual() {
		return posicionActual;
	}
	public void setPosicionActual(int posicionActual) {
		this.posicionActual = posicionActual;
	}
	public int getPosicionAgua() {
		return posicionAgua;
	}
	public void setPosicionAgua(int posicionAgua) {
		this.posicionAgua = posicionAgua;
	}
	
	public void llenarRevolver() {
		Random random = new Random();
		this.posicionActual = random.nextInt(6);
		this.posicionAgua = random.nextInt(6);
	}
	
	public boolean mojar() {
		if(this.posicionActual == this.posicionAgua) {
			return true;
		}else {
			return false;
		}
	}
	
	public void siguienteChorro() {
		if(this.posicionActual != 5) {
			this.posicionActual+= 1;
		}else {
			this.posicionActual = 0;
		}
	}
	
	public String toString() {
		return "Posicion actual: " + this.posicionActual + "\n" + "Posicion de bala: " + this.posicionAgua;
	}
	
}
