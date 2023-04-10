package classes;

public class Electrodomestico {

	private int precioBase;
	private String nombre;
	private String color;
	private char consumoEnergetico;
	private int peso;
	
	
	public Electrodomestico() {
		this.precioBase = 100;
		this.color = "blanco";
		this.consumoEnergetico = 'F';
		this.peso = 5;
		
	}
	public Electrodomestico(int precio, int peso,String nombre) {
		this.color = "blanco";
		this.consumoEnergetico = 'F';
		this.precioBase = precio;
		this.peso = peso;
	}
	public Electrodomestico(int precioB, String nombre, String color,char consumoE, int peso) {
		this.precioBase = precioB;
		this.nombre = nombre;
		this.color = color;
		this.consumoEnergetico = consumoE;
		this.peso = peso;
		comprobarConsumoEnergetico(this.consumoEnergetico);
	}
	
	/* Getter & Setter PRECIOBASE  */
	public int getPrecioBase() {
		return this.precioBase;
	}
	public void setPrecioBase(int pb) {
		this.precioBase = pb;
	}
	/* Getter & Setter NOMBRE  */
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String n) {
		this.nombre = n;
	}
	/* Getter & Setter COLOR  */
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	/* Getter & Setter CONSUMOENERGETICO  */
	public char getConsumoEnergetico() {
		return this.consumoEnergetico;
	}
	public void setConsumoEnergetico(char consumoEnerg) {
		this.consumoEnergetico = consumoEnerg ;
	}
	/* Getter & Setter PESO  */
	public int getPeso() {
		return this.peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	private void comprobarConsumoEnergetico(char letra) {
		char upperLetra = Character.toUpperCase(letra); 
		if(upperLetra == 'A' || upperLetra == 'B' || upperLetra == 'C' || upperLetra == 'D' || upperLetra == 'E') {
			this.consumoEnergetico = upperLetra;
		}else {
			this.consumoEnergetico = 'F';
		}
		
	}
	private void comprobarColor(String color) {
		String lowerColor = color.toLowerCase();
		if (lowerColor.equals("negro") || lowerColor.equals("rojo") || lowerColor.equals("azul") || lowerColor.equals("gris")) {
			this.color = lowerColor;
		}else {
			this.color = "blanco";
		}
	}
	public int precioFinal() {
		int precioTotal = 0;
		switch(getConsumoEnergetico()) {
			case 'A': 
				precioTotal += 100;
				break;
			case 'B':
				precioTotal += 80;
				break;
			case 'C':
				precioTotal += 60;
				break;
			case 'D':
				precioTotal += 50;
				break;
			case 'E':
				precioTotal += 30;
				break;
			default: 
				precioTotal += 10;
				break;
		}
		if (getPeso() > 0 && getPeso() < 20) {
			precioTotal += 10;
		}else {
			if (getPeso() > 19 && getPeso() < 50) {
				precioTotal +=50;
			}else {
				if (getPeso() > 49 && getPeso() <= 79) {
					precioTotal += 80;
				}else {
					precioTotal += 100;
				}
			}
		}
		return precioTotal;
	}
	
	

}

