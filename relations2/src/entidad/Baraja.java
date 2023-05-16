package entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Baraja {

	private ArrayList<Carta> cartas;
	private ArrayList<Carta> cartasBarajadas;
	
	
	public Baraja() {
		cartas = new ArrayList<Carta>();
		cartasBarajadas = new ArrayList<Carta>();
	}
	
	private void crearBaraja() {
		for(int i = 1 ; i < 13 ; i++) {
			if(i != 8 && i != 9) {
				cartas.add(new Carta(i,"espadas"));
				cartas.add(new Carta(i,"bastos"));
				cartas.add(new Carta(i,"oros"));
				cartas.add(new Carta(i,"copas"));			
			}
		}
	}
	
	public void barajar() {
		this.crearBaraja();
		Random random = new Random();
		Collections.shuffle(this.cartas, random);
		for(int i = 0;i < 6;i++) {
			this.cartasBarajadas.add(this.cartas.get(i));
		}
	}
	
	public void siguienteCarta() {
		if(this.cartasBarajadas.size() == 40) {
			System.out.println("NO hay mas cartas!!!");
		}else {
			System.out.println("La siguiente carta: " + this.cartasBarajadas.get(0).toString());
		}
	}
	
	public void cartasDisponibles() {
		int sizecartas = 40 - this.cartasBarajadas.size();
		System.out.println("Todavia se pueden repartir " + sizecartas + " cartas");
	}
	
	public void darCartas() {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Cuantas cartas desea el jugador: ");
		int cantidadCartas = scan.nextInt();
		if(cantidadCartas > (this.cartasBarajadas.size() + cantidadCartas)) {
			System.out.println("No existe esa cantidad de cartas en la baraja");
		}else {
			System.out.println("se entrega " + cantidadCartas  + " cartas");
			int tamanioCartasBarajadas = this.cartasBarajadas.size(); 
			for(int i = tamanioCartasBarajadas ; i < (tamanioCartasBarajadas + cantidadCartas) ; i++) {
				this.cartasBarajadas.add(this.cartas.get(i));				
			}
		}
	}
	
	public void cartasMonton() {
		if(this.cartasBarajadas.size() == 0) {
			System.out.println("No se ha sacado ninguna carta.");
		}else {
			for (int i = 0; i < this.cartasBarajadas.size(); i++) {
				System.out.println(this.cartasBarajadas.get(i).toString());
			}
		}
	}
	
	public void mostrarBaraja() {
		for(int i = 0 ; i < this.cartas.size();i++) {
			System.out.println(this.cartas.get(i).toString());
		}
	}
	
	
}
