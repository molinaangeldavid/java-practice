package classes;

public class Alumno {

	private String nombre;
	private String apellido;
	private int legajo;
	private int nota_parcial1;
	private int nota_parcial2;
	private int energia;
	
	public Alumno(String nombr, String apell, int lega) {
		nombre = nombr;
		apellido = apell;
		legajo = lega;
		energia = 100;
	}
	
	public void rendirParcial(int parcial,int nota) {
		if (parcial == 1) {
			nota_parcial1 = nota;
 		}else {
 			nota_parcial2 = nota;
 		}
	}
	
	public void mostrarNota() {
		System.out.println("Nota primer parcial: " + nota_parcial1 );
		System.out.println("Nota segundo parcial: " + nota_parcial2 );
	}

	public void getEnergia() {
		if (energia > 99) {
			System.out.println("El alumno tiene 100 de energia");
		}else {
			if (energia > 0) {
				System.out.println("El alumno tiene " + energia + " de energia");
			}else {
				energia = 0;
				System.out.println("Se suspenden las clases");
			}
		}
	}
	
	public void preguntarAProfe() {
		energia -= 10;
		getEnergia();
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

	public int getNota_parcial1() {
		return nota_parcial1;
	}

	public void setNota_parcial1(int nota_parcial1) {
		this.nota_parcial1 = nota_parcial1;
	}

	public int getNota_parcial2() {
		return nota_parcial2;
	}

	public void setNota_parcial2(int nota_parcial2) {
		this.nota_parcial2 = nota_parcial2;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public void recreo() {
		energia += 15;
		getEnergia();
	}
	
	
	
	
	
}
