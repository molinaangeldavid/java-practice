package proyecto_banco;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private String dni;
	
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad_correcta(edad);
	}
	public String getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni_correcto(dni);
	}
	public Persona() {
		
	}
	public Persona(String nombre, String apellido, int edad, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad_correcta(edad);
		this.dni = dni_correcto(dni);
	}
	
	public String mostrar_informacion() {
		StringBuilder info = new StringBuilder();
		
		info.append("Nombre: " + this.nombre + "\n");
		info.append("Apellido: " + this.apellido + "\n");
		info.append("Edad: " + this.edad + "\n");
		info.append("DNI: " + this.dni + "\n");
		return info.toString();
	}
	private int edad_correcta(int edad) {
		if (edad < 0) {
			edad = 0;
		}
		return edad;
	}
	private String dni_correcto(int dni) {
		String numero_dni = Integer.toString(dni);
		if (numero_dni.length() != 8) {
			numero_dni = "";
		}
		return numero_dni;
	}
	
}
