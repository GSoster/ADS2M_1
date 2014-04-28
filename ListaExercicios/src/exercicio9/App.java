package exercicio9;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Numeros nums = new Numeros();
		Scanner ler = new Scanner(System.in);
		double media = 0;
		
		//Lê os valores digitados pelo usuário
		for(int i = 0; i< 10; i++){
			System.out.print("Insira um numero: ");
			int value = ler.nextInt();
			nums.add(i, value);
		}

		System.out.println("Numeros na ordem em que foram digitados: ");
		for(int i = 0; i< 10; i++){
			System.out.println(nums.getNumero(i));
			media += nums.getNumero(i);
		}
		
			media = media/nums.getSize();
		
		System.out.println("Numeros na ordem INVERSA a que foram digitados: ");
		for(int i = 9; i>= 0; i--){
			System.out.println(nums.getNumero(i));
		}
		
		System.out.println("Numeros IMPAR: ");
		for(int i = 0; i< 10; i++){
			if(!(nums.getNumero(i)%2 == 0)){
				System.out.println(nums.getNumero(i));
			}
		}
		
		System.out.println("Numeros PAR: ");
		for(int i = 0; i< 10; i++){
			if(nums.getNumero(i)%2 == 0){
				System.out.println(nums.getNumero(i));
			}
		}
		
		System.out.println("Numeros Acima da média aritmetica: ");
		for(int i = 0; i< 10; i++){
			if(nums.getNumero(i) > media){
				System.out.println(nums.getNumero(i));
			}
		}
		
	}

}
