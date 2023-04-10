package parcial2;

import java.util.*;
public class Materia {

	private Profesor p;
	private ArrayList<Alumno> alumnos;
	private String nombre;
	
	public Materia() {
		alumnos = new ArrayList<Alumno>();
		p = new Profesor();
	}
	
	public Materia(String nombre) {
		alumnos = new ArrayList<Alumno>();
		p = new Profesor();
		this.nombre = nombre;
	}
	
	public void agregarAlumno(Alumno a) {
		boolean encontrado = false;
		for (int i = 0 ; i < alumnos.size() && !encontrado ; i++) {
			if (a.getLegajo() == alumnos.get(i).getLegajo()) {
				System.out.println("Alumno encontrado");
				encontrado = true;
			}
		}
		alumnos.add(a);
	}
	
	public void simularExamen() {
		for (int i = 0 ; i < alumnos.size(); i++) {
			alumnos.get(i).rendirExamen();
			if ((alumnos.get(i).getNota1() + alumnos.get(i).getNota2()) > 6) {
				p.setCantidadAprobados(p.getCantidadAprobados()+1);                                                                                                                                                                                                           
			}
		}
	}
	
	public void mostrarInfo() {
		System.out.println("Materia: " + this.nombre + " - Profesor: " + p.getNombre() + " " + p.getApellido());
		System.out.println("Alumnos aprobados: " + p.getCantidadAprobados());
	}

	public Profesor getP() {
		return p;
	}

	public void setP(Profesor p) {
		this.p = p;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
