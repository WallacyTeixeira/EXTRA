package ForWhile;

<<<<<<< HEAD
import java.util.Scanner;

public class Exercicio12 {
    public Exercicio12() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verificar se o número é um número primo
        boolean ehPrimo = true;

        // Um número primo é maior que 1
        if (numero <= 1) {
            ehPrimo = false;
        } else {
            // Verificar se o número é divisível por algum número diferente de 1 e ele mesmo
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break; // Se encontrarmos um divisor, não é primo, então podemos sair do loop
                }
            }
        }

        // Exibir o resultado
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}

=======
public class Exercicio12 {
    public  Exercicio12() {

    }
}
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
