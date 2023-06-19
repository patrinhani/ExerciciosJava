package faccat;
import java.util.Scanner;


public class ExFaccat33 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Digite dois valores:");
	        System.out.print("Primeiro valor: ");
	        double valor1 = input.nextDouble();

	        System.out.print("Segundo valor: ");
	        double valor2 = input.nextDouble();

	        if (valor1 == valor2) {
	            System.out.println("Números iguais");
	        } else if (valor1 > valor2) {
	            System.out.println("Primeiro é maior");
	        } else {
	            System.out.println("Segundo é maior");
	        }

	        input.close();
	    }
	}
