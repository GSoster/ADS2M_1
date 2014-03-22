package com.senac.jogos.cartas;

public class Baralho {
	//Atributos
	private Carta[] cartas;
	private int numCartas;
	
	/*construror
	 * define os 4 naipes
	 * cria um vertor com 52 cartas e o preenche com 13 cartas de cada naipe
	 */
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
	
	//saca uma carta aleatoria do baralho
	public Carta drawCarta() {
		Carta carta = null;
		
		int indice = (int)(Math.random() * numCartas);
		carta = cartas[indice];
		numCartas--;
		cartas[indice] = cartas[numCartas];
		
		return carta;
	}

	/*
	 * Retorna um boolean que diz se as cartas ja foram todas sacadas ou nao
	 */
	public boolean isEmpty() {
		return numCartas == 0;
	}
	
	public void setNumCartas(int cartas){
		this.numCartas = cartas;
	}
	
}
