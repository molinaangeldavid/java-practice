package parcial2;

public class Persona {

	private String nombre;
	private String apellido;
	private int legajo;
	
	public Persona() {
		
	}
	
	public Persona(String n, String a, int l) {
		this.nombre = n;
		this.apellido = a;
		this.legajo = l;
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
	
	

}
