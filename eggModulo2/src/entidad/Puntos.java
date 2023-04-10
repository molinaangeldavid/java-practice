package entidad;

public class Puntos {

	private int x1,y1,x2,y2;
	
	public Puntos() {
		
	}
	
	public Puntos(int x1,int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public double calcularDistancia() {
		return Math.sqrt(Math.pow(this.x2 - this.x1,2) + Math.pow(this.y2 - this.y1,2));
	}
	
	public String toString() {
		
		return "Punto 1: (" + this.x1 + "," + this.y1 + ")\nPunto 2: (" + this.x2 + "," + this.y2 + ")";
		
	}
}
