package model;

public class Investimento extends Conta{
	//Atributos
	private int dataCriacao;
	
	//Metodo construtor
	public Investimento(int numConta, int numVerificacao, int dataCriacao) {
		super(numConta, numVerificacao);
		setDataCriacao(dataCriacao);
	}
	
	//Metodos acessores
	public void setDataCriacao(int dataCriacao){
		this.dataCriacao = dataCriacao;
	}
	public int getDataCriacao(){
		return this.dataCriacao;
	}
	
	//Outros Metodos
	//Aletera o valor do saldo dado uma taxa
	public void dividendos(double taxa){
		//tratar a taxa pois ela não virá como 1.43 e sim como 0.43 ou 43
		this.saldo = this.saldo * taxa;
	}
		
}//fim da classe
