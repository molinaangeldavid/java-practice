package mainCollections;

import entidad.Producto;
import entidad.ProductoService;
import java.util.Scanner;
import java.util.HashMap;

public class ejercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		HashMap<String,Float> productos = new HashMap<String, Float>();
		ProductoService ps = new ProductoService();
		int opc;
		do {
			System.out.println("1. Crear producto. ");
			System.out.println("2. Modificar producto. ");
			System.out.println("3. Eliminar producto. ");
			System.out.println("4. Mostrar todos los productos.");
			System.out.println("5. Salir.");
			
			System.out.println("Ingresa una opcion valida: ");
			opc = scan.nextInt();
			String nombre;
			switch(opc) {
				case 1:
					Producto p = ps.crearProducto();
					productos.put(p.getNombre(),p.getPrecio());
					break;
				case 2: 
					System.out.println("Ingrese el nombre del producto que desea modificar su precio: ");
					nombre = scan.next();
					ps.modificarPrecio(productos, nombre);
					break;
				case 3:
					System.out.println("Ingrese el nombre del producto que desea eliminar: ");
					nombre = scan.next();
					ps.eliminarProducto(productos, nombre);
					break;
				case 4:
					ps.mostrarProductos(productos);
					break;
				default:
					if(opc != 5) {
						System.out.println("La opcion ingresada no es valida.");
					}
			}
		} while (opc != 5);
	}

}
