package entidad;

import enumeradores.*;

public class Poliza {

	
	private int numeroPoliza;
	private String fechaInicio;
	private String fechaFin;
	private int cantidadCuotas;
	private double montoTotalAsegurado;
	private boolean incluyeGranizo;
	private double montoMaximoGranizo;
	private TipoCobertura tipo;
	private Cliente cliente;
	private Vehiculo vehiculo;
	
	public Poliza() {
		
	}
	
	public Poliza(int numeroPoliza, String fechaInicio, String fechaFin, int cantidadCuotas, double montoTotalAsegurado,
			boolean incluyeGranizo, double montoMaximoGranizo,TipoCobertura tipo,Cliente cliente, Vehiculo vehiculo) {
		this.numeroPoliza = numeroPoliza;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.cantidadCuotas = cantidadCuotas;
		this.montoTotalAsegurado = montoTotalAsegurado;
		this.incluyeGranizo = incluyeGranizo;
		this.montoMaximoGranizo = montoMaximoGranizo;
		this.tipo = tipo;
		this.cliente = cliente;
		this.vehiculo = vehiculo;
	}


	public int getNumeroPoliza() {
		return numeroPoliza;
	}

	public void setNumeroPoliza(int numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getCantidadCuotas() {
		return cantidadCuotas;
	}

	public void setCantidadCuotas(int cantidadCuotas) {
		this.cantidadCuotas = cantidadCuotas;
	}

	public double getMontoTotalAsegurado() {
		return montoTotalAsegurado;
	}

	public void setMontoTotalAsegurado(double montoTotalAsegurado) {
		this.montoTotalAsegurado = montoTotalAsegurado;
	}

	public boolean isIncluyeGranizo() {
		return incluyeGranizo;
	}

	public void setIncluyeGranizo(boolean incluyeGranizo) {
		this.incluyeGranizo = incluyeGranizo;
	}

	public double getMontoMaximoGranizo() {
		return montoMaximoGranizo;
	}

	public void setMontoMaximoGranizo(double montoMaximoGranizo) {
		this.montoMaximoGranizo = montoMaximoGranizo;
	}

	public TipoCobertura getTipo() {
		return tipo;
	}

	public void setTipo(TipoCobertura tipo) {
		this.tipo = tipo;
	}

	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Vehiculo getVehiculo() {
		return vehiculo;
	}


	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}


	@Override
	public String toString() {
		return "Poliza [numeroPoliza=" + numeroPoliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", cantidadCuotas=" + cantidadCuotas + ", montoTotalAsegurado=" + montoTotalAsegurado
				+ ", incluyeGranizo=" + incluyeGranizo + ", montoMaximoGranizo=" + montoMaximoGranizo + "]";
	}
	
	
	
}