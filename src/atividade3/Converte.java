package atividade3;

import java.util.Scanner;

class Temperatura {
    // Atributo
    private double temperatura;

    // Métodos
    public void valorAtributo(double valor) {
        this.temperatura = valor;
    }

    public void conversaoFahr(){
        temperatura = temperatura * 9 / 5 + 32;
    }
    public void conversaoCelsius(){
        temperatura = (temperatura - 32) * 5 / 9;
    }

    public String exibirValor() {
        return String.format("%.1f", temperatura);
    }
}

public class Converte {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        double tempCelsius = scanner.nextDouble();

        Temperatura temp = new Temperatura();
        temp.valorAtributo(tempCelsius);

        temp.conversaoFahr();
        System.out.println("temperatura: " + temp.exibirValor() + " graus fahrenheit");

        temp.conversaoCelsius();
        System.out.println("temperatura: " + temp.exibirValor() + " graus celsius");

        scanner.close();
    }
}
