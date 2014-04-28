
public class Comodo {

	private double tamanho;
	private String cor;
	private String tipo;
	private Lampada lampada;
	private Porta porta;
	
	//construtor
	public Comodo(double tamanho, String tipo){
		this.tipo = new String();
		this.cor = new String();
		this.setTamanho(tamanho);
		this.setTipo(tipo);
		this.lampada = new Lampada();
	}
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public boolean isIluminado(){
		return this.lampada.isLigada();
	}
	
	public Lampada getIluminacao() {
		return lampada;
	}


	public void setIluminacao(boolean iluminacao) {
		if(iluminacao){
			this.lampada.setLigada();
		}else{
			this.lampada.setDesligada();
		}
	}
	
	public void setPorta(Porta porta){
		this.porta = porta;
	}
	
	public Porta getPorta(){
		return this.porta;
	}
	
	
	
}
