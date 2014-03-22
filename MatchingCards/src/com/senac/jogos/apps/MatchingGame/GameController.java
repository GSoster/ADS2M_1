package com.senac.jogos.apps.MatchingGame;

import com.senac.jogos.Jogador;
import com.senac.jogos.cartas.Baralho;
import com.senac.jogos.cartas.Carta;
import com.senac.jogos.rules.MatchingGame;

public class GameController {
//Atributos
	private MatchingGame game;
	private Baralho baralho;
	private Jogador jogador[];
	private GameView view;
	private int qtdPlayers;
	
	int jogDaVez = 0;
	
	/*metodo construtor
	 * Instancia um novo jogador
	 * Instancia um novo baralho
	 * Instancia um novo jogo e defini a carta inicial do jogo (mesa) como sendo uma aleatoria retirada do baralho
	 * Instancia uma nova visao
	 */
	public GameController() {
		
		view = new GameView();		
		jogador = new Jogador[this.defineQtdPlayers()];
		int i = 0;
		while(i<this.qtdPlayers){
			jogador[i] = new Jogador(); 
			i++;
		}
		baralho = new Baralho();
		game = new MatchingGame(baralho.drawCarta());
		
	}

	
	public int defineQtdPlayers(){
		this.qtdPlayers = this.view.exibeInicio(); 
		return this.qtdPlayers;
	}
	
	
	/*
	 * realizaJogada()
	 * realiza as principais acoes do jogo:
	 * Cria um objeto comprada do tipo Carta e define seu valor como sendo o de uma carta aleatoria
	 * exibe o numero e naipe da carta
	 * checa se a carta comprada marca algum ponto em relacao a que esta na mesa
	 * adiciona (ou subtrai) a quantidade de pontos ao socre do jogador
	 * define a carta da mesa como a ultima carta comprada.
	 */
	public void realizaJogada() {
		//para a quantidade de jogadores
		for(int i = 0; i<this.qtdPlayers;i++){
			//se a opcao for sacar
			String opcao = this.view.exibeOpcoes();
			if (opcao.equalsIgnoreCase("sacar")) {
				Carta comprada = baralho.drawCarta();
				view.mostraCarta("Jogador "+i+" Comprou: ",comprada);
				int score = game.matchCards(comprada);
				jogador[i].addPontos(score);
				view.mostraJogador(jogador[i],i);
				game.setMesa(comprada);
				view.mostraCarta("Carta na mesa: ",game.getMesa());
			}else if(opcao.equalsIgnoreCase("passar a vez")) {				
				this.view.exibir("Jogador "+i+" passou a vez" );
				jogador[i].addPontos(-1);
				view.mostraJogador(jogador[i],i);
			}else if(opcao.equalsIgnoreCase("parar")){
				int ganhador = this.definirGanhador();
				this.view.exibir("Jogador "+ganhador+" ganhou com ");
				this.view.exibir(this.jogador[ganhador].getPontos()+" pontos.");
				this.baralho.setNumCartas(0);
			}
			
		}//fecha for
		
		
		
	}

	//retorna um boolean que checa se as cartas ja foram todas sacadas ou nao
	public boolean isOver() {
		return baralho.isEmpty();
	}
	
	/*showStats
	 * mostra a quantidade de pontos do jogador
	 * mostra o numero e naipe da carta na mesa.
	 */
	public void showStatus() {
		//view.mostraJogador(jogador[jogDaVez]);
		//view.mostraCarta(game.getMesa());
	}
	
	/*
	 * Define qual o jogador que venceu.
	 */
	private int definirGanhador(){
		//se começar do zero e todos os jogadores tiverem pontos negativos, o resultado seria errado.(seria o jogador zero)
		int maior = -1000;
		for(int i = 0; i<this.qtdPlayers; i++){
			if(this.jogador[i].getPontos() > maior){
				maior = i;
			}
		}
		return maior;
	}
	
	
}





