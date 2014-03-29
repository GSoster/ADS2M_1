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
	
	public void depositar(){
		double valor = this.cv.depositar();
		this.conta.depositar(valor);
	}
	
	public void sacar(){
		double valor = this.cv.sacar();
		this.conta.sacar(valor);
	}

	public void exibirSaldo(){
		this.cv.exibir("Saldo: "+this.conta.getSaldo());
	}
	
	public void setConta(Conta c){
		this.conta = c;
	}
	
}
