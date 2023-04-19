package main;

import entidad.Curso;
import servicios.CursoService;

public class mainAlumnos {

	public static void main(String[] args) {

		CursoService cs = new CursoService();
		Curso c1 = cs.crearCurso();
		cs.cargarAlumnos(c1);
		cs.calcularGananciaSemanal(c1);
		
		
	}

}
