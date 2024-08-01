package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Transaccion;

public class TransaccionDAO {
	private ArrayList<Transaccion> lista;
	private ClienteDAO clienteDAO;
	
	public TransaccionDAO() {
		lista = new ArrayList<>();
		clienteDAO =  new ClienteDAO();
	}
}
