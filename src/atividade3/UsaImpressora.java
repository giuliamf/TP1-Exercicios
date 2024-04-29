package atividade3;

import java.util.Scanner;

class Impressora {
    // Atributos
    String modelo;
    String cor;
    String tipoPapel;
    Boolean bluetooth;
    Boolean wifi;
    Boolean colorida;
    Boolean ligada;
    Boolean papel;
    Boolean digitalizadora;
    Boolean copiadora;

    // Métodos
    void ligar() {
        if (!ligada) {
            System.out.println("ligando...");
            ligada = true;
        }
    }

    void desligar() {
        if (ligada) {
            System.out.println("desligando...");
            ligada = false;
        }
    }

    void imprimir() {
        if (ligada && papel) {
            System.out.println("imprimindo...");
        } else if (ligada) {    // porque se estiver ligada e tiver papel, não entrará no else if
            System.out.println("sem papel");
        } else {
            System.out.println("impressora desligada");
        }
    }

    void digitalizar() {
        if (ligada && digitalizadora) {
            System.out.println("digitalização sendo realizada...");
        } else if (ligada) {
            System.out.println("não é possível digitalizar");
        } else {
            System.out.println("impressora desligada");
        }
    }

    void copiar() {
        if (ligada && copiadora) {
            System.out.println("cópia sendo realizada...");
        } else if (ligada) {
            System.out.println("não é possível copiar");
        } else {
            System.out.println("impressora desligada");
        }
    }

    void status() {
        System.out.println(modelo);
        System.out.println(cor);
        System.out.println(tipoPapel);
        System.out.println(bluetooth ? "bluetooth on" : "bluetooth off");
        System.out.println(wifi ? "wifi on" : "wifi off");
        System.out.println(colorida ? "impressão colorida" : "impressão preto e branco");
        System.out.println(ligada ? "impressora on" : "impressora off");
        System.out.println(papel ? "tem papel" : "não tem papel");
        System.out.println(digitalizadora ? "digitalizadora on" : "digitalizadora off");
        System.out.println(copiadora ? "copiadora on" : "copiadora off");
    }
}

public class UsaImpressora {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        //String[] entrada = scanner.nextLine().split(" ");

        Impressora impressora = new Impressora();
        impressora.bluetooth = true;
        impressora.wifi = true;
        impressora.copiadora = false;
        impressora.digitalizadora = true;
        impressora.ligada = false;
        impressora.colorida = true;
        impressora.papel = true;

        impressora.modelo = scanner.next();
        impressora.cor = scanner.next();
        impressora.tipoPapel = scanner.next();

        impressora.status();

        impressora.ligar();
        impressora.digitalizar();
        impressora.copiar();
        impressora.desligar();
        impressora.imprimir();

        scanner.close();
    }
}
