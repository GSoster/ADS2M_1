package view;

import java.util.Scanner;

public class View {

	private static final Scanner ler = new Scanner(System.in);;
	
	public View(){
		
	}
	
	public String recebePalindromo(){
		System.out.println("Digite uma palavra para avaliar se e palindromo: ");
		return (String)ler.nextLine();
	}
	
	
	public int recebeValor(){
		System.out.println("Digite um valor decimal a ser convertido para binario: ");
		return ler.nextInt();
	}
	
	public String recebeExpressao(){
		System.out.println("Digite uma expressao para converter: ");
		String expressao = (String)ler.nextLine();	
				
		return "a";		
	}
	
	public void exibir(String mensagem){
		System.out.println(mensagem);
	}
	
	
	
}
