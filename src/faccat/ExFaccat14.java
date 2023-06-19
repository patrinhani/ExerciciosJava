package faccat;
import java.util.Scanner;
public class ExFaccat14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        int valor = input.nextInt();
        
        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
        
        input.close();
    }
}