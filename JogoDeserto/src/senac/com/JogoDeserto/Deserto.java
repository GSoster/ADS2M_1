package senac.com.JogoDeserto;

public class Deserto {

	private int[] deserto = null;
	
	
	public Deserto(){
		this.deserto = new int[10];
	}
	
	public int getValorDaPosicao(int indice) { 
		return this.deserto[indice];
	}

	public void setValorNaPosicao(int indice){
		this.deserto[indice]++;
	}
	
	public void retirarValorDaPosicao(int indice){
		this.deserto[indice]--;
		if(this.deserto[indice] < 0){
			this.deserto[indice] = 0;
		}
	}
	
	
}

