package atividade3;

import java.util.Scanner;

class Circulo {
    private int x, y, raio;
    public static final double PI = 3.14159;

    public Circulo(int x, int y, int raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double circunferencia() {
        return 2 * PI * raio;
    }
}

public class TestaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circulo[] circulos1 = new Circulo[3];
        Circulo[] circulos2;
        Circulo[] circulos3 = new Circulo[3];


        for (int i = 0; i < 3; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int raio = scanner.nextInt();
            circulos1[i] = new Circulo(x, y, raio);
        }

        circulos2 = circulos1.clone();


        for (int i = 0; i < circulos3.length; i++) {
            circulos3[i] = new Circulo(circulos1[i].getX(), circulos1[i].getY(), circulos1[i].getRaio());
        }

        int[] novosRaios = new int[3];
        for (int i = 0; i < 3; i++) {
            novosRaios[i] = scanner.nextInt();
        }

        for (int i = 0; i < circulos1.length; i++) {
            circulos1[i].setRaio(novosRaios[i]);
        }

        imprimirValores("vetor1:", circulos1);
        imprimirValores("vetor2:", circulos2);
        imprimirValores("vetor3:", circulos3);

        scanner.close();
    }

    public static void imprimirValores(String identificacao, Circulo[] circulos) {
        System.out.println(identificacao);
        for (Circulo circulo : circulos) {
            System.out.println(circulo.getX() + " " + circulo.getY() + " " + circulo.getRaio());
        }
    }
}
