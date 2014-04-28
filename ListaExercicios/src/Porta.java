
public class Porta {

	private boolean fechada;
	private boolean trancada;
	private final int fechadura;
	
	private Comodo fora;
	private Comodo dentro;
	
	public Porta(int fechadura){
		this.fechada = false;
		this.trancada = false;
		this.fechadura = fechadura;
		
		this.fora = null;
		this.dentro = null;
	}
	
	//Ligando comodos
	public void conectarComodos(Comodo fora, Comodo dentro){
		this.fora = fora;
		this.fora.setPorta(this);
		this.dentro = dentro;
		this.dentro.setPorta(this);
	}
	public Comodo getComodoFora(){
		return this.fora;
	}
	public Comodo getComodoDentro(){
		return this.dentro;
	}	
	
	//Funções normais da porta, abrir, fechar, trancar, destrancar
	public void abrir() throws PortaTrancadaException{
		
		if(isTrancada()){
			throw new PortaTrancadaException();
		}
		this.fechada = false;
	}
	public void fechar(){
		this.fechada = true;
	}	
	public boolean isAberta(){
		return this.fechada;
	}
	
	
	public void trancar(Chave chave){
		if(this.fechada){
			if(this.fechadura == chave.getCodigo()){
				this.trancada = true;
			}
		}
	}
	
	public void destrancar(Chave chave){
		if(this.fechada){
			if(this.fechadura == chave.getCodigo()){
				this.trancada = false;
			}
		}
	}
	
	public boolean isTrancada(){
		return this.trancada;
	}

	
	
}
