package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Duplicados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> adicioneNomes = new ArrayList<>();
        HashSet<String> unicos = new HashSet<>();
        HashSet<String> duplicados = new HashSet<>();

        while (true){
            System.out.print("Digite um nome (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")){
                break;
            }

            if (!unicos.add(nome)){
                duplicados.add(nome);
            }

            adicioneNomes.add(nome);

        }


        if (!duplicados.isEmpty()){
            System.out.print("Nomes repetidos: ");
            for (String nome : duplicados){
                System.out.println(nome);
            }
        } else {
                System.out.println("Nenhum nome foi repetido");

            }

        scanner.close();
    }
}

