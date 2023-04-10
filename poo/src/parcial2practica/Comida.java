package parcial2practica;

public class Comida extends Producto{
	
	private int peso;
	private String origen;
	
	
	public Comida() {
		// TODO Auto-generated constructor stub
	}
	
	public Comida(int id, double p_c, double p_v, String desc, int peso, String origen) {
//		super(id,p_c,p_v,desc);
		this.peso = peso;
		this.origen = origen;
	}	
	
	public void mostrar_info() {
		System.out.println("ID: " + this.getId());
		System.out.println("Nombre: "  + this.getDescripcion());
		System.out.println("Precio costo: "  + this.getPrecio_costo());
		System.out.println("Precio venta: "  + this.getPrecio_venta());
		System.out.println("Peso: "  + this.getPeso());
		System.out.println("Origen: "  + this.getOrigen());
	}
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

}
