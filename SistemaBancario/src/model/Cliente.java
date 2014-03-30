package model;

public class Cliente extends Pessoa {
	// Atributos
	private Conta conta;

	// Construtor
	public Cliente(String n, String sn, String e) {
		super(n, sn, e);
	}

	// Acessores
	public void setConta(Conta c) {
		this.conta = c;
	}

	public Conta getConta() {
		return this.conta;
	}
}
