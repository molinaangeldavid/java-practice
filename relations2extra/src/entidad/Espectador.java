package entidad;

public class Espectador {

	private String nombre;
	private int edad;
	private Asiento asientoEspectador;
	
	public Espectador() {
		
	}

	public Espectador(String nombre, int edad, Asiento asientoEspectador) {
		this.nombre = nombre;
		this.edad = edad;
		this.asientoEspectador = asientoEspectador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Asiento getAsientoEspectador() {
		return asientoEspectador;
	}

	public void setAsientoEspectador(Asiento asientoEspectador) {
		this.asientoEspectador = asientoEspectador;
	}

	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", asientoEspectador=" + asientoEspectador + "]";
	}

	
	
	
}
