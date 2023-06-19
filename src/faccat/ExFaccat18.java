package faccat;
import java.util.Scanner;
public class ExFaccat18 {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite o ano atual: ");
	        int anoAtual = input.nextInt();

	        System.out.print("Digite o ano de nascimento: ");
	        int anoNascimento = input.nextInt();

	        int idade = anoAtual - anoNascimento;

	        if (idade >= 16) {
	            System.out.println("Você pode votar este ano.");
	        } else {
	            System.out.println("Você não pode votar este ano.");
	        }

	        input.close();
	    }
	}
