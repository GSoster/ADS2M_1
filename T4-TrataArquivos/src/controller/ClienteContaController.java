package controller;
import model.*;
import controller.*;
import view.*;
public class ClienteContaController {
	//Atributos
	private Conta conta;
	private ArquivoController arqControl;
	private Cliente cliente;
	private View view;
	private Controller control;
	
	
	public ClienteContaController(){
		this.arqControl = new ArquivoController();
		this.view = new View();
		this.control = new Controller();
	}
	
	
	
	public void criarConta(){
		//Criando lista de pessoas randomicamente
		this.arqControl.gravarContatos();
		//pegando os dados de uma unica pessoa
		this.arqControl.separarDadosContato();
		//criando um cliente com os dados recem pegos
		this.cliente = this.arqControl.getCliente();
		//Passandoe sse cliente para o da classe Controller que trabalhará
		//com as contas
		this.control.setCliente(this.cliente);
		//exibindo as informacoes do cliente 
		this.view.exibir("Cliente: " + this.cliente.getNome());
		this.view.exibir("Endereco: "+this.cliente.getEndereco());
		
		//mostrando menu de operacoes (contas)
		this.control.clienteCriado = true;
		this.control.exibirMenu();
	}
	
}
