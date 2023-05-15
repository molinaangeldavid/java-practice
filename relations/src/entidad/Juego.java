package entidad;

import java.util.ArrayList;

public class Juego {

	private ArrayList<Jugador> jugadores;
	
	public Juego() {
		jugadores = new ArrayList<Jugador>();
	}
	
	public Juego(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua r) {
		this.jugadores = jugadores;
		r.llenarRevolver();
	}
	
	public void ronda(RevolverAgua r) {
		for(int i = 0; i < this.jugadores.size();i++) {
			this.jugadores.get(i).disparo(r);
			if(this.jugadores.get(i).isMojado()) {
				break;
			}
		}
	}
}
