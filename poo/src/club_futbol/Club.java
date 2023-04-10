package club_futbol;
import java.util.*;

public class Club {

	private String nombre;
	private String color;
	private Persona director_tecnico;
	private ArrayList<Jugador> jugadores;
	private int cant_socios;
	
	
	/**
	 * Nombre: Nombre del club(String).<br>
	 * Color: Color del club(String).<br>
	 * Director tecnico: DT del club(String).<br>
	 * Jugadores: Lista de jugadores del club(Jugador[]).<br>
	 * Cantidad socios: La cantidad de socios del club(int).<br>
	 */
	public Club() {
	}
	
	public void jugar_partido() {
		System.out.println("Esta jugando!!!");
	}
	public void mostrar_info() {
		System.out.println("Nombre Club: " + this.nombre);
		System.out.println("Color Club: " + this.color);
		System.out.println("Director tecnico: " + this.director_tecnico.getNombre() + " " + this.director_tecnico.getApellido());
		System.out.println("Cantidad de socios: " + this.cant_socios);
	}
	
	public void mostrar_jugadores() {
		for(int i = 0;i < this.jugadores.size();i++) {
			System.out.println("Nombre jugador " + (i+1) + ": " + jugadores.get(i).getNombre());
			System.out.println("Apellido jugador " + (i+1) + ": " + jugadores.get(i).getApellido());
			System.out.println("Posicion jugador " + (i+1) + ": " + this.jugadores.get(i).getPosicion());
			System.out.println("Salario jugador " + (i+1) + ": " + this.jugadores.get(i).getSalario());
		}
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Persona getDirector_tecnico() {
		return director_tecnico;
	}

	public void setDirector_tecnico(Persona director_tecnico) {
		this.director_tecnico = director_tecnico;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public int getCant_socios() {
		return cant_socios;
	}

	public void setCant_socios(int cant_socios) {
		this.cant_socios = cant_socios;
	}
	
	

}
