package com.senac.jogos.cartas;

public class Baralho {
	
	private Carta[] cartas;
	private int numCartas;
	
	public Baralho() {
		char[] naipes = {'C','O','P','E'};
		int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		cartas = new Carta[52];
		numCartas = 0;
		
		for (char naipe: naipes ) {
			for (int numero: numeros) {
				cartas[numCartas] = new Carta(numero, naipe);
				numCartas++;
			}
		}
	}
	
	public Carta drawCarta() {
		Carta carta = null;
		
		int indice = (int)(Math.random() * numCartas);
		carta = cartas[indice];
		numCartas--;
		cartas[indice] = cartas[numCartas];
		
		return carta;
	}

	public boolean isEmpty() {
		return numCartas == 0;
	}
}
