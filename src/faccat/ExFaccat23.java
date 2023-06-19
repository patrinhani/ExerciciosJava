package faccat;
import java.util.Scanner;
public class ExFaccat23 {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite seu nome: ");
	        String nome = input.nextLine();

	        System.out.print("Digite seu sexo (M/F): ");
	        String sexo = input.nextLine();

	        System.out.print("Digite sua altura em metros: ");
	        double altura = input.nextDouble();

	        if (sexo.equalsIgnoreCase("M")) {
	            double pesoIdeal = 72.7 * altura - 58;
	            System.out.println(nome + ", seu peso ideal é " + pesoIdeal + " kg.");
	        } else {
	            double pesoIdeal = 62.1 * altura - 44.7;
	            System.out.println(nome + ", seu peso ideal é " + pesoIdeal + " kg.");
	        }

	        input.close();
	    }
	}
