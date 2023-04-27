package practicaIntegrador2;

import java.util.Scanner;
import practicaIntegrador2.*;
import java.util.ArrayList;

public class mainEstudiante {

	public static void main(String[] args) {

		Estudiante estudiantes[] = new Estudiante[8];
		ArrayList<String> alumnosAprobados;
		Scanner scan = new Scanner(System.in);
		String nombre;
		int nota;
		int notaTotal = 0;
		float promedio;
		for(int i = 0; i < estudiantes.length ; i++){
			System.out.println("Ingrese nombre del alumno: ");
			nombre = scan.next();
			System.out.println("Ingrese nota del alumno: ");
			nota = scan.nextInt();
			estudiantes[i] = new Estudiante(nombre,nota); 
		}
		promedio = (float) (notaTotal / estudiantes.length);
		System.out.println("Promedio del curso es" + promedio);
		alumnosAprobados = alumnosAprobados(estudiantes,promedio);
		mostrarAprobados(alumnosAprobados);
	}
	
	public static ArrayList<String> alumnosAprobados(Estudiante[] estudiantes,float promedio) {
		
		ArrayList <String> nombresAprobados = new ArrayList<String>();
		for (int i = 0 ; i < estudiantes.length ; i++) {
			if (estudiantes[i].getNota() > promedio) {
				nombresAprobados.add(estudiantes[i].getNombre());
			}
		}
		return nombresAprobados;
		
	}
	
	public static void mostrarAprobados(ArrayList<String> estudiantesAprobados) {
		System.out.println("Nombres de estudiantes con mayor al promedio: ");
		for (int i = 0 ; i < estudiantesAprobados.size() ; i++) {
			System.out.println(estudiantesAprobados.get(i));
		}
	}

}
