package com.senac.jogos.cartas;

public class Carta {
	//Atributos
	private int numero;
	private char naipe;
	
	//metodo construtor
	public Carta (int numero, char naipe)
	{
		this.numero = numero;
		this.naipe = naipe;
	}
	
	//retorna o  numero da carta 
	public int getNumero() {
		return this.numero;
	}
	//retorna o naipe da carta
	public char getNaipe() {
		return this.naipe;
	}
}
