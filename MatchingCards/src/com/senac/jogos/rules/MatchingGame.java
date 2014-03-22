package com.senac.jogos.rules;

import com.senac.jogos.cartas.Carta;

public class MatchingGame {
	//Atributos
	private Carta mesa;
	
	//metodo construtor, define um valor para o atributo mesa (que é um objeto do tipo Carta)
	public MatchingGame(Carta inicial) {
		mesa = inicial;
	}

	//define o valor do objeto mesa que é um objeto do tipo Carta
	public void setMesa(Carta mesa)
	{
		this.mesa = mesa;
	}
	
	//retorna o objeto mesa (do tipo Carta)
	public Carta getMesa()
	{
		return mesa;
	}
	
	/*
	 * Recebe um objeto carta chamado comprada
	 * define o score como -2
	 * caso as cartas (a da mesa e a comprada) sejam do mesmo naipe, o score passa a ser 1
	 * caso as cartas (a da mesa e a comprada) tenham o mesmo numero, o score passa a ser 4
	 * retorna o score
	 */
	public int matchCards(Carta comprada)
	{
		int score = -2;
		
		if (mesa.getNaipe() == comprada.getNaipe())
			score = 1;
		if (mesa.getNumero() == comprada.getNumero())
			score = 4;
		
		return score;
	}
}
