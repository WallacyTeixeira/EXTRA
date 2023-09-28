package ForWhile;

public class Exercicio3 {
<<<<<<< HEAD
    public Exercicio3() {
    int populacaoA = 80000; // População do país A
        int populacaoB = 200000; // População do país B
        double taxaCrescimentoA = 0.03; // Taxa de crescimento anual do país A (3%)
        double taxaCrescimentoB = 0.015; // Taxa de crescimento anual do país B (1.5%)
        int anos = 0; // Contador de anos

        // Enquanto a população de A for menor ou igual à população de B
        while (populacaoA <= populacaoB) {
            // Calcular o crescimento populacional para ambos os países no ano atual
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++; // Incrementar o contador de anos
        }

        // Exibir o número de anos necessários para que A ultrapasse ou iguale B
        System.out.println("Número de anos necessários: " + anos);
=======
    public  Exercicio3() {

>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
    }
}
