package ForWhile;

<<<<<<< HEAD
import java.util.Scanner;

public class Exercicio10 {
    public Exercicio10() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário o valor de n
        System.out.print("Digite o valor de n para a série de Fibonacci: ");
        int n = scanner.nextInt();

        // Verificar se n é válido (n deve ser maior ou igual a 1)
        if (n < 1) {
            System.out.println("Por favor, insira um valor válido (n >= 1).");
        } else {
            // Iniciar a série de Fibonacci com os dois primeiros termos (1 e 1)
            int termo1 = 1;
            int termo2 = 1;

            // Exibir os dois primeiros termos
            System.out.print("Série de Fibonacci até o " + n + "º termo: " + termo1 + " " + termo2);

            // Gerar os termos seguintes da série até o n-ésimo termo
            for (int i = 3; i <= n; i++) {
                int proximoTermo = termo1 + termo2;
                System.out.print(" " + proximoTermo); // Exibir o próximo termo
                termo1 = termo2;
                termo2 = proximoTermo;
            }

            System.out.println(); // Nova linha para melhor formatação
        }

        scanner.close();
    }
}

=======
public class Exercicio10 {
    public  Exercicio10() {

    }
}
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
