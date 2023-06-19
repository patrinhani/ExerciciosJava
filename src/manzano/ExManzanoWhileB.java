package manzano;

public class ExManzanoWhileB {
    public static void main(String[] args) {
        somaNumerosInteiros();
    }

    public static void somaNumerosInteiros() {
        int soma = 0;
        int contador = 1;

        while (contador < 101) {
            soma += contador;
            contador++;
        }

        System.out.println(soma);
    }
}