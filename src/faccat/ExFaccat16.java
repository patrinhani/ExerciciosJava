package faccat;
import java.util.Scanner;

public class ExFaccat16 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite o n�mero de ma��s compradas: ");
	        int quantidade = input.nextInt();

	        double preco;

	        if (quantidade < 12) {
	            preco = 1.3;
	        } else {
	            preco = 1;
	        }

	        double custoTotal = quantidade * preco;

	        System.out.println("O custo total da compra � de: R$" + custoTotal);

	        input.close();
	    }
	}
