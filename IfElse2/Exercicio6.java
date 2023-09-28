<<<<<<< HEAD
package IfElse2;

import java.util.Scanner;

public class Exercicio6 {
    public  Exercicio6() {
        // Criando um objeto Scanner para receber os dados do cliente
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira o número de litros vendidos
        System.out.print("Digite o número de litros vendidos: ");
        double litrosVendidos = scanner.nextDouble();

        // Solicitando ao usuário que insira o tipo de combustível (A para álcool, G para gasolina)
        System.out.print("Digite o tipo de combustível (A para álcool, G para gasolina): ");
        char tipoCombustivel = scanner.next().charAt(0);

        // Definindo os preços dos combustíveis
        double precoGasolina = 5.30;
        double precoAlcool = 3.90;

        // Calculando o valor a ser pago pelo cliente com base no tipo de combustível
        double valorPago = 0;

        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            valorPago = litrosVendidos * precoAlcool;
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            valorPago = litrosVendidos * precoGasolina;
        } else {
            System.out.println("Tipo de combustível inválido.");
            // Encerrando o programa
            System.exit(1);
        }

        // Exibindo o valor a ser pago pelo cliente
        System.out.println("Valor a ser pago pelo cliente: R$ " + valorPago);

        // Fechando o Scanner
        scanner.close();
=======
public class Exercicio6 {
    public  Exercicio6() {
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
    }
}
