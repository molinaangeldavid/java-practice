package entidad;

public class Rectangulo {
	private int base;
	private int altura;
	
	public Rectangulo() {
		
	}
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int superficie() {
		return this.base * this.altura;
	}
	
	public int perimetro() {
		return (this.base + this.altura) * 2;
	}
	
	public void dibujarRectangulo() {
		for (int i = 0 ; i < this.altura ; i++) {
			for (int j = 0 ; j < this.base ; j++) {
				
				if (i == 0 || i == (this.altura - 1)) {
					System.out.print("*");
				}else {
					if (j == 0 || j == (this.base - 1)) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				
			}
			System.out.println("");
		}
	}
	
	
	
}
