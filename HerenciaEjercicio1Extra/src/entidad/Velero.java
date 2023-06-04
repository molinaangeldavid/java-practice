package entidad;

public class Velero extends Barco{

	private int cantidadMastiles;

	public Velero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Velero(String matricula, double eslora, String anioPublicacion,int cantMastiles) {
		super(matricula, eslora, anioPublicacion);
		this.cantidadMastiles = cantMastiles;
	}

	
	
	public int getCantidadMastiles() {
		return cantidadMastiles;
	}

	public void setCantidadMastiles(int cantidadMastiles) {
		this.cantidadMastiles = cantidadMastiles;
	}
	
	
	
}
