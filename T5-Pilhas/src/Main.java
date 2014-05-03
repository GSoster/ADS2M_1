import controller.Controller;
import model.Vetor;


public class Main {

	public static void main(String[] args){
		
		Vetor<Integer> v = new Vetor<>();
		Vetor<Boolean> b = new Vetor<>();
		Vetor<String> s = new Vetor<>();
	
		Controller c = new Controller();
		if(c.isPalindromo()){
			System.out.print("É palindromo!");
		}else{
			System.out.println("Não é!");
		}
	
		
		
	}

}
