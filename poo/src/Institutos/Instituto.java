package Institutos;

import java.util.*;

public class Instituto {

	private String nombre;
	private String ubicacion;
	private ArrayList<Alumno> alumnos;
	
	public Instituto() {
		alumnos = new ArrayList<Alumno>();
	}
	public void mostrar_info() {
		System.out.println("Nombre instituto: " + this.nombre);
		System.out.println("Ubicacion instituto: " + this.ubicacion);
		for (int i = 0 ; i < alumnos.size() ; i++) {
			System.out.println(alumnos.get(i).getNombre());
		}
	}
	
	public void mostrar_alumnos_aprobados() {
		
		int cantidad_aprobados = 0;
		System.out.println("Alumnos Aprobados: ");
		for (int i = 0 ; i < alumnos.size() ; i++) {
			if ((alumnos.get(i).getNota1() + alumnos.get(i).getNota2()) / 2 > 6) {
				System.out.println(alumnos.get(i).getNombre() + " " + alumnos.get(i).getApellido()  + " (" + alumnos.get(i).getLegajo() + ")");
				cantidad_aprobados++;
			}
		}
		System.out.println("Aprobados " + cantidad_aprobados + " alumnos");
	}
	
	public void mostrar_alumnos_reprobados() {
		
		int cantidad_desaprobados = 0;
		for (int i = 0 ; i < alumnos.size() ; i++) {
			if ((alumnos.get(i).getNota1() + alumnos.get(i).getNota2()) / 2 < 7) {
				System.out.println(alumnos.get(i).getNombre() + " " + alumnos.get(i).getApellido()  + " (" + alumnos.get(i).getLegajo() + ")");
				cantidad_desaprobados++;
			}
		}
		System.out.println("Desaprobados " + cantidad_desaprobados + " desaprobados");
	}
	
	public double promedio_notas() {
		double notas = 0;
		for (int i = 0 ; i < alumnos.size() ; i++) {
			notas += ((alumnos.get(i).getNota1() + alumnos.get(i).getNota2()) / 2);
		}
		notas /= alumnos.size();
		return notas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	

}
