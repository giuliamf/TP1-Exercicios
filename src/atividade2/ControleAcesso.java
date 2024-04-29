package atividade2;

import java.util.Scanner;
public class ControleAcesso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        int homens = 0, mulheres = 0;

        while (!entrada.equals("q")) {

            if (entrada.equals("h")) {
                homens++;
            } else if (entrada.equals("m")) {
                mulheres++;

            }entrada = scanner.nextLine();
        }

        System.out.println(homens + " " + mulheres);
        double ingressoHomens, ingressoMulheres;

        ingressoHomens = 12.5 * homens;
        ingressoMulheres = 7.4 * mulheres;

        System.out.printf("%.2f %.2f %.2f", ingressoHomens, ingressoMulheres, ingressoHomens+ingressoMulheres);
        scanner.close();
    }
}
