package controller;

import view.ClienteView;
import model.Cliente;

public class ClienteController {

	private Cliente cliente;
	private ClienteView cv;
	
	public ClienteController(){
		this.cv = new ClienteView();
	}
	
	public Cliente criarCliente(){
		this.cv.criarCliente();
		return this.cliente = null;
	}
}
