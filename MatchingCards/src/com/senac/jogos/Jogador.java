package com.senac.jogos;

public class Jogador {
	//Atributos
	private int pontos;
	//metodo construtor
	public Jogador() {
		pontos = 0;
	}
	
	//retorna quantidade de pontos do jogador
	public int getPontos() {
		return pontos;
	}
	//adiciona pontos a quantidade atual de pontos do jogador
	public void addPontos(int pontos) {
		this.pontos += pontos;
	}
	
	//diminui quantidade x(parametro) de pontos da pontuacao atual do jogador
	public void subtractPontos(int pontos) {
		this.pontos -= pontos;
	}
}
