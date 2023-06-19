package manzano;

public class ExManzanoWhileC {
    public static void main(String[] args) {
        somaPares();
    }

    public static void somaPares() {
        int soma = 0;
        int i = 1;

        while (i <= 500) {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        }

        System.out.println(soma);
    }
}
