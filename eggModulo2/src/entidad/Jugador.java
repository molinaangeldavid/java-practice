package entidad;

public class Jugador {
	private String nombre;
	private int intentos;
	private int vecesGanados;
	
	public Jugador() {
		this.intentos = 5;
		this.vecesGanados = 0;
	}
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.intentos = 5;
		this.vecesGanados = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}
	
	public void perderIntentos() {
		this.intentos--;
	}
	public void victoria() {
		this.vecesGanados++;
	}

	public int getVecesGanados() {
		return vecesGanados;
	}

	public void setVecesGanados(int vecesGanados) {
		this.vecesGanados = vecesGanados;
	}
	
}
