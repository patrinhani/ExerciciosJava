package faccat;
import java.util.Scanner;

public class ExFaccat20 {



	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite o primeiro valor: ");
	        double valor1 = input.nextDouble();

	        System.out.print("Digite o segundo valor: ");
	        double valor2 = input.nextDouble();

	        if (valor1 < valor2) {
	            System.out.println(valor1 + " � menor que " + valor2 + ", ent�o a ordem crescente �: " + valor1 + ", " + valor2);
	        } else {
	            System.out.println(valor1 + " � maior que " + valor2 + ", ent�o a ordem crescente �: " + valor2 + ", " + valor1);
	        }

	        input.close();
	    }
	}
