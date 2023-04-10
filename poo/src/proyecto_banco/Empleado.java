package proyecto_banco;

public class Empleado{

	private String nombre;
	private String apellido;
	private int edad;
	private String dni;
	private String legajo;
	private String puesto;
	private int experiencia;
	private int sueldo;
	
	public Empleado() {
		
	}
	public Empleado(String nombre,String apellido,int edad,int dni,int legajo,String puesto,int experiencia,int sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = validar_edad(edad);
		this.dni = validar_dni(dni);
		this.legajo = validar_legajo(legajo);
		this.puesto = puesto;
		this.experiencia = validar_experiencia(experiencia);
		this.sueldo = validar_sueldo(sueldo);
	}
	public void mostrar_informacion() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("Edad: " + this.edad);
		System.out.println("Dni: " + this.dni);
		System.out.println("Legajo: " + this.legajo);
		System.out.println("Puesto: " + this.puesto);
		System.out.println("Anios de experiencia: " + this.experiencia);
		System.out.println("Sueldo: " + this.sueldo);
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = validar_edad(edad);
	}
	public String getDni() {
		return this.dni;
	}
	public void setDni(int dni){
		this.dni = validar_dni(dni);
	}
	public String getLegajo() {
		return this.legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = validar_legajo(legajo);
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = validar_experiencia(experiencia);
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = validar_sueldo(sueldo);
	}
	private int validar_edad(int edad) {
		if (edad < 0) {
			edad = -1;
		}
		return edad;
	}
	private String validar_dni(int dni) {
		String numero_dni = Integer.toString(dni);
		if (numero_dni.length() != 8) {
			numero_dni = "";
		}
		return numero_dni;
	}
	private String validar_legajo(int legajo) {
		String lgj = Integer.toString(legajo);
		if (lgj.length() < 6 && lgj.length() > 8) {
			lgj = "";
		}
		return lgj;
	}
	private int validar_experiencia(int exp) {
		if (exp < 0) {
			exp = 0;
		}
		return exp;
	}
	private int validar_sueldo(int sueldo) {
		if (sueldo < 0){
			sueldo = 0;
		}
		return sueldo;
	}

}
