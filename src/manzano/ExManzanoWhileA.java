package manzano;	
import java.util.Scanner;


public class ExManzanoWhileA {

	    public static void main(String[] args) {
	        tabuada();
	    }

	    public static void tabuada() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Qual tabuada deseja? ");
	        int multiplicando = scanner.nextInt();

	        int contadora = 1;

	        while (contadora <= 10) {
	            int resultado = multiplicando * contadora;
	            System.out.println(multiplicando + " x " + contadora + " = " + resultado);
	            contadora++;
	        }
	        
	        scanner.close();
	    }
	}
