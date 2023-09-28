<<<<<<< HEAD
package IfElse;

import java.util.Scanner;

public class Exercicio1 {
    public  Exercicio1 () {
// Criando um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        
        // Lendo o número inteiro fornecido pelo usuário
        int numero = scanner.nextInt();
        
        // Verificando se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println(numero + " é um número PAR.");
        } else {
            System.out.println(numero + " é um número ÍMPAR.");
        }
        
        // Fechando o Scanner
        scanner.close();
=======
public class Exercicio1 {
    public  Exercicio1() {
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
    }
}
