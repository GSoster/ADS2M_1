package model;

public class Cliente extends Pessoa {
	// Atributos
	private Conta conta;

	// Construtor
	public Cliente(String nomeCompleto, String endereco){
		super(nomeCompleto, endereco);
	}

	// Acessores
	public void setConta(Conta c) {
		this.conta = c;
	}

	public Conta getConta() {
		return this.conta;
	}
}
