package ForWhile;

<<<<<<< HEAD
import java.util.Scanner;

public class Exercicio9 {
    public Exercicio9() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira a base e o expoente
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o expoente (um número inteiro): ");
        int expoente = scanner.nextInt();

        // Calcular a potência usando um loop
        double resultado = 1.0; // Inicializar o resultado como 1

        // Lidar com casos especiais: se o expoente for zero, o resultado é 1
        if (expoente == 0) {
            resultado = 1.0;
        } else if (expoente > 0) {
            // Se o expoente for positivo, multiplicar a base pelo número de vezes indicado pelo expoente
            for (int i = 0; i < expoente; i++) {
                resultado *= base;
            }
        } else {
            // Se o expoente for negativo, calcular a potência inversa
            for (int i = 0; i < -expoente; i++) {
                resultado /= base;
            }
        }

        // Exibir o resultado
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}

=======
public class Exercicio9 {
    public  Exercicio9() {

    }
}
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
