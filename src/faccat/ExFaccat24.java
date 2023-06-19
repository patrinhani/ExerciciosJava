package faccat;
import java.util.Scanner;
public class ExFaccat24 {
	

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite seu salário fixo: ");
	        double salarioFixo = input.nextDouble();

	        System.out.print("Digite o valor total das vendas efetuadas: ");
	        double valorVendas = input.nextDouble();

	        double comissao = 0;
	        double salarioFinal = 0;

	        if (valorVendas <= 1500) {
	            comissao = valorVendas * 0.03;
	        } else {
	            comissao = 1500 * 0.03 + (valorVendas - 1500) * 0.05;
	        }

	        salarioFinal = salarioFixo + comissao;

	        System.out.println("Seu salário é de: R$ " + String.format("%.2f", salarioFinal));

	        input.close();
	    }
	}
