<<<<<<< HEAD
package IfElse2;

import java.util.Scanner;

public class Exercicio4 {
    public  Exercicio4() {
         // Criando um objeto Scanner para receber os dados do cliente
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira o número da conta, saldo, débito e crédito
        System.out.print("Digite o número da conta do cliente: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo do cliente: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o débito do cliente: ");
        double debito = scanner.nextDouble();

        System.out.print("Digite o crédito do cliente: ");
        double credito = scanner.nextDouble();

        // Calculando o saldo atual
        double saldoAtual = saldo - debito + credito;

        // Verificando se o saldo atual é positivo ou negativo e exibindo a mensagem correspondente
        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }

        // Exibindo o saldo atual
        System.out.println("Saldo Atual: R$ " + saldoAtual);

        // Fechando o Scanner
        scanner.close();
=======
public class Exercicio4 {
    public  Exercicio4() {
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
    }
}
