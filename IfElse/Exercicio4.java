<<<<<<< HEAD
package IfElse;

import java.util.Scanner;

public class Exercicio4 {
    public Exercicio4() {
        // Criando um objeto Scanner para receber o salário do colaborador
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira o salário
        System.out.print("Digite o salário do colaborador: ");

        // Lendo o salário fornecido pelo usuário
        double salario = scanner.nextDouble();

        // Variáveis para armazenar o percentual de aumento e o valor do aumento
        double percentualAumento = 0;
        double valorAumento = 0;

        // Aplicando o reajuste com base nos critérios
        if (salario <= 1280.00) {
            percentualAumento = 20;
        } else if (salario <= 1700.00) {
            percentualAumento = 15;
        } else if (salario <= 2500.00) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }

        // Calculando o valor do aumento e o novo salário
        valorAumento = (salario * percentualAumento) / 100;
        double novoSalario = salario + valorAumento;

        // Exibindo as informações
        System.out.println("Salário antes do reajuste: R$" + salario);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("Valor do aumento: R$" + valorAumento);
        System.out.println("Novo salário após o aumento: R$" + novoSalario);

        // Fechando o Scanner
        scanner.close();
=======
public class Exercicio4 {
    public  Exercicio4() {
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
    }
}
