package classes;

public class Profesor {

	private String nombre;
	private String apellido;
	private int legajo;
	private String cargo;
	private int energia;
	
	public Profesor(String nombre,String apellido,int legajo, String cargo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.cargo = cargo;
		this.energia = 100;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void getEnergia() {
		if (energia > 99) {
			System.out.println("El profesor tiene " + energia + " de energia");
		}else {
			if (energia > 0) {
				System.out.println("EL profesor tiene " + energia);
			}else {
				System.out.println("Se suspenden las clases");
			}
		}
	}
	
	public void contestarPregunta() {
		energia-= 5;
		getEnergia();
	}
	
	public void contestarTema() {
		energia -= 15;
		getEnergia();
	}
	
	public void tomarCafe() {
		energia += 35;
		getEnergia();
	}

	public void recreo() {
		energia += 20;
		getEnergia();

	}
}
