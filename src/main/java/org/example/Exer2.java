package org.example;

import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] alturas = new float[5];

        System.out.println("Digite a altura de 5 pessoas (em metros):");

        for (int i = 0; i < 5; i++) {
            System.out.print("Altura da pessoa " + (i + 1) + ": ");
            alturas[i] = scanner.nextFloat();
        }

        float maior = alturas[0];
        float menor = alturas[0];

        for (int i = 1; i < 5; i++) {
            if (alturas[i] > maior) {
                maior = alturas[i];
            }
            if (alturas[i] < menor) {
                menor = alturas[i];
            }
        }

        System.out.println("A maior altura é: " + maior + " metros");
        System.out.println("A menor altura é: " + menor + " metros");

        scanner.close();
    }
}



