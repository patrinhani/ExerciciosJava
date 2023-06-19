package manzano;
import java.util.Scanner;


public class ExManzanoWhileK {
	
	    public static void main(String[] args) {
	        comodos();
	    }

	    public static void comodos() {
	        Scanner scanner = new Scanner(System.in);
	        double areaTotal = 0;

	        while (true) {
	            System.out.print("Digite o nome do cômodo: ");
	            String nome = scanner.nextLine();

	            System.out.print("Digite a largura do cômodo em metros: ");
	            double largura = scanner.nextDouble();

	            System.out.print("Digite o comprimento do cômodo em metros: ");
	            double comprimento = scanner.nextDouble();

	            double area = largura * comprimento;

	            System.out.printf("A área do cômodo %s é %.2f metros quadrados.%n", nome, area);

	            areaTotal += area;

	            System.out.print("Deseja calcular a área de mais um cômodo? Digite SIM ou NAO: ");
	            String continuar = scanner.next();

	            if (!continuar.equalsIgnoreCase("SIM")) {
	                break;
	            }
	            scanner.nextLine();
	        }

	        System.out.printf("A área total da residência é %.2f metros quadrados.%n", areaTotal);

	        scanner.close();
	    }
	}
