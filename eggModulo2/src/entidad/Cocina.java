package entidad;

import java.util.*;

public class Cocina {
	private ArrayList<Receta> recetas;
	private ArrayList<String> ingredientes;
	
	public Cocina() {
		recetas = new ArrayList<Receta>();
		ingredientes = new ArrayList<String>();
	}

	public ArrayList<Receta> getRecetas() {
		return recetas;
	}

	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public void setRecetas(ArrayList<Receta> recetas) {
		this.recetas = recetas;
	}
	
	public void agregarReceta(Receta receta) {
		recetas.add(receta);
	}
	
	public void cargarIngredientes() {
		Scanner scan = new Scanner(System.in);
		String ingrediente;
		String agregarMas;
		do {
			System.out.println("Agregar ingrediente: ");
			ingrediente = scan.next();
			this.ingredientes.add(ingrediente);
			System.out.println("Desea agregar mas ingredientes? <si/no>");
			agregarMas = scan.next();
		} while (agregarMas.equals("si"));
	}
	

	public ArrayList<String> crearReceta() {
		ArrayList<String> nombreRecetas = new ArrayList<String>();
		for (int i = 0; i < ingredientes.size() ; i++) {
			for (int j = 0 ; j < recetas.size(); j++) {
				int contadorIngredientes = 0;
				for (int k = 0 ; k < recetas.get(j).getIngredientes().size(); k++) {
					if(ingredientes.get(i).contains(recetas.get(j).getIngredientes().get(k))) {
						contadorIngredientes++;
						if (contadorIngredientes == recetas.get(j).getIngredientes().size()) {
							nombreRecetas.add(recetas.get(j).getNombre());							
						}
					}
				}
			}
		}
		return nombreRecetas;
	}
	
	
	
}
