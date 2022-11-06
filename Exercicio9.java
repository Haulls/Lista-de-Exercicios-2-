package Lista2;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da Diagonal maior : ");
		Float DiagonalMaior = sc.nextFloat();
		System.out.println("Digite o valor da Diagonal menor : ");
		Float DiagonalMenor = sc.nextFloat();

		Float area = DiagonalMaior * DiagonalMenor/2;
		System.out.println("A area do losango é  : " + area);
		sc.close();

	}

}
