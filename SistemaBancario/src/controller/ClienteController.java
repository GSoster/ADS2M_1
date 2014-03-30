package controller;

import view.ClienteView;
import model.Cliente;

public class ClienteController extends PessoaController{
	//Atributos
	private Cliente cliente;
	//o atributo abaixo nao estava sendo usado e para que o findbugs nao reclamasse foi comentado
	//private ClienteView cv;
	
	public ClienteController(){
	}
	
	public void criarCliente(){
		this.criarPessoa();			
		this.cliente = new Cliente(getPessoa().getNome(), getPessoa().getSobrenome(), getPessoa().getEndereco());				
	}
	
	public Cliente getCliente(){
		return this.cliente;
	}
}
