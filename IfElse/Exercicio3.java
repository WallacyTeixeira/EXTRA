<<<<<<< HEAD
package IfElse;

import java.util.Scanner;

public class Exercicio3 {
    public Exercicio3() {
        // Criando um objeto Scanner para receber a letra do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira uma letra
        System.out.print("Digite uma letra: ");

        // Lendo a letra fornecida pelo usuário (considere que será fornecida apenas uma
        // letra)
        char letra = scanner.nextLine().charAt(0);

        // Verificando se a letra é uma vogal ou uma consoante
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("A letra " + letra + " é uma vogal.");
        } else if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) {
            System.out.println("A letra " + letra + " é uma consoante.");
        } else {
            System.out.println("Você não digitou uma letra válida.");
        }

        // Fechando o Scanner
        scanner.close();
=======
public class Exercicio3 {
    public  Exercicio3() {
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
    }
}
