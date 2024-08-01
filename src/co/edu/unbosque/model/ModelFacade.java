package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.ClienteDAO;
import co.edu.unbosque.model.persistence.DataMapper;
import co.edu.unbosque.model.persistence.TransaccionDAO;

public class ModelFacade {
	private ClienteDAO clienteDAO;
	private TransaccionDAO transaccionDAO;
	private DataMapper dataMapper;
	
	public ModelFacade() {
		clienteDAO = new ClienteDAO();
		transaccionDAO =  new TransaccionDAO();
		dataMapper = new DataMapper();
	}

	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	public void setClienteDAO(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	public TransaccionDAO getTransaccionDAO() {
		return transaccionDAO;
	}

	public void setTransaccionDAO(TransaccionDAO transaccionDAO) {
		this.transaccionDAO = transaccionDAO;
	}

	public DataMapper getDataMapper() {
		return dataMapper;
	}

	public void setDataMapper(DataMapper dataMapper) {
		this.dataMapper = dataMapper;
	}
}
