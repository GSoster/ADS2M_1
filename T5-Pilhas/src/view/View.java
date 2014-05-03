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
	
	
}
