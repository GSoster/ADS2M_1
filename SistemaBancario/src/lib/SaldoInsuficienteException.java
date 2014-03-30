package lib;

public class SaldoInsuficienteException extends Exception {

	/*
	 * Excessao que é lancada quando o saldo nao e suficiente para retirada
	 */
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException() {
		super("Saldo insuficiente para operacao");
	}

}
