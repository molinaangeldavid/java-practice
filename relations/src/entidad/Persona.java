package entidad;

public class Persona {

	private String nombre;
	private String apellido;
	private String documento;
	private Perro perro;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String apellido, String documento, Perro perro) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.perro = perro;
	}

	public Persona(String nombre, String apellido, String documento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
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

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Perro getPerro() {
		return perro;
	}

	public void setPerro(Perro perro) {
		this.perro = perro;
	}
	
	public void adoptarPerro(Perro p) {
		setPerro(p);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + "]";
	}
	
	
	
	
	
}
