package controller;

//import view.ClienteView;
import model.Cliente;

public class ClienteController extends PessoaController {
	// Atributos
	private Cliente cliente;

	// o atributo abaixo nao estava sendo usado e para que o findbugs nao
	// reclamasse foi comentado
	// private ClienteView cv;
	// Construtor
	public ClienteController() {
	}

	// Chama o metodo da classe base e instancia um novo cliente.
	public void criarCliente() {
		this.criarPessoa(); // >> > > > > > Nao sei se devo usar THIS ou SUPER
							// em um caso como esse...
		this.cliente = new Cliente(getPessoa().getNome(), getPessoa()
				.getSobrenome(), getPessoa().getEndereco());
	}

	// retorna o cliente
	public Cliente getCliente() {
		return this.cliente;
	}
}
