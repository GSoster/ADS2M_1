package view;

import java.util.Scanner;

public class ContaView {
	
	public ContaView(){};
	
	public void exibir(String mensagem){
		System.out.println(mensagem);
	}
	
	public void receber(){
		Scanner ler = new Scanner(System.in);
		ler.nextLine();
		ler.close();
	}
}
