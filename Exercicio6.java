package Lista2;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro valor : ");
		Float valor1=sc.nextFloat();

	System.out.println("Digite o segundo valor : ");
		Float valor2=sc.nextFloat();

		
		Float divisão=valor1/valor2;
		System.out.println("A divisão dos dois valores é de : "+divisão);
		
		
		
		
		sc.close();
	}
}
