package entidad;

public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    
    @Override
    public void alimentarse() {
        System.out.println("El perro come " + alimento);
    }
    
}
