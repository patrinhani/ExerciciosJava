package faccat;
import java.util.Scanner;


public class ExFaccat38 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Digite o c�digo de usu�rio:");
	        String codigoUsuario = input.nextLine();

	        if (!codigoUsuario.equals("1234")) {
	            System.out.println("Usu�rio inv�lido!");
	        } else {
	            System.out.println("Digite a senha:");
	            String senha = input.nextLine();

	            if (!senha.equals("9999")) {
	                System.out.println("Senha incorreta!");
	            } else {
	                System.out.println("Acesso permitido");
	            }
	        }

	        input.close();
	    }
	}
