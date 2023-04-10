package restaurantes;

import java.util.ArrayList;

public class Restaurante {

	private String nombre;
	private ArrayList<Empleado> empleados;
	private double facturacion;
	private ArrayList<Menu> menues;
	private int capacidad;
	
	public Restaurante(String nombre) {
		this.nombre = nombre;
		empleados = new ArrayList<Empleado>();
		menues = new ArrayList<Menu>();
	}
	
	public void mostrar_info() {
		System.out.println("");
		System.out.println("Nombre Restaurante: " + this.nombre);
		System.out.println("Capacidad maxima: " + this.capacidad);
		System.out.println("Cantidad de empleados: " + this.empleados.size());
		System.out.println("Facturacion: " + this.facturacion);
		System.out.println("Cantidad platos disponibles: " + this.menues.size());
		System.out.println("");
		
	}
	
	public void listar_platos() {
		for (int i = 0 ; i < this.menues.size() ; i++) {
			this.menues.get(i).mostrar_info();
			System.out.println("");
		}
	}
	
	public double gasto_sueldo() {
		double gasto_total = 0;
		for (int i = 0 ; i < this.empleados.size() ; i++) {
			gasto_total += this.empleados.get(i).getSueldo();
		}
		return gasto_total;
	}
	
	public void vender_plato(Menu plat) {
		boolean existe = false;
		for (int i = 0 ; i < this.menues.size() && !existe; i++) {
			if (plat.getNombre() == this.menues.get(i).getNombre()) {
				existe = true;
				this.facturacion += this.menues.get(i).getPrecio();
			}
		}
	}
	
	public void agregar_menu(Menu menu) {
		boolean existe = false;
		for (int i = 0 ; i < this.menues.size() ; i++) {
			if (menu.getNombre() == this.menues.get(i).getNombre()) {
				existe = true;
			}
		}
		if(existe) {
			System.out.println("Plato ya se encuentra registrado. Ingrese otro");
		}else {
			this.menues.add(menu);
		}
	}
	
	public void agregar_empleado(Empleado emp) {
		boolean existe = false;
		for (int i = 0 ; i < empleados.size() ; i++) {
			if (emp.getLegajo() == empleados.get(i).getLegajo()) {
				existe = true;
				System.out.println("Empleado ya existente.");
			}
		}
		if (!existe) {
			empleados.add(emp);
		}
	}
	
	public void desvincular_empleado(Empleado emp) {
		for (int i = 0 ; i < empleados.size() ; i++) {
			if (emp.getLegajo() == empleados.get(i).getLegajo()) {
				empleados.remove(i);
				System.out.println("Empleado desvinculado");
			}
		}
	}

	public boolean eliminar_menu(Menu plat) {
		boolean borrado = false;
		for (int i = 0 ; i < this.menues.size() ; i++) {
			if (plat.getNombre() == this.menues.get(i).getNombre()) {
				menues.remove(i);
				borrado = true;
			}
		}
		return borrado;
	}
}
