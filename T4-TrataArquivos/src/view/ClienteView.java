package view;

public class ClienteView extends PessoaView {
	// Construtor
	public ClienteView() {
		super();
	}

	// nome autoexplicativo...
	public String cadastrarNumeroConta() {
		exibir("Insira o numero da Conta: ");
		String numConta = receber();
		return numConta;
	}
}
