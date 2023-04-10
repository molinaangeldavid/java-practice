package club_futbol;

public class Domicilio {

	private String provincia;
	private String barrio;
	private String calle;
	private int numero;
	
	/**
	 * Provincia: Provincia de la persona(String)<br>
	 * Barrio: Barrio de la persona(String)<br>
	 * Calle: Calle de la persona(String)<br>
	 * Numero: Numero de la persona(int) 
	 */
	public Domicilio() {
	}
	
	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


}
