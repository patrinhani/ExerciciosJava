package exemplos;

import java.util.Scanner;

public class ExemploMultplicacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero01 = sc.nextInt();
		System.out.print("Digite outro número: ");
		int numero02 = sc.nextInt();
		int multiplique = numero01 * numero02;
		System.out.print("O resultado da multiplicação é:" + multiplique);
		sc.close();
	}
}
