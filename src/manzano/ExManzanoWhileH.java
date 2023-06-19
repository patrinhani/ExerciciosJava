package manzano;

public class ExManzanoWhileH {
	
	    public static void main(String[] args) {
	        conversao();
	    }

	    public static void conversao() {
	        int celsius = 10;

	        while (celsius <= 100) {
	            double fahrenheit = (9.0 * celsius) / 5.0 + 32.0;
	            System.out.println(celsius + "°C = " + fahrenheit + "°F");
	            celsius += 10;
	        }
	    }
	}
