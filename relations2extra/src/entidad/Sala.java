package entidad;

public class Sala {
	
	private int numero;
	private Asiento[][] asientos = new Asiento[8][6];
	
	public Sala() {
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

	public Asiento[][] getAsientos() {
		return asientos;
	}

	public void setAsientos(Asiento[][] asientos) {
		this.asientos = asientos;
	}
	
	private void DefinirAsientos() {
		String columnasAsientos[] = {"A","B","C","D","E","F"};
		for(int i = 0 ; i < 8  ; i++) {
			for(int j = 0 ; j < 6 ; j++) {
				asientos[i][j] = new Asiento(columnasAsientos[j],(i + 1));				
			}
		}
	}
	
	public void mostrarAsientos() {
		String ocupado;
		for(int i = 7; i >= 0  ; i--) {
			for(int j = 0 ; j < 6 ; j++) {
				if(this.asientos[i][j].getDisponible()) {
					ocupado = "	X";
				}else {
					ocupado = " ";
				}
				System.out.print("[" + this.asientos[i][j].getNumero() + "  " + this.asientos[i][j].getLetra() + "  " + ocupado+ "] " );
			}
			System.out.println("");
		}
	}
	
	@Override
	public String toString() {
		return "Sala [numero=" + numero + ", asientos=" + asientos + "]";
	}
	
	
	
}
