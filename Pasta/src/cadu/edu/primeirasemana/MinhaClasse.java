package cadu.edu.primeirasemana;

public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "Cadu";
        String segundoNome = "Carfi";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}