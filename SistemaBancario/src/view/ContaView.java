package view;

public class ContaView extends View{
	
	//Metodo Construtor
	public ContaView(){
		super();
	};
	
	public String cadastrarNumeroConta(){
		exibir("Insira o numero da conta: ");
		return receber();
	}
	
	public String cadastrarNumeroVerificacao(){
		exibir("Insira o numero de Verificacao: ");
		return receber();
	}
}
