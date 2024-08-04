public class Veiculo {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca(scanner.next());
        veiculo.setNumeroPortas(scanner.nextInt());
        veiculo.setPreco(scanner.nextFloat());

        Carro carro = new Carro();
        carro.setPlaca(scanner.next());
        carro.setNumeroPortas(scanner.nextInt());
        carro.setPreco(scanner.nextFloat());
        carro.setCor(scanner.next());

        Moto moto = new Moto();
        moto.setPlaca(scanner.next());
        moto.setNumeroPortas(scanner.nextInt());
        moto.setPreco(scanner.nextFloat());
        moto.setQtdeCilindradas(scanner.nextInt());


        System.out.println(veiculo);
        System.out.println(carro);
        System.out.println(moto);

    }
}

class Veiculo {
    protected String placa;
    protected int numeroPortas;
    protected float preco;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }
    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Veiculo() {
        this.placa = "";
        this.numeroPortas = 0;
        this.preco = 0.0f;
    }

    public Veiculo(String placa, int numeroPortas, float preco) {
        this.placa = placa;
        this.numeroPortas = numeroPortas;
        this.preco = preco;

    }

    @Override
    public String toString() {
        return String.format("Placa: %s Número de portas: %d Preço: R$%.1f", placa, numeroPortas, preco);
    }
}

class Carro extends Veiculo {
    private String cor;

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public Carro() {
        super();
        this.cor = "";
    }

    public Carro(String placa, int numeroPortas, float preco, String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Cor: %s", cor);
    }
}

class Moto extends Veiculo {
    private int qtdeCilindradas;

    public int getQtdeCilindradas() {
        return qtdeCilindradas;
    }
    public void setQtdeCilindradas(int qtdeCilindradas) {
        this.qtdeCilindradas = qtdeCilindradas;
    }

    public Moto() {
        super();
        this.qtdeCilindradas = 0;
    }

    public Moto(String placa, int numeroPortas, float preco, int qtdeCilindradas) {
        this.qtdeCilindradas = qtdeCilindradas;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Quantidade de cilindradas: %d", qtdeCilindradas);
    }
}
