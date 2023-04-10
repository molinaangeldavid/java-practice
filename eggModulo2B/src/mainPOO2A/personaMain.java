package mainPOO2A;

import java.util.ArrayList;

import entidad.Persona;

public class personaMain {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		ArrayList<Integer>imc = new ArrayList<Integer>();
		ArrayList<Boolean>edad = new ArrayList<Boolean>();
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		Persona p4 = new Persona();
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		for (int i = 0; i < personas.size() ; i++) {
			personas.get(i).crearPersona();
			imc.add(personas.get(i).calcularIMC());
			edad.add(personas.get(i).esMayorDeEdad());
		}
		
		int sobrepeso=0,normal=0,delgado=0,menor=0,mayor=0;
		for (int i = 0; i < imc.size() ; i++) {
			if (imc.get(i) == -1) {
				delgado++;
			}else {
				if (imc.get(i) == 0) {
					normal++;
				}else{
					sobrepeso++;
				}
			}
			if(edad.get(i) == true) {
				mayor++;
			}else{
				menor++;
			}
		}
		System.out.println("Personas con el peso debajo de su ideal: " + delgado);
		System.out.println("Personas con el peso ideal: " + normal);
		System.out.println("Personas con el peso superior de su ideal: " + sobrepeso);
		System.out.println("Personas mayor de edad: " + mayor);
		System.out.println("Personas menores de edad: " + menor);
	}

}
