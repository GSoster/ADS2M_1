package model;

public class Pilha <T>{

	private T vetor[];
	private int numObj;
	
	/*
	 * Criando um Vetor (sempre é criado com apenas 1 posição (0))
	 */
	@SuppressWarnings("unchecked")
	public Pilha(){		
		this.numObj = 0;
		this.vetor = (T[]) new Object[this.numObj]; 
	}
	
	
	//Retorna o valor da posição especificada pelo index(sempre um int)
	public T get(int index){
		return (T)this.vetor[index];
	}
	
	
	//Adiciona um valor a um indice especifico
	public void set(int index, T value){
		this.vetor[index] = value;
	}
	
	
	
	//retorna a quantidade de elementos no vetor
	public int size(){
		//return this.vetor.length;
		return this.numObj;
	}
	
	
	
	@SuppressWarnings("unchecked")
	public void insert(T value){		
		//T[] tempVet = (T[])new Object[this.vetor.length + 1];
		T[] tempVet = (T[])new Object[this.numObj + 1];
		
		//System.arraycopy(this.vetor, 0, tempVet, 0, this.vetor.length);
		System.arraycopy(this.vetor, 0, tempVet, 0, this.numObj);
		//adiciona o valor recebido a ultima posição do vetor
		tempVet[this.numObj] = value;			
		this.vetor = tempVet;
		this.numObj ++;		
	}
	
	
	
	public void remove(int index)throws IndexOutOfBoundsException{
		if(index >= this.numObj){
			throw new IndexOutOfBoundsException();
		}
		//copiamos da posição a frente do indice que queremos excluir
		//para o indice que queremos excluir
		System.arraycopy(this.vetor, index+1, this.vetor, index, this.numObj -index -1);
		this.numObj--;
	}
	
	
}
