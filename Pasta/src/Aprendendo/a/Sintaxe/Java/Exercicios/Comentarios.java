package Aprendendo.a.Sintaxe.Java.Exercicios;

public class Comentarios {

    public static void main(String[] args) {
        // Olá, eu sou um comentário em uma única linha

        /* Olá,
        * Eu sou um cometário
        * que posso ser mais detalhado
        * quando necessário
        */
    }

    /*
    * Este método foi elaborado as pressas
    * Por isso eu abreviei o nome das variaveis
    * mas olha, ele tem a finalidade somar ou multiplicar
    * dois numeros
     */
    public int somaMultiplica(int n, int x, String m) {
        int r = 0;      // r é igual ao resultado
        if(m == "M") {  // M = multiplicação
            r = n * x;
        } else {
            //se não soma mesmo
            r = n + x;
        }
        return r;
    }
}
