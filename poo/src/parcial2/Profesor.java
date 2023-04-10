package parcial2;

public class Profesor extends Persona{
	
	private int cantidadAprobados;
	
	public Profesor() {
		cantidadAprobados = 0;
	}
	public Profesor(String nom, String ape,int leg) {
		super(nom,ape,leg);
	}
	
	public void mostrarInfo() {
		System.out.println("Nombre y apellido: " + getNombre() + " " + getApellido());
		System.out.println("Alumnos aprobados: " + getCantidadAprobados());
	}

	public int getCantidadAprobados() {
		return cantidadAprobados;
	}

	public void setCantidadAprobados(int cantidadAprobados) {
		this.cantidadAprobados = cantidadAprobados;
	}

}
