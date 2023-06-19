package faccat;
import java.util.Scanner;
public class ExFaccat17 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite a nota da 1ª avaliação: ");
	        double nota1 = input.nextDouble();

	        System.out.print("Digite a nota da 2ª avaliação: ");
	        double nota2 = input.nextDouble();

	        double media = (nota1 + nota2) / 2;

	        System.out.println("A média do aluno é: " + media);

	        if (media >= 6) {
	            System.out.println("O aluno foi aprovado.");
	        } else {
	            System.out.println("O aluno não foi aprovado.");
	        }

	        input.close();
	    }
	}
