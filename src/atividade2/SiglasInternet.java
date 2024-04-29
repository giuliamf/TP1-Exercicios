package atividade2;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Scanner;

public class SiglasInternet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        int n = Integer.parseInt(scanner.nextLine());

        HashMap<String, String> dicionario = new HashMap<>();

        for (int i = 0; i < n; i++){
            String[] palavra = scanner.nextLine().split(" ");
            dicionario.put(palavra[0], palavra[1]);
        }

        String[] frase = scanner.nextLine().split(" ");
        for (int i = 0; i < frase.length; i++){
            if (dicionario.containsKey(frase[i].toLowerCase())) {
                frase[i] = dicionario.get(frase[i].toLowerCase());
            }
        }
        String fraseFinal = " ";
        for (String palavraFinal : frase) {
            fraseFinal += palavraFinal + " ";
        }

        System.out.println(fraseFinal.trim());
        scanner.close();
    }
}
