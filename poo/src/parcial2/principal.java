package parcial2;

public class principal {

	public static void main(String[] args) {

		Alumno a = new Alumno("Damian","Gutierrez", 1);
		Alumno b = new Alumno("Pablo", "Gonzalez", 2);
		Alumno c = new Alumno("David", "Molina", 3);
		Profesor z = new Profesor("Sulfina", "chais", 0);
		Materia m = new Materia("Matematica");
		
		m.agregarAlumno(a);
		m.agregarAlumno(b);
		m.agregarAlumno(c);
		m.setP(z);
		m.simularExamen();
		m.mostrarInfo();
		z.mostrarInfo();
		System.out.println(a.getNota1());
		System.out.println(a.getNota2());
		System.out.println(z.getCantidadAprobados());
		
	}

}
