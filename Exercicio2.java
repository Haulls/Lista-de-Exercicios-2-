package Lista2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite um valor : ");
		int valor=sc.nextInt();

	
	int antecessor = valor-1;
	
	System.out.println("O antecessor do valor digitado é : " +antecessor);
	
	
	sc.close();
	}

}
