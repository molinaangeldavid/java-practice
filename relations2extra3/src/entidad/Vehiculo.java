package entidad;

import enumeradores.TipoVehiculo;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String anio;
	private String numeroMotor;
	private String chasis;
	private String color;
	private TipoVehiculo tipo;
	
	public Vehiculo() {
		
	}

	public Vehiculo(String marca, String modelo, String anio, String numeroMotor, String chasis, String color,
			TipoVehiculo tipo) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.numeroMotor = numeroMotor;
		this.chasis = chasis;
		this.color = color;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getNumeroMotor() {
		return numeroMotor;
	}

	public void setNumeroMotor(String numeroMotor) {
		this.numeroMotor = numeroMotor;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public TipoVehiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVehiculo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numeroMotor=" + numeroMotor
				+ ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + "]";
	}
	
	

	
	
}
