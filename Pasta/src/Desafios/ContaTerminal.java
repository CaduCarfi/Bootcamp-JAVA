package Desafios;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        //Exibir mensagens para o usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta Criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite seu número do banco: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        System.out.println("Digite o nome de sua Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do Cliente: ");
        String cliente = scanner.nextLine(); // Permite nomes compostos

        System.out.println("Digite o saldo da conta: ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + cliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }

}
