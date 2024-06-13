package org.example;

import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        System.out.println("Digite 5 nomes:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (nomes[i].compareTo(nomes[j]) > 0) {
                    String temp = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = temp;
                }
            }
        }

        System.out.println("Nomes ordenados de A a Z:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}


