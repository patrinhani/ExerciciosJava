package faccat;
import java.util.Scanner;

public class ExFaccat15 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite um valor: ");
	        int valor = input.nextInt();

	        if (valor >= 0) {
	            System.out.println("O valor é positivo.");
	        } else {
	            System.out.println("O valor é negativo.");
	        }

	        input.close();
	    }
	}
