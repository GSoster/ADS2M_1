package controller;

import model.Pessoa;
import view.PessoaView;

public class PessoaController {

	// Atributos
	private PessoaView pv;
	private Pessoa p;

	// Construtor
	public PessoaController() {
		this.pv = new PessoaView();
	}

	/*
	 * recebe as entradas do usuario e cria um objeto pessoa
	 */
	public void criarPessoa() {
		String nome = this.pv.cadastrarNome();
		String sobreNome = this.pv.cadastrarSobreNome();
		String endereco = this.pv.cadastrarEndereco();
		this.p = new Pessoa(nome, sobreNome, endereco);
	}

	// Retorna o objeto Pessoa
	public Pessoa getPessoa() {
		return this.p;
	}

}
