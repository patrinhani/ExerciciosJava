package faccat;
import java.util.Scanner;

public class ExFaccat15 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite um valor: ");
	        int valor = input.nextInt();

	        if (valor >= 0) {
	            System.out.println("O valor � positivo.");
	        } else {
	            System.out.println("O valor � negativo.");
	        }

	        input.close();
	    }
	}
