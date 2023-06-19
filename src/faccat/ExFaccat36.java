package faccat;
import java.util.Scanner;


public class ExFaccat36 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Digite as idades de 2 homens e 2 mulheres:");

	        // Leitura das idades dos homens
	        System.out.print("Idade do primeiro homem: ");
	        double homem1 = input.nextDouble();

	        System.out.print("Idade do segundo homem: ");
	        double homem2 = input.nextDouble();

	        // Leitura das idades das mulheres
	        System.out.print("Idade da primeira mulher: ");
	        double mulher1 = input.nextDouble();

	        System.out.print("Idade da segunda mulher: ");
	        double mulher2 = input.nextDouble();

	        double homemMaisVelho = Math.max(homem1, homem2);
	        double homemMaisNovo = Math.min(homem1, homem2);
	        double mulherMaisVelha = Math.max(mulher1, mulher2);
	        double mulherMaisNova = Math.min(mulher1, mulher2);

	        double somaIdades = homemMaisVelho + mulherMaisNova;
	        double produtoIdades = homemMaisNovo * mulherMaisVelha;

	        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + somaIdades);
	        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produtoIdades);

	        input.close();
	    }
	}
