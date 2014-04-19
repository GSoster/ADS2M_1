package controller;

import java.io.*;
import controller.PController;
import model.*;

public class ArquivoControllerOLD{

	
	
	/*
	 * 		####################		ATENÇÃO 		#######################
	 * Não usar esta classe, ela gera codigos estranhos ao salvar no arquivo.
	 * é provavel que seja o DataOutputStream com UTF e a codificação da minha máquina.
	 * De qualquer forma, uma melhor soluçao parece ser utilizar BufferedWriter, conforme artigos:
	 * http://www.devmedia.com.br/lendo-dados-de-txt-com-java/23221
	 * http://www.devmedia.com.br/lendo-dados-de-txt-com-java/23221
	 */
	
	
	
	
	
	
	private DataOutputStream out = null;
	private PController pc;
	private Pessoa p;
	
	//Construtor, cria lista de contatos.
	public ArquivoControllerOLD(){
		pc = new PController();
		this.criarArquivoContatos();
	}
	
	/*
	 * Faz a criação do arquivo contatos.txt
	 */
	private void criarArquivoContatos(){
		try{
			this.out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("contatos.txt")));		
			this.armazenaContatos();
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		} finally{
			if(out != null){
				try{ 
					out.close();
				}catch(IOException e) { 
					e.printStackTrace(); 
				}
			}
		}
	}

	
	/*
	 * Deve armazenar no arquivo contatos.txt os seguintes dados dos contatos:
	 * Nome, endereço e telefone.
	 */
	public void armazenaContatos(){
	try{		
		for(int i = 1; i<21; i++){
			this.p = this.pc.retornarPessoa(pc.retornarTelefone());		
			this.out.writeUTF(i+" - ");
			this.out.writeUTF(this.p.getNome() +" "+ this.p.getSobrenome());
			this.out.writeUTF(this.p.getEndereco());
			this.out.writeUTF(this.p.getTelefoneTratado());
			this.out.writeUTF("\r\n");//para a quebra de linha
		}
	}catch(IOException ioe) {
		ioe.printStackTrace();
	} 
	}	
	
	
	public void exibirContatos(){
		try{
			FileReader arq = new FileReader("contatos.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = lerArq.readLine(); // lê a primeira linha 
			// a variável "linha" recebe o valor "null" quando o processo 
			// de repetição atingir o final do arquivo texto
			while (linha != null){
				System.out.printf("%s\n", linha); 
				linha = lerArq.readLine();// lê da segunda até a última linha
			} 
			arq.close(); 
			} catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage()); 
				} 
			}
		
	}