package electro;
import classes.Alumno;
import classes.Aula;
import classes.Profesor;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingrese nombre de Alumno: ");
		String alumno1 = scan.next();
		System.out.print("Ingrese apellido de alumno: ");
		String alumnoApellido = scan.next();
		System.out.println("Ingrese legajo del alumno");
		int legajo = scan.nextInt();
		
		System.out.print("Ingrese nombre del profesor: ");
		String profe1 = scan.next();
		System.out.print("Ingrese apellido del profesor: ");
		String profeApellido = scan.next();
		System.out.println("Ingrese legajo del profesor");
		int legajoprofe = scan.nextInt();
		System.out.println("Ingrese cargo del profesor");
		String cargoProfesor = scan.next();
		
		System.out.println("Ingrese numero de aula: ");
		int aulaNumero = scan.nextInt();
		
		Alumno alu1 = new Alumno(alumno1,alumnoApellido,legajo);
		Profesor profe = new Profesor(profe1,profeApellido,legajoprofe,cargoProfesor);
		
		
		
		Aula aula = new Aula(aulaNumero);
		aula.setProfesor(profe);
		aula.setAlumno(alu1);

		System.out.println("El aula tiene 1 profesor: " + aula.getProfesor().getNombre() + " " + aula.getProfesor().getApellido() + " con el cargo de " + aula.getProfesor().getCargo());
		System.out.println("El aula tiene 1 alumno: " + aula.getAlumno().getNombre() + " " + aula.getAlumno().getApellido());
		System.out.println("El aula tiene numero: " + aula.getAulaNumero());
		
		
	}

}
