package com.senac.listaEncadeada;
//esse <T extends Comparable<T>>  pode ficar no Nodo também.
//public class Lista<T extends Comparable<T>>  {
public class ListaDuplamenteEncadeada{

	//private Nodo<T> head = null;
	private Nodo head = null;
	private Nodo tail = null;
	
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
	
	/**
	 * Verifica se uma lista está vazia ou não.
	 * @return boolean verdadeiro se estiver vazia, falso se contiver algo
	 */
	public boolean isVazia(){
		if(this.head == null){
			return true;
		}
			return false;
	}
	
	/**
	 * Faz uma busca e verifica se existe um nodulo com valor anterio ao a
	 * ser inserido. Se não existir o novo nodulo é inserido na head
	 * Caso exista o nodo anterior ao que deve ser inserido passa a apontar para
	 * o nodo a ser inserido, e o nodo a ser inserido passa a apontar para onde o anterior
	 * apontava.
	 * @param valor --> será usado para criar o Nodulo que será inserido
	 */
	public void insertOrdenado(int valor){
		Nodo n = new Nodo(valor);
		Nodo ant = procuraAnterior(valor);
			if(ant == null){
				n.setNext(this.head);
				this.head = n;
				n.setLast(null);
			}else{
				Nodo prox = ant.getNext();
				n.setNext(prox);
				ant.setNext(n);
			}
		}
	
	/**
	 * 
	 * @param valor --> valor a ser buscado na lista
	 * @return Nodulo anterior ao que foi procurado, ou null caso não encontre
	 */
	public Nodo procuraAnterior(int valor){		
		Nodo iter = this.head;
		Nodo ant = null;
		while(iter != null){
			//int cmp = iter.getChave().compareTo(valor);
			int cmp = iter.getChave() - valor;
			if(cmp > 0){
				return ant;
			}
			
			ant = iter;
			iter = iter.getNext();
			return ant;
		}	
			return ant;
	}
	
	
}
