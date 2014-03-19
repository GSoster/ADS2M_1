package com.senac.jogos.cartas;

public class Carta {
	private int numero;
	private char naipe;
	
	public Carta (int numero, char naipe)
	{
		this.numero = numero;
		this.naipe = naipe;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public char getNaipe() {
		return this.naipe;
	}
}
