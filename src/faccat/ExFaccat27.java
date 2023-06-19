package faccat;
import java.util.Scanner;

public class ExFaccat27 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite um valor: ");
	        double valor = input.nextDouble();

	        if (valor > 0) {
	            System.out.println("Valor digitado é positivo");
	        } else if (valor == 0) {
	            System.out.println("Valor digitado é neutro (zero)");
	        } else {
	            System.out.println("Valor digitado é negativo");
	        }

	        input.close();
	    }
	}