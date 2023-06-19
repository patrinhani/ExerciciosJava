package faccat;
import java.util.Scanner;
public class ExFaccat10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = input.nextDouble();
        
        double percentualDistribuidor = 0.28; // 28%
        double percentualImpostos = 0.45; // 45%
        
        double custoDistribuidor = custoFabrica * percentualDistribuidor;
        double custoImpostos = custoFabrica * percentualImpostos;
        double custoFinal = custoFabrica + custoDistribuidor + custoImpostos;
        
        System.out.println("Custo final ao consumidor: " + custoFinal);
        
        input.close();
    }
}