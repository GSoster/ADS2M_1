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
	
	
	//Verifica se uma palavra � igual indiferente da ordem (OVO).
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
		
		//Verifica se a as letras s�o as mesmas em ordem contr�ria
		int j = 0;
		for(int i = palavra.length()-1; i>=0; i--){
			if((char)this.pilha.get(j) != letras[i]){
				isPalindromo = false;				
			}
			//Linha abaixo � apenas para debugar
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
	 * Recebe um valor inserido pelo usu�rio
	 * verifica se � maior ou igual a 2
	 * caso sim insere o resto da divis�o do valor por 2 na pilha
	 * no final insere o proprio valor na pilha (quando n�o passar mais no teste)
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
