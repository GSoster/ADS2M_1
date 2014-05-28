package controller;
import model.Pilha;
import view.View;
public class Controller {

	private View view;
	private Pilha pilha;
	private int[] valores = null;
	
	
	public Controller(){
		this.view = new View();
	}
	
	
	//Verifica se uma palavra é igual indiferente da ordem (OVO).
	public boolean isPalindromo(){
		boolean isPalindromo = true;
		//recebe palavra do ususario
		String palavra = view.recebePalindromo().toLowerCase();
		//transforma a palavra em um array de chars
		char[] letras = palavra.toCharArray();
		this.pilha = new Pilha<String>();
		

		//adiciona os valores ao vetor
		for(char letra : letras){
			this.pilha.insert(letra);
		}
		
		//Verifica se a as letras são as mesmas em ordem contrária
		int j = 0;
		for(int i = palavra.length()-1; i>=0; i--){
			if((char)this.pilha.get(j) != letras[i]){
				isPalindromo = false;				
			}
			//Linha abaixo é apenas para debugar
			System.out.println("vet["+j+"] = "+pilha.get(j)+ " X letras["+i+"] = "+letras[i]);
			j++;		
		}		
		return isPalindromo;		
	}

	/**
	 * 
	 * @return
	 */
	public void tratarExpressao(){
		this.view.recebeExpressao();
	}
	
	/**
	 * Recebe um valor inserido pelo usuário
	 * verifica se é maior ou igual a 2
	 * caso sim insere o resto da divisão do valor por 2 na pilha
	 * no final insere o proprio valor na pilha (quando não passar mais no teste)
	 * retira os elementos da pilha e exibe
	 */
	public void converteParaBinario(){
		int valor = this.view.recebeValor();
		this.pilha = new Pilha<Integer>();
		int qtd = 0;
		while(valor >= 2){
			this.pilha.insert(valor%2);				
			valor = valor/2;
			qtd++;
		}		
			this.pilha.insert(valor);			
		//desempilhando:
		String resultado = "";
		while(qtd >= 0){			
			resultado += this.pilha.get(qtd);			
			qtd--;			
		}
		this.view.exibir(resultado);
	}
	

	
		
}
