package Aprendendo.a.Sintaxe.Java.Exercicios;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Cadu";
        String nomeDois = new String("Cadu");

        System.out.println(nomeUm.equals(nomeDois));



        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);
    }
}
