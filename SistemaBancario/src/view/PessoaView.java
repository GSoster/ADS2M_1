package view;

public class PessoaView extends View {
	// Construtor
	public PessoaView() {
		super();
	}

	// Exibe mensagem e captura a entrada do usuario
	public String cadastrarNome() {
		exibir("Insira o Nome: ");
		return receber();
	}

	// Exibe mensagem e captura a entrada do usuario
	public String cadastrarSobreNome() {
		exibir("Insira o Sobrenome: ");
		return receber();
	}

	// Exibe mensagem e captura a entrada do usuario
	public String cadastrarEndereco() {
		exibir("Insira o Endereco: ");
		return receber();
	}
}
