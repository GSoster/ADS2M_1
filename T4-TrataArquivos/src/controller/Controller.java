package controller;

import model.*;
import view.*;

public class Controller {

	// Atributos
	protected View view;
	private ArquivoController arqControl;
	private ContaController contControl;

	private Cliente cliente;
	private Conta conta;
	private Especial contaEspecial;
	private Investimento contaInvestimento;

	// Variaveis utilizadas para controle de fluxo e opcoes
	public boolean clienteCriado;
	public boolean contaInvestimentoCriada = false;
	public boolean contaCriada = false;

	// Metodo construtor
	public Controller() {
		this.view = new View();		
		this.arqControl = new ArquivoController();
		this.inicio();
	}

	// Mensagem exibida inicialmente
	private void inicio() {
		this.view.exibir("Bem vindo ao Sistema Bancario");
	}

	/*
	 * MENU DE CRIACAO menu 'externo' com as principais opcoes (opcoes de
	 * CRIACAO)
	 */
	public void exibirMenu() {
		int opcao;
		do {
			this.view.exibir("\n############################");
			if(clienteCriado && contaCriada){
				this.view.exibir("Por favor, CONFIRME sua opcao: ");
			}else{
				this.view.exibir("Por favor, escolha sua opcao: ");
			}
			if (clienteCriado && !contaCriada) {
				this.view.exibir("2 - Criar Conta");
				this.view.exibir("3 - Criar Conta Especial");
				this.view.exibir("4 - Criar Conta Investimento");
			}
			this.view.exibir("0 - Sair");
			opcao = Integer.parseInt(this.view.receber());
			tratarEscolha(opcao);
		} while (opcao != 0);
	}

	/*
	 * Trabalha com o primeiro level de escolhas do usuario (qual conta criar)
	 */
	public void tratarEscolha(int opcao) {
		// usado nas escolhas de operacoes nas contas
		int escolha = 1;
		switch (opcao) {
		case 0:
			this.arqControl.gravarContas(this.cliente.getConta());
			this.view.exibir("Obrigado por utilizar nossos servicos");			
			break;
		case 2:
			this.contControl = new ContaController();
			this.contControl.criarConta();
			this.conta = this.contControl.getConta();
			this.cliente.setConta(this.conta);
			contaCriada = true;			
			this.view.exibir("Conta Criada com Sucesso!");
			while (escolha != 0) {
				escolha = menuOperacoes();
				if (verificarConta()) {
					tratarContaComum(escolha);
				} else {
					this.view
							.exibir("Dados nao conferem, impossivel acessar a conta");
				}
			}
			break;
		case 3:
			this.contControl = new ContaController();
			this.contControl.criarContaEspecial();
			this.contaEspecial = this.contControl.getContaEspecial();
			this.contControl.setConta(contaEspecial);
			this.cliente.setConta(this.contaEspecial);
			contaCriada = true;
			this.view.exibir("Conta Especial criada com Sucesso!");
			while (escolha != 0) {
				escolha = menuOperacoes();
				if (verificarConta()) {
					tratarContaEspecial(escolha);
				} else {
					this.view
							.exibir("Dados nao conferem, impossivel acessar a conta");
				}
			}
			break;
		case 4:
			this.contControl = new ContaController();
			this.contControl.criarContaInvestimento();
			this.contaInvestimento = this.contControl.getContaInvestimento();
			this.contControl.setConta(this.contaInvestimento);
			this.cliente.setConta(this.contaInvestimento);
			contaCriada = true;
			contaInvestimentoCriada = true;
			while (escolha != 0) {
				escolha = menuOperacoes();
				if (verificarConta()) {
					tratarContaInvestimento(escolha);
				} else {
					this.view
							.exibir("Dados nao conferem, impossivel acessar a conta");
				}
			}
			break;
		default:
			this.view.exibir("Opcao nao encontrada");
			break;

		}
	}

	/*
	 * Menu que exibe as operacoes disponiveis (dependem do tipo da conta, como
	 * dividendo)
	 */
	public int menuOperacoes() {
		this.view.exibir("1 - Depositar");
		this.view.exibir("2 - Sacar");		
		if (contaInvestimentoCriada) {
			this.view.exibir("3 - dividendos");
		}
		this.view.exibir("0 - Sair");
		return Integer.parseInt(this.view.receber());
	}

	/*
	 * Metodo responsavel por tratar as escolhas feitas no menu de operacoes
	 * caso a conta seja do tipo comum
	 */
	public void tratarContaComum(int escolha) {
		switch (escolha) {
		case 0:
			//this.view.exibir("Obrigado por utilizar nossos servicos");
			break;
		case 1:
			this.contControl.depositar();
			this.contControl.exibirSaldo();
			break;
		case 2:
			this.contControl.sacar();
			this.contControl.exibirSaldo();
			break;			
		default:
			this.view.exibir("Opcao nao encontrada");
			break;
		}
	}

	/*
	 * Metodo responsavel por tratar as escolhas feitas no menu de operacoes
	 * caso a conta seja do tipo especial
	 */
	public void tratarContaEspecial(int escolha) {
		switch (escolha) {
		case 0:
			//this.view.exibir("Obrigado por utilizar nossos servicos");
			break;
		case 1:
			this.contControl.depositar();
			this.contControl.exibirSaldo();
			break;
		case 2:
			this.contControl.sacar();
			this.contControl.exibirSaldo();
			break;
		default:
			this.view.exibir("Opcao nao encontrada");
			break;
		}
	}

	/*
	 * Metodo responsavel por tratar as escolhas feitas no menu de operacoes
	 * caso a conta seja do tipo Investimento
	 */
	public void tratarContaInvestimento(int escolha) {
		switch (escolha) {
		case 0:
			//this.view.exibir("Obrigado por utilizar nossos servicos");
			break;
		case 1:
			this.contControl.depositar();
			this.contControl.exibirSaldo();
			break;
		case 2:
			this.contControl.sacar();
			this.contControl.exibirSaldo();
			break;
		case 3:
			this.contControl.exibirSaldo();
			this.contControl.dividendos();
			this.contControl.exibirSaldo();
			break;
		default:
			this.view.exibir("Opcao nao encontrada");
			break;
		}
	}

	/*
	 * Metodo responsavel por chamar o metodo que checa numero de verificacao e
	 * numero da conta
	 */
	private boolean verificarConta() {
		this.view.exibir(" ###  Autentificacao  ###");
		if (this.contControl.verificarConta()) {
			return true;
		}
		return false;
	}

	public void setCliente(Cliente c){
		this.cliente = c;
	}
}
