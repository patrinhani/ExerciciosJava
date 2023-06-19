package exemplos;

import java.util.Scanner;

public class ExemploDivisao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		float numero01 = sc.nextInt();
		System.out.print("Digite outro número: ");
		float numero02 = sc.nextInt();
		float divisao = numero01 / numero02;
		System.out.print("O resultado da divisão é: " + divisao);
		sc.close();
	}

}
