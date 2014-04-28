
public class Casa{
	
	
	private Vetor<Comodo> listaDeComodos;
	private Vetor<Porta> listaDePortas;
	
	public Casa(){
		this.listaDeComodos  = new Vetor<Comodo>();
		this.listaDePortas  = new Vetor<Porta>();
	}
	
	public void addComodo(Comodo comodo){
		this.listaDeComodos.add(comodo);
	}
	
	public Comodo retornarComodo(int indice){
		return this.listaDeComodos.get(indice);
	}
	
	
	public void addPorta(Porta porta){
		this.listaDePortas.add(porta);
	}
	
	public Porta retornarPorta(int indice){
		return this.listaDePortas.get(indice);
	}
	
	
	public void addConexaoComodos(Porta porta, Comodo fora, Comodo dentro){
		porta.conectarComodos(fora, dentro);
		addPorta(porta);
		addComodo(fora);
		addComodo(dentro);
		
	}
	
}
