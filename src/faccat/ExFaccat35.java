package faccat;
import java.util.Scanner;


public class ExFaccat35 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Qual tipo de combustível você deseja?");
	        System.out.println("(01 Álcool ou 02 Gasolina):");
	        System.out.print("Digite o código do combustível: ");
	        String combustivel = input.nextLine();

	        switch (combustivel) {
	            case "01":
	                System.out.println("Quantos litros de álcool você deseja (R$ 2,90/L):");
	                System.out.print("Digite a quantidade de litros de álcool: ");
	                double litrosAlcool = input.nextDouble();

	                double valorTotalAlcool;
	                if (litrosAlcool <= 20) {
	                    valorTotalAlcool = 2.9 * litrosAlcool * 0.97;
	                } else {
	                    valorTotalAlcool = 2.9 * litrosAlcool * 0.95;
	                }

	                System.out.println("Você vai gastar: R$" + valorTotalAlcool);
	                break;

	            case "02":
	                System.out.println("Quantos litros de gasolina você deseja (R$ 3,30/L):");
	                System.out.print("Digite a quantidade de litros de gasolina: ");
	                double litrosGasolina = input.nextDouble();

	                double valorTotalGasolina;
	                if (litrosGasolina <= 20) {
	                    valorTotalGasolina = 3.3 * litrosGasolina * 0.96;
	                } else {
	                    valorTotalGasolina = 3.3 * litrosGasolina * 0.94;
	                }

	                System.out.println("Você vai gastar: R$" + valorTotalGasolina);
	                break;

	            default:
	                System.out.println("Opção de combustível inválida.");
	                break;
	        }

	        input.close();
	    }
	}
