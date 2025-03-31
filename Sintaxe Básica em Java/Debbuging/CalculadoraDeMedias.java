import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calcularMediaDaTurma(alunos, scan);

        System.out.println("Media da Turma: " + media);
    }

    public static double calcularMediaDaTurma(String[] alunos, Scanner scan) {
        double soma = 0;
        for(String aluno : alunos) {
            System.out.println("Nota do aluno " + aluno + ": ");
            double nota = scan.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }
}
