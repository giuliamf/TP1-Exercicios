package atividade2;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class OperacoesVenda {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());

        LinkedHashMap<String, Integer> estoque = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> pedidos = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] item = scanner.nextLine().split(" ");
            estoque.put(item[0], Integer.parseInt(item[1]));
    }

        String pedido = scanner.nextLine();
        while (!pedido.equals("fim")){
            if (estoque.containsKey(pedido)){
                int quantidade = Integer.parseInt(scanner.nextLine());
                pedidos.put(pedido, quantidade);
                System.out.println(pedido + " " + quantidade);
            }
            else {
                System.out.println(pedido + " produto não encontrado");
            }
            pedido = scanner.nextLine();
        }

        for (String j : pedidos.keySet()) {
            if (estoque.containsKey(j)) {
                estoque.put(j, estoque.get(j) - pedidos.get(j));
            }
        }
        for (String l : estoque.keySet()) {
            System.out.println(l + " " + estoque.get(l));
        }
        scanner.close();
    }

}