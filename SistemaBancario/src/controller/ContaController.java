package controller;

import model.Conta;
import view.ContaView;

public class ContaController {

	//Atributos
	private ContaView cv;
	private Conta conta;
	
	public ContaController(){
		this.cv = new ContaView();
	}
	
	
	public void criarConta(){
		int numeroConta = Integer.parseInt(this.cv.cadastrarNumeroConta());
		int numVerificacao = Integer.parseInt(this.cv.cadastrarNumeroVerificacao());
		this.conta = new Conta(numeroConta, numVerificacao);		
	}
	
	public Conta getConta(){
		return this.conta;
	}
	
}
