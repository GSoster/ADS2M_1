package com.senac.listaEncadeada;

//public class Nodo<T>{
public class Nodo{
	private int chave;
	//private Nodo<T> proximo;
	private Nodo proximo;
	private Nodo anterior;
	
	
	public Nodo(int valor){
		this.chave = valor;
	}
	
	public void setChave(int chave){
		this.chave = chave;
	}
	
	public int getChave(){
		return this.chave;
	}
	
	public void setNext(Nodo proximo){
		this.proximo = proximo;
	}
	
	public void setLast(Nodo anterior){
		this.anterior = anterior;
	}
	
	public Nodo getNext(){
		return this.proximo;
	}
	
	public Nodo getLast(){
		return this.anterior;
	}
	
	
	
}
