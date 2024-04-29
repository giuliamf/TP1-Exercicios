package atividade2;

import java.util.Scanner;

public class CalculoIPTU {

    public static void main(String[] args) {
        // Entradas
        Scanner scanner = new Scanner(System.in);
        int tipo = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());

        double iptu;

        // Condicionais
        if (area >= 200) {
            if (tipo == 1) {
                iptu = area * 1.2;
                System.out.printf("%.2f", iptu);
            } else if (tipo == 2) {
                iptu = area * 1.3;
                System.out.printf("%.2f", iptu);
            } else {
                System.out.println("Entrada inválida!");
            }
        } else if (area > 0){
            if (tipo == 1) {
                iptu = area;
                System.out.printf("%.2f", iptu);
            } else if (tipo == 2) {
                iptu = area * 1.1;
                System.out.printf("%.2f", iptu);
            } else {
                System.out.println("Entrada inválida!");
            }
        } else {
            System.out.println("Entrada inválida!");
        }
        scanner.close();
    }
}