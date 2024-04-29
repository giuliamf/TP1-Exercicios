package atividade2;

import java.util.ArrayList;
import java.util.Scanner;

public class CorretorOrtografico {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            lista.add(scanner.nextLine());
        }

        boolean sugestao = false;
        String palavra = scanner.nextLine();
        if (lista.contains(palavra)){
            System.out.println("palavra correta");
        }
        else {
            System.out.println("palavra incorreta");
            ArrayList<String> possibilidades = conferir(palavra);
            for (String p : possibilidades) {
                if (lista.contains(p)) {
                    sugestao = true;
                    System.out.println(p + "?");
                }
            }
            if (!sugestao) {
                System.out.println("nenhuma sugestão");
            }
            }
        scanner.close();
        }
    public static ArrayList<String> conferir(String palavra) {
        ArrayList<String> possibilidades = new ArrayList<>();
        for (int i = 0; i < palavra.length() - 1; i++) {
            char[] chars = palavra.toCharArray();
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
            possibilidades.add(new String(chars));
        }
        return possibilidades;
    }
}
