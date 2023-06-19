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
	            System.out.print("Digite o nome do c�modo: ");
	            String nome = scanner.nextLine();

	            System.out.print("Digite a largura do c�modo em metros: ");
	            double largura = scanner.nextDouble();

	            System.out.print("Digite o comprimento do c�modo em metros: ");
	            double comprimento = scanner.nextDouble();

	            double area = largura * comprimento;

	            System.out.printf("A �rea do c�modo %s � %.2f metros quadrados.%n", nome, area);

	            areaTotal += area;

	            System.out.print("Deseja calcular a �rea de mais um c�modo? Digite SIM ou NAO: ");
	            String continuar = scanner.next();

	            if (!continuar.equalsIgnoreCase("SIM")) {
	                break;
	            }
	            scanner.nextLine();
	        }

	        System.out.printf("A �rea total da resid�ncia � %.2f metros quadrados.%n", areaTotal);

	        scanner.close();
	    }
	}
