package exemplos;

import java.util.Scanner;

public class ExemploAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero01 = sc.nextInt();
		System.out.print("Digite outro número: ");
		int numero02 = sc.nextInt();
		int adicione = numero01 + numero02;
		System.out.println("O resultado da adição é: " + adicione);
		sc.close();
	}
}
