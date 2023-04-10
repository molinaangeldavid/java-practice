package club_futbol;

public class Jugador extends Persona{

	private int posicion;
	private int salario;
	
	/**
	 * Posicion: Posicion del jugador(int)<br>
	 * Salario: Salario del jugador(int)
	 */
	public Jugador() {
		// TODO Auto-generated constructor stub
	}
	
	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public void mostrar_jugador() {
		System.out.println("Nombre Jugador: " + getNombre());
		System.out.println("Apellido jugador: " + getApellido());
		System.out.println("Posicion: " + this.posicion);
		System.out.println("Salario: " + this.salario);
	}

}
