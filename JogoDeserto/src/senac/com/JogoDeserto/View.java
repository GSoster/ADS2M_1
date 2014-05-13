package senac.com.JogoDeserto;

import java.util.Scanner;

public class View {
	
	private Scanner ler = null;
	
	public View(){
		this.ler = new Scanner(System.in);
	}
	
	public void apresentacao(){
		System.out.println("BEM VINDO A TRAVESSIA Do DESERTO!");
	}
	
	public String exibirMenuInicial() {		
		System.out.println("Digite uma das opções: ");
		System.out.println(" - AVANCAR - ");
		System.out.println(" - VOLTAR - ");
		System.out.println(" - DESCARREGAR - ");
		System.out.println(" - CARREGAR - ");
		return ler.nextLine().toLowerCase();
	}
	
	public void gameOver(){
		System.out.println("GAME OVER!");
	}
	
	
	
	
}
