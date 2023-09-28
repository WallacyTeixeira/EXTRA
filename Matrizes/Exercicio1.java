package Matrizes;

public class Exercicio1 {
    public  Exercicio1(){
        // Criar uma matriz 4x4
        int[][] matriz = new int[4][4];

        // Preencher a matriz com os resultados das multiplicações
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = i * j;
            }
        }

        // Imprimir a matriz na tela
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t"); // \t para separar os elementos por tabulação
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }
    }
}