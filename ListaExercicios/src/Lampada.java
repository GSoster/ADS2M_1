
public class Lampada {

	private boolean estado;
	
	
	public void setLigada(){
		this.estado = true;		
	}
	public  void setDesligada(){
		this.estado = false;
	}
	
	public boolean isLigada(){
		return this.estado;
	}
	
}
