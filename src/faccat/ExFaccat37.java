package faccat;
import java.util.Scanner;


public class ExFaccat37 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Digite a quantidade (em Kg) de morangos e maçãs adquiridas:");

	        System.out.print("Quantidade de morangos (em Kg): ");
	        double quantidadeMorangos = input.nextDouble();

	        System.out.print("Quantidade de maçãs (em Kg): ");
	        double quantidadeMacas = input.nextDouble();

	        double precoMorangos = 0;
	        if (quantidadeMorangos <= 5) {
	            precoMorangos = quantidadeMorangos * 2.5;
	        } else {
	            precoMorangos = quantidadeMorangos * 2.2;
	        }

	        double precoMacas = 0;
	        if (quantidadeMacas <= 5) {
	            precoMacas = quantidadeMacas * 1.8;
	        } else {
	            precoMacas = quantidadeMacas * 1.5;
	        }

	        double valorTotal = precoMorangos + precoMacas;

	        if (quantidadeMorangos + quantidadeMacas > 8 || valorTotal > 25) {
	            valorTotal *= 0.9;
	        }

	        System.out.println("Valor a ser pago pelo cliente: R$" + valorTotal);

	        input.close();
	    }
	}
