package manzano;
import java.util.Scanner;


public class ExManzanoWhileF {

	    public static void main(String[] args) {
	        potencianumerodigitado();
	    }

	    public static void potencianumerodigitado() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor da base: ");
	        int base = scanner.nextInt();

	        System.out.print("Digite o valor do expoente: ");
	        int expoente = scanner.nextInt();

	        int resultado = 1;
	        int i = 1;

	        while (i <= expoente) {
	            resultado *= base;
	            i++;
	        }

	        System.out.println("O resultado de " + base + " elevado a " + expoente + " é " + resultado);

	        scanner.close();
	    }
	}
