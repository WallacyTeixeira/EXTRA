package ForWhile;
<<<<<<< HEAD
import java.util.Scanner;

public class Exercicio2 {
    public Exercicio2() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e validar o nome (maior que 3 caracteres)
        String nome;
        do {
            System.out.print("Digite o nome (maior que 3 caracteres): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        // Solicitar e validar a idade (entre 0 e 150)
        int idade;
        do {
            System.out.print("Digite a idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        // Solicitar e validar o salário (maior que zero)
        double salario;
        do {
            System.out.print("Digite o salário (maior que zero): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        // Solicitar e validar o sexo ('f' ou 'm')
        char sexo;
        do {
            System.out.print("Digite o sexo ('f' para feminino, 'm' para masculino): ");
            sexo = scanner.next().charAt(0);
            sexo = Character.toLowerCase(sexo); // Converter para minúsculo para aceitar maiúsculas
        } while (sexo != 'f' && sexo != 'm');

        // Solicitar e validar o estado civil ('s', 'c', 'v', 'd')
        char estadoCivil;
        do {
            System.out.print("Digite o estado civil ('s' para solteiro, 'c' para casado, 'v' para viúvo, 'd' para divorciado): ");
            estadoCivil = scanner.next().charAt(0);
            estadoCivil = Character.toLowerCase(estadoCivil); // Converter para minúsculo para aceitar maiúsculas
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        // Exibir as informações validadas
        System.out.println("Informações válidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Salário: R$" + salario);
        System.out.println("Sexo: " + (sexo == 'f' ? "Feminino" : "Masculino"));
        System.out.println("Estado Civil: " + (estadoCivil == 's' ? "Solteiro" : estadoCivil == 'c' ? "Casado" : estadoCivil == 'v' ? "Viúvo" : "Divorciado"));

        scanner.close();
=======

public class Exercicio2 {
    public  Exercicio2() {

>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
    }
}
