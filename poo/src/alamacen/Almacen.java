package alamacen;

import java.util.*;

public class Almacen {

	private String nombre;
	private int recaudacion;
	private int cantidad_prod_vendidos;
	private ArrayList<Producto> productos;
	
	
	public Almacen(String nombre) {
		this.nombre = nombre;
		productos = new ArrayList<Producto>();
	}

	public void agregar_producto(Producto prod) {
		boolean producto_igual = false;
		for (int i = 0 ; i < this.productos.size() && !producto_igual; i++) {
			if (prod.getCodigo() == this.productos.get(i).getCodigo()) {
				producto_igual = true;
			}
		}
		if (!producto_igual) {
			this.productos.add(prod);
			System.out.println("Producto agregado exitosamente.");
		}else {
			System.out.println("Producto registrado en el sistema. Ingrese otro!");
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(int recaudacion) {
		this.recaudacion = recaudacion;
	}

	public int getCantidad_prod_vendidos() {
		return cantidad_prod_vendidos;
	}

	public void setCantidad_prod_vendidos(int cantidad_prod_vendidos) {
		this.cantidad_prod_vendidos = cantidad_prod_vendidos;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public void vender_producto(int codigo, int cantidad) {
		boolean producto_repetido = false; 
		for (int i = 0 ; i < this.productos.size() && !producto_repetido; i++) {
			if (codigo == this.productos.get(i).getCodigo()) {
				producto_repetido = true;
				if (cantidad < this.productos.get(i).getStock() && this.productos.get(i).getStock() > 0) {
					int precio_venta = this.productos.get(i).getPrecio_costo();
					this.recaudacion += precio_venta * cantidad;
					this.productos.get(i).setStock(this.productos.get(i).getStock() - cantidad);
					this.cantidad_prod_vendidos += cantidad;
					System.out.println("Venta exitosa.");
					System.out.println("Stock restante: " + this.productos.get(i).getStock());
				}else {
					System.out.println("No existe ese stock!");
				}
			}
		}
		if(!producto_repetido) {
			System.out.println("Producto no existente");
		}
	}
	
	public int obtener_recaudacion() {
		return this.recaudacion;
	}
	
	public int obtener_cantidad_vendidos() {
		return this.cantidad_prod_vendidos;
	}
	
}
