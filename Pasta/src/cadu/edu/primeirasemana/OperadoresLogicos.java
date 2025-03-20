package cadu.edu.primeirasemana;

public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean condicao1 = true;

        boolean condicao2 = true;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2) {
            System.out.println("Pelo menos uma das condições é verdadeira");
        }
    }
}
