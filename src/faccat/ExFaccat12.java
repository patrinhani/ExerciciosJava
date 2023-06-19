package faccat;
import java.util.Scanner;
public class ExFaccat12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.println("A temperatura em graus Celsius é: " + celsius);
        
        input.close();
    }
}