import java.util.Scanner;
import java.util.Locale;


public class LocadoraVeiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // informações do veículo
        String placa = scanner.next();
        String marca = scanner.next();
        String modelo = scanner.next();
        String cor = scanner.next();
        int ano = scanner.nextInt();
        Veiculo veiculo = new Veiculo(placa, marca, modelo, cor, ano);

        // informações do motorista
        int idMotorista = scanner.nextInt();
        String nomeMotorista = scanner.next();
        String telefoneMotorista = scanner.next();
        String cnhMotorista = scanner.next();
        Motorista motorista = new Motorista(idMotorista, nomeMotorista, telefoneMotorista, cnhMotorista);

        // informações do cliente
        int idCliente = scanner.nextInt();
        String nomeCliente = scanner.next();
        String telefoneCliente = scanner.next();
        String rgCliente = scanner.next();
        String cpfCliente = scanner.next();
        Cliente cliente = new Cliente(idCliente, nomeCliente, telefoneCliente, rgCliente, cpfCliente);

        // informações do chamado
        int idChamado = scanner.nextInt();
        String data = scanner.next();
        String tipo = scanner.next();
        String origem = scanner.next();
        String destino = scanner.next();
        float partida = scanner.nextFloat();
        float retorno = scanner.nextFloat();
        double kmInicial = scanner.nextDouble();
        double kmFinal = scanner.nextDouble();
        double valorTotal = scanner.nextDouble();
        Chamado chamado = new Chamado(idChamado, data, tipo, origem, destino, partida, retorno, kmInicial, kmFinal,
                valorTotal);


        // Saída
        System.out.println(chamado.getId());
        System.out.println(chamado.getDestino());
        System.out.println(veiculo.getPlaca());
        System.out.println(cliente.getRg());
        System.out.println(motorista.getNome());

        scanner.close();
    }
}


class Cliente {
    private final int id;
    private String rg;
    private String cpf;
    private String nome;
    private String telefone;

    public Cliente(int id, String nome, String telefone, String rg, String cpf) {
        this.id = id;
        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

class Motorista {
    private final int id;
    private String nome;
    private String telefone;
    private String cnh;

    public Motorista(int id, String nome, String telefone, String cnh) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cnh = cnh;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCnh() {
        return cnh;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}

class Chamado {
    private final int id;
    private String data;
    private String tipo;
    private String origem;
    private String destino;
    private float partida;
    private float retorno;
    private double kmInicial;
    private double kmFinal;
    private double valorTotal;

    public Chamado(int id, String data, String tipo, String origem, String destino, float partida, float retorno,
                   double kmInicial, double kmFinal, double valorTotal) {
        this.id = id;
        this.data = data;
        this.tipo = tipo;
        this.origem = origem;
        this.destino = destino;
        this.partida = partida;
        this.retorno = retorno;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public float getPartida() {
        return partida;
    }

    public float getRetorno() {
        return retorno;
    }

    public double getKmInicial() {
        return kmInicial;
    }

    public double getKmFinal() {
        return kmFinal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPartida(float partida) {
        this.partida = partida;
    }

    public void setRetorno(float retorno) {
        this.retorno = retorno;
    }

    public void setKmInicial(float kmInicial) {
        this.kmInicial = kmInicial;
    }

    public void setKmFinal(float kmFinal) {
        this.kmFinal = kmFinal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}

class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

    public Veiculo(String placa, String marca, String modelo, String cor, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}