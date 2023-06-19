package faccat;
import java.util.Scanner;


public class ExFaccat25 {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite seu Saldo: ");
	        double saldo = input.nextDouble();

	        System.out.print("Digite seu Débito disponível: ");
	        double debito = input.nextDouble();

	        System.out.print("Digite seu Crédito disponível: ");
	        double credito = input.nextDouble();

	        double saldoAtual = saldo - debito + credito;

	        if (saldoAtual >= 0) {
	            System.out.println("Seu saldo é positivo: $" + saldoAtual);
	        } else {
	            System.out.println("Seu saldo é negativo: $" + saldoAtual);
	        }

	        input.close();
	    }
	}
