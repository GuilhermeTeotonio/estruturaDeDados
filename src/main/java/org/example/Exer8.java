package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Exer8 {

    public static void main(String[] args) {
        Stack<String> comandos = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String comando;

        while (true) {
            System.out.println("Digite um comando (ou 'sair' para encerrar): ");
            comando = scanner.nextLine().trim();

            if (comando.equalsIgnoreCase("sair")) {
                break;
            } else if (comando.equalsIgnoreCase("CTRL + Z")) {
                if (!comandos.isEmpty()) {
                    String ultimoComando = comandos.pop();
                    System.out.println("Comando desfeito: " + ultimoComando);
                } else {
                    System.out.println("Nenhum comando para desfazer.");
                }
            } else {
                comandos.push(comando);
                System.out.println("Comando armazenado: " + comando);
            }
        }

        System.out.println("\nComandos finais armazenados:");
        while (!comandos.isEmpty()) {
            System.out.println(comandos.pop());
        }

        scanner.close();
    }
}
