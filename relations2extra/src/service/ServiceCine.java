package service;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

import entidad.Cine;
import entidad.Sala;
import entidad.Pelicula;
import entidad.Cliente;
import entidad.Asiento;



public class ServiceCine {

	public Cine crearCine() {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		
		System.out.println("Ingrese el nombre del cine: ");
		String nombre = scan.next();
				
		Sala sala = new Sala(1);
		
		System.out.println("Ingrese el titulo de la pelicula: ");
		String peliculaNombre = scan.next();

		System.out.println("Ingrese director de la pelicula: ");
		String peliculaDirectorNombre = scan.next();

		System.out.println("Ingrese la duracion de la pelicula en minutos: ");
		int peliculaDuracionMinutos = scan.nextInt();

		System.out.println("Ingrese la edad minima de la pelicula: ");
		int peliculaEdadMinima = scan.nextInt();

		Pelicula pelicula = new Pelicula(peliculaNombre,peliculaDirectorNombre,peliculaDuracionMinutos,peliculaEdadMinima);	

		
		System.out.println("Ingrese el precio de las funcion: ");
		double precioFuncion = scan.nextDouble();
		
		return new Cine(nombre,sala,pelicula,precioFuncion);
	}
	
	public ArrayList<Cliente> crearClientes(){
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		
		
		System.out.println("Ingrese la cantidad de clientes del cine: ");
		int cantidadClientes = scan.nextInt();
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		for(int i = 0 ; i < cantidadClientes ; i++) {
			System.out.println("Ingrese el nombre del cliente: ");
			String nombreCliente = scan.next();
			System.out.println("Ingrese la edad del cliente: ");
			int edadCliente = scan.nextInt();
			System.out.println("Ingrese el dinero que tiene el cliente: ");
			double dineroCliente  = scan.nextDouble();
			clientes.add(new Cliente(nombreCliente,edadCliente,dineroCliente));
		}
		return clientes;
	}
		
	public void crearEspectadoresAleatoriamente(Cine c1, ArrayList<Cliente> clientes) {
		Random random = new Random();
		int asientofila;
		int asientocol;
		Asiento asiento;
		for(Cliente cliente: clientes) {
			if(cliente.getDinero() > c1.getPrecio()) {
				if(cliente.getEdad() > c1.getPeliculas().getEdadMinima()) {
					do {
						asientofila = random.nextInt(c1.getSala().getAsientos().length);
						asientocol = random.nextInt(c1.getSala().getAsientos()[0].length);
						asiento = c1.getSala().getAsientos()[asientofila][asientocol];
					} while (asiento.getDisponible());					
					asiento.setDisponible(true);
					System.out.println("El cliente " + cliente.getNombre() +" puede ver la pelicula.");
				}else {
					System.out.println("El cliente "+cliente.getNombre()+" tiene edad menor a la edadMinima");
				}
			}else{
				System.out.println("El cliente " + cliente.getNombre() +" no tiene dinero suficiente.");
			}
			
		}
		
	}
	
	
	
	
	
	
}
