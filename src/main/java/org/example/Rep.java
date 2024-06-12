package org.example;

import java.util.Scanner;

public class Rep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int repetidos = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (numeros[i] == numeros[j]) {
                    repetidos++;
                    break;
                }
            }
        }


        System.out.println("O número de valores repetidos é: " + repetidos);

        scanner.close();
    }
}

