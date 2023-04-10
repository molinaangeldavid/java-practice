package restaurantes;

public class Menu {

	private String nombre;
	private double precio;
	private String tipo;
	
	public Menu() {
		
		
	}
	
	public void mostrar_info() {
		System.out.println("");
		System.out.println("Nombre plato: " + this.nombre);
		System.out.println("Precio plato: " + this.precio);
		System.out.println("Tipo plato: " + this.tipo);
		System.out.println("");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
