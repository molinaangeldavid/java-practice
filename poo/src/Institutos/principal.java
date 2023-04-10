package Institutos;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Instituto instituto = new Instituto();
		for (int i = 0 ; i < 5 ; i ++) {
			instituto.getAlumnos().add(new Alumno());
		}
		for (int i = 0 ; i < instituto.getAlumnos().size() ; i++) {
			System.out.println("Ingrese nombre del estudiante "  + (i + 1));
			instituto.getAlumnos().get(i).setNombre(scan.next());
			System.out.println("Ingrese apellido del estudiante "  + (i + 1));
			instituto.getAlumnos().get(i).setApellido(scan.next());
			System.out.println("Ingrese legajo del estudiante "  + (i + 1));
			instituto.getAlumnos().get(i).setLegajo(scan.nextInt());
			System.out.println("Ingrese la primer nota del estudiante "  + (i + 1));
			instituto.getAlumnos().get(i).rendir_primer_parcial(validar_nota());
			System.out.println("Ingrese la segunda nota del estudiante "  + (i + 1));
			instituto.getAlumnos().get(i).rendir_segundo_parcial(validar_nota());
		}
		
		instituto.mostrar_alumnos_aprobados();
		System.out.println();
		instituto.mostrar_alumnos_reprobados();
		System.out.println();
		instituto.promedio_notas();
		
	}
	
	static int validar_nota() {
		Scanner scan = new Scanner(System.in);
		int nota = scan.nextInt();
		while (nota < 1 || nota > 10) {
			System.out.println("Nota invalida!");
			nota = scan.nextInt();
		}
		return nota;
	}

}
