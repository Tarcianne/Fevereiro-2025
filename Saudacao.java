package test;

import java.time.LocalTime;
import java.util.Scanner;

public class Saudacao {

    // Função que retorna uma saudação com o nome
    public static String saudacao(String nome) {
        // Obtém a hora atual
        LocalTime horaAtual = LocalTime.now();
        int hora = horaAtual.getHour(); // Pega a hora em formato de 24 horas

        // Determina a saudação com base na hora e retorna a mensagem
        if (hora >= 6 && hora < 12) {
            return "Bom dia, " + nome + "!";
        } else if (hora >= 12 && hora < 18) {
            return "Boa tarde, " + nome + "!";
        } else if (hora >= 18 && hora <= 23) {
            return "Boa noite, " + nome + "!";
        } else {
            return "Vai dormir, " + nome + "!";
        }
    }

    public static void main(String[] args) {
        // Cria um Scanner para ler o nome do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o nome ao usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Chama a função saudacao e exibe o retorno
        String mensagem = saudacao(nome);
        System.out.println(mensagem);

        // Fecha o scanner
        scanner.close();
    }
}
