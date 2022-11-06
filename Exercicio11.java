package Lista2;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da base Maior : ");
		Float baseMaior=sc.nextFloat();
		System.out.println("Digite o valor da base Menor : ");
		Float basemenor=sc.nextFloat();
		System.out.println("Digite o valor da altura : ");
		Float altura=sc.nextFloat();
		
		Float area=(baseMaior+basemenor)*altura/2;
		
		System.out.println("A área do trapezio é : "+area);
		
		sc.close();
	}	

}
