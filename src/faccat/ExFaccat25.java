package faccat;
import java.util.Scanner;


public class ExFaccat25 {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite seu Saldo: ");
	        double saldo = input.nextDouble();

	        System.out.print("Digite seu D�bito dispon�vel: ");
	        double debito = input.nextDouble();

	        System.out.print("Digite seu Cr�dito dispon�vel: ");
	        double credito = input.nextDouble();

	        double saldoAtual = saldo - debito + credito;

	        if (saldoAtual >= 0) {
	            System.out.println("Seu saldo � positivo: $" + saldoAtual);
	        } else {
	            System.out.println("Seu saldo � negativo: $" + saldoAtual);
	        }

	        input.close();
	    }
	}
