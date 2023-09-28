<<<<<<< HEAD
package IfElse2;

import java.util.Scanner;

public class Exercicio5 {
    public  Exercicio5() {
        // Criando um objeto Scanner para receber os valores
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira os três valores
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        // Encontrando o maior valor usando condicionais
        double maiorValor = valor1;

        if (valor2 > maiorValor) {
            maiorValor = valor2;
        }

        if (valor3 > maiorValor) {
            maiorValor = valor3;
        }

        // Exibindo o maior valor na tela
        System.out.println("O maior valor é: " + maiorValor);

        // Fechando o Scanner
        scanner.close();
=======
public class Exercicio5 {
    public  Exercicio5() {
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
    }
}
