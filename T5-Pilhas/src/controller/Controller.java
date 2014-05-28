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
	
	
	public void converteParaBinario(){
		int valor = this.view.recebeValor();
		this.pilha = new Pilha<Integer>();
		while(valor > 2){
			this.pilha.insert(valor%2);			
			valor = valor/2;
		}
		//desempilhando:
		String resultado = "";
		int qtd = this.pilha.size()-1;
		System.out.println("QTD: "+qtd);
		while(qtd > -1){
			resultado += this.pilha.get(qtd);
			System.out.println("RESULTADO: "+resultado);
			qtd--;
		}
		this.view.exibir(resultado);
	}
	

	
		
}
