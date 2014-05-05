import senac.FilaCircular;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FilaCircular fc = new FilaCircular();
		
		fc.push(13);
		fc.push(1);
		fc.push(2);
		fc.push(3);
		fc.push(4);
		fc.push(5);
		fc.push(6);
		fc.push(7);
		fc.push(8);
		fc.pop();
		fc.push(9);
		
				
		
		
		
		for(int i = 0; i<10; i++){
			System.out.println("Indice (i): "+i+ " Valor -> "+fc.getValor(i));		
		}
		
		
		
		
	}

}
