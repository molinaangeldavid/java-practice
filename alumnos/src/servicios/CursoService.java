package servicios;

import entidad.Curso;
import java.util.*;

public class CursoService {
	
	public Curso crearCurso() {
		String alumnos[] = new String[5];
		Scanner scan = new Scanner(System.in).useDelimiter("\n"); 
		System.out.println("Ingrese nombre de curso: ");
		String nombre = scan.next();
		System.out.println("Ingrese la cantidad de horas por dia: ");
		int cantidadHoras = scan.nextInt();
		System.out.println("Ingrese la cantidad de dias por semana: ");
		int cantidadDias = scan.nextInt();
		System.out.println("Ingrese el turno: <mañana/tarde>");
		String turno = scan.next();
		System.out.println("Ingrese el precio por hora: ");
		float precioHora = scan.nextFloat();
		return new Curso(nombre,cantidadHoras,cantidadDias,turno,precioHora,alumnos);
	}
	
	public void cargarAlumnos(Curso c) {
		Scanner scan = new Scanner(System.in);
		String arr[] = new String[5]; 
		for(int i = 0 ; i< c.getAlumnos().length;i++) {
			System.out.println("Ingrese nombre del alumno " + (i + 1));
			arr[i] = scan.next();
		}
		c.setAlumnos(arr);
	}
	
	public void calcularGananciaSemanal(Curso c) {
		float ganancia = c.getCantidadHorasPorDia() * c.getPrecioHora() * c.getAlumnos().length * c.getCantidadDiasPorSemana();
		System.out.println("La ganancia semanal es de: " + ganancia);
	}
	
}
