import java.util.Scanner;

public class MenuRepetirNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Tarcianne Rocha"; // Substitua pelo seu nome, se desejar
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Repetir o nome 10 vezes");
            System.out.println("100 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Meu nome é: " + nome);
                }
            } else if (opcao != 100) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 100);

        System.out.println("Saindo do programa. Até logo!");
        scanner.close();
    }
}
