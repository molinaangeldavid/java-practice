package alamacen;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese nombre del almacen: ");
		String nombre_almacen = scan.nextLine();
		Almacen almacen = new Almacen(nombre_almacen);
		
		int opcion = 0;
		while (opcion != 5) {
			
			System.out.println("===================================");
			System.out.println(almacen.getNombre().toUpperCase());
			System.out.println("===================================");
			
			System.out.println("1. Agregar producto.");
			System.out.println("2. Vender producto.");
			System.out.println("3. Revisar recaudacion.");
			System.out.println("4. Revisar cantidad productos vendidos");
			System.out.println("5. Salir");
			
			opcion = validar_opcion();
			
			switch(opcion) {
				case 1:
					System.out.println("Ingrese codigo del producto: ");
					int codigo_nuevo_producto = scan.nextInt();
					scan.nextLine();
					System.out.println("Ingrese nombre del producto: ");
					String nombre_producto = scan.nextLine();
					System.out.println("Ingrese el precio del costo: ");
					int costo_producto = scan.nextInt();
					System.out.println("Ingrese el stock total del producto: ");
					int stock_producto = scan.nextInt();
					almacen.agregar_producto(new Producto(codigo_nuevo_producto, nombre_producto, costo_producto, stock_producto));
					break;
				case 2: 
					System.out.println("Ingrese el codigo del producto que desea vender: ");
					int codigo_producto_vender = scan.nextInt();
					System.out.println("Ingrese cantidad exacta del producto a vender: ");
					int cantidad_producto_vender = scan.nextInt();
					almacen.vender_producto(codigo_producto_vender, cantidad_producto_vender);
					break;
				case 3: 
					System.out.println("Recaudacion: " + almacen.obtener_recaudacion());
					break;
				case 4: 
					System.out.println("Cantidad vendidas: " + almacen.obtener_cantidad_vendidos() );
					break;
			}
		}
		
		
		
		
	}
	
	static int validar_opcion() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese una opcion valida: ");
		int opcion = scan.nextInt();
		while (opcion < 1 || opcion > 5) {
			System.out.println("Opcion invalida");
			opcion = scan.nextInt();
		}
		return opcion;
	}

}
