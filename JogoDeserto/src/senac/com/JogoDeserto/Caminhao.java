package senac.com.JogoDeserto;

public class Caminhao {

	private int qtdCombustivel = 0;
	private int posicao;
	
	public Caminhao(){
		this.qtdCombustivel = 6;
		this.posicao = 0;
	}

	public int getQtdCombustivel() {
		return this.qtdCombustivel;
	}

	public int getPosicao() {
		return this.posicao;
	}

	public void avancar() {
		this.qtdCombustivel--;
		this.posicao++;		
	}

	public void voltar(){
		this.qtdCombustivel--;
		this.posicao--;
	}
}


