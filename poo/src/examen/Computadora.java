package examen;

public class Computadora {

	private int codigo;
	private int tipo;
	private int memoria;
	private int precio_costo;
	private int precio_venta;
	private String procesador;
	
	public Computadora(int codigo, int tipo, int memoria) {
		
		this.codigo = codigo;
		this.tipo = tipo;
		this.memoria = memoria;
		calculo_atributos(tipo);
		
	}
	// ====================================
	// Getters & Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getPrecio_costo() {
		return precio_costo;
	}

	public void setPrecio_costo(int precio_costo) {
		this.precio_costo = precio_costo;
	}

	public int getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(int precio_venta) {
		this.precio_venta = precio_venta;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	private void calculo_atributos(int tipo) {
		switch(tipo) {
			case 300: 
				setPrecio_costo(3000);
				setPrecio_venta(3500);
				setProcesador("i3");
				break;
			case 500:
				setPrecio_costo(5000);
				setPrecio_venta(5500);
				setProcesador("i5");
				break;
			case 700:
				setPrecio_costo(7000);
				setPrecio_venta(7500);
				setProcesador("i7");
				break;
			case 900:
				setPrecio_costo(9000);
				setPrecio_venta(9500);
				setProcesador("i9");
		}
	}
	
	public void mostrar_info() {
		System.out.println("");
		System.out.println("Procesador de la computadora: " + getProcesador());
		System.out.println("Memoria de la computadora: " + getMemoria());
		System.out.println("Precio de venta de la computadora: " + getPrecio_venta());
	}
	
}
