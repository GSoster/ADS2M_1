package model;

import java.io.*;
public class Arquivo {
	
	/*
	 *  3 etapas da persistencia de dados:
	 *  1 - Abertura ou criação do arquivo
	 *  2 - Leitura ou gravação dos dados
	 *  3 - Fechamento do arquivo.
	 */
	
	//Atributos
	private FileWriter arquivo = null;//responsável por criar/abrir o arquivo 
	private PrintWriter gravarNoArquivo = null;//responsável por gravar no arquivo	
	private FileReader arquivoLer = null;//responsavel por abrir o arquivo para ler
	private BufferedReader lerArquivo = null;//responsavel por leitura do arquivo
	
	/* Construtor -> define qual arquivo será criado/aberto.
	 * aponta o atributo responsável por gravar para esse arquivo
	 * 
	 */
	public Arquivo(String arquivo) throws IOException{
		//para gravar:
		this.arquivo = new FileWriter(arquivo);				
		this.gravarNoArquivo  = new PrintWriter(this.arquivo);
		//Para ler:
		this.arquivoLer = new FileReader(arquivo);
		this.lerArquivo = new BufferedReader(this.arquivoLer);
	}
	
	//Sobrecarga de construtor (para poder gravar ao fim do arquivo)
	public Arquivo(String arquivo, boolean gravarNoFim) throws IOException{
		//para gravar:
		this.arquivo = new FileWriter(arquivo, gravarNoFim);				
		this.gravarNoArquivo  = new PrintWriter(this.arquivo);
		//Para ler:
		this.arquivoLer = new FileReader(arquivo);
		this.lerArquivo = new BufferedReader(this.arquivoLer);
	}
	
	
	/*
	 * Metodo responsavel por gravar os contatos no arquivo .txt
	 * ATENÇÃO!! -> o %n no fim do texto é para que a proxima string va para uma nova linha!
	 */
	public void gravarString(String mensagem){
		this.gravarNoArquivo.printf(mensagem+"%n");		
	}
	

	//Le o conteudo do arquivo linha a linha.
	public  String lerLinha() throws IOException{
		return this.lerArquivo.readLine();
	}
	
	//Fecha o arquivo
	public void encerrarGravacao() throws IOException{
		this.arquivo.close();		
	}
	
	public void encerrarLeitura() throws IOException{
		this.arquivoLer.close();
	}
}
