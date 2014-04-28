
public class Vetor<T> {
	private Object[] dados;
	private int numObjetos;
	
	public Vetor(){
		this.numObjetos = 0;
		this.dados = new Object[numObjetos];
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index){
		return (T)this.dados[index];
	}
	
	public void add(T obj){
		if(this.numObjetos == this.dados.length){
			this.aumentarDados();
		}
		this.dados[numObjetos] = obj;
		this.numObjetos++;
	}
	
	
	public void aumentarDados(){
		Object[] novo = new Object[dados.length+1];
		System.arraycopy(this.dados, 0, novo, 0, this.dados.length);
		this.dados = novo;
		
	}
}
