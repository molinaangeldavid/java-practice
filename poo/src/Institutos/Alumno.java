package Institutos;

public class Alumno {

	private String nombre;
	private String apellido;
	private int legajo;
	private int nota1;
	private int nota2;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	public void mostrar_info() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Apellido: " + getApellido());
		System.out.println("Legajo: " + getLegajo());
		System.out.println("Nota 1: " + getNota1());
		System.out.println("Nota 2: " + getNota2());
	}
	
	public void rendir_primer_parcial(int nota) {
		this.nota1 = nota;
	}
	public void rendir_segundo_parcial(int nota) {
		this.nota2 = nota;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

}
