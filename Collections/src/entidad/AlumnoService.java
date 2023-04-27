package entidad;

import java.util.*;

public class AlumnoService {

	public ArrayList<Alumno> crearAlumnos() {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		String nombre;
		int nota;
		String continuar;
		do {
			System.out.println("Ingrese el nombre del alumno: ");
			nombre = scan.next().toLowerCase();
			ArrayList<Integer> notas = new ArrayList<Integer>();
			for (int i = 0 ; i < 3 ; i++) {
				System.out.println("Ingrese la nota" + (i+1) + ": ");
				notas.add(scan.nextInt());
			}
			alumnos.add(new Alumno(nombre,notas));
			System.out.println("Desea agregar mas alumnos: ");
			continuar = scan.next();
		} while (continuar.equals("si"));
		
		return alumnos;
	}
	
	public double notaFinal(ArrayList<Alumno> alumnos) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese nombre del alumno: ");
		String nombre = scan.next();
		double promedio = 0;
		for (int i  = 0 ; i < alumnos.size() ; i++) {
			if (nombre.toLowerCase().equals(alumnos.get(i).getNombre())) {
				for (int j = 0; j < 3 ; j++) {
					promedio += alumnos.get(i).getNotas().get(j);
				}
			}
		}
		return promedio/3; 
				
	}
	
}
