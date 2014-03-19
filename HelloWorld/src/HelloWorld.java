
public class HelloWorld {

	public static void main(String[] args){
			//System.out.print("Hello World!");
		//instancia objetos
		Hello h = new Hello();
		You y = new You();
		//exibe mensagem
		System.out.print(h.sayHello() + y.sayYou());
	}
}
