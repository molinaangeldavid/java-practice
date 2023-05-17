package entidad;

public class Asiento {

	private String letra;
	private int numero;
	private boolean disponible;
	
	public Asiento() {
		this.disponible = false;
	}
	
	public Asiento(String letra,int numero) {
		this.letra = letra;
		this.numero = numero;
		this.disponible = false;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Asiento [letra=" + letra + ", numero=" + numero + ", disponible=" + disponible + "]";
	}

	
	
	
}
