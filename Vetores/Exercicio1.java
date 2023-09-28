<<<<<<< HEAD
package Vetores;

public class Exercicio1 {
    public  Exercicio1 () {
        // Criando um vetor A com 5 elementos inteiros
        int[] A = {1, 2, 3, 4, 5};

        // Criando um vetor B de mesmo tipo e tamanho que o vetor A
        int[] B = new int[A.length];

        // Copiando os elementos de A para B
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        // Imprimindo os vetores A e B para verificar o resultado
        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
=======
public class Exercicio1 {
    public  Exercicio1() {
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
    }
}
