package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> adicioneNomes = new ArrayList<>();
        HashSet<String> unicos = new HashSet<>();
        HashSet<String> duplicados = new HashSet<>();
        int contDuplicados = 0;


        while (true){
            System.out.print("Digite um nome (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")){
                break;
            }

            if (!unicos.add(nome)){
                if (duplicados.add(nome)){
                    contDuplicados++;
                }
            }

            adicioneNomes.add(nome);

        }

        for (String nome : duplicados){
            unicos.remove(nome);
        }

        System.out.println("Nomes não duplicados:");

        for (String nome : unicos){
            System.out.println(nome);
        }

        System.out.println("Duplicados: " + contDuplicados);


        scanner.close();
    }
}


