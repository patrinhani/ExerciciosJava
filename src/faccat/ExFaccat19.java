package faccat;
import java.util.Scanner;

public class ExFaccat19 {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite o primeiro valor: ");
	        double valor1 = input.nextDouble();

	        System.out.print("Digite o segundo valor: ");
	        double valor2 = input.nextDouble();

	        if (valor1 > valor2) {
	            System.out.println("O primeiro valor é maior: " + valor1);
	        } else {
	            System.out.println("O segundo valor é maior: " + valor2);
	        }

	        input.close();
	    }
	}


