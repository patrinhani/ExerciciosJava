package manzano;
import java.util.Scanner;

public class ExManzanoWhileI {
	
	    public static void main(String[] args) {
	        somar();
	    }

	    public static void somar() {
	        Scanner scanner = new Scanner(System.in);
	        int total = 0;
	        double media = 0;
	        int contador = 0;

	        while (contador < 10) {
	            System.out.print("Digite o " + (contador + 1) + "� valor: ");
	            int valor = scanner.nextInt();
	            total += valor;
	            contador++;
	        }

	        media = (double) total / contador;

	        System.out.println("O total do somat�rio � " + total + " e a m�dia aritm�tica � " + media);

	        scanner.close();
	    }
	}
