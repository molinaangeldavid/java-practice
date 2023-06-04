package entidad;

import java.util.Scanner;

public class Televisor extends Electrodomestico{

	private double resolucion;
	private boolean sintonizador =false;
	
	public Televisor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Televisor(double precio, String color, char consumoElectrico, double peso) {
		super(precio, color, consumoElectrico, peso);
		// TODO Auto-generated constructor stub
	}
	public double getResolucion() {
		return resolucion;
	}
	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isSintonizador() {
		return sintonizador;
	}
	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}
	
	public void crearTelevision() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese los datos del televisor");
		super.crearElectrodomestico();
		System.out.println("Ingrese la resolucion de la pantalla: ");
		this.resolucion = scan.nextDouble();
		System.out.println("Tiene sintonizador TDT: <si/no>");
		String opt = scan.next();
		if(opt.equalsIgnoreCase("si")) {
			this.sintonizador = true;
		}
		this.precioFinal();
	}
	
	public void precioFInal() {
		super.precioFinal();
		if(this.resolucion > 40) {
			this.precio += ((super.getPrecio() * 30) / 100);
		}else {
		}
		System.out.println(super.getPrecio());
		if(this.sintonizador==true) {
			this.precio += 500;
		}
	}
	
	@Override
	public String toString() {
		return "Televisor [resolucion=" + resolucion + ", sintonizador=" + sintonizador + ", precio=" + super.precio
				+ ", color=" + color + ", consumoElectrico=" + consumoElectrico + ", peso=" + peso + "]";
	}
	
	
	
	
}
