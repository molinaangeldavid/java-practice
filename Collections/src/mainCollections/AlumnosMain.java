package mainCollections;

import entidad.AlumnoService;
import java.util.ArrayList;
import entidad.Alumno;


public class AlumnosMain {

	public static void main(String[] args) {
		
		AlumnoService as = new AlumnoService();
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		alumnos = as.crearAlumnos();
		System.out.println(as.notaFinal(alumnos));
	}

}
