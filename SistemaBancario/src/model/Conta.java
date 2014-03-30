package model;

import lib.SaldoInsuficienteException;

public class Conta {
	// Atributos
	protected double saldo;
	protected int numConta;
	protected int numVerificacao;

	// Metodo construtor
	public Conta(int numConta, int numVerificacao) {
		setNumConta(numConta);
		setNumVerificacao(numVerificacao);
	}

	// Metodos acessores
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public void setNumVerificacao(int numVerificacao) {
		this.numVerificacao = numVerificacao;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumConta() {
		return this.numConta;
	}

	public int getNumVerificacao() {
		return this.numVerificacao;
	}

	// Outros Metodos
	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException();
		}
		this.saldo -= valor;
	}

}// fim da classe
