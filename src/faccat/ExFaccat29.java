package faccat;
import java.util.Scanner;


public class ExFaccat29 {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite o primeiro valor: ");
	        double valor1 = input.nextDouble();

	        System.out.print("Digite o segundo valor: ");
	        double valor2 = input.nextDouble();

	        System.out.print("Digite o terceiro valor: ");
	        double valor3 = input.nextDouble();

	        double soma = 0;

	        if (valor1 > valor2 && valor1 > valor3) {
	            soma = valor1;
	            if (valor2 > valor3) {
	                soma += valor2;
	            } else {
	                soma += valor3;
	            }
	        } else if (valor2 > valor1 && valor2 > valor3) {
	            soma = valor2;
	            if (valor1 > valor3) {
	                soma += valor1;
	            } else {
	                soma += valor3;
	            }
	        } else {
	            soma = valor3;
	            if (valor1 > valor2) {
	                soma += valor1;
	            } else {
	                soma += valor2;
	            }
	        }

	        System.out.println("A soma dos dois maiores valores é: " + soma);

	        input.close();
	    }
	}
