package model;

public class Vetor <T>{

	private T vetor[];
	
	/*
	 * Criando um Vetor (sempre � criado com apenas 1 posi��o (0))
	 */
	public Vetor(){		
		this.vetor = (T[]) new Object[0]; 
	}
	
	//Retorna o valor da posi��o especificada pelo index(sempre um int)
	public T get(int index){
		return this.vetor[index];
	}
	
	//Adiciona um valor a um indice especifico
	public void set(int index, T value){
		this.vetor[index] = value;
	}
	
	//retorna a quantidade de elementos no vetor
	public int size(){
		return this.vetor.length;
	}
	
	public void insert(T value){
		T[] tempVet = (T[])new Object[this.vetor.length + 1];
		
		System.arraycopy(this.vetor, 0, tempVet, 0, this.vetor.length);
		//adiciona o valor recebido a ultima posi��o do vetor
		tempVet[this.vetor.length] = value;			
		this.vetor = tempVet;
		
	}
	
	public void remove(int index)throws IndexOutOfBoundsException{
		if(index >= this.vetor.length){
			throw new IndexOutOfBoundsException();
		}
		//copiamos da posi��o a frente do indice que queremos excluir
		//para o indice que queremos excluir
		System.arraycopy(this.vetor, index+1, this.vetor, index, this.vetor.length -index -1);
	}
	
	
}
