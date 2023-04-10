package entidad;

public class Operacion {

	private int numero1,numero2;
	
	public Operacion() {
		
	}
	
	public Operacion(int num1,int num2) {
		this.numero1 = num1;
		this.numero2 = num2;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public void crearOperacion(int num1, int num2) {
		this.numero1 = num1;
		this.numero2 = num2;
	}
	
	public int sumar() {
		return this.numero1 + this.numero2;
	}
	
	public int restar() {
		return this.numero1 + this.numero2;
	}
	
	public int multiplicar() {
	
		if (this.numero1 == 0 || this.numero2 == 0) {
			System.out.println("Error!");
			return 0;
		}else {
			return this.numero1 * this.numero2;
		}
	}
	
	public int dividir() {
		if (this.numero2 == 0) {
			System.out.println("Error dividir por 0!");
			return 0;
		}else {
			return this.numero1 / this.numero2;
		}
	}
	
	
	
	
	
	
}
