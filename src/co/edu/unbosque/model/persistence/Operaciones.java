package co.edu.unbosque.model.persistence;

public interface Operaciones {
	public void crearTransaccion(Object o);
	public String mostrarTransaciones();
	public String consultarTransaccion(int id);
}
