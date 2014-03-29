package view;

public class PessoaView extends View{

	public PessoaView(){
		super();
	}
	
	
	
	public String cadastrarNome(){
		exibir("Insira o Nome: ");
		return receber();		
	}
	
	public String cadastrarSobreNome(){
		exibir("Insira o Sobrenome: ");
		return receber();
	}
	
	public String cadastrarEndereco(){
		exibir("Insira o Endereco: ");
		return receber();
	}
}
