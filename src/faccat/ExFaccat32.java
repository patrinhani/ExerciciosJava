package faccat;
import java.util.Scanner;


public class ExFaccat32 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Informe os dados da partida:");
	        System.out.print("Nome do time 1: ");
	        String time1 = input.nextLine();

	        System.out.print("Número de gols do time 1: ");
	        int golsTime1 = input.nextInt();

	        input.nextLine(); // Limpar o buffer

	        System.out.print("Nome do time 2: ");
	        String time2 = input.nextLine();

	        System.out.print("Número de gols do time 2: ");
	        int golsTime2 = input.nextInt();

	        if (golsTime1 > golsTime2) {
	            System.out.println("Vencedor: " + time1);
	        } else if (golsTime2 > golsTime1) {
	            System.out.println("Vencedor: " + time2);
	        } else {
	            System.out.println("EMPATE");
	        }

	        input.close();
	    }
	}
