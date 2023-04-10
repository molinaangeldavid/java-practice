package alamacen;

public class Producto {

	private String nombre;
	private int codigo;
	private int precio_costo;
	private int precio_venta;
	private int stock;
	
	public Producto(int codigo, String nombre, int precio_costo, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio_costo = precio_costo;
		this.precio_venta = precio_costo * (30 / 100);
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
