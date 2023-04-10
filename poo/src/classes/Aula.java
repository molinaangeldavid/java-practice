package classes;

public class Aula {

	private int aulaNumero;
	private Alumno alumno;
	private Profesor profesor;
	
	public Aula(int numero) {
		this.aulaNumero = numero;
	}

	public int getAulaNumero() {
		return aulaNumero;
	}

	public void setAulaNumero(int aulaNumero) {
		this.aulaNumero = aulaNumero;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	
}
