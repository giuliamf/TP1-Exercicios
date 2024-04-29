package atividade2;

import java.util.Scanner;

public class PesoIdeal {

    public static void main(String[] args) {
        // Entradas
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        String s = scanner.nextLine();

        double peso_ideal;

        // Condicional do a
        if (a > 0) {
            // Condicionais do s
            if (s.equals("m")) {
                peso_ideal = (72.7 * a) - 58;
                System.out.printf("%.1f kg", peso_ideal);
            } else if (s.equals("f")) {
                peso_ideal = (62.1 * a) - 44.7;
                System.out.printf("%.1f kg", peso_ideal);
            } else {
                System.out.println("Entrada inválida!");
            }
        } else {
            System.out.println("Entrada inválida!");
        }
        scanner.close();
    }
}