package controller;

import lib.SaldoInsuficienteException;
import model.Conta;
import model.Especial;
import model.Investimento;
import view.ContaView;

public class ContaController {

	// Atributos
	private ContaView cv;
	private Conta conta = null;
	private Especial contaEspecial = null;
	private Investimento contaInvestimento = null;

	// Metodo Construtor
	public ContaController() {
		this.cv = new ContaView();
	}

	/*
	 * Metodo responsavel por criar a conta e apenas isso.
	 */
	public void criarConta() {
		int numeroConta = Integer.parseInt(this.cv.cadastrarNumeroConta());
		int numVerificacao = Integer.parseInt(this.cv
				.cadastrarNumeroVerificacao());
		this.conta = new Conta(numeroConta, numVerificacao);
	}

	public void criarContaEspecial() {
		int numeroConta = Integer.parseInt(this.cv.cadastrarNumeroConta());
		int numVerificacao = Integer.parseInt(this.cv
				.cadastrarNumeroVerificacao());
		double limite = this.cv.cadastrarLimite();
		this.contaEspecial = new Especial(numeroConta, numVerificacao, limite);
	}

	public void criarContaInvestimento() {
		int numeroConta = Integer.parseInt(this.cv.cadastrarNumeroConta());
		int numVerificacao = Integer.parseInt(this.cv.cadastrarNumeroVerificacao());
		int dataCriacao = this.cv.cadastrarData();
		this.contaInvestimento = new Investimento(numeroConta, numVerificacao,
				dataCriacao);
	}

	/*
	 * Deposita um valor, este e adicionado a quantidade ja existente
	 */
	public void depositar() {
		double valor = this.cv.depositar();
		this.conta.depositar(valor);
	}

	/*
	 * retira um valor da conta contanto que esse o saldo da conta seja igual ou
	 * superior
	 */
	public void sacar() {
		try {
			double valor = this.cv.sacar();
			this.conta.sacar(valor);
		} catch (SaldoInsuficienteException sie) {
			this.cv.exibir(sie.getMessage());
		}
	}

	public boolean verificarConta(){
		if(Integer.parseInt(this.cv.cadastrarNumeroConta()) == this.conta.getNumConta()){
			if(Integer.parseInt(this.cv.cadastrarNumeroVerificacao()) == this.conta.getNumVerificacao()){
				return true;
			}			
		}
		return false;
	}
	
	
	public void exibirSaldo() {
		this.cv.exibir("Saldo: " + this.conta.getSaldo());
	}

	public void dividendos(){
		double taxa = this.cv.dividendos();
		this.contaInvestimento.dividendos(taxa);
	}
	
	public void setConta(Conta c) {
		this.conta = c;
	}
	
	public void setContaInvestimento(Investimento inv){
		this.contaInvestimento = inv;
	}
	
	public void setContaEspecial(Especial esp){
		this.contaEspecial = esp;
	}
	
	// Recupera a conta
	public Conta getConta() {
		return this.conta;
	}

	// Recupera a contaEspecial
	public Especial getContaEspecial() {
		return this.contaEspecial;
	}

	// recupera conta Investimento
	public Investimento getContaInvestimento() {
		return this.contaInvestimento;
	}

}
