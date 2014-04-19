package view;

import java.util.Scanner;

public class View {

	// Atributos
	protected Scanner ler;

	// Metodo construtor
	public View() {
		this.ler = new Scanner(System.in);
	}

	/*
	 * Metodo responsavel por exibir mensagens para os usuarios
	 */
	public void exibir(String mensagem) {
		System.out.println(mensagem);
	}

	/*
	 * Metodo responsavel por ler a entrada do ususario, sempre le como String,
	 * o tratamento ocorre aonde o metodo e chamado
	 */
	public String receber() {
		String entrada = this.ler.nextLine();
		return entrada;
	}

}
