
public class MeuVetor {

	private int[] vetor;
	
	public MeuVetor(){
		//um vetor inicia sem valores.
		this.vetor = new int[0];
	}
					
	public void exibirVetor(){
		for(int i = 0; i<this.vetor.length; i++){
			System.out.println("posicao "+i+" contem: "+this.vetor[i]);
		}
	}
			
	
	public void remover(int indice){
		int[] vetTemp = new int[vetor.length-1];
		for(int i = 0; i<this.vetor.length; i++){
			if(i != indice){
				vetTemp[i] = this.vetor[i];
			}
		}		
	}
	
	public void adicionarElemento(int posicao, int valor){
		this.vetor[posicao] = valor;	
	}
	
	public void adicionarNovoElemento(int elemento){
		int posicaoAdicionar = vetor.length+1;
		System.out.println("Quantidade elemento vet"+posicaoAdicionar);
		int[] vetTemp = new int[posicaoAdicionar];
		vetTemp[posicaoAdicionar-1] = elemento;
		for(int i = 0; i < vetor.length; i++){
			vetTemp[i] = vetor[i];
		}
		
		this.vetor = vetTemp;			
	}
	
	public void removerElemento(int vetor[], int indice){
		vetor[indice] = -1;
	}
	
}
