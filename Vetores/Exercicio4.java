<<<<<<< HEAD
package Vetores;

import java.util.Arrays;

public class Exercicio4 {
    public Exercicio4() {
        // Criando um vetor A com 15 elementos inteiros
        int[] A = { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225 };

        // Criando um vetor B de mesmo tamanho que o vetor A
        double[] B = new double[A.length];

        // Calculando a raiz quadrada de cada elemento de A e armazenando em B
        for (int i = 0; i < A.length; i++) {
            B[i] = Math.sqrt(A[i]);
        }

        // Imprimindo os vetores A e B para verificar o resultado
        System.out.println("Vetor A: " + Arrays.toString(A));
        System.out.println("Vetor B: " + Arrays.toString(B));
=======
public class Exercicio4 {
    public  Exercicio4() {
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
    }
}
