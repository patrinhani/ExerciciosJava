package manzano;

public class ExManzanoWhileJ {

	    public static void main(String[] args) {
	        mediaPares();
	    }

	    public static void mediaPares() {
	        int numero = 50;
	        int acumuladora = 0;
	        int pares = 0;

	        while (numero < 71) {
	            if (numero % 2 == 0) {
	                acumuladora += numero;
	                pares++;
	            }
	            numero++;
	        }

	        double media = (double) acumuladora / pares;

	        System.out.println("Esses são os números pares: " + pares + " Esse é o resultado da soma: " + media);
	    }
	}
