package Aprendendo.a.Sintaxe.Java;

public class Operadores {

    public static void main(String[] args) {
        String NomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(NomeCompleto);

        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }
}
