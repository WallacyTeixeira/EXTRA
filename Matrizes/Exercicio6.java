package Matrizes;
import java.util.Scanner;

public class Exercicio6 {
    public Exercicio6(){ 
    Scanner scanner = new Scanner(System.in);

        // Definir as matrizes A, B e C
        int[][] matrizA = new int[3][3]; // Matriz A (3x3)
        int[][] matrizB = new int[3][3]; // Matriz B (3x3)
        int[][] matrizC = new int[3][3]; // Matriz C (resultado da multiplicação de A por B)

        // (a) Ler a matriz A
        System.out.println("Digite os elementos da matriz A (3x3):");
        lerMatriz(matrizA, scanner);

        // (a) Ler a matriz B
        System.out.println("Digite os elementos da matriz B (3x3):");
        lerMatriz(matrizB, scanner);

        // (b) Calcular a matriz C (multiplicação de A por B)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizC[i][j] = 0; // Inicializar o elemento da matriz C em (i, j) como zero
                for (int k = 0; k < 3; k++) {
                    // Multiplicar os elementos da linha i de A pelos elementos da coluna j de B
                    // e somar o resultado ao elemento (i, j) de C
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // (c) Imprimir a matriz C (resultado da multiplicação)
        System.out.println("Matriz C (resultado da multiplicação de A por B):");
        imprimirMatriz(matrizC);

        scanner.close();
    }

    // Função para ler uma matriz
    public static void lerMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt(); // Ler um elemento da matriz e atribuí-lo à posição (i, j)
            }
        }
    }

    // Função para imprimir uma matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t"); // Imprimir um elemento da matriz separado por tabulação
            }
            System.out.println(); // Imprimir uma nova linha após cada linha da matriz
        }
    }
}
