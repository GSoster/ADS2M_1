package com.senac.estruturas.listaComSentinela;

import com.senac.estruturas.listaComSentinela.Nodo;

public class ListaEncadeada<T extends Comparable<T>> {
	public Nodo<T> head;	
	public Nodo<T> tail;
	
	public void remove(T valor){}
	
	public void inserir(Nodo<T> novo){
		if(head ==null){
			head = novo;
			tail = novo;
		}else{
			Nodo<T> nodo = procuraProximo(novo.getValue());
			if(nodo != null){
				Nodo<T> ant = nodo.getPrevious();
				Nodo<T> prox = nodo;
				novo.setNext(prox);
				novo.setPrevious(ant);
				if(ant != null){
					ant.setNext(novo);
					prox.setPrevious(novo);
				}else{
					head = novo;
					prox.setPrevious(novo);
				}
				
			}else{//inserindo no final da lista
				Nodo<T> ant = tail.getPrevious();
				Nodo<T> prox = null;
				novo.setNext(prox);
				novo.setPrevious(ant);
				tail.setNext(novo);
				tail = novo;
				
			}
		}
		
	}
	
	private Nodo<T> procuraProximo(T value) {
		Nodo<T> iter = this.head;
		while(iter != null){
			//visitacao
			int cmp = value.compareTo(iter.getValue());
			if(cmp == 0){
				return iter;	
			}
			if(cmp < 0){
				return iter;
			}
			// se for maior que zero, vai para proxima iteracao
			iter = iter.getNext();
		}
		return null;
	}

	public Nodo<T> procurar(T valor){
		Nodo<T> iter = this.head;
		while(iter != null){
			//visitacao
			int cmp = valor.compareTo(iter.getValue());
			if(cmp == 0){
				return iter;	
			}
			if(cmp < 0){
				return null;
			}
			// se for maior que zero, vai para proxima iteracao
			iter = iter.getNext();
		}
		return null;
	}
	
}