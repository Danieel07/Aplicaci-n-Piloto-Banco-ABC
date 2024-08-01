package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.model.ClienteDTO;
import co.edu.unbosque.model.Transaccion;
import co.edu.unbosque.model.TransaccionDTO;

public class DataMapper {


    public TransaccionDTO toTransaccionDTO(Transaccion transaccion) {
        return new TransaccionDTO(transaccion.getMonto(),
        		transaccion.getId(),
        		transaccion.getHora(),
        		transaccion.getNombreCliente());
    }

    public Transaccion toTransaccion(TransaccionDTO transaccionDTO) {
        return new Transaccion(
        		transaccionDTO.getMonto(),
                transaccionDTO.getId(),
                transaccionDTO.getHora(),
                transaccionDTO.getNombreCliente()
        );
    }
    
    public ClienteDTO toClienteDTO(Cliente cliente) {
    	return new ClienteDTO(cliente.getCedula(),
    			cliente.getSaldo(),
    			cliente.getNombre());
    }
    
    public Cliente toCliente(ClienteDTO clienteDTO) {
    	return new Cliente(clienteDTO.getCedula(),
    			clienteDTO.getSaldo(),
    			clienteDTO.getNombre());
    }
}

