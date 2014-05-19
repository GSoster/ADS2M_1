package com.senac.estruturas;

public class ListaEncadeada<T extends Comparable<T>> {
	public Nodo<T> head;	
	
	/**
	 * void inserir
	 * Caso a lista esteja vazia, insere no head.
	 * Se a lista contiver elementos, ent�o passa a responsabilidade de inserir
	 * para o Nodo, e esse verifica com o seguinte e assim por diante..
	 * Respons�vel por inserir novos nodos a uma lista
	 * @param novo --> tipo Nodo, um novo nodo a ser inserido na lista
	 */
	public void inserir(Nodo<T> novo){
		if(this.head == null){
			this.head = novo;			
		}else{
			this.head.inserir(novo);
		}
	}
	
	/**
	 * 
	 * @param valor --> valor a ser buscado
	 * @return Nodo ou null --> Nodo contendo o valor procurado 
	 * ou null caso a lista esteja vazia ou o valor n�o seja encontrado
	 */
	public Nodo procurar(T valor){
		if(this.head == null){
			return null;
		}else{
			return this.head.procurar(valor);
		}
	}

	public void remove(T valor){
		Nodo<T> nodo = procurar(valor);
		nodo.remove();
		if(nodo == this.head){
			this.head = this.head.getNext();
		}
	}
	
}
