package senac.com.JogoDeserto;

import java.util.Scanner;

public class View {
	
	private Scanner ler = null;
	
	public View(){
		this.ler = new Scanner(System.in);
	}
	
	public void apresentacao(){
		System.out.println("BEM VINDO AO DESERTO DO MAD MAX!");
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

	public void montaFichaStatus(){
		System.out.println("#########STATUS#########");
	}
	
	public void statusCaminhaoPosicao(int posicao) {
		System.out.println("Posicao do caminhao: "+posicao);		
	}

	public void statusCaminhaoCombustivel(int qtdCombustivel) {
		System.out.println("Quantidade de Combustivel do Caminhao: "+qtdCombustivel);
		
	}

	public void statusDesertoCombustivelPosicao(int valorDaPosicao) {		
		System.out.println("Quantidade de Combustivel nesta posicao do deserto: "+valorDaPosicao);		
	}
	
	public void statusDesertoCombustivelPosicaoInicial(){
		System.out.println("Quantidade de Combustivel nesta posicao do deserto: INFINITO");
	}
	
	public void opcaoInvalida(){
		System.out.println("Opção Inválida!");
	}
	
	
}
