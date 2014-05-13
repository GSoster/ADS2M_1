package senac.com.JogoDeserto;

public class OutOfDesertException extends Exception {

	public OutOfDesertException(){
		super("Não existe espaco disponivel para se mover!");
	}
	
}
