package ForWhile;

<<<<<<< HEAD
import java.util.Scanner;

public class Exercicio5 {
    public Exercicio5() {
    Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros = 8;
        int maiorNumero = Integer.MIN_VALUE; // Inicializar com o menor valor possível

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > maiorNumero) {
                maiorNumero = numero; // Atualizar o maior número se o número atual for maior
            }
        }

        // Exibir o maior número
        System.out.println("O maior número é: " + maiorNumero);

        scanner.close();
    }
}

=======
public class Exercicio5 {
    public  Exercicio5() {

    }
}
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
