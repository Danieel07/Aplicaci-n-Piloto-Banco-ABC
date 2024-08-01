package co.edu.unbosque.model;

public class Cliente {
	private long cedula;
	private long saldo;
	private String nombre;
	
	public Cliente() {
	}
	
	public Cliente(long cedula, long saldo, String nombre) {
		super();
		this.cedula = cedula;
		this.saldo = saldo;
		this.nombre = nombre;
	}


	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public long getSaldo() {
		return saldo;
	}

	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre +" Su Saldo es de: ("+ saldo+")" ;
	}
	
}
