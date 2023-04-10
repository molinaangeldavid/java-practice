package proyecto_banco;

public class Cliente {

	private String nombre;
	private String apellido;
	private int edad;
	private String dni;
	private int saldo;
	private int nro_cliente;
	private boolean tarjeta_credito;
	
	public Cliente() {
		
	}
	public Cliente(String nombre, String apellido, int edad, int dni, int saldo,int n_cliente, boolean tarcre) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = validar_edad(edad);
		this.dni = validar_dni(dni);
		this.saldo = saldo;
		this.nro_cliente = validar_nro_cliente(n_cliente);
		this.tarjeta_credito = tarcre;
	}
	public void mostrar_infomarcion() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("Edad: " + this.edad);
		System.out.println("Dni: " + this.dni);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Numero de cliente: " + this.nro_cliente);
	}
	
	public void depositar(int cant) {
		this.saldo += cant;
		System.out.println("Has ingresado $" + cant + "con exito!!!");
	}
	
	public int retirar(int cant) {
		cant = validar_retiro(cant);
		this.saldo -= cant;
		return this.saldo;
	}

	private int validar_retiro(int cant) {
		if (cant > this.saldo) {
			System.out.println("Saldo insuficiente");
			cant = 0;
		}
		return cant;
		
	}
	
	public String tiene_tarjeta() {
		if (this.tarjeta_credito) {
			return "Si!";
		}
		return "No!";
	}
	
	private int validar_edad(int edad) {
		if (edad < 0) {
			edad = -1;
		}
		return edad;
	}
	private String validar_dni(int dni) {
		String numero_dni = Integer.toString(dni);
		if (numero_dni.length() != 8) {
			numero_dni = "";
		}
		return numero_dni;
	}
	private int validar_nro_cliente(int n_cliente) {
		if (n_cliente < 0) {
			n_cliente = -1;
		}
		return n_cliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = validar_edad(edad);
	}
	public String getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = validar_dni(dni);
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getNro_cliente() {
		return nro_cliente;
	}
	public void setNro_cliente(int nro_cliente) {
		this.nro_cliente = validar_nro_cliente(nro_cliente);
	}
	public boolean isTarjeta_credito() {
		return tarjeta_credito;
	}
	public void setTarjeta_credito(boolean tarjeta_credito) {
		this.tarjeta_credito = tarjeta_credito;
	}

	
}
