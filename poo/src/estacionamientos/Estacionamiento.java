package estacionamientos;

import java.util.ArrayList;

public class Estacionamiento {

	private String nombre;
	private int precio_hora;
	private ArrayList<Lugar> lugares;
	private int facturacion;
	
	
	public Estacionamiento() {
		lugares = new ArrayList<Lugar>();
	}
	
	public void mostrar_info() {
		 System.out.println("Nombre estacionamiento: " + this.nombre);
		 System.out.println("Valor por hora: " + this.precio_hora);
		 System.out.println("Facturado: " + this.facturacion);
		 System.out.println("Lugares libres: " + cantidad_libres());
		 System.out.println("Lugares ocupados: " + cantidad_ocupados());
	}

	public int cantidad_libres() {
		int libres = 0;
		for (int i = 0 ; i < lugares.size() ; i++) {
			 if (lugares.get(i).isLibre()) {
				 libres++;
			 }
		 }
		return libres;
	}
	
	public int cantidad_ocupados() {
		int ocupados = 0;
		for (int i = 0 ; i < lugares.size() ; i++) {
			 if (!lugares.get(i).isLibre()) {
				 ocupados++;
			 }
		 }
		return ocupados;
	}
	
	public boolean estacionar(int lugar) {
		boolean estacionado = false;
		for (int i = 0 ; i < lugares.size() && !estacionado ; i++) {
			if (lugares.get(i).getNumero() == lugar){
				if (lugares.get(i).isLibre()) {
					lugares.get(i).setLibre(false);					
					this.facturacion += this.precio_hora;
					estacionado = true;
				}else {
					System.out.println("El lugar ya se encuentra ocupado");
				}
			}
		}
			
		return estacionado;
	}
	
	public boolean liberar(int lugar) {
		boolean liberado = false;
		for (int i = 0 ; i < lugares.size() && !liberado ; i++) {
			if (lugares.get(i).getNumero() == lugar) {
				if (lugares.get(i).isLibre()) {
					System.out.println("El lugar ya se encontraba libre");
				}else {
					lugares.get(i).setLibre(true);
					liberado = true;
				}
			}
		}
		return liberado;
		
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio_hora() {
		return precio_hora;
	}

	public void setPrecio_hora(int precio_hora) {
		this.precio_hora = precio_hora;
	}

	public ArrayList<Lugar> getLugares() {
		return lugares;
	}

	public void setLugares(ArrayList<Lugar> lugares) {
		this.lugares = lugares;
	}

	public int getFacturacion() {
		return facturacion;
	}

	public void setFacturacion(int facturacion) {
		this.facturacion = facturacion;
	}
	

}
