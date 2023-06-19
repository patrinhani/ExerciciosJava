package faccat;
import java.util.Scanner;
public class ExFaccat09 {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Digite o salário mensal atual: ");
	        double salarioAtual = input.nextDouble();
	        
	        System.out.print("Digite o percentual de reajuste: ");
	        double percentualReajuste = input.nextDouble();
	        
	        double valorReajuste = salarioAtual * (percentualReajuste / 100.0);
	        double novoSalario = salarioAtual + valorReajuste;
	        
	        System.out.println("Valor do reajuste: " + valorReajuste);
	        System.out.println("Novo salário: " + novoSalario);
	        
	        input.close();
	    }
	}