package service;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

import entidad.Cine;
import entidad.Sala;
import entidad.Pelicula;
import entidad.Espectador;
import entidad.Funcion;
import entidad.Cliente;



public class ServiceCine {

	public Cine crearCine() {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		
		System.out.println("Ingrese el nombre del cine: ");
		String nombre = scan.next();
		
		System.out.println("Ingrese la cantidad de salas que tiene el cine: ");
		int cantidadSalas = scan.nextInt();
		
		ArrayList<Sala> salas = new ArrayList<Sala>();
		
		for (int i = 0 ; i < cantidadSalas ; i++) {
			salas.add(new Sala(i+1));
		}
		
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		
		System.out.println("Hay" + cantidadSalas + ".Debes crear " + cantidadSalas + " peliculas.");
		
		for(int i = 0 ; i < cantidadSalas ; i++) {
			System.out.println("Ingrese el titulo de la pelicula: ");
			String peliculaNombre = scan.next();
			
			System.out.println("Ingrese director de la pelicula: ");
			String peliculaDirectorNombre = scan.next();
			
			System.out.println("Ingrese la duracion de la pelicula en minutos: ");
			int peliculaDuracionMinutos = scan.nextInt();
			
			System.out.println("Ingrese la edad minima de la pelicula: ");
			int peliculaEdadMinima = scan.nextInt();
			
			peliculas.add(new Pelicula(peliculaNombre,peliculaDirectorNombre,peliculaDuracionMinutos,peliculaEdadMinima));	
		}
		
		System.out.println("Ingrese el precio de las funcion: ");
		double precioFuncion = scan.nextDouble();
		
		return new Cine(nombre,salas,peliculas,precioFuncion);
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
	
	public void crearFuncionesAleatoriamente(Cine c1) {
		ArrayList<Funcion> funciones = new ArrayList<Funcion>();
		for(int i = 0 ; i < c1.getSalas().size(); i++) {
			funciones.add(new Funcion(c1.getSalas().get(i).getNumero(),c1.getPeliculas().get(i)));
		}
		c1.setFunciones(funciones);
	}
	
	
	
}
