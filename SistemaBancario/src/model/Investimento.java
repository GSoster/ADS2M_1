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

	/*Aletera o valor do saldo dado uma taxa
	 * ex.: saldo(500) * 0.43% = 2.15 
	 */
	public void dividendos(double taxa){		
		double rendimento = (this.saldo) * (taxa/100);
		this.saldo += rendimento;
	}
			
}//fim da classe
