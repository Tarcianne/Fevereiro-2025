package teste;

import java.util.Scanner;
import java.time.LocalTime;

public class MenuSaudacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;

        // Pede para o usuário digitar um nome
        System.out.print("Digite um nome: ");
        nome = scanner.nextLine();

        int opcao = 0;

        while (opcao != 100) {
            System.out.println("\nMenu:");
            System.out.println("1 - Repetir o nome 10 vezes");
            System.out.println("100 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                String saudacao = obterSaudacao();
                for (int i = 0; i < 10; i++) {
                    System.out.println(saudacao + ", " + nome + "!");
                }
            } else if (opcao != 100) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("Saindo do programa. Até logo!");
        scanner.close();
    }

    private static String obterSaudacao() {
        LocalTime agora = LocalTime.now();
        
        if (agora.getHour() >= 6 && agora.getHour() < 12) { // 6h - 12h
            return "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) { // 12h - 18h
            return "Boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) { // 18h - 24h
            return "Boa noite";
        } else { // 0h - 6h
            return "Vai dormir";
        }
    }
}


