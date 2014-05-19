package com.senac.estruturas.listaComSentinela;


public class Nodo<T extends Comparable<T>> {

	private T valor;
	private Nodo<T> proximo;
	private Nodo<T> anterior;
	
	public Nodo(T valor){
		this.valor = valor;
		this.proximo = null;
	}
	

	
	public void setNext(Nodo<T> next){
		this.proximo = next;
	}
	
	public void setPrevious(Nodo<T> prev){
		this.anterior = prev;
	}
	
	public Nodo<T> getNext(){
		return this.proximo;
	}
	
	public Nodo<T> getPrevious(){
		return this.anterior;
	}
	
	public T getValue(){
		return this.valor;
	}
	
	
	
	
	
	
	
	
	
}