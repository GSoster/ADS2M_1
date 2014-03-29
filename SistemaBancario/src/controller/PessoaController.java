package controller;

import model.Pessoa;
import view.PessoaView;

public class PessoaController {

	//Atributos
	private PessoaView pv;
	private Pessoa p;
	
	public PessoaController(){
		this.pv = new PessoaView();
	}
	
	public void criarPessoa(){
		String nome = this.pv.cadastrarNome();
		String sobreNome = this.pv.cadastrarSobreNome();
		String endereco = this.pv.cadastrarEndereco();
		this.p = new Pessoa(nome, sobreNome, endereco);		
	}
	
	public Pessoa getPessoa(){
		return this.p;
	}
	
}
