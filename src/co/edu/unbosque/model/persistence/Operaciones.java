package co.edu.unbosque.model.persistence;
import co.edu.unbosque.model.Transaccion;

public interface Operaciones {
	public void crearTransaccion(Transaccion newTransaccion);
	public String mostrarTransaciones();
	public String consultarTransaccion(int id, String tipoUsuario, String nombreCliente);
}
