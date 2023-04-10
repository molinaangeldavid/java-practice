package club_futbol;

public class Persona {

	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	private String dni;
	private int edad;
	
	/**
	 * Nombre: Nombre de la persona(String)<br>
	 * Apellido: Apellido de la persona(String)<br>
	 * Domicilio: Domicilio extendido de la clase Domicilio de la persona(Domicilio)<br>
	 * Dni: Dni de la persona<br>
	 * Edad: Edad de la persona<br>
	 */
	public Persona() {
		
	}
	
	public void mostrar_info() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("Edad: " + this.edad);
		System.out.println("Dni: " + this.dni);
		System.out.println("Provincia: " + this.domicilio.getProvincia());
		System.out.println("Barrio: " + this.domicilio.getBarrio());
		System.out.println("Calle: " + this.domicilio.getCalle());
		System.out.println("Altura N: " + this.domicilio.getNumero());
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

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
