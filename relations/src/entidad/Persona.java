package entidad;

public class Persona {

	private String nombre;
	private String apellido;
	private String documento;
	private Perro perro;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String apellido, String documento, Perro perro) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.perro = perro;
	}

	public Persona(String nombre, String apellido, String documento) {
		super();
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
	
	public void agregarPerro(Perro p) {
		setPerro(p);
	}
	
	public void mostrarInfo() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("Documento: " + this.documento);
		System.out.println("Nombre del perro: " + perro.getNombre());
		System.out.println("Raza del perro: " + perro.getRaza());
		System.out.println("Edad del perro: " + perro.getEdad());
		System.out.println("Tamanio del perro: " + perro.getTamanio());
		
	}
	
	
	
}
