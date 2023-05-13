package entidad;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ProductoService {

	public Producto crearProducto() {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Ingrese nombre del producto: ");
		String nombre = scan.next();
		System.out.println("Ingrese el precio del producto: ");
		float precio = scan.nextFloat();
		return new Producto(nombre,precio);
	}
	
	public void modificarPrecio(HashMap<String,Float> productos, String nombre) {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		for(Map.Entry<String, Float> producto: productos.entrySet()) {
			if(nombre.equals(producto.getKey())) {
				System.out.println("Ingrese el nuevo precio a modificar: ");
				float precioNuevo =  scan.nextFloat();
				producto.setValue(precioNuevo);
			}
		}
	}
	
	public void eliminarProducto(HashMap<String, Float> productos, String nombre) {
		for(Map.Entry<String, Float> producto: productos.entrySet()) {
			if(nombre.equals(producto.getKey())) {
				productos.remove(producto.getKey());
			}
		}
	}
	
	public void mostrarProductos(HashMap<String,Float> productos) {
		for(Map.Entry<String, Float> producto: productos.entrySet()) {
			System.out.println(producto.getKey() + ": " + producto.getValue());
		}
	}
	
}
