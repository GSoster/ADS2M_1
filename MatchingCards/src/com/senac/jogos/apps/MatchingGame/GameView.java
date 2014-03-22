package com.senac.jogos.apps.MatchingGame;

import java.util.Scanner;

import com.senac.jogos.Jogador;
import com.senac.jogos.cartas.Carta;

import static java.lang.System.out;

public class GameView {

	private Scanner teclado = new Scanner(System.in);
	
	public String getUserInput()
	{
		return teclado.nextLine();
	}
	
	public void mostraCarta(String origem,Carta carta) {
		out.println(String.format(origem + " %d%c",
				                  carta.getNumero(),
				                  carta.getNaipe()));
	}
	
	public void mostraJogador(Jogador jogador, int n) {
		System.out.println(" O Jogador "+n+" tem "+jogador.getPontos()+" pontos.");		
		
	}
	
	/*	########	Metodos criados por mim		########*/
	public String exibeOpcoes(){
		System.out.print("Digite: 'sacar' -> sacar uma carta");
		System.out.println(" 'passar' -> para passar a vez (perde 1 ponto)");
		System.out.print(" 'parar' -> acaba o jogo e exibe vencedor");
		return getUserInput();		
	}
	
	public int exibeInicio(){
		int qtdPlayers = 0;
		do{
			System.out.print("Insira a quantidade de jogadores: ");
			qtdPlayers = teclado.nextInt();
		}while((qtdPlayers<1) || (qtdPlayers>4));		 
		return qtdPlayers;		
	}
	
	public void exibir(String conteudo){
		System.out.println(conteudo);
	}
}
