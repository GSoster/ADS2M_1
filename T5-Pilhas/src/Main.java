import model.Vetor;


public class Main {

	public static void main(String[] args){
		
		Vetor<Integer> v = new Vetor<>();
		v.insert(1);//indice 0
		v.insert(2);//indice 1
		v.insert(5);//indice 2
		v.insert(4);//indice 3
		
		v.remove(2);//removemos o indice 2 => elemento 5
		
		for(int i = 0; i<v.size(); i++){
			System.out.println(v.get(i));
		}
	
	}

}
