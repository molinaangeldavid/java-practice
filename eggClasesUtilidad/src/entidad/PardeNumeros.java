package entidad;

public class PardeNumeros {
	private float numero1;
	private float numero2;
	
	public PardeNumeros() {
		
	}
	
	public PardeNumeros(float num1,float num2) {
		this.numero1 = num1;
		this.numero2 = num2;
	}

	public float getNumero1() {
		return numero1;
	}

	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}

	public float getNumero2() {
		return numero2;
	}

	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}
	
	public void mostrarValores() {
		System.out.println("El primer numero/valor es: " + this.numero1);
		System.out.println("El segundo numero/valor es: " + this.numero2);
	}
	
	public float devolverMayor() {
		return Math.max(this.numero1, this.numero2);
	}
	
	public void calcularPotencia() {
		int maximo = Math.round(devolverMayor());
		int minimo = Math.round(Math.min(this.numero1, this.numero2));
		System.out.println("Potencia: " + Math.pow(maximo, minimo) );
	}
	
	public void calcularRaiz() {
		float minimo = Math.abs(Math.min(this.numero1,this.numero2));
		System.out.println("Raiz cuadrada: " + Math.sqrt(minimo));
	}
}
