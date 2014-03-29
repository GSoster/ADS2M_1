package controller;

import view.ClienteView;
import model.Cliente;

public class ClienteController extends PessoaController{

	private Cliente cliente;
	private ClienteView cv;
	
	public ClienteController(){
		this.cv = new ClienteView();
	}
	
	public Cliente criarCliente(){
		this.criarPessoa();			
		this.cliente = new Cliente(getPessoa().getNome(), getPessoa().getSobrenome(), getPessoa().getEndereco());		
		return this.cliente;
	}
}
