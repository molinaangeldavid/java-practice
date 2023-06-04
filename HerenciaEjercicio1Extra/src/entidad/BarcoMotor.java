package entidad;

public class BarcoMotor extends Barco{

	private double potenciacv;

	public BarcoMotor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BarcoMotor(String matricula, double eslora, String anioPublicacion,double potenciacv) {
		super(matricula, eslora, anioPublicacion);
		this.potenciacv = potenciacv;
	}

	public double getPotenciacv() {
		return potenciacv;
	}

	public void setPotenciacv(double potenciacv) {
		this.potenciacv = potenciacv;
	}
	
	
	
}
