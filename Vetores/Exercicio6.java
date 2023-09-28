<<<<<<< HEAD
package Vetores;

public class Exercicio6 {
    public  Exercicio6() {
        // Criando dois vetores A e B com 10 elementos inteiros
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // Criando um vetor C de mesmo tipo e tamanho que os vetores A e B
        int[] C = new int[A.length];

        // Preenchendo o vetor C com a soma dos elementos correspondentes de A e B
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i]; // Soma os elementos de A e B e armazena em C
        }

        // Imprimindo os vetores A, B e C para verificar o resultado
        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " "); // Imprime os elementos de A
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " "); // Imprime os elementos de B
        }
        System.out.println();

        System.out.print("Vetor C: ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " "); // Imprime os elementos de C
        }
        System.out.println();
=======
public class Exercicio6 {
    public  Exercicio6() {
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
    }
}
