package entidad;

public class Barco {
	protected String matricula;
	protected double eslora;
	protected String anioPublicacion;
	
	public Barco() {
		
	}

	public Barco(String matricula, double eslora, String anioPublicacion) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.anioPublicacion = anioPublicacion;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getEslora() {
		return eslora;
	}

	public void setEslora(double eslora) {
		this.eslora = eslora;
	}

	public String getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(String anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	
	
}
