package view;

public class ClienteView extends PessoaView{

	public ClienteView(){
		super();
	}
	
	public String cadastrarNumeroConta(){
		exibir("Insira o numero da Conta: ");
		String numConta = receber();
		return numConta;
	}
}
