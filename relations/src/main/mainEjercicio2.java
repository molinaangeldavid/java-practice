package main;

import entidad.Juego;
import entidad.Jugador;
import entidad.RevolverAgua;
import java.util.ArrayList;
import java.util.Scanner;

public class mainEjercicio2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		RevolverAgua revolver = new RevolverAgua();
		Juego juego = new Juego();
		for(int i = 0 ; i < 6; i++) {
			System.out.println("Ingrese el nombre del jugador: ");
			jugadores.add(new Jugador((i+1),scan.next()));
		}		
		juego.llenarJuego(jugadores, revolver);
		juego.ronda(revolver);
	}

}
