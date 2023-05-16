package main;

import entidad.Persona;
import entidad.Perro;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class mainEjercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		ArrayList<Persona> personas = new ArrayList<Persona>();
		ArrayList<Perro> perros = new ArrayList<Perro>();
		HashMap<Perro,Persona> perrosConFamilia = new HashMap<Perro,Persona>();
		
		
		System.out.println("Ingrese la cantidad de personas que desea agregar: ");
		int cantidadPersonas = scan.nextInt();
		for(int i = 0 ; i < cantidadPersonas ; i++) {
			System.out.println("Ingrese el nombre de la persona " + (i+1) + ": ");
			String nombrePersona = scan.next();
			System.out.println("Ingrese el apellido de la persona: ");
			String apellidoPersona = scan.next();
			System.out.println("Ingrese el dni de la persona: ");
			String dniPersona = scan.next();
			personas.add(new Persona(nombrePersona,apellidoPersona,dniPersona));
		}
		
		System.out.println("Ingrese la cantidad de perros que desea agregar: ");
		int cantidadPerros = scan.nextInt();
		for(int i = 0 ; i < cantidadPerros ; i++) {
			System.out.println("Ingrese el nombre del perrito " + (i+1)+": ");
			String nombrePerro = scan.next();
			System.out.println("Ingrese la raza del perrito: ");
			String razaPerro = scan.next();
			System.out.println("Ingrese la edad del perrito: ");
			int edadPerro = scan.nextInt();
			System.out.println("Ingrese el tamanio del perrito: ");
			String tamanioPerro = scan.next();
			perros.add(new Perro(nombrePerro,razaPerro,edadPerro,tamanioPerro));
		}
		String adopta;
		String quiereAdoptar;
		for(Persona persona: personas) {
			System.out.println(persona.getNombre() + " desea adoptar un perro. <si/no>");
			quiereAdoptar = scan.next();
			if(quiereAdoptar.equals("si")) {
				boolean perroAdoptado;
				for(Perro perro: perros) {
					perroAdoptado = false;
					System.out.println(perro.toString());
					System.out.println("Desea adoptar a este perro? <si/no>");
					adopta = scan.next();
					if(adopta.equals("si")) {
						if(perrosConFamilia.size() == 0) {
							System.out.println("Has adoptado a " + perro.getNombre());
							perrosConFamilia.put(perro, persona);
							perroAdoptado =true;
							break;
						}else {
							for(Map.Entry<Perro, Persona> entry: perrosConFamilia.entrySet()) {
								if(perro.getNombre().equals(entry.getKey().getNombre())) {
									System.out.println("El perrito ya tiene familia");
									break;
								}else {
									System.out.println("Has adoptado a " + perro.getNombre());
									perrosConFamilia.put(perro, persona);
									perroAdoptado = true;
									break;
								}
							}							
						}
					}else {
						continue;
					}
					if(perroAdoptado) {
						break;
					}
				}
			}else {
				continue;
			}
			
		}
		
		for(Map.Entry<Perro, Persona> entry:  perrosConFamilia.entrySet()) {
			System.out.println("El perro " + entry.getKey().getNombre() + " esta en una familia con " + entry.getValue().getNombre());
		}
		
		
		
	}

}
