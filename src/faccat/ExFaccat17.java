package faccat;
import java.util.Scanner;
public class ExFaccat17 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite a nota da 1� avalia��o: ");
	        double nota1 = input.nextDouble();

	        System.out.print("Digite a nota da 2� avalia��o: ");
	        double nota2 = input.nextDouble();

	        double media = (nota1 + nota2) / 2;

	        System.out.println("A m�dia do aluno �: " + media);

	        if (media >= 6) {
	            System.out.println("O aluno foi aprovado.");
	        } else {
	            System.out.println("O aluno n�o foi aprovado.");
	        }

	        input.close();
	    }
	}
