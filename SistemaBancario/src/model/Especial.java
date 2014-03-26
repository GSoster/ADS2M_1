package model;

public class Especial extends Conta {
	//Atributos
	private double limite;
	
	//Metodo Construtor
	public Especial(int numConta, int numVerificacao, double limite) {
		super(numConta, numVerificacao);
		setLimite(limite);
	}
	
	//Metodos acessores
	public void setLimite(double limite){
		this.limite = limite;
	}	
	public double getLimite(){
		return this.limite;
	}

}//fim da classe
