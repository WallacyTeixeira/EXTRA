package Matrizes;

public class Exercicio4 {
    public Exercicio4(){ 
    // Criar uma matriz 10x10
        int[][] matriz = new int[10][10];

        // Preencher a matriz de acordo com as condições
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < j) {
                    matriz[i][j] = 2 * i + 7 * j - 2;
                } else if (i == j) {
                    matriz[i][j] = 3 * i * i - 1;
                } else {
                    matriz[i][j] = 4 * i * i * i - 5 * j * j + 1;
                }
            }
        }

        // Imprimir a matriz na tela
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + "\t"); // \t para separar os elementos por tabulação
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }
    }
}
