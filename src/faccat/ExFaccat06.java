package faccat;

import java.util.Scanner;

public class ExFaccat06 {

	public static void main(String[] args) {
		// Cria um objeto Scanner para ler a entrada do usu�rio
		Scanner scanner = new Scanner(System.in);

		// Solicita a entrada da base do ret�ngulo
		System.out.print("Digite a base do ret�ngulo: ");
		double base = scanner.nextDouble();

		// Solicita a entrada da altura do ret�ngulo
		System.out.print("Digite a altura do ret�ngulo: ");
		double altura = scanner.nextDouble();

		// Calcula a �rea do ret�ngulo
		double area = base * altura;

		// Imprime a �rea do ret�ngulo
		System.out.println("A �rea do ret�ngulo �: " + area);

		// Fecha o objeto Scanner
		scanner.close();
	}
}