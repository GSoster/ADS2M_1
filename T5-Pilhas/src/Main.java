import controller.Controller;
import model.Pilha;


public class Main {

	public static void main(String[] args){
		
		Pilha<Integer> v = new Pilha<>();
		Pilha<Boolean> b = new Pilha<>();
		Pilha<String> s = new Pilha<>();
	
		Controller c = new Controller();
		/*if(c.isPalindromo()){
			System.out.println("É palindromo!");
		}else{
			System.out.println("Não é palindromo!");
		}
		*/
			
		c.converteParaBinario();
	
		
		
	}

}
