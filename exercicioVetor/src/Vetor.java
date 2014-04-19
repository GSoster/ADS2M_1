
public class Vetor {

	private int[] vetor;
	
	public Vetor(){
		this.vetor = new int[0];
	}
	
	public int get(int index){
		return this.vetor[index];
	}
	
	public void set(int index, int value){
		this.vetor[index] = value;
	}
	
	public int size(){
		return this.vetor.length;
	}
	
	public void insert(int value){
		int[] tempVet = new int[this.vetor.length + 1];
		
		System.arraycopy(this.vetor, 0, tempVet, 0, this.vetor.length);
		//adiciona o valor recebido a ultima posição do vetor
		tempVet[this.vetor.length] = value;			
		this.vetor = tempVet;
		
	}
	
	public void remove(int index)throws IndexOutOfBoundsException{
		if(index >= this.vetor.length){
			throw new IndexOutOfBoundsException();
		}
		//copiamos da posição a frente do indice que queremos excluir
		//para o indice que queremos excluir
		System.arraycopy(this.vetor, index+1, this.vetor, index, this.vetor.length -index -1);
	}
	
	
	public static void main(String[] args){
		Vetor v = new Vetor();
		v.insert(1);
		v.insert(2);
		v.insert(3);
		v.insert(4);
		
		
		for(int i = 0; i<v.size(); i++){
			System.out.println(v.get(i));
		}
		
	}
	
}
