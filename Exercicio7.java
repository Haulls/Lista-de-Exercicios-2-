package Lista2;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da base : ");
		Double Base = sc.nextDouble();
		System.out.println("Digite o valor da Altura : ");
		Double Altura = sc.nextDouble();

		Double area=Base*Altura;
		System.out.println("A area do retângulo é  : "+area);
		sc.close();
	}

}
