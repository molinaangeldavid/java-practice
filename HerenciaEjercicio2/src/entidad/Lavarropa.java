package entidad;

import java.util.Scanner;

public class Lavarropa extends Electrodomestico{

	private double carga;

	public Lavarropa() {
		super();
	}

	public Lavarropa(double precio, String color, char consumoElectrico, double peso, double carga) {
		super(precio, color, consumoElectrico, peso);
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	public void crearLavarropa() {
		System.out.println("Ingrese los datos de la lavarropa");
		Scanner scan = new Scanner(System.in);
		super.crearElectrodomestico();
		System.out.println("Ingrese la carga en kg: ");
		this.carga = scan.nextDouble();
	}
	
	
	public void precioFinal() {
		super.precioFinal();
		if(this.carga > 30 ) {
//			super.precio += 500;
			super.setPrecio(super.getPrecio() + 500); 
		}
	}
	
	@Override
	public String toString() {
		return "Lavarropa [carga=" + carga + ", precio=" + this.precio + ", color=" + color + ", consumoElectrico="
				+ consumoElectrico + ", peso=" + peso + "]";
	}
	
	
	
	
}
