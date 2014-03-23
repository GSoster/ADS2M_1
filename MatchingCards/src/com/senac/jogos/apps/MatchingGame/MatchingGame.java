package com.senac.jogos.apps.MatchingGame;

public class MatchingGame {

	public static void main(String[] args) {				
		GameController game = new GameController();
		game.mostrarCartaMesa();
		while (! game.isOver()) {						
			game.realizaJogada();
		}
	}

}
