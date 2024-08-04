public class Empresa {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // dados da empresa
        String nomeEmpresa = scanner.next();
        String endereco = scanner.next();
        String mes = scanner.next();

        Funcionario[] funcionarios = new Funcionario[4];

        // dados do chefe
        funcionarios[0] = new Chefe(scanner.next(), scanner.next(), scanner.nextFloat(), scanner.next());
        // dados do vendedor
        funcionarios[1] = new Vendedor(scanner.next(), scanner.next(), scanner.nextFloat(), scanner.nextFloat(),
                scanner.nextInt());
        // dados do operario
        funcionarios[2] = new Operario(scanner.next(), scanner.next(), scanner.nextFloat(), scanner.nextFloat(),
                scanner.nextInt());
        // dados do horista
        funcionarios[3] = new Horista(scanner.next(), scanner.next(), scanner.nextFloat(), scanner.nextFloat(),
                scanner.nextInt());

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        folhaPagamento.mostrarPagamentos(nomeEmpresa, endereco, mes, funcionarios);

        scanner.close();
    }
}

class Funcionario {
    private String nome;
    private String dataNascimento;
    private float salario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Funcionario() {
        this.nome = "";
        this.dataNascimento = "";
        this.salario = 0.0f;
    }

    public Funcionario(String nome, String dataNascimento, float salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("\nNome: %s\nData de Nascimento: %s\nSalário: R$%.1f", nome, dataNascimento, salario);
    }
}

class Chefe extends Funcionario {
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Chefe() {
        super();
        this.departamento = "";
    }

    public Chefe(String nome, String dataNascimento, float salario, String departamento) {
        super(nome, dataNascimento, salario);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nDepartamento: %s\nCargo: chefe", departamento);
    }
}

class Vendedor extends Funcionario {
    private float comissaoVendas;
    private int quantidadeVendas;

    public float getComissaoVendas() {
        return comissaoVendas;
    }
    public void setComissaoVendas(float comissaoVendas) {
        this.comissaoVendas = comissaoVendas;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }
    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public Vendedor() {
        super();
        this.comissaoVendas = 0;
    }

    public Vendedor(String nome, String dataNascimento, float salario, float comissaoVendas, int quantidadeVendas) {
        super(nome, dataNascimento, salario + comissaoVendas * quantidadeVendas);
        this.comissaoVendas = comissaoVendas;
        this.quantidadeVendas = quantidadeVendas;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nCargo: vendedor\nComissão por Venda: R$%.1f\nNúmero de vendas: %d",
                comissaoVendas, quantidadeVendas);
    }
}

class Operario extends Funcionario {
    private float valorProducao;
    private int quantidadeProduzida;

    public float getValorProducao() {
        return valorProducao;
    }
    public void setValorProducao(float valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getQuantidadeProduzida() {
        return quantidadeProduzida;
    }
    public void setQuantidadeProduzida(int quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public Operario() {
        super();
        this.valorProducao = 0.0f;
        this.quantidadeProduzida = 0;
    }

    public Operario(String nome, String dataNascimento, float salario, float valorProducao, int quantidadeProduzida) {
        super(nome, dataNascimento, valorProducao * quantidadeProduzida);
        this.valorProducao = valorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nCargo: Operário\nValor por Produção: R$%.1f\nQuantidade produzida: " +
                "%d", valorProducao, quantidadeProduzida);
    }
}

class Horista extends Funcionario {
    private float valorHora;
    private int totalHoras;

    public float getValorHora() {
        return valorHora;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getTotalHoras() {
        return totalHoras;
    }
    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    public Horista() {
        super();
        this.valorHora = 0.0f;
        this.totalHoras = 0;
    }

    public Horista(String nome, String dataNascimento, float salario, float valorHora, int totalHoras) {
        super(nome, dataNascimento, valorHora * totalHoras);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nCargo: horista\nValor por Hora: R$%.1f\nTotal de horas: %d",
                valorHora, totalHoras);
    }
}

class FolhaPagamento {
    public void mostrarPagamentos(String nomeEmpresa, String endereco, String mes, Funcionario[] funcionarios) {
        System.out.printf("Nome da Empresa: %s\nEndereço: %s\nMês: %s%n", nomeEmpresa, endereco, mes);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }
    }
}
