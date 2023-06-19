package faccat;
import java.util.Scanner;



public class ExFaccat28 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite o primeiro valor: ");
	        double valor1 = input.nextDouble();

	        System.out.print("Digite o segundo valor: ");
	        double valor2 = input.nextDouble();

	        System.out.print("Digite o terceiro valor: ");
	        double valor3 = input.nextDouble();

	        double maiorValor = valor1;

	        if (valor2 > maiorValor) {
	            maiorValor = valor2;
	        }

	        if (valor3 > maiorValor) {
	            maiorValor = valor3;
	        }

	        System.out.println("O maior valor é: " + maiorValor);

	        input.close();
	    }
	}
