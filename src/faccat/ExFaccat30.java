package faccat;
import java.util.Scanner;


public class ExFaccat30 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        double valor1 = input.nextDouble();

	        System.out.print("Digite o segundo número: ");
	        double valor2 = input.nextDouble();

	        System.out.print("Digite o terceiro número: ");
	        double valor3 = input.nextDouble();

	        double menor, meio, maior;

	        if (valor1 < valor2 && valor1 < valor3) {
	            menor = valor1;
	            if (valor2 < valor3) {
	                meio = valor2;
	                maior = valor3;
	            } else {
	                meio = valor3;
	                maior = valor2;
	            }
	        } else if (valor2 < valor1 && valor2 < valor3) {
	            menor = valor2;
	            if (valor1 < valor3) {
	                meio = valor1;
	                maior = valor3;
	            } else {
	                meio = valor3;
	                maior = valor1;
	            }
	        } else {
	            menor = valor3;
	            if (valor1 < valor2) {
	                meio = valor1;
	                maior = valor2;
	            } else {
	                meio = valor2;
	                maior = valor1;
	            }
	        }

	        System.out.println("Valores em ordem crescente: " + menor + ", " + meio + ", " + maior);

	        input.close();
	    }
	}
