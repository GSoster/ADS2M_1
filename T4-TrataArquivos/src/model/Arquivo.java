package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
	
	/*
	 *  3 etapas da persistencia de dados:
	 *  1 - Abertura ou cria��o do arquivo
	 *  2 - Leitura ou grava��o dos dados
	 *  3 - Fechamento do arquivo.
	 */
	
	//Atributos
	private FileWriter arquivo = null;//respons�vel por criar/abrir o arquivo 
	private PrintWriter gravarNoArquivo = null;//respons�vel por gravar no arquivo	
	
	
	//Construtor -> define qual arquivo ser� criado/aberto.
	//aponta o atributo respons�vel por gravar para esse arquivo
	public Arquivo(String arquivo) throws IOException{		
		this.arquivo = new FileWriter(arquivo);		
		this.gravarNoArquivo  = new PrintWriter(this.arquivo);				
	}
	
	/*
	 * Metodo responsavel por gravar os contatos no arquivo .txt
	 * ATEN��O!! -> o %n no fim do texto � para que a proxima string va para uma nova linha!
	 */
	public void gravarString(String mensagem){
		this.gravarNoArquivo.printf(mensagem+"%n");		
	}
	
	public void encerrar() throws IOException{
		this.arquivo.close();
	}
	
}
