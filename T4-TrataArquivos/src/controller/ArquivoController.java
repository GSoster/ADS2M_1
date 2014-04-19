package controller;
import java.io.*;
import model.*;


public class ArquivoController {
	
	//Atributos	
	private PController pController = null;
	private Pessoa p = null;
	private Arquivo arquivo = null;
	
	//Construtor
	public ArquivoController(){
		this.pController = new PController();			
	}
	
	//Gera um novo Contato Aleatorio
	private void gerarContato(){
		this.p = pController.retornarPessoa(pController.retornarTelefone());
	}
	
	//Gera 20 contatos e os guarda no arquivo.
	public void gravarContatos(){
		try{
			arquivo = new Arquivo("contatos.txt");			
			arquivo.gravarString("Contatos -> Nome - Endereço - Telefone");
			for(int i = 0; i<20; i++){
				this.gerarContato();
				this.arquivo.gravarString(this.p.getNomeCompleto() + " - " + this.p.getEndereco() + " - " + this.p.getTelefoneTratado());
			}
		}catch(IOException ioe){
			System.out.print(ioe.getMessage());
		}finally{
			try{
				arquivo.encerrarGravacao();
			}catch(IOException ioe){
				System.out.print(ioe.getMessage());
			}			
		}	
	}	
	
	/*quando arquivo.lerLinha() retornar NULL é porque acabaram as
	 * informações do arquivo 
	 */
	public void exibirContatosSalvos(){
		try{
			String linha = this.arquivo.lerLinha();
			while(linha != null){
				linha = this.arquivo.lerLinha();
				System.out.println(linha);
			}
		}catch(IOException ioe){
			System.out.print(ioe.getMessage());
		}finally{
			try{
				arquivo.encerrarLeitura();
			}catch(IOException ioe){
				System.out.print(ioe.getMessage());
			}			
		}	
	}
	
}
