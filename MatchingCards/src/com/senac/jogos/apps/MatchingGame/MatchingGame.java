package com.senac.jogos.apps.MatchingGame;

public class MatchingGame {

	public static void main(String[] args) {
		GameController game = new GameController();
		while (! game.isOver()) {
			game.showStatus();
			game.realizaJogada();
		}
	}

}
