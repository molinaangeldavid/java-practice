package parcial2practica;

public class Producto {

	private int id;
	private double precio_costo;
	private double precio_venta;
	private int tipo;
	private String descripcion;
	
	
	public Producto() {
		
	}
	public Producto(int id, double p_c, double p_v, int tipo, String desc) {
		this.id = id;
		this.precio_costo = p_c;
		this.precio_venta = p_v;
		this.tipo = tipo;
		this.descripcion = desc;
	}
	
	public void mostrar_info() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio_costo() {
		return precio_costo;
	}

	public void setPrecio_costo(double precio_costo) {
		this.precio_costo = precio_costo;
	}

	public double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
