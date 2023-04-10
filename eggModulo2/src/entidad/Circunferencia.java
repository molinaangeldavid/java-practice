package entidad;

public class Circunferencia {
	double radio;

	public Circunferencia(double radio) {
		this.radio = radio;
	}
	
	public Circunferencia() {
		
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public void crearCircunferencia(double radio) {
		this.radio = radio;
	}
	
	public double area() {
		return (Math.PI * (this.radio * this.radio));
	}
	public double perimetro() {
		return (2 * Math.PI * this.radio);
	}
	
}
