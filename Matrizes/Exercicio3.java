package Matrizes;
import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
    public Exercicio3(){ 
    // Criar uma matriz 5x5 preenchida com números aleatórios
        int[][] matriz = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(100); // Números aleatórios de 0 a 99
            }
        }

        // Imprimir a matriz na tela
        System.out.println("Matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t"); // \t para separar os elementos por tabulação
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }

        // Ler o valor X a ser buscado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a ser buscado (X): ");
        int valorX = scanner.nextInt();

        // Realizar a busca na matriz
        boolean encontrado = false;
        int linhaEncontrado = -1;
        int colunaEncontrado = -1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == valorX) {
                    encontrado = true;
                    linhaEncontrado = i;
                    colunaEncontrado = j;
                    break; // Parar a busca assim que o valor for encontrado
                }
            }
            if (encontrado) {
                break;
            }
        }

        // Exibir o resultado da busca
        if (encontrado) {
            System.out.println("O valor " + valorX + " foi encontrado na linha " + linhaEncontrado + ", coluna " + colunaEncontrado);
        } else {
            System.out.println("O valor " + valorX + " não foi encontrado na matriz.");
        }
    }
}
