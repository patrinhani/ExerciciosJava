package manzano;

public class ExManzanoWhileD {
    public static void main(String[] args) {
        impares();
    }

    public static void impares() {
        int i = 0;

        while (i <= 20) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
