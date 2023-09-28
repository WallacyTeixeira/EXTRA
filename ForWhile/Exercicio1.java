package ForWhile;
<<<<<<< HEAD
import java.util.Scanner;

public class Exercicio1 {
    public Exercicio1() {
    Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um nome de usuário
        System.out.print("Digite um nome de usuário: ");
        String nomeUsuario = scanner.nextLine();

        // Solicitar ao usuário que insira uma senha
        System.out.print("Digite uma senha: ");
        String senha = scanner.nextLine();

        // (a) Verificar se a senha é igual ao nome de usuário
        while (senha.equals(nomeUsuario)) {
            // (b) Se a senha for igual ao nome de usuário, mostrar mensagem de erro
            System.out.println("Senha não pode ser igual ao nome de usuário. Tente novamente.");

            // Solicitar ao usuário que insira uma nova senha
            System.out.print("Digite uma senha: ");
            senha = scanner.nextLine();
        }

        // (c) Se a senha for diferente do nome de usuário, mostrar mensagem de sucesso
        System.out.println("Senha aceita com sucesso!");

        scanner.close();
    }
}

=======

public class Exercicio1 {
    public  Exercicio1() {
    }
}
>>>>>>> 99a0cd974eac386c6631e1b8bc4c50163557fd2f
