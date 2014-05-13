package senac.com.JogoDeserto;

public class OutOfGasException extends Exception {
	public OutOfGasException(){
		super("Acabou a gasolina!");
	}
}
