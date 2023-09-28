<<<<<<< HEAD
package IfElse2;

import java.util.Scanner;

public class Exercicio3 {
    public  Exercicio3(){
        // Criando um objeto Scanner para receber os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira o salário fixo e o valor das vendas
        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor das vendas efetuadas pelo vendedor: ");
        double valorVendas = scanner.nextDouble();

        // Calculando a comissão
        double comissao = 0;

        if (valorVendas <= 2500.00) {
            comissao = valorVendas * 0.03;
        } else {
            comissao = (2500.00 * 0.03) + ((valorVendas - 2500.00) * 0.05);
        }

        // Calculando o salário total
        double salarioTotal = salarioFixo + comissao;

        // Exibindo o salário total
        System.out.println("Salário Total do Vendedor: R$ " + salarioTotal);

        // Fechando o Scanner
        scanner.close();
=======
public class Exercicio3 {
    public  Exercicio3() {
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
    }
}
