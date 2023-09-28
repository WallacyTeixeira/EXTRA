<<<<<<< HEAD
package IfElse;

import java.util.Scanner;

public class Exercicio2 {
    public Exercicio2() {
        // Criando um objeto Scanner para receber a nota do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira a nota
        System.out.print("Digite a nota: ");

        // Lendo a nota fornecida pelo usuário
        double nota = scanner.nextDouble();

        // Verificando a nota e aplicando as regras
        if (nota >= 7.0) {
            System.out.println("Passou direto!");
        } else if (nota >= 5.0) {
            System.out.println("Tem direito a fazer uma prova de recuperação.");
        } else {
            System.out.println("Reprovado direto.");
        }

        // Fechando o Scanner
        scanner.close();
=======
public class Exercicio2 {
    public  Exercicio2() {
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
    }
}
