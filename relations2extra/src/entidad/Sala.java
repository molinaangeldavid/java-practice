package entidad;

import java.util.ArrayList;

public class Sala {
	
	private int numero;
	private ArrayList<Asiento> asientos;
	
	public Sala() {
		asientos = new ArrayList<Asiento>();
		this.DefinirAsientos();
	}
	
	public Sala(int numero) {
		this.numero = numero;
		this.DefinirAsientos();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ArrayList<Asiento> getAsientos() {
		return asientos;
	}

	public void setAsientos(ArrayList<Asiento> asientos) {
		this.asientos = asientos;
	}
	
	private void DefinirAsientos() {
		String columnasAsientos[] = {"A","B","C","D","E","F"};
		for(int i = 0 ; i < 8  ; i++) {
			for(int j = 0 ; j < 6 ; j++) {
				asientos.add(new Asiento(columnasAsientos[j],(i + 1)));				
			}
		}
	}
	
	public void mostrarAsientos() {
		Asiento asiento;
		for(int i = 1 ; i <= 8  ; i++) {
			for(int j = 1 ; j <= 6 ; j++) {
				asiento = this.asientos.get(i);
				System.out.print("[ " + asiento.getNumero() + "  " + asiento.getLetra() + "  " + asiento.getDisponible()+ " ]");
			}
			System.out.println("");
		}
	}
	
	@Override
	public String toString() {
		return "Sala [numero=" + numero + ", asientos=" + asientos + "]";
	}
	
	
	
}
