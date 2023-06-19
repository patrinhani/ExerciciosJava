package faccat;
import java.util.Scanner;


public class ExFaccat35 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Qual tipo de combust�vel voc� deseja?");
	        System.out.println("(01 �lcool ou 02 Gasolina):");
	        System.out.print("Digite o c�digo do combust�vel: ");
	        String combustivel = input.nextLine();

	        switch (combustivel) {
	            case "01":
	                System.out.println("Quantos litros de �lcool voc� deseja (R$ 2,90/L):");
	                System.out.print("Digite a quantidade de litros de �lcool: ");
	                double litrosAlcool = input.nextDouble();

	                double valorTotalAlcool;
	                if (litrosAlcool <= 20) {
	                    valorTotalAlcool = 2.9 * litrosAlcool * 0.97;
	                } else {
	                    valorTotalAlcool = 2.9 * litrosAlcool * 0.95;
	                }

	                System.out.println("Voc� vai gastar: R$" + valorTotalAlcool);
	                break;

	            case "02":
	                System.out.println("Quantos litros de gasolina voc� deseja (R$ 3,30/L):");
	                System.out.print("Digite a quantidade de litros de gasolina: ");
	                double litrosGasolina = input.nextDouble();

	                double valorTotalGasolina;
	                if (litrosGasolina <= 20) {
	                    valorTotalGasolina = 3.3 * litrosGasolina * 0.96;
	                } else {
	                    valorTotalGasolina = 3.3 * litrosGasolina * 0.94;
	                }

	                System.out.println("Voc� vai gastar: R$" + valorTotalGasolina);
	                break;

	            default:
	                System.out.println("Op��o de combust�vel inv�lida.");
	                break;
	        }

	        input.close();
	    }
	}
