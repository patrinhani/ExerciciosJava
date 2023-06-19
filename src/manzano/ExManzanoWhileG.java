package manzano;

public class ExManzanoWhileG {

	    public static void main(String[] args) {
	        fibonacci();
	    }

	    public static void fibonacci() {
	        int termo = 1;
	        int anterior = 1;
	        int proximo = 1;
	        int i = 2;

	        while (i <= 50) {
	            System.out.println(termo);
	            termo = anterior + proximo;
	            anterior = proximo;
	            proximo = termo;
	            i++;
	        }
	    }
	}
