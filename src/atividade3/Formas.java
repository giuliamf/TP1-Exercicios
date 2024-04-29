package atividade3;

import java.util.Scanner;

class Retangulo {
    // Atributos
    int comprimento = 1;
    int largura = 1;

    // Métodos
    public int calculoPerimetro() {
        return (2 * (comprimento + largura));
    }

    public int calculoArea() {
        return (comprimento * largura);
    }

    public void setComprimento(int novoComprimento) {
        if (novoComprimento > 0 && novoComprimento < 20) {
            comprimento = novoComprimento;
        }
    }
    public void setLargura(int novaLargura) {
        if (novaLargura > 0 && novaLargura < 20) {
            largura = novaLargura;
        }
    }
    public int getComprimento() {
        return comprimento;
    }
    public int getLargura() {
        return largura;
    }
}

public class Formas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Retangulo retanguloUm = new Retangulo();
        Retangulo retanguloDois = new Retangulo();

        retanguloUm.setComprimento(scanner.nextInt());
        retanguloUm.setLargura(scanner.nextInt());

        retanguloDois.setComprimento(scanner.nextInt());
        retanguloDois.setLargura(scanner.nextInt());

        int perimetroUm = retanguloUm.calculoPerimetro();
        int areaUm = retanguloUm.calculoArea();

        int perimetroDois = retanguloDois.calculoPerimetro();
        int areaDois = retanguloDois.calculoArea();

        // atualizando os dados
        int comprimentoUm = retanguloUm.getComprimento();
        int larguraUm = retanguloUm.getLargura();

        int comprimentoDois = retanguloDois.getComprimento();
        int larguraDois = retanguloDois.getLargura();

        System.out.println(comprimentoUm + " " + larguraUm + " " + perimetroUm + " " + areaUm);
        System.out.println(comprimentoDois + " " + larguraDois + " " + perimetroDois + " " + areaDois);
        }
    }

