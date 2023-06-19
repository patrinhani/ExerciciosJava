package manzano;

public class ExManzanoWhileE {
    public static void main(String[] args) {
        potencia3();
    }

    public static void potencia3() {
        int i = 0;
        int potencia = 1;

        while (i <= 15) {
            System.out.println("3 elevado a " + i + " é " + potencia);
            potencia *= 3;
            i++;
        }
    }
}
