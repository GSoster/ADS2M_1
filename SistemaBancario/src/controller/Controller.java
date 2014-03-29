package controller;

import model.Cliente;
import model.Conta;
import view.View;

public class Controller {

	//Atributos
	protected View view;	
	private ClienteController cliControl;
	private ContaController contControl;
	
	private Cliente cliente;
	private Conta conta;
	
	public Controller(){
		this.view = new View();
		this.inicio();
	}
	
	
	
	private void inicio(){
		this.view.exibir("Bem vindo ao Sistema Bancario");		
	}
	
	public void exibirMenu(){
		int opcao;
		do{
			this.view.exibir("\n############################");
			this.view.exibir("Por favor, escolha sua opcao: ");
			this.view.exibir("1 - Criar Cliente.");
			this.view.exibir("2 - Criar Conta");
			this.view.exibir("3 - Criar Conta Especial");
			this.view.exibir("4 - Criar Conta Investimento");
			this.view.exibir("0 - Sair");
			opcao = Integer.parseInt(this.view.receber());
			tratarEscolha(opcao);
		}while(opcao != 0);		
	}
	
	public void tratarEscolha(int opcao){
		switch(opcao){
			
			case 1:
				this.cliControl = new ClienteController();
				this.cliControl.criarCliente();
				this.cliente = this.cliControl.getCliente();
				this.view.exibir("Cliente Criado com Sucesso!");
				break;
			case 2:
				this.contControl = new ContaController();
				this.contControl.criarConta();
				this.conta = this.contControl.getConta();
				this.view.exibir("Conta Criada com Sucesso!");
				break;
		}
	}
	
}
