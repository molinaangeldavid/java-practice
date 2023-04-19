package entidad;

public class Curso {
	private String nombreCurso;
	private int cantidadHorasPorDia;
	private int cantidadDiasPorSemana;
	private String turno;
	private float precioHora;
	private String[] alumnos;
	
	public Curso() {
		
	}
	
	public Curso(String nombre, int cantHoras, int cantDias, String turno, float precioHora, String[] alumnos) {
		this.nombreCurso = nombre;
		this.cantidadHorasPorDia = cantHoras;
		this.cantidadDiasPorSemana = cantDias;
		this.turno = turno;
		this.precioHora = precioHora;
		this.alumnos = alumnos;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getCantidadHorasPorDia() {
		return cantidadHorasPorDia;
	}

	public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
		this.cantidadHorasPorDia = cantidadHorasPorDia;
	}

	public int getCantidadDiasPorSemana() {
		return cantidadDiasPorSemana;
	}

	public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
		this.cantidadDiasPorSemana = cantidadDiasPorSemana;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public float getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
	}

	public String[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(String[] alumnos) {
		this.alumnos = alumnos;
	}
	
	
	
}

