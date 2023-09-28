package ForWhile;

<<<<<<< HEAD
import java.util.Scanner;

public class Exercicio4 {
    public Exercicio4() {
    Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            // Solicitar a população inicial e a taxa de crescimento para o país A
            System.out.print("Informe a população inicial do país A: ");
            int populacaoA = scanner.nextInt();

            System.out.print("Informe a taxa de crescimento anual do país A (em decimal, por exemplo, 0.03 para 3%): ");
            double taxaCrescimentoA = scanner.nextDouble();

            // Solicitar a população inicial e a taxa de crescimento para o país B
            System.out.print("Informe a população inicial do país B: ");
            int populacaoB = scanner.nextInt();

            System.out.print("Informe a taxa de crescimento anual do país B (em decimal, por exemplo, 0.015 para 1.5%): ");
            double taxaCrescimentoB = scanner.nextDouble();

            int anos = 0; // Contador de anos

            // Enquanto a população de A for menor ou igual à população de B
            while (populacaoA <= populacaoB) {
                // Calcular o crescimento populacional para ambos os países no ano atual
                populacaoA += (int) (populacaoA * taxaCrescimentoA);
                populacaoB += (int) (populacaoB * taxaCrescimentoB);
                anos++; // Incrementar o contador de anos
            }

            // Exibir o número de anos necessários para que A ultrapasse ou iguale B
            System.out.println("Número de anos necessários: " + anos);

            // Verificar se o usuário deseja continuar
            System.out.print("Deseja realizar outra operação? (S/N): ");
            continuar = scanner.next().charAt(0);
            continuar = Character.toUpperCase(continuar);
        } while (continuar == 'S');

        scanner.close();
    }
}

=======
public class Exercicio4 {
    public  Exercicio4() {

    }
}
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
