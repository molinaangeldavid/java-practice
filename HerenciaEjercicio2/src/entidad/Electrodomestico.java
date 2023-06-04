package entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Electrodomestico {
	protected double precio = 1000;
	protected String color;
	protected char consumoElectrico;
	protected double peso;
	
	public Electrodomestico() {
	}

	public Electrodomestico(double precio, String color, char consumoElectrico, double peso) {
		this.precio += precio;
		this.color = color;
		this.consumoElectrico = consumoElectrico;
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoElectrico() {
		return consumoElectrico;
	}

	public void setConsumoElectrico(char consumoElectrico) {
		this.consumoElectrico = consumoElectrico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	private char comprobarConsumoElectrico(char letra) {
		
		ArrayList<Character> letras = new ArrayList<Character>();
		letras.add('A');
		letras.add('B');
		letras.add('C');
		letras.add('D');
		letras.add('E');
		letras.add('F');
		
		for(char let: letras) {
			if(letra == let) {
				return let;
			}
		}
		return 'F';
	}
	
	private String comprobarColor(String color) {
		ArrayList<String> colores = new ArrayList<String>();
		colores.add("blanco");
		colores.add("rojo");
		colores.add("negro");
		colores.add("azul");
		colores.add("gris");
		
		if(colores.contains(color)) {
			return color;
		}
		return "blanco";
	}
	
	public void crearElectrodomestico() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el precio");
		double precio = scan.nextDouble();
		this.precio += precio;
		System.out.println("Ingrese el color");
		String[] colores = {"Blanco","Rojo","Negro","Azul","Gris"};
		for(int i = 0 ; i < colores.length ; i++) {
			System.out.println((i+1) + ". " + colores[i]);
		}
		this.color = comprobarColor(scan.next()).toLowerCase();
		
		System.out.println("Ingrese el consumo electrico <A,B,C,D,E,F>: ");
		this.consumoElectrico = comprobarConsumoElectrico(scan.next().toUpperCase().charAt(0));
		System.out.println("Ingrese el peso del electrodomestico: ");
		this.peso = scan.nextDouble();
	}
	
	public void precioFinal() {
		
		switch(this.consumoElectrico) {
			case 'A':
				this.precio += 1000;
				break;
			case 'B':
				this.precio += 800;
				break;
			case 'C':
				this.precio += 600;
				break;
			case 'D':
				this.precio += 500;
				break;
			case 'E':
				this.precio += 300;
				break;
			case 'F':
				this.precio += 100;
				break;
		}
		
		if(this.peso >= 1 && this.peso <20) {
			this.precio += 100;
		}else if(this.peso >= 20 && this.peso < 50) {
			this.precio += 500;
		}else if(this.peso >= 50 && this.peso <= 80) {
			this.precio += 800;
		}else {
			if(this.peso >= 80) {
				this.precio += 1000;
			}
		}
		
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio=" + this.precio + ", color=" + color + ", consumoElectrico=" + consumoElectrico
				+ ", peso=" + peso + "]";
	}
	
	
	
}
