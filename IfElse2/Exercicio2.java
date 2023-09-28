<<<<<<< HEAD
package IfElse2;

import java.util.Scanner;

public class Exercicio2 {
    public  Exercicio2() {
        // Criando um objeto Scanner para receber os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira o número de horas trabalhadas e o salário por hora
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();

        // Calculando o salário total, considerando as horas extras
        double salarioTotal = 0;

        if (horasTrabalhadas <= 200) {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {
            double horasNormais = 200; // 5 semanas x 40 horas
            double horasExtras = horasTrabalhadas - horasNormais;
            salarioTotal = (horasNormais * salarioPorHora) + (horasExtras * salarioPorHora * 1.5);
        }

        // Exibindo o salário total
        System.out.println("Salário Total: R$ " + salarioTotal);

        // Fechando o Scanner
        scanner.close();
=======
public class Exercicio2 {
    public  Exercicio2() {
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
    }
}
