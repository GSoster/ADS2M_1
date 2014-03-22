package com.senac.jogos.apps.MatchingGame;

import com.senac.jogos.Jogador;
import com.senac.jogos.cartas.Baralho;
import com.senac.jogos.cartas.Carta;
import com.senac.jogos.rules.MatchingGame;

public class GameController {
//Atributos
	private MatchingGame game;
	private Baralho baralho;
	private Jogador jogador;
	private GameView view;
	
	/*metodo construtor
	 * Instancia um novo jogador
	 * Instancia um novo baralho
	 * Instancia um novo jogo e defini a carta inicial do jogo (mesa) como sendo uma aleatoria retirada do baralho
	 * Instancia uma nova visao
	 */
	public GameController() {
		jogador = new Jogador();
		baralho = new Baralho();
		game = new MatchingGame(baralho.drawCarta());
		view = new GameView();
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
		if (view.getUserInput().equalsIgnoreCase("jogar")) {
			Carta comprada = baralho.drawCarta();
			view.mostraCarta(comprada);
			int score = game.matchCards(comprada);
			jogador.addPontos(score);
			game.setMesa(comprada);
		}
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
		view.mostraJogador(jogador);
		view.mostraCarta(game.getMesa());
	}
	
}





