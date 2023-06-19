package faccat;
import java.util.Scanner;

public class ExFaccat34 {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Digite dois valores:");
	        System.out.print("Valor de x: ");
	        double x = input.nextDouble();

	        System.out.print("Valor de y: ");
	        double y = input.nextDouble();

	        double z = x * y + 5;
	        String resposta;

	        if (z <= 0) {
	            resposta = "A";
	        } else if (z <= 100) {
	            resposta = "B";
	        } else {
	            resposta = "C";
	        }

	        System.out.println("z: " + z + ", resposta: " + resposta);

	        input.close();
	    }
	}
