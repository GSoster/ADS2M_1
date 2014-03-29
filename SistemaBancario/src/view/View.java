package view;

import java.util.Scanner;

public class View {

	 //Atributos
	protected Scanner ler;
	
	//Metodo construtor
	public View(){		
		this.ler = new Scanner(System.in);
	}
	
	public void exibir(String mensagem){
		System.out.println(mensagem);
	}
	
	public String receber(){		
		String entrada = this.ler.nextLine();		
		return entrada;
	}
	
}
