package view;

public class ContaView extends View {

	// Metodo Construtor
	public ContaView() {
		super();
	};

	public double depositar() {
		exibir("Inisira o valor que deseja depositar: ");
		return Double.parseDouble(receber());
	}

	public double sacar() {
		exibir("Inisira o valor que deseja Sacar: ");
		return Double.parseDouble(receber());
	}

	public double dividendos() {
		exibir("Inisra a taxa (ex.: 0.43): ");
		return Double.parseDouble(receber());
	}

	public String cadastrarNumeroConta() {
		exibir("Insira o numero da conta: ");
		return receber();
	}

	public String cadastrarNumeroVerificacao() {
		exibir("Insira o numero de Verificacao: ");
		return receber();
	}

	public double cadastrarLimite() {
		exibir("Inisira o limite da conta: ");
		return Double.parseDouble(receber());
	}

	public int cadastrarData() {
		exibir("Insira a data de Criacacao: ");
		return Integer.parseInt(receber());
	}
}
