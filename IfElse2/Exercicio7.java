<<<<<<< HEAD
package IfElse2;

import java.util.Scanner;

public class Exercicio7 {
    public  Exercicio7() {
        // Criando um objeto Scanner para receber os dados do produto
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira a descrição do produto (nome)
        System.out.print("Digite a descrição do produto (nome): ");
        String descricaoProduto = scanner.nextLine();

        // Solicitando ao usuário que insira a quantidade adquirida e o preço unitário
        System.out.print("Digite a quantidade adquirida: ");
        int quantidadeAdquirida = scanner.nextInt();

        System.out.print("Digite o preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        // Calculando o total
        double total = quantidadeAdquirida * precoUnitario;

        // Calculando o desconto com base na quantidade adquirida
        double desconto = 0;

        if (quantidadeAdquirida <= 5) {
            desconto = total * 0.02;
        } else if (quantidadeAdquirida > 5 && quantidadeAdquirida <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }

        // Calculando o total a pagar
        double totalAPagar = total - desconto;

        // Exibindo as informações na tela
        System.out.println("Descrição do Produto: " + descricaoProduto);
        System.out.println("Total: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total a Pagar: R$ " + totalAPagar);

        // Fechando o Scanner
        scanner.close();
=======
public class Exercicio7 {
    public  Exercicio7() {
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
    }
}
