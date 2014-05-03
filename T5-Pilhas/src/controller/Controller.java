package controller;
import model.Vetor;
import view.View;
public class Controller {

	private View view;
	private Vetor vet;
	
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
		this.vet = new Vetor<String>();
		

		//adiciona os valores ao vetor
		for(char letra : letras){
			this.vet.insert(letra);
		}
		
		//Verifica se a as letras são as mesmas em ordem contrária
		int j = 0;
		for(int i = palavra.length()-1; i>=0; i--){
			if((char)this.vet.get(j) != letras[i]){
				isPalindromo = false;				
			}
			//Linha abaixo é apenas para debugar
			System.out.println("vet["+j+"] = "+vet.get(j)+ " X letras["+i+"] = "+letras[i]);
			j++;		
		}		
		return isPalindromo;		
	}

		
}
