package faccat;
import java.util.Scanner;
public class ExFaccat13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double n1 = input.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double n2 = input.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double n3 = input.nextDouble();
        
        double mediaFinal = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
        
        System.out.println("A média final do aluno é: " + mediaFinal);
        
        input.close();
    }
}