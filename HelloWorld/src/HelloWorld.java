
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args){
			//System.out.print("Hello World!");
		//instancia objetos
		Scanner ler = new Scanner(System.in);					
		Hello h = new Hello();
		You y = new You();
		//recebe informação do usuario
		System.out.print("Insira seu nome: ");
		String user = ler.nextLine(); 
		y.setUser(user);
		//exibe mensagem
		System.out.print(h.sayHello() + y.getUser());
				
	}
}
