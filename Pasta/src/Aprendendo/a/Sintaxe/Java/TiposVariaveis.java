package Aprendendo.a.Sintaxe.Java;

public class TiposVariaveis {

    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;

        numero = 2;

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14;
    }
}
