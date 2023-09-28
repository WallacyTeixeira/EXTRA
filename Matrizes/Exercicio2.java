package Matrizes;
    import java.util.Random;

public class Exercicio2 {
    public Exercicio2(){
        // Criar uma matriz 4x4 preenchida com números aleatórios
        int[][] matriz = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(100); // Números aleatórios de 0 a 99
            }
        }

        // Imprimir a matriz na tela
        System.out.println("Matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t"); // \t para separar os elementos por tabulação
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }

        // Encontrar a localização do maior valor
        int maiorValor = matriz[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("O maior valor é " + maiorValor);
        System.out.println("Localização (linha e coluna) do maior valor: (" + linhaMaior + ", " + colunaMaior + ")");
    }
}
