package senac.com.JogoDeserto;
import senac.com.JogoDeserto.OutOfDesertException;
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

	public void avancar() throws OutOfDesertException {
		if(this.posicao == 9){
			throw new OutOfDesertException();
		}
		this.posicao++;
		this.qtdCombustivel--;
	}

	public void voltar() throws OutOfDesertException{			
		if(this.posicao == 0){
			throw new OutOfDesertException();
		}
		this.posicao--;		
		this.qtdCombustivel--;
		recarregarNaPosicaoInicial();
	}
		
	private void recarregarNaPosicaoInicial(){
		if(this.posicao == 0){
			this.qtdCombustivel = 6;
		}
	}
	
	public void descarregar() throws OutOfGasException{
		if(this.qtdCombustivel == 0){
			throw new OutOfGasException();
		}
		this.qtdCombustivel--;
	}
	
}


