package Lista2;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro valor : ");
		int valor1=sc.nextInt();

	System.out.println("Digite o segundo valor : ");
		int valor2=sc.nextInt();

		
		int subtração=valor1-valor2;
		System.out.println("A subtração dos dois valores é de : "+subtração);
		
		
		
		
		sc.close();
	}

}
