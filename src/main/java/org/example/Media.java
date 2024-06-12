package org.example;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        int soma = 0;

        System.out.println("Digite dez números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
            soma += num[i];
        }

        double media = (double) soma / 10;

        System.out.println("A média é: " + media);

        scanner.close();
    }
}







