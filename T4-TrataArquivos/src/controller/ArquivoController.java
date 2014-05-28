package controller;
import java.io.*;
import model.*;


public class ArquivoController {
	
	//Atributos	
	private PController pController = null;
	private Pessoa p = null;
	private Arquivo arquivo = null;
	private Arquivo arquivoContas = null;
	
	//Construtor
	public ArquivoController(){
		this.pController = new PController();			
	}
	
	//Gera um novo Contato Aleatorio
	private void gerarContato(){
		this.p = pController.retornarPessoa(pController.retornarTelefone());
	}
	
	/*Gera 20 contatos e os guarda no arquivo.
	 * Os dados dos contatos são salvos com separaçao via ; para que fique facil de
	 * extrai-los e então criar novos contatos na outra parte da aplicacao
	 */
	public void gravarContatos(){
		try{
			arquivo = new Arquivo("contatos.txt");						
			for(int i = 0; i<20; i++){
				this.gerarContato();
				this.arquivo.gravarString(this.p.getNomeCompleto() + ";" + this.p.getEndereco() + ";" + this.p.getTelefoneTratado());
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
	
	/*
	 * Separa os dados de uma linha (pelos ; ) e cria um novo objeto pessoa com eles
	 * então adiciona esse novo obj pessoa a referencia this.p 
	 */
	public void separarDadosContato(){
		try{			
			String contato = this.arquivo.lerLinha();														
				String linha[] = contato.split(";");
				//System.out.println(linha[0]); //nomeCompleto
				//System.out.println(linha[1]); //endereco
				//System.out.println(linha[2]); //telefone
				//Criando uma pessoa com nome completo e endereco
				this.p = new Pessoa(linha[0],linha[1]);				
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
	
	public Cliente getCliente(){
		return new Cliente(this.p.getNome(), this.p.getEndereco());
	}
	
}
