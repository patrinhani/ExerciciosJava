package faccat;
import java.util.Scanner;
public class ExFaccat08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = input.nextInt();
        
        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = input.nextInt();
        
        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = input.nextInt();
        
        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = input.nextInt();
        
        double percentualBrancos = (votosBrancos * 100.0) / totalEleitores;
        double percentualNulos = (votosNulos * 100.0) / totalEleitores;
        double percentualValidos = (votosValidos * 100.0) / totalEleitores;
        
        System.out.println("Percentual de votos em branco: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");
        
        input.close();
    }
}

