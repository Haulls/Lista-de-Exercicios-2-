package Lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor : ");
		int valor=sc.nextInt();
		
		int sucessor = valor+1;
	
	
System.out.println("O sucessor do número digitado é : "+sucessor);
	
sc.close();

	}

}
