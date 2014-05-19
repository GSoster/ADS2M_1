package com.senac.estruturas;

public class Nodo<T extends Comparable<T>> {

	private T valor;
	private Nodo<T> proximo;
	private Nodo<T> anterior;
	
	public Nodo(T valor){
		this.valor = valor;
		this.proximo = null;
	}
	
	/**
	 * 
	 * @param valor
	 * @return Nodo contendo o valor requerido ou Nulo
	 */
	public Nodo<T> procurar(T valor){
		if(this.valor == valor){
			return this;
		}else{
			if(this.proximo == null){
				return null;
			}else{
				return this.proximo.procurar(valor);
			}
		}
	}
	
	
	/**
	 * verifica se o valor a ser inserido é maior ao valor do nodo atual. Caso seja passa 
	 * o processo de inserção para o nodo adiante.
	 * SE o valor do nodo atual for maior que o valor a ser inserido, então o nodo atual
	 * comanda a inserção entre o nodo anterior e o nodo atual. (else)
	 * para isso os seguintes passos são seguidos:
	 * o 'anterio' do novo nodo a ser inserido é apontado para o anterior do nodo atual
	 * o 'proximo' do novo nodo a ser inserido é apontado para o nodo atual
	 * o 'proximo' do nodo anterior é apontado para o nodo a ser inserido
	 * o 'anterior' do nodo atual é apontado para o nodo a ser inserido
	 * @param novo
	 */
	public void inserir(Nodo<T> novo){
		if(novo.valor.compareTo(this.valor) >= 0){
			proximo.inserir(novo);
		}else{
			novo.anterior = this.anterior;
			novo.proximo = this;			
			this.anterior.proximo = novo;
			this.anterior = novo;
		}
	}
	
	public Nodo<T> getNext(){
		return this.proximo;
	}
	
	public void remove(){
		if(this.anterior != null){
			this.anterior.proximo = this.proximo;
		}
		if(this.proximo != null){
			this.proximo.anterior = this.anterior;
		}
	}
	
	
	
	
	
}
