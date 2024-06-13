package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exer9 {

    public static void main(String[] args) {
        Queue<String> emailQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Digite um comando ou digite 'sair' para finalizar: ");
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("sair")) {
                break;
            } else if (input.equalsIgnoreCase("on")) {
                if (emailQueue.isEmpty()) {
                    System.out.println("Nada para enviar.");
                } else {
                    System.out.println("Enviando ...");
                    while (!emailQueue.isEmpty()) {
                        String email = emailQueue.poll();
                        System.out.println("Enviando: " + email);
                    }
                }
            } else if (input.startsWith("Enviar email: ")) {
                String email = input.substring(13);
                emailQueue.offer(email);
                System.out.println("Armazenado o : " + email);
            } else {
                System.out.println("Comando não reconhecido. Digite 'enviar email: <email>' para adicionar um email ou 'on' para enviar.");
            }
        }

        scanner.close();
    }
}