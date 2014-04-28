package exercicio9;

public class Numeros {
	private int[] numeros;
	
	public Numeros(){
		this.numeros = new int[10];
	}
	
	public void add(int index, int value){
		this.numeros[index] = value;
	}
	
	public int getNumero(int index){
		return this.numeros[index];
	}
	
	public int getSize(){
		return this.numeros.length;
	}
	
}
