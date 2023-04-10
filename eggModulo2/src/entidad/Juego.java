package entidad;

import java.util.*;
import entidad.Jugador;

public class Juego {

	private Jugador jugador1;
	private Jugador jugador2;
	private int numero;
	
	public Juego() {
		
	}
	
	public Juego(Jugador jugador1,Jugador jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.numero = 0;
	}
	
	public void iniciar_juego() {
		Scanner scan = new Scanner(System.in);
		int numeroAdivinar;
		boolean adivinado=false; 
		do {
			System.out.println("Jugador Principal. Ingrese numero 1 al 100");
			numero = scan.nextInt();
		} while (validarNumero());
		System.out.println("Tienes 5 intentos para adivinar el numero");
		
		while(this.jugador2.getIntentos() != 0 && !adivinado) {
			System.out.println("Jugador Secundaria. Ingrese numero para adivinar");
			numeroAdivinar = scan.nextInt();
			if (numeroAdivinar > this.numero) {
				System.out.println("Muy alto");
				jugador2.perderIntentos();
			}else {
				if (numeroAdivinar < this.numero) {
					System.out.println("Muy bajo");
					this.jugador2.perderIntentos();
				}else {
					System.out.println("Has adivinado");
					System.out.println("GANADOR: " + jugador2.getNombre());
					jugador2.victoria();
					System.out.println("VECES GANADAS: " + jugador2.getVecesGanados());
					adivinado = true;
				}
			}
		}
		
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numeroNuevo) {
		this.numero = numeroNuevo;
	}
	
	public Jugador getJugador1() {
		return jugador1;
	}

	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}

	public Jugador getJugador2() {
		return jugador2;
	}

	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}
	
	private boolean validarNumero() {
		boolean numeroIncorrecto = false;
		if (this.numero > 100 || this.numero < 0) {
			numeroIncorrecto = true;
		}
		return numeroIncorrecto;
	}
	
}
