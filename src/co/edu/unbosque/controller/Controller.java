package co.edu.unbosque.controller;

import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.Transaccion;
import co.edu.unbosque.model.TransaccionDTO;
import co.edu.unbosque.view.Console;

public class Controller {
	private Console con;
	private ModelFacade mf;
	
	public Controller() {
		con =  new Console();
		mf = new ModelFacade();
	}
	public void run() {
		mainloop: while(true) {
			con.printText(" Usted es: \n (1)Cliente \n (2)Cajero \n (3)Salir");
			int tipoCliente = con.readInt();
			
			switch (tipoCliente) {
			case 1: {
				con.printText("¿Que Desea Hacer?\n"
						+ "(1)Consultar Saldo\n"
						+ "(2)Consultar Transacciones Registradas\n"
						+ "(3)Salir");
				int opCliente = con.readInt();
				
				switch (opCliente) {
				case 1: {
					con.printText("Digite Su Numero De Cedula:");
					long cedulaCliente = con.readLong();
					con.printText(mf.getClienteDAO().consultarSaldo(cedulaCliente));
					break;
				}case 2: {
					con.printText("Digite Su Numero De Cedula:");
					long cedulaCliente = con.readLong();
					String nombreCliente = mf.getClienteDAO().consultarNombreCliente(cedulaCliente);
					System.out.println(nombreCliente);
					con.printText(mf.getTransaccionDAO().consultarTransaccion(0, "Cliente", nombreCliente));
					break;
				}case 3: {
					break;
				}
				default:
					System.out.println("Opcion Fuera de Rango");
				}
				break;
			}case 2:{
				con.printText("¿Que Desea Hacer?\n"
						+ "(1)Crear Transacción\n"
						+ "(2)Consultar Transacciones Registradas\n"
						+ "(3)Consultar Transaccion por Id\n"
						+ "(4)Salir");
				int opCajero = con.readInt();
				switch (opCajero) {
				case 1: {
					con.printText("Digite El Monton:");
					long monto = con.readLong();
					con.printText("Id:");
					int id = con.readInt();
					con.printText("Hora De la Transacción, Formato 24H (Solo la Hora):");
					int hora = con.readInt();
					int horaMax = 18;
					int horaMin = 16;
					String horaString = Integer.toString(hora);
					con.printText("Nombre Del Cliente Quien Realizo la Transacción:");
					con.readLine();
					String nombreCliente = con.readLine();
					if(monto > 1500000 && hora <= horaMax && hora >= horaMin) {
						Transaccion newTransaccion = mf.getDataMapper().toTransaccion(new TransaccionDTO(monto, id,"A las " + horaString+" Horas", nombreCliente));
						mf.getTransaccionDAO().crearTransaccion(newTransaccion);
						con.printText("Transaccion Creada Con exito");
					}else {
						con.printText("La transccion no cumple con los parametros para ser registrada");
					}
					break;
				}case 2: {
					con.printText(mf.getTransaccionDAO().mostrarTransaciones());
					break;
				}case 3: {
					con.printText("Digite el (Id) De la transacción a consultar:");
					int idTransaccion = con.readInt();
					con.printText(mf.getTransaccionDAO().consultarTransaccion(idTransaccion, "Cajero", ""));
					break;
				}case 4: {
					break;
				}default:
					System.out.println("Opcion Fuera de Rango");
				}
				break;
			}case 3:{
				break mainloop;
			}
			default:
				System.out.println("Opcion Fuera de Rango");
			}
		}
		
	}
}
