

import controller.*;

public class Main {
	
	public static void main(String[] args) {
	
		/**
		 * O sistema cria automaticamente um arquivo com 20 pessoas, 
		 * o arquivo se chama: contatos.txt
		 * feito isso o sistema lê cada um desses contatos, instancia um novo cliente
		 * e exibe as opções de contas e operações.
		 */
		ClienteContaController cc = new ClienteContaController();
		cc.criarConta();
	
	
	}

}
