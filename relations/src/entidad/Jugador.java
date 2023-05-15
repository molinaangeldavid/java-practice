package entidad;

public class Jugador {

	private int id;
	private String nombre;
	private boolean mojado;
	
	public Jugador() {
		this.mojado = false;
	}

	public Jugador(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.mojado = false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isMojado() {
		return mojado;
	}

	public void setMojado(boolean mojado) {
		this.mojado = mojado;
	}
	
	public void disparo(RevolverAgua r) {
		if(r.mojar()) {
			this.mojado = true;
			System.out.println("El jugador " + this.id + " - " + this.nombre + " fue mojado.");
		}else {
			r.siguienteChorro();
		}
	}
	
}
