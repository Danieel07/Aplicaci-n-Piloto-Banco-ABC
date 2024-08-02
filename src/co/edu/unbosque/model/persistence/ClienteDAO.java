package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Cliente;

public class ClienteDAO {
	private ArrayList<Cliente> listaClientes;
	
	public ClienteDAO() {
		listaClientes = new ArrayList<>();
		listaClientes.add(new Cliente(1, 123456789, "Daniel"));
		listaClientes.add(new Cliente(2, 123456789, "Stefy"));
		listaClientes.add(new Cliente(3, 123456789, "Wiston"));
		listaClientes.add(new Cliente(4, 123456789, "Emperatriz"));
	}
	public String consultarSaldo(long cedula) {
		String salida = "";
		for (Cliente cliente : listaClientes) {
			if(cliente.getCedula() == cedula) {
				salida += cliente.toString(); 
			}
		}	
		return salida;
	}
	public String consultarNombreCliente(long cedula) {
		String nombre = "";
		for (Cliente cliente : listaClientes) {
			if(cliente.getCedula() == cedula) {
				nombre = cliente.getNombre();
				break;
			}
		}
		return nombre;
	}
	public ArrayList<Cliente> getList(){
		return listaClientes;
	}
}
