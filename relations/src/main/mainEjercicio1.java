package main;

import entidad.Persona;
import entidad.Perro;

public class mainEjercicio1 {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("juan", "Perez","88273495");
		Persona persona2 = new Persona("Michael", "Gonzalez","88291111");
		
		Perro perro1 = new Perro("Pichi","labrador",6,"mediano");
		Perro perro2 = new Perro("Juji","caniche",10,"chico");
		
		persona1.agregarPerro(perro1);
		persona2.agregarPerro(perro2);
		persona1.mostrarInfo();
		System.out.println();
		persona2.mostrarInfo();
		
		
	}

}
