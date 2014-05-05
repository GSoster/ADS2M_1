package senac;

public class FilaCircular {

	private int[] dados;
	private int head;
	private int tail;
	
	/**
	 * Inicia o vetor com 10 posições e o head e tail na posição 0
	 */
	public FilaCircular(){
		this.dados = new int[10];
		this.head = 0;
		this.tail = 0;
	}
	
	/**
	 * acrescenta um valor à fila e faz com que o tail 'avance'
	 */
	public void push(int value){
		if(!this.isCheia()){
			this.dados[this.tail] = value;
			this.tail = this.proximo(this.tail);
		}
	}
	
	/**
	 * 'retira' um valor da pilha fazendo com que o head 'avance'
	 * @return 
	 */
	public int pop(){
		if(!this.isVazia()){
			int res = this.dados[this.head];
			this.head = this.proximo(this.head);
			return res;
		}else{
			return -1;
		}
	}
	
	public int peek(){
		return this.dados[this.head];
	}

	public int getValor(int position){
		return this.dados[position];
	}
	
	private boolean isCheia(){
		return this.proximo(this.tail) == this.head;
	}
	
	private int proximo(int x){
		return (x + 1) % this.dados.length;
	}
	
	private boolean isVazia(){
		return (this.head == this.tail);
	}
	
	public int getSize(){
		return this.dados.length;
	}
	
	public int getTail(){
		return this.tail;
	}
}
