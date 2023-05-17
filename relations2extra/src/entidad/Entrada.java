package entidad;

public class Entrada {
	
	private int  sala;
	private Asiento asiento;
	private Espectador espectador;
	private Pelicula peliculaEntrada;
	
	public Entrada() {
		
	}

	public Entrada(int sala, Asiento asiento, Espectador espectador, Pelicula peliculaEntrada) {
		super();
		this.sala = sala;
		this.asiento = asiento;
		this.espectador = espectador;
		this.peliculaEntrada = peliculaEntrada;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public Asiento getAsiento() {
		return asiento;
	}

	public void setAsiento(Asiento asiento) {
		this.asiento = asiento;
	}

	public Espectador getEspectador() {
		return espectador;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}

	public Pelicula getPeliculaEntrada() {
		return peliculaEntrada;
	}

	public void setPeliculaEntrada(Pelicula peliculaEntrada) {
		this.peliculaEntrada = peliculaEntrada;
	}

	@Override
	public String toString() {
		return "Entrada [sala=" + sala + ", asiento=" + asiento + ", espectador=" + espectador + ", peliculaEntrada="
				+ peliculaEntrada + "]";
	}
	
}
