package Estrutura.Repetição;

import java.util.Random;
public class ExemploDoWhile {

    public static void main(String[] args) {
        System.out.printlf("Discando...");
        do {
            System.out.println("Telefone Tocando");
        } while(tocando());

        System.out.println("Alô !!!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu " + atendeu);

        return ! atendeu;
    }
}
