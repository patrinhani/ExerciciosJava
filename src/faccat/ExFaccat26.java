package faccat;
	import java.util.Scanner;
public class ExFaccat26 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite a quantidade atual em estoque: ");
	        double quantidadeAtual = input.nextDouble();

	        System.out.print("Digite a quantidade m�xima em estoque: ");
	        double quantidadeMaxima = input.nextDouble();

	        System.out.print("Digite a quantidade m�nima em estoque: ");
	        double quantidadeMinima = input.nextDouble();

	        double quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

	        if (quantidadeAtual >= quantidadeMedia) {
	            System.out.println("N�o efetuar compra");
	        } else {
	            System.out.println("Efetuar compra");
	        }

	        input.close();
	    }
	}

