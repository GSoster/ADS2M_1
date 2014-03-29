package view;

public class ClienteView extends View{

	
	public String criarCliente(){
		exibir("Insira o numero da Conta: ");
		String numConta = receber();
		return numConta;
	}
}
