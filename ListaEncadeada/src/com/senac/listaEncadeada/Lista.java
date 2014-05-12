package com.senac.listaEncadeada;
//esse <T extends Comparable<T>>  pode ficar no Nodo também.
public class Lista<T extends Comparable<T>>  {

	private Nodo<T> head = null;
	
	
	public void insere(int valor, Nodo anterior){
		Nodo n = new Nodo(valor);
		
		if(isVazia()){
			this.head = n;
		}
		//se for ser inserido na primeira posição: o n vira referencia da primeira posicao
		// o head passa a apontar para o n
		if(anterior == null){
			n = head;
			this.head = n;
		}else{
			n.setNext(anterior.getNext());
			anterior.setNext(n);
		}		
	}
	
	public Nodo procurar(int valor){
		Nodo i = this.head;
		while(i!=null){
			if(i.getChave() == valor){
				return i;
			}else{
				i = i.getNext();				
			}
		}
		return null;
	}
	
	
	public boolean isVazia(){
		if(this.head == null){
			return true;
		}
			return false;
	}
	
	
	public void insertOrdenado(int valor){
		Nodo n = new Nodo(valor);
		Nodo ant = procuraAnterior(valor);
			if(ant == null){
				n.setNext(this.head);
				this.head = n;
			}else{
				Nodo prox = ant.getNext();
				n.setNext(prox);
				ant.setNext(n);
			}
		}
	
	
	public Nodo procuraAnterior(int valor){
		Nodo iter = this.head;
		Nodo ant = null;
		while(iter != null){
			int cmp = iter.getChave().compareTo(valor);
			if(cmp > 0){
				return ant;
			}
			
			ant = iter;
			iter = iter.getNext();
			return ant;
		}
	}
	
	
}
