package restaurantes;

public class Empleado {

	private String nombre;
	private int legajo;
	private double sueldo;
	private int rango;
	
	public Empleado(String nombre, int legajo, int sueldo, int rango) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.sueldo = sueldo;
		this.rango = rango;
		definir_sueldo(rango);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getRango() {
		return rango;
	}

	public void setRango(int rango) {
		this.rango = rango;
	}

	public void mostrar_info() {
		System.out.println("");
		System.out.println("Nombre empleado: " + this.nombre);
		System.out.println("Legajo: " + this.legajo);
		System.out.println("Sueldo: " + this.sueldo);
		System.out.println("Rango: " + this.rango);
		System.out.println("");
		
	}
	
	private void definir_sueldo(int tipo) {
		switch(tipo) {
			case 1:
				this.sueldo = 10000 + (10000 * 10/100);
				break;
			case 2: 
				this.sueldo = 10000 + (10000 * 20/100);
				break;
			case 3:
				this.sueldo = 10000 + (10000 *  30/100);
				break;
			default:
				this.sueldo = 10000 + (10000 * 40/100);
				break;
		}
	}

}
