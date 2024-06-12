package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SeteNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Double> notas = new HashMap<>();

        String materia;
        double nota;

        while (true) {
            System.out.println("Digite a matéria (ou 'sair' para encerrar): ");
            materia = scanner.nextLine().trim().toUpperCase();

            if (materia.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite a nota: ");
            nota = Double.parseDouble(scanner.nextLine());

            if (notas.containsKey(materia)) {
                double mediaAnter = notas.get(materia);
                double novaMedia = (mediaAnter + nota) / 2;
                notas.put(materia, novaMedia);
                System.out.println("Nota atualizada. Média em " + materia + ": " + novaMedia);
            } else {
                notas.put(materia, nota);
                System.out.println("Nota adicionada em " + materia + ". Nota: " + nota);
            }
        }

        System.out.println("\nMédias finais:");
        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
