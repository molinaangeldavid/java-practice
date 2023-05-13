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
	
	
	
}
