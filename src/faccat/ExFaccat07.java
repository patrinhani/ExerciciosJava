package faccat;

import java.util.Scanner;

public class ExFaccat07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite quantos anos você tem: ");
		int anos = input.nextInt();

		System.out.print("Quantos meses faz desdo seu ultimo aniversario: ");
		int meses = input.nextInt();

		System.out.print("Digite quantos dias faz desdo seu ultimo mesversario: ");
		int dias = input.nextInt();

		int idadeEmDias = (anos * 365) + (meses * 30) + dias;

		System.out.println("A idade em dias é: " + idadeEmDias);

		input.close();
	}
}
