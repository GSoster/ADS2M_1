package controller;

import view.View;

public class Controller {

	//Atributos
	protected View view;
	
	
	public Controller(){
		this.view = new View();
	}
	
	
	
	public void inicio(){
		this.view.exibir("Bem vindo ao Sistema Bancario");
		this.view.exibir("Por favor, escolha sua opcao: ");
	}
	
	public void exibirMenu(){
		int opcao;
		do{
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
				
				break;
		
		}
	}
	
}
