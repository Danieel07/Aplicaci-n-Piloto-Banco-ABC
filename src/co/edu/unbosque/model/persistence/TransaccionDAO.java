package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Transaccion;

public class TransaccionDAO implements Operaciones {
	private ArrayList<Transaccion> lista;
	
	public TransaccionDAO() {
		lista = new ArrayList<>();
		leerDesdeSerializado();
	}
	
	@SuppressWarnings({ "unchecked" })
	
	public void leerDesdeSerializado() {

		Object temp = FileHandler.abrirYLeerSerializable("Transacciones.Bat");
		if (temp == null) {
			lista = new ArrayList<>();
		} else {
			lista = (ArrayList<Transaccion>) temp;
		}
	}

	public void escribirEnArchivo() {
		String contenido = "";
		for (int i = 0; i < lista.size(); i++) {
			contenido += lista.get(i).getMonto()+";";
			contenido += lista.get(i).getId() + ";";
			contenido += lista.get(i).getHora()+ ";";
			contenido += lista.get(i).getNombreCliente();
			if (i < lista.size() - 1) {
				contenido += "\n";
			}
		}
		FileHandler.abrirYEscribirArchivo("Transacciones.csv", contenido);
	}

	@Override
	public void crearTransaccion(Transaccion newTransaccion) {
		lista.add(newTransaccion);
		escribirEnArchivo();
		FileHandler.abrirYEscribirSerializado("Transacciones.Bat", lista);
	}

	@Override
	public String mostrarTransaciones() {
		String salida = "";
		for (Transaccion transaccion : lista) {
			salida += transaccion.toString();
		}		
		return salida;
	}

	@Override
	public String consultarTransaccion(int id, String tipoUsuario, String nombreCliente) {
		String salida = "";
		
		switch (tipoUsuario) {
		case "Cliente": {
			for (Transaccion transaccion : lista) {
				if(transaccion.getNombreCliente() == nombreCliente){
					salida += transaccion.toString();
				}
			}
			break;
		}case "Cajero":{
			for (Transaccion transaccion : lista) {
				if(transaccion.getId() == id){
					salida += transaccion.toString();
				}
			}
			break;
		}
		default:
			System.out.println("Algo Salio Mal");
		}
		
		return salida;
	}
}
