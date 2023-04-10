package biblioteca;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nombre_biblioteca;
		System.out.println("Ingrese nombre de la biblioteca");
		nombre_biblioteca = scan.nextLine();
		Biblioteca biblio1 = new Biblioteca(nombre_biblioteca);
		boolean salir = false;
		while (!salir) {
			System.out.println("\n" + biblio1.getNombre() + "\n");
			System.out.println("1. Agregar Libro");
			System.out.println("2. Alquilar libro");
			System.out.println("3. Devolver Libro");
			System.out.println("4. Buscar Libro");
			System.out.println("5. Listar Libro");
			System.out.println("6. Obtener facturacion");
			System.out.println("7. Salir");

			System.out.println("Ingrese opcion: ");
			int opcion = validar_opcion();
			
			switch(opcion) {
				case 1:
					System.out.println("Ingrese el codigo del libro");
					String codigo = scan.nextLine();
					System.out.println("Ingrese el titulo del libro");
					String titulo = scan.nextLine();
					System.out.println("Ingrese el genero del libro");
					String genero = scan.nextLine();
					System.out.println("Ingrese el autor del libro");
					String autor = scan.nextLine();
					if (biblio1.agregar_libros(new Libro(Integer.parseInt(codigo),titulo,genero,autor))) {
						System.out.println("Libro agregado con exito");
					}else {
						System.out.println("El libro ya existe!");
					}
					break;
				case 2:
					System.out.println("Ingrese el codigo del libro que desea alquilar");
					int codigo_alquilar = scan.nextInt();
					if(biblio1.alquilar_libro(codigo_alquilar)) {
						System.out.println("Libro alquilado con exito");
					}
					break;
				case 3:
					System.out.println("Ingrese el codigo del libro que desea devolver");
					int codigo_devolver = scan.nextInt();
					if(biblio1.devolver_libro(codigo_devolver)) {
						System.out.println("El libro ha sido devuelto con exito");
					}
					break;
				case 4:
					System.out.println("Ingrese el codigo del libro que desea buscar");
					int codigo_buscar = scan.nextInt();
					biblio1.buscar_libro(codigo_buscar);
					break;
				case 5:
					System.out.println("Ingrese el genero que desea listar");
					String genero_listar = scan.nextLine();
					biblio1.listar_libros(genero_listar);
					break;
				case 6: 
					System.out.println("Recaudacion: " + biblio1.obtener_facturacion());
					break;
				default:
					salir = true;
					System.out.println("Sistema cerrandose...");
					break;
			}
		}
		
	}
	static int validar_opcion() {
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		while (opcion < 1 || opcion > 7) {
			System.out.println("Ingreso invalido");
			opcion = scan.nextInt();
		}
		return opcion;
	}
	

}
