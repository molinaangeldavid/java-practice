package examen;

import java.util.*;

public class Tienda {

	private String nombre;
	private int facturacion_total;
	private int ganancia;
	private int unidades_vendidas;
	private ArrayList<Computadora> computadoras;
	
	public Tienda(String nombre) {
		this.nombre = nombre;
		computadoras = new ArrayList<Computadora>();
	}
	//  ====================================
	//	Getters & Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFacturacion_total() {
		return facturacion_total;
	}

	public void setFacturacion_total(int facturacion_total) {
		this.facturacion_total = facturacion_total;
	}

	public int getGanancia() {
		return ganancia;
	}

	public void setGanancia(int ganancia) {
		this.ganancia = ganancia;
	}

	public int getUnidades_vendidas() {
		return unidades_vendidas;
	}

	public void setUnidades_vendidas(int unidades_vendidas) {
		this.unidades_vendidas = unidades_vendidas;
	}

	public ArrayList<Computadora> getComputadoras() {
		return computadoras;
	}

	public void setComputadoras(ArrayList<Computadora> computadoras) {
		this.computadoras = computadoras;
	}
	// ============================
	// Metodos
	public void Agregar_computadora(Computadora computadora) {
		boolean existe = false;
		for (int i = 0 ; i < computadoras.size() && !existe; i++) {
			if (computadora.getCodigo() == computadoras.get(i).getCodigo()) {
				existe = true;
			}
		}
		if (!existe) {
			computadoras.add(computadora);
			System.out.println("Computadora agregada con existo... \n");
		}else {
			System.out.println("La computadora ya se encuentra en el sistema. Ingrese otro!");
		}
	}
	
	public void Vender_computadora(int codigo) {
		boolean vendido = false;
		for (int i = 0 ; i < computadoras.size() && !vendido ; i++) {
			if (codigo == computadoras.get(i).getCodigo()) {
				unidades_vendidas++;
				ganancia += (computadoras.get(i).getPrecio_venta() - computadoras.get(i).getPrecio_costo());
				facturacion_total += computadoras.get(i).getPrecio_venta();
				System.out.println("Computadora vendida exitosamente...");
				vendido = true;
			}
		}
		if (!vendido) {
			System.out.println("El producto no se ha vendido. Compruebe que el codigo sea valido");
		}
	}
	
	public int Obtener_facturacion() {
		return this.facturacion_total;
	}
	
	public int Obtener_ganancia() {
		return this.ganancia;
	}
	
	public int Obtener_unidades_vendidas() {
		return this.unidades_vendidas;
	}
	
	public void Mostrar_info() {
		System.out.println("");
		System.out.println("Nombre de la tienda: " + getNombre());
		System.out.println("Unidades vendidas: " + getUnidades_vendidas());
		System.out.println("Facturacion: " + getFacturacion_total());
		System.out.println("Ganancias: " + getGanancia());
		System.out.println("");
	}
	
	
	

}
