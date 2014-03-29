package model;

public class Cliente extends Pessoa {
	
	private Conta conta;
	
	public Cliente(String n, String sn, String e){
		super(n, sn, e);
	}
	
	public void adicionarConta(Conta c){
		this.conta = c;
	}
	
	public Conta getConta(){
		return this.conta;
	}
}
