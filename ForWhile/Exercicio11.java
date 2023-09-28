package ForWhile;

<<<<<<< HEAD
import java.util.Scanner;

public class Exercicio11 {
    public Exercicio11() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Verificar se o número é não negativo
        if (numero < 0) {
            System.out.println("O fatorial não está definido para números negativos.");
        } else {
            // Inicializar o resultado como 1, pois 0! e 1! são iguais a 1
            long resultado = 1;

            // Calcular o fatorial usando um loop for
            for (int i = 1; i <= numero; i++) {
                resultado *= i;
            }

            // Exibir o resultado
            System.out.println(numero + "! = " + resultado);
        }

        scanner.close();


        
    }
}

=======
public class Exercicio11 {
    public  Exercicio11() {

    }
}
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
