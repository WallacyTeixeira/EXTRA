package ForWhile;

<<<<<<< HEAD
import java.util.Scanner;

public class Exercicio8 {
    public Exercicio8() {
    Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira dois números inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // Garantir que numero1 seja menor ou igual a numero2
        if (numero1 > numero2) {
            // Trocar os valores de numero1 e numero2 se numero1 for maior que numero2
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        // Imprimir os números no intervalo entre numero1 e numero2 (inclusive)
        System.out.println("Números no intervalo entre " + numero1 + " e " + numero2 + " (inclusive):");

        // Usar um loop for para gerar e imprimir os números no intervalo
        for (int i = numero1; i <= numero2; i++) {
            System.out.println(i);
        }

        // Fechar o Scanner para liberar recursos
        scanner.close();
    }
}

=======
public class Exercicio8 {
    public  Exercicio8() {

    }
}
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
