package entidad;

public class Caballo extends Animal{

	public Caballo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Caballo(String nombre, String alimento, int edad, String razaAnimal) {
		super(nombre, alimento, edad, razaAnimal);
		// TODO Auto-generated constructor stub
	}
	
	public void alimentarse() {
		System.out.println("El caballo come " + alimento);
	}
	
}
