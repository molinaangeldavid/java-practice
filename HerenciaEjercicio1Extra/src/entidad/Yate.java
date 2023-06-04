package entidad;

public class Yate extends Barco{

	private double potenciacv;
	private int cantidadCamarotes;
	
	public Yate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Yate(String matricula, double eslora, String anioPublicacion,double potenciacv, int cantCamarotes) {
		super(matricula, eslora, anioPublicacion);
		this.potenciacv = potenciacv;
		this.cantidadCamarotes = cantCamarotes;
	}
	public double getPotenciacv() {
		return potenciacv;
	}
	public void setPotenciacv(double potenciacv) {
		this.potenciacv = potenciacv;
	}
	public int getCantidadCamarotes() {
		return cantidadCamarotes;
	}
	public void setCantidadCamarotes(int cantidadCamarotes) {
		this.cantidadCamarotes = cantidadCamarotes;
	}
	
	
	
}
