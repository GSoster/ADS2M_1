package com.senac.listaEncadeada;

public class Nodo<T>{

	private int chave;
	private Nodo<T> proximo;
	
	
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
	
	public Nodo getNext(){
		return this.proximo;
	}
	
}
