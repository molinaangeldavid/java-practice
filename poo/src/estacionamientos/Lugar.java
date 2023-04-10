package estacionamientos;

public class Lugar {

	private int numero;
	private boolean libre;
	
	public Lugar() {
		this.libre = true;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

}
