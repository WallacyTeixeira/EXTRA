<<<<<<< HEAD
package IfElse;

import java.util.Scanner;

public class Exercicio5 {
    public Exercicio5() {
        // Criando um objeto Scanner para receber os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário o valor da hora e a quantidade de horas trabalhadas
        System.out.print("Digite o valor da hora: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        // Calculando o salário bruto
        double salarioBruto = valorHora * horasTrabalhadas;

        // Calculando o desconto do IR
        double descontoIR = 0;
        if (salarioBruto <= 900.00) {
            descontoIR = 0;
        } else if (salarioBruto <= 1500.00) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500.00) {
            descontoIR = salarioBruto * 0.1;
        } else {
            descontoIR = salarioBruto * 0.2;
        }

        // Calculando o desconto do INSS (10%)
        double descontoINSS = salarioBruto * 0.1;

        // Calculando o valor do FGTS (11%)
        double fgts = salarioBruto * 0.11;

        // Calculando o total de descontos
        double totalDescontos = descontoIR + descontoINSS;

        // Calculando o salário líquido
        double salarioLiquido = salarioBruto - totalDescontos;

        // Exibindo as informações na tela
        System.out.println("Salário bruto (" + valorHora + " * " + horasTrabalhadas + "): R$ " + salarioBruto);
        System.out.println("( - ) IR (" + (descontoIR > 0 ? (descontoIR + "%)") : "Isento) : R$ 0.00"));
        System.out.println("( - ) INSS (10%): R$ " + descontoINSS);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total de descontos: R$ " + totalDescontos);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        // Fechando o Scanner
        scanner.close();
=======
public class Exercicio5 {
    public  Exercicio5() {
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
    }
}
