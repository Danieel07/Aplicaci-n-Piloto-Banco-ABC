package co.edu.unbosque.model;

import java.io.Serializable;

public class TransaccionDTO implements Serializable{

	private static final long serialVersionUID = 2693282726117875779L;
	private long monto;
	private int id;
	private String hora;
	private String nombreCliente;
	
	public TransaccionDTO() {
	}

	public TransaccionDTO(long monto, int id, String hora, String nombreCliente) {
		super();
		this.monto = monto;
		this.id = id;
		this.hora = hora;
		this.nombreCliente = nombreCliente;
	}

	public long getMonto() {
		return monto;
	}

	public void setMonto(long monto) {
		this.monto = monto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	@Override
	public String toString() {
		return "Transaccion: \n Id: ("+id+ ")\n Nombre del Cliente: ("+nombreCliente+")\n "
				+ "Hora: ("+hora+") \n Monto: ("+monto+")\n";
	}
	
}
