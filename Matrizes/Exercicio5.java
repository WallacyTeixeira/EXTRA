package Matrizes;
import java.util.Scanner;

public class Exercicio5 {
    public Exercicio5(){ 
        Scanner scanner = new Scanner(System.in);

        // Criar uma matriz 5x4 para armazenar as informações dos alunos
        // Cada linha representa um aluno, e cada coluna representa uma informação (matrícula, média provas, média trabalhos, nota final)
        int[][] matrizNotas = new int[5][4];
        int maiorNotaFinal = Integer.MIN_VALUE;
        int matriculaMaiorNota = 0;
        int somaNotasFinais = 0;

        // (a) Ler as três primeiras informações de cada aluno e calcular a nota final
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe a matrícula do aluno " + (i + 1) + ": ");
            matrizNotas[i][0] = scanner.nextInt();
            
            System.out.println("Informe a média das provas do aluno " + (i + 1) + ": ");
            matrizNotas[i][1] = scanner.nextInt();
            
            System.out.println("Informe a média dos trabalhos do aluno " + (i + 1) + ": ");
            matrizNotas[i][2] = scanner.nextInt();
            
            matrizNotas[i][3] = matrizNotas[i][1] + matrizNotas[i][2]; // (b) Calcular a nota final

            somaNotasFinais += matrizNotas[i][3]; // Somar as notas finais para calcular a média

            if (matrizNotas[i][3] > maiorNotaFinal) { // Verificar se a nota final é a maior até agora
                maiorNotaFinal = matrizNotas[i][3];
                matriculaMaiorNota = matrizNotas[i][0]; // Atualizar a matrícula do aluno com a maior nota
            }
        }

        scanner.close();

        // (c) Imprimir a matrícula do aluno com a maior nota final
        System.out.println("Matrícula do aluno com a maior nota final: " + matriculaMaiorNota);

        // (d) Imprimir a média aritmética das notas finais
        double mediaNotasFinais = (double) somaNotasFinais / 5; // Calcular a média das notas finais
        System.out.println("Média das notas finais: " + mediaNotasFinais);
    }
}
