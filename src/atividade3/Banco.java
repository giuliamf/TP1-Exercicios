package atividade3;

import java.util.Scanner;

class Conta {
    // Atributos
    private int numeroConta;
    private String nomeCliente;
    private double saldo;
    private int senha;

    // Método Construtor
    public void inicializacao(int conta, int senha, String nome, double saldo){
        this.numeroConta = conta;
        this.nomeCliente = nome;
        this.saldo = saldo;
        this.senha = senha;
    }

    // Métodos getters
    public int getNumeroConta(){
        return numeroConta;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public double getSaldo(int senhaFornecida){
        if (senhaFornecida == senha) {
            return saldo;
        } return -1;
    }

    // Método de verificação da senha
    public boolean verificaSenha(int senhaFornecida){
        return senha == senhaFornecida;    // caso as senhas sejam iguais true, se não, false
    }

    // Outros métodos
    public boolean saque(double valorSaque, int senhaFornecida){
        if (valorSaque > 0 && valorSaque < saldo && verificaSenha(senhaFornecida)) {
            saldo -= valorSaque;
            return true;
        }
        return false;
    }

    public boolean deposito(double valorDeposito, int senhaFornecida) {
        if (valorDeposito > 0 && verificaSenha(senhaFornecida)){
            this.saldo += valorDeposito;
            return true;
        }
        return false;
    }

    public boolean transferencia(double valorTransferencia, int senhaFornecida, Conta contaDestino){
        if (valorTransferencia > 0 && valorTransferencia < saldo && verificaSenha(senhaFornecida)){
            saldo -= valorTransferencia;
            contaDestino.saldo += valorTransferencia;
            return true;
        }
        return false;
    }

}

public class Banco {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Conta contaUm = new Conta();
        Conta contaDois = new Conta();

        // Informações Cliente UM
        int nContaUm = scanner.nextInt();
        int senhaUm = scanner.nextInt();
        String clienteUm = scanner.next();
        double saldoUm = Double.parseDouble(scanner.next());

        // Informações Cliente DOIS
        int nContaDois = scanner.nextInt();
        int senhaDois = scanner.nextInt();
        String clienteDois = scanner.next();
        double saldoDois = Double.parseDouble(scanner.next());

        // Inicializando os dados
        contaUm.inicializacao(nContaUm, senhaUm, clienteUm, saldoUm);
        contaDois.inicializacao(nContaDois, senhaDois, clienteDois, saldoDois);

        int operacao = scanner.nextInt();

        while (operacao != 5){

            if (operacao == 1){             // Visualizar saldo
                int senha = scanner.nextInt();
                double saldo = contaUm.getSaldo(senha);
                if (saldo == -1){
                    System.out.println("senha incorreta");
                } else{
                    System.out.printf("%.2f\n", saldo);
                }
            }

            else if (operacao == 2) {     // Sacar valor
                double valor = scanner.nextDouble();
                int senha = scanner.nextInt();

                if (contaUm.saque(valor, senha)){
                    System.out.println("saque realizado");
                } else{
                    System.out.println("saque não realizado");
                }
            }

            else if (operacao == 3) {       // Depositar valor
                double valor = scanner.nextDouble();
                int senha = scanner.nextInt();
                if (contaUm.deposito(valor, senha)){
                    System.out.println("depósito realizado");
                } else {
                    System.out.println("depósito não realizado");
                }
            }

            else if (operacao == 4) {         // Transferência entre contas
                String nomeDestino = scanner.next();
                if (nomeDestino.equals(contaDois.getNomeCliente())) {
                    double valor = scanner.nextDouble();
                    int senha = scanner.nextInt();
                    if (contaUm.transferencia(valor, senha, contaDois)){
                        System.out.println("transferência realizada");
                    } else {
                        System.out.println("transferência não realizada");
                    }
                } else {
                    System.out.println("nenhum usuário encontrado");
                }
            }
            operacao = Integer.parseInt(scanner.next());
        }
        scanner.close();
    }
}
