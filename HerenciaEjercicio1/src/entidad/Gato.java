package entidad;

public class Gato  extends Animal{

	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gato(String nombre, String alimento, int edad, String razaAnimal) {
		super(nombre, alimento, edad, razaAnimal);
		// TODO Auto-generated constructor stub
	}

	public void alimentarse() {
		System.out.println("El gato come " + alimento);
	}
	
}
