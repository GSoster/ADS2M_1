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
	
	public double depositar(){
		exibir("Inisira o valor que deseja depositar: ");
		return Double.parseDouble(receber());
	}
	
	public double sacar(){
		exibir("Inisira o valor que deseja Sacar: ");
		return Double.parseDouble(receber());
	}
}
