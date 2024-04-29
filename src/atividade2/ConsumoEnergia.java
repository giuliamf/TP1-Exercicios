package atividade2;

import java.util.Scanner;
public class ConsumoEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double consumo = Double.parseDouble(scanner.nextLine());
        double taxa = 5.00;
        double custoEnergia = calculoCustoEnergia(consumo);
        double total = custoEnergia + taxa;

        System.out.printf("%.2f %.2f %.2f", custoEnergia, taxa, total);

        scanner.close();
    }
    public static double calculoCustoEnergia(double consumo) {
        double custo = 0.0;

        if (consumo <= 500) {
            custo = consumo * 0.02;
        } else if (consumo > 500 && consumo <= 1000) {
            custo = 500 * 0.1 + (consumo - 500) * 0.05;
        } else {
            custo = 1000 * 0.35 + (consumo - 1000) * 0.1;
        }
        return custo;
    }
}
