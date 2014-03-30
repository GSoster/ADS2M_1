package view;

public class ContaView extends View {

	// Metodo Construtor
	public ContaView() {
		super();
	};

	// Exibe mensagem e captura a entrada do usuario
	public double depositar() {
		exibir("Inisira o valor que deseja depositar: ");
		return Double.parseDouble(receber());
	}

	// Exibe mensagem e captura a entrada do usuario
	public double sacar() {
		exibir("Inisira o valor que deseja Sacar: ");
		return Double.parseDouble(receber());
	}

	// Exibe mensagem e captura a entrada do usuario
	public double dividendos() {
		exibir("Inisra a taxa (ex.: 0.43): ");
		return Double.parseDouble(receber());
	}

	// Exibe mensagem e captura a entrada do usuario
	public String cadastrarNumeroConta() {
		exibir("Insira o numero da conta: ");
		return receber();
	}

	// Exibe mensagem e captura a entrada do usuario
	public String cadastrarNumeroVerificacao() {
		exibir("Insira o numero de Verificacao: ");
		return receber();
	}

	// Exibe mensagem e captura a entrada do usuario
	public double cadastrarLimite() {
		exibir("Inisira o limite da conta: ");
		return Double.parseDouble(receber());
	}

	// Exibe mensagem e captura a entrada do usuario
	public int cadastrarData() {
		exibir("Insira a data de Criacacao: ");
		return Integer.parseInt(receber());
	}
}
