package faccat;

import java.util.Scanner;

public class ExFaccat06 {

	public static void main(String[] args) {
		// Cria um objeto Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);

		// Solicita a entrada da base do retângulo
		System.out.print("Digite a base do retângulo: ");
		double base = scanner.nextDouble();

		// Solicita a entrada da altura do retângulo
		System.out.print("Digite a altura do retângulo: ");
		double altura = scanner.nextDouble();

		// Calcula a área do retângulo
		double area = base * altura;

		// Imprime a área do retângulo
		System.out.println("A área do retângulo é: " + area);

		// Fecha o objeto Scanner
		scanner.close();
	}
}