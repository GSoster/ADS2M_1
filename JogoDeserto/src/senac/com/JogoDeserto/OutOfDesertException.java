package senac.com.JogoDeserto;

public class OutOfDesertException extends Exception {

	public OutOfDesertException(){
		super("N�o existe espaco disponivel para se mover!");
	}
	
}
