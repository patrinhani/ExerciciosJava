package faccat;
import java.util.Scanner;


public class ExFaccat31 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Digite as medidas dos lados do triângulo:");
	        System.out.print("Lado A: ");
	        double ladoA = input.nextDouble();

	        System.out.print("Lado B: ");
	        double ladoB = input.nextDouble();

	        System.out.print("Lado C: ");
	        double ladoC = input.nextDouble();

	        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
	            System.out.println("Forma um triângulo.");
	        } else {
	            System.out.println("Não forma um triângulo.");
	        }

	        input.close();
	    }
	}
