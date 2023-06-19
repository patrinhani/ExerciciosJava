package faccat;

import java.util.Scanner;

public class ExFaccat05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero01=sc.nextInt();
		int antecessor= numero01-1;
		System.out.print("O antecessor de"+ numero01 + " é: "+ antecessor);
		sc.close();
	}
}
